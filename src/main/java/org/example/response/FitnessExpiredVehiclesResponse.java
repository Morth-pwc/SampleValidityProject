package org.example.response;

import org.example.RTOData;

import java.util.List;

public class FitnessExpiredVehiclesResponse {
    private int totalNumOfRecords;
    private List<RTOData> RTODataList;

    public int getTotalNumOfRecords() {
        return totalNumOfRecords;
    }

    public void setTotalNumOfRecords(int totalNumOfRecords) {
        this.totalNumOfRecords = totalNumOfRecords;
    }

    public List<RTOData> getRTODataList() {
        return RTODataList;
    }

    public void setRTODataList(List<RTOData> RTODataList) {
        this.RTODataList = RTODataList;
    }

    @Override
    public String toString() {
        return "FitnessExpiredVehiclesResponse{" +
                "totalNumOfRecords=" + totalNumOfRecords +
                ", RTODataList=" + RTODataList +
                '}';
    }
}