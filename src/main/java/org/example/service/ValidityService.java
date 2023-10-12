package org.example.service;

import org.example.entity.FitnessExpiry;
import org.example.RTOData;
import org.example.repo.FitnessExpiryRepository;
import org.example.response.FitnessExpiredVehiclesResponse;
import org.example.response.FitnessExpiryDummyResponse;
import org.example.response.FitnessExpiryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ValidityService {
    @Autowired
    private final FitnessExpiryRepository fitnessExpiryRepository;
    private final Logger logger = LoggerFactory.getLogger(ValidityService.class);

    public ValidityService(FitnessExpiryRepository fitnessExpiryRepository) {
        this.fitnessExpiryRepository = fitnessExpiryRepository;
    }

    public FitnessExpiredVehiclesResponse getTopFitnessExpiryNew(Date startDate, Date endDate){
        logger.info("Received request in Validity Service");
        List<RTOData> rtoDataList = new ArrayList<>(new ArrayList<>(fitnessExpiryRepository.findAllFitnessExpiry()));

        FitnessExpiredVehiclesResponse fitnessExpiredVehiclesResponse = new FitnessExpiredVehiclesResponse();
        fitnessExpiredVehiclesResponse.setRTODataList(rtoDataList);
        fitnessExpiredVehiclesResponse.setTotalNumOfRecords(rtoDataList.size());
        return fitnessExpiredVehiclesResponse;
    }

    public FitnessExpiryResponse getTopFitnessExpiry(Date startDate, Date endDate){
        logger.info("Received request in Validity Service");
        List<FitnessExpiry> fitnessExpiryList = new ArrayList<FitnessExpiry>(new ArrayList<>(fitnessExpiryRepository.findAll()));
        List<FitnessExpiry> result = new ArrayList<FitnessExpiry>();

        for (FitnessExpiry fitnessExpiry : fitnessExpiryList){

            if(startDate.before(fitnessExpiry.getFitnessExpiryDate()) && endDate.after(fitnessExpiry.getFitnessExpiryDate())) {
                result.add(fitnessExpiry);
            }
        }


        FitnessExpiryResponse fitnessExpiryResponse = new FitnessExpiryResponse();
        fitnessExpiryResponse.setFitnessExpiryList(result);
        fitnessExpiryResponse.setTotalNumOfRecords(result.size());
        return fitnessExpiryResponse;
    }

    public FitnessExpiryResponse getTopFitnessExpirySample(){
        logger.info("Received request in Validity Service");
        List<FitnessExpiry> fitnessExpiryList = new ArrayList<FitnessExpiry>(new ArrayList<>(fitnessExpiryRepository.findAll()));

        FitnessExpiryResponse fitnessExpiryResponse = new FitnessExpiryResponse();
        fitnessExpiryResponse.setFitnessExpiryList(fitnessExpiryList);
        return fitnessExpiryResponse;
    }

    public FitnessExpiryDummyResponse getTopFitnessExpiry(){
        logger.info("Received request in Validity Service");
        List<RTOData> rtoDataList = new ArrayList<RTOData>();
        rtoDataList.add( new RTOData("UK15", 26));
        rtoDataList.add( new RTOData("MP12", 24));
        rtoDataList.add( new RTOData("PY09", 24));
        rtoDataList.add( new RTOData("KA15", 23));
        rtoDataList.add( new RTOData("MH05", 23));

        FitnessExpiryDummyResponse fitnessExpiryDummyResponse = new FitnessExpiryDummyResponse();
        fitnessExpiryDummyResponse.setRTOList(rtoDataList);

        return fitnessExpiryDummyResponse;
    }

}