package com.infobasic.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infobasic.models.User;
import com.infobasic.persistence.PostgresDatabase;

public class UserService {
    PostgresDatabase database;
    Connection conn;
    List<User> user;

    public UserService() {
        this.database = new PostgresDatabase();
        this.conn = database.connect_to_db("wgehueeb", "wgehueeb", "vSyhvB1LzTa4v9pn9EmDvELoGpPVM8fm");

    }

    public List<User> getAllUser() {
        this.user = new ArrayList<User>();
        ResultSet rs = database.read_data(this.conn, "public.\"user\"");
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String fax = rs.getString("fax");
                String job = rs.getString("job");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String cf = rs.getString("cf");
                User u = new User(id, cf, first_name, last_name, fax, job, username, password, role);
                user.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    public User control_user_existing(UserService userService,String username,String password) {
        ResultSet rs = database.control_user_existing(this.conn, "public.\"user\"",username,password);
        User user = null;
        try {
            if(rs.next()){
                int id = rs.getInt("id"); 
                user = userService.getUserById(id);
            } else {
                System.out.print("Utente non esistente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    public User getUserById(int idSearch){
        ResultSet rs = database.search_by_id(this.conn, "public.user", idSearch);
        User user = null;
        try {
            while (rs.next()){
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String fax = rs.getString("fax");
                String job = rs.getString("job");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String cf = rs.getString("cf");
                user = new User(id, cf, first_name, last_name, fax, job, username, password, role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

}
