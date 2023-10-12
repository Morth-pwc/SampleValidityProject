package org.example.response;

import org.example.RTOData;

import java.util.List;

public class FitnessExpiryDummyResponse {
    private List<RTOData> RTOList;

    public List<RTOData> getRTOList() {
        return RTOList;
    }

    public void setRTOList(List<RTOData> RTOList) {
        this.RTOList = RTOList;
    }
}