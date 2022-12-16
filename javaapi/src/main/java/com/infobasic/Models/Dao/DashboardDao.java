package com.infobasic.Models.Dao;

import java.util.HashMap;

public interface DashboardDao {

    public HashMap<String, Integer> leadsBySource();

    public void dealsByState();

    public void tasksForMonth();

    public void tasksByState();
    
}
