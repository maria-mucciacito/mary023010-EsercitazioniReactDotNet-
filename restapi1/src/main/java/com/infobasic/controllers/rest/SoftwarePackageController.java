package com.infobasic.controllers.rest;
import static spark.Spark.*;
import com.google.gson.Gson;
import com.infobasic.services.SoftwarePackageService;

public class SoftwarePackageController {
    Gson gson;

    public SoftwarePackageController() {
        this.gson = new Gson();
    }

    public void startServices() {
        get("/", (req, res) -> "System online!");
    }

    public void getAllSoftwarePackage(SoftwarePackageService softwareService){
        get("/softwarepackages", (req, res) -> {
            res.type("application/json");
            return softwareService.getAllSoftwarePackage();
        }, gson::toJson);
    }

    public void getSoftwarePackageById(SoftwarePackageService softwareService){
        get("/softwarepackages/:id", (req, res) -> {
            res.type("application/json");
            int idSearch = Integer.parseInt(req.params("id")); 
            return softwareService.getSoftwarePackageById(idSearch);
        }, gson::toJson);
    }
    
}
