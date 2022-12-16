package com.infobasic.Controllers;

import com.google.gson.Gson;
import com.infobasic.Services.DashboardService;
import static spark.Spark.*;

public class DashboardController {
    Gson gson;
    DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService){
        this.gson = new Gson();
        this.dashboardService = new DashboardService();
    }

    public void startServices(){

        //read number of leads group by source
        get("/leadbysource", (req, res) -> {
            res.type("application/json");
            return dashboardService.leadsBySource();
        }, gson::toJson);
    }
    
}
