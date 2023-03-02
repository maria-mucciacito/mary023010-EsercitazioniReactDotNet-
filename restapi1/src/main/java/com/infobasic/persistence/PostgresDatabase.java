package com.infobasic.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

final public class PostgresDatabase {
    public Connection connect_to_db(String dbname,String user,String pass){
        Connection conn=null;
        try{
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://lucky.db.elephantsql.com:5432/"+dbname, user, pass);
            if(conn!=null){
                System.out.println("Connection Established");
            }
            else{
                System.out.println("Connection Failed");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

    public ResultSet read_data(Connection conn, String table_name){
        Statement statement;
        ResultSet rs=null;
        try {
            String query=String.format("select * from %s",table_name);
            statement=conn.createStatement();
            rs=statement.executeQuery(query);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }

    public ResultSet search_by_id(Connection conn, String table_name,int id){
        Statement statement;
        ResultSet rs=null;
        try {
            String query=String.format("select * from %s where id= %s",table_name,id);
            statement=conn.createStatement();
            rs=statement.executeQuery(query);
        }catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }

    public void insert_row(Connection conn,String table_name,String name, String address){
        Statement statement;
        try {
            String query=String.format("insert into %s(name,address) values('%s','%s');",table_name,name,address);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inserted");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public ResultSet control_user_existing(Connection conn, String table_name, String username, String password){
        Statement statement;
        ResultSet rs=null;
        try {
            String query=String.format("select id from %s where username= %s AND password= %s",table_name,username,password);
            statement=conn.createStatement();
            rs=statement.executeQuery(query);
        }catch (Exception e){
            System.out.println(e);
        }
        return rs;
    }

}
