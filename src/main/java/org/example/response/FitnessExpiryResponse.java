package org.example.response;

import org.example.FitnessExpiry;

import java.util.List;

public class FitnessExpiryResponse {

    private int totalNumOfRecords;
    private List<FitnessExpiry> fitnessExpiryList;

    public int getTotalNumOfRecords() {
        return totalNumOfRecords;
    }

    public void setTotalNumOfRecords(int totalNumOfRecords) {
        this.totalNumOfRecords = totalNumOfRecords;
    }
    public List<FitnessExpiry> getFitnessExpiryList() {
        return fitnessExpiryList;
    }

    public void setFitnessExpiryList(List<FitnessExpiry> fitnessExpiryList) {
        this.fitnessExpiryList = fitnessExpiryList;
    }

    @Override
    public String toString() {
        return "FitnessExpiryResponse{" +
                "totalNumOfRecords=" + totalNumOfRecords +
                ", fitnessExpiryList=" + fitnessExpiryList +
                '}';
    }
}
