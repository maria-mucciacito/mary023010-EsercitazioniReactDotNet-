package com.infobasic.services;
import com.infobasic.persistence.PostgresDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infobasic.models.SoftwarePackage;

public class SoftwarePackageService {
    PostgresDatabase database;
    Connection conn;
    List<SoftwarePackage> software;


    public SoftwarePackageService() {
        this.database = new PostgresDatabase();
        this.conn = database.connect_to_db("wgehueeb","wgehueeb","vSyhvB1LzTa4v9pn9EmDvELoGpPVM8fm");
        System.out.println(conn);
    }

    public List<SoftwarePackage> getAllSoftwarePackage() {
        this.software = new ArrayList<SoftwarePackage>();
        ResultSet rs = database.read_data(this.conn, "software_package");
        try {
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String category = rs.getString("category");
                String product_code = rs.getString("product_code");
                SoftwarePackage s = new SoftwarePackage(id, name, description, category, product_code);
                software.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return software;
        
    }

    public List<SoftwarePackage> getSoftwarePackageById(int idSearch){
        this.software = new ArrayList<SoftwarePackage>();
        ResultSet rs = database.search_by_id(this.conn, "software_package", idSearch);
        try {
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String category = rs.getString("category");
                String product_code = rs.getString("product_code");
                SoftwarePackage s = new SoftwarePackage(id, name, description, category, product_code);
                software.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return software;
    }

}
