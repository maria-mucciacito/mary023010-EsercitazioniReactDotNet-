package com.infobasic.models.dao;

import com.infobasic.models.Email;

public interface EmailDao {

    public void save(Email email);

    public Email findById(int id);

    
}
