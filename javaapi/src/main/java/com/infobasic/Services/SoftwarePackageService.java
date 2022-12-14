package com.infobasic.Services;

import java.util.List;
import com.infobasic.Models.SoftwarePackage;
import com.infobasic.Models.Dao.Impl.SoftwarePackageDaoImpl;

public class SoftwarePackageService {
    List<SoftwarePackage> software;
    SoftwarePackageDaoImpl softwarePackageDaoImpl;

    public SoftwarePackageService(){
        this.softwarePackageDaoImpl = new SoftwarePackageDaoImpl();
    }

    public List<SoftwarePackage> getAllSoftware(){
        return softwarePackageDaoImpl.getAllSoftware();
    }

    public SoftwarePackage getSoftwareById(int idSearch){
        return softwarePackageDaoImpl.getSoftwareByID(idSearch);
    }

    public void createSoftware(SoftwarePackage softwarePackage){
        softwarePackageDaoImpl.createSoftware(softwarePackage);
    }

    public void deleteSoftwareById(int id){
        softwarePackageDaoImpl.deleteSoftwareById(id);
    }

    public void updateSoftware(SoftwarePackage softwarePackage){
        softwarePackageDaoImpl.updateSoftware(softwarePackage);
    }
}
