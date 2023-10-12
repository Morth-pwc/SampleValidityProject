package org.example.request;

import jakarta.persistence.Id;

import java.util.Date;

public class FitnessExpiryRequest {
    @Id
    private int id;
    private Date fitnessExpiryDate;
    private String vehicleType;
    private String state;
    private String rto;
    private String imported;
    private String vehicleCategory;
    private String fuelType;
    private String emissionNorms;

}