package org.example;

public class RTOData {
    private String rto;
    private int vehiclesExpired;

    public RTOData() {
    }

    public RTOData(String rto, int vehiclesExpired) {
        this.rto = rto;
        this.vehiclesExpired = vehiclesExpired;
    }

    public String getRto() {
        return rto;
    }

    public void setRto(String rto) {
        this.rto = rto;
    }

    public int getVehiclesExpired() {
        return vehiclesExpired;
    }

    public void setVehiclesExpired(int vehiclesExpired) {
        this.vehiclesExpired = vehiclesExpired;
    }

    @Override
    public String toString() {
        return "RTOData{" +
                "rto='" + rto + '\'' +
                ", vehiclesExpired=" + vehiclesExpired +
                '}';
    }
}