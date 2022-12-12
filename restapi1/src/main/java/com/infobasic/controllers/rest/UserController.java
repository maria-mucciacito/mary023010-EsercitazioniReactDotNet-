package com.infobasic.controllers.rest;
import static spark.Spark.get;
import static spark.Spark.*;

import com.infobasic.models.User;
import com.infobasic.models.UserTest;
import spark.Filter;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.infobasic.services.UserService;;

public class UserController {
    Gson gson;

    public UserController() {
        this.gson = new Gson();
    }

    public void getAllUser(UserService userService){
        get("/users", (req, res) -> {
            res.type("application/json");
            return userService.getAllUser();
        }, gson::toJson);
    }

    public void getUserById(UserService usersService){
        get("/users/:id", (req, res) -> {
            res.type("application/json");
            int idSearch = Integer.parseInt(req.params("id")); 
            return usersService.getUserById(idSearch);
        }, gson::toJson);
    }

    public void control_user_existing(UserService userService){

        options("/*",
        (request, response) -> {

            String accessControlRequestHeaders = request
                    .headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers",
                        accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request
                    .headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods",
                        accessControlRequestMethod);
            }

            return "OK";
        });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
        /*after((Filter) (req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
            res.header("Access-Control-Allow-Methods", "GET, POST, PATCH, PUT, DELETE, OPTIONS");
            res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, eContent-Type, Accept");
            res.header("Access-Control-Max-Age", "86400");

            res.status(200);

        });*/
        post("/users/control", (req, res) -> {
            res.type("application/json");
            UserTest userFromRequest = new Gson().fromJson(req.body(), UserTest.class);
            User user = userService.control_user_existing(userService, userFromRequest.getUsername(), userFromRequest.getPassword());
            if(user!=null){
                

            }
            System.out.print(userFromRequest.toString());
            return userFromRequest;
        }, gson::toJson);

    }

}
