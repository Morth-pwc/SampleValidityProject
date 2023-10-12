package org.example.controller;

import org.example.response.FitnessExpiredVehiclesResponse;
import org.example.response.FitnessExpiryDummyResponse;
import org.example.response.FitnessExpiryResponse;
import org.example.service.ValidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/validity")
public class ValidityController {
    @Autowired
    private final ValidityService validityService;

    public ValidityController(ValidityService validityService) {
        this.validityService = validityService;
    }

    @RequestMapping(value="/getTopFitnessExpiryNew", method= RequestMethod.GET)
    public FitnessExpiredVehiclesResponse getTopFitnessExpiryNew(@RequestParam(value="startDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date startDate, @RequestParam(value="endDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date endDate){
        return validityService.getTopFitnessExpiryNew(startDate, endDate);
    }

    @RequestMapping(value="/getTopFitnessExpiry", method= RequestMethod.GET)
    public FitnessExpiryResponse getTopFitnessExpiry(@RequestParam(value="startDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date startDate, @RequestParam(value="endDate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date endDate){
        return validityService.getTopFitnessExpiry(startDate, endDate);
    }

    @RequestMapping(value="/getTopFitnessExpirySample", method= RequestMethod.GET)
    public FitnessExpiryResponse getTopFitnessExpirySample(){
        return validityService.getTopFitnessExpirySample();
    }

    @RequestMapping(value="/getTopFitnessExpiryDummy", method= RequestMethod.GET)
    public FitnessExpiryDummyResponse getTopFitnessExpiry(){
        return validityService.getTopFitnessExpiry();
    }

}