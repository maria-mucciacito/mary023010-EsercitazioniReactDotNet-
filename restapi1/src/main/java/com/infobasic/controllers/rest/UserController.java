package com.infobasic.controllers.rest;
import static spark.Spark.get;
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

}
