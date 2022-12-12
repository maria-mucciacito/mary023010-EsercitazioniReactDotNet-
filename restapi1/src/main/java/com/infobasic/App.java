package com.infobasic;

import java.sql.Connection;

import com.infobasic.controllers.rest.SoftwarePackageController;
import com.infobasic.controllers.rest.UserController;
import com.infobasic.persistence.PostgresDatabase;
import com.infobasic.services.SoftwarePackageService;
import com.infobasic.services.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SoftwarePackageService service = new SoftwarePackageService();
        //System.out.print(service.getAllSoftwarePackage()); 
        PostgresDatabase p = new PostgresDatabase();
        Connection c = p.connect_to_db("wgehueeb","wgehueeb","vSyhvB1LzTa4v9pn9EmDvELoGpPVM8fm");
        System.out.print(c);
        SoftwarePackageController controller = new SoftwarePackageController();
        controller.startServices();
        controller.getAllSoftwarePackage(service);
        controller.getSoftwarePackageById(service);
        UserService uservice = new UserService();
        UserController cuser = new UserController();
        cuser.getAllUser(uservice);
        cuser.controlUser(uservice);

        

    }
}
