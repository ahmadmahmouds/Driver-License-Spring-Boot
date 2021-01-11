package com.relationship.demo.Services;

import com.relationship.demo.Reopsitories.LicenseRepository;
import com.relationship.demo.models.License;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {
    private final LicenseRepository licenseRepository;



    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public List<License> allLicense(){
        return licenseRepository.findAll();
    }

    public License addLicense(License license){
        return  licenseRepository.save(license);
    }


}
