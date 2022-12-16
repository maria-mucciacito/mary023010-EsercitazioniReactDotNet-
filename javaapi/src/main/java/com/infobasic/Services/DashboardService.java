package com.infobasic.Services;

import java.util.HashMap;

import com.infobasic.Models.Dao.Impl.DashboardDaoImpl;

public class DashboardService {
    HashMap<String, Integer> dict;
    DashboardDaoImpl dashboardDaoImpl;

    public DashboardService(){
        dashboardDaoImpl = new DashboardDaoImpl();
    }

    public HashMap<String, Integer> leadsBySource(){
        return dashboardDaoImpl.leadsBySource();
    }
    
}
