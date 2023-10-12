package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class FitnessExpiry {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFitnessExpiryDate() {
        return fitnessExpiryDate;
    }

    public void setFitnessExpiryDate(Date fitnessExpiryDate) {
        this.fitnessExpiryDate = fitnessExpiryDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRto() {
        return rto;
    }

    public void setRto(String rto) {
        this.rto = rto;
    }

    public String getImported() {
        return imported;
    }

    public void setImported(String imported) {
        this.imported = imported;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEmissionNorms() {
        return emissionNorms;
    }

    public void setEmissionNorms(String emissionNorms) {
        this.emissionNorms = emissionNorms;
    }

    @Override
    public String toString() {
        return "FitnessExpiry{" +
                "id=" + id +
                ", fitnessExpiryDate='" + fitnessExpiryDate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", state='" + state + '\'' +
                ", rto='" + rto + '\'' +
                ", imported='" + imported + '\'' +
                ", vehicleCategory='" + vehicleCategory + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", emissionNorms='" + emissionNorms + '\'' +
                '}';
    }


}