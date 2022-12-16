package com.infobasic.Models.Dao.Impl;

import com.infobasic.Models.Dao.DashboardDao;
import com.infobasic.Persistence.ConnectionManager;
import java.sql.*;
import java.util.HashMap;

public class DashboardDaoImpl implements DashboardDao{
    HashMap<String, Integer> dict;

    @Override
    public HashMap<String, Integer> leadsBySource() {
        Connection connection = ConnectionManager.getConnetion();
        Statement statement;
        ResultSet resultSet = null;
        dict = new HashMap<String, Integer>();
        try{
            String query = "SELECT source, COUNT(*) as leadbysource FROM public.lead GROUP BY source;";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String source = resultSet.getString("source");
                int leads = resultSet.getInt("leadbysource");
                dict.put(source, leads);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return dict;
    }

    @Override
    public void dealsByState() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tasksForMonth() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tasksByState() {
        // TODO Auto-generated method stub
        
    }
    
}
