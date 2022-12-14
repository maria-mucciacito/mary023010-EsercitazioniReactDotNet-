package com.infobasic;
import com.infobasic.Controllers.SoftwarePackageController;
import com.infobasic.Services.SoftwarePackageService;

public class App 
{
    public static void main( String[] args )
    {
        SoftwarePackageService softwarePackageService = new SoftwarePackageService();
        SoftwarePackageController softwarePackageController = new SoftwarePackageController(softwarePackageService);
        softwarePackageController.startServices();
    }
}
