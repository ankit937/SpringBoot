package Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Vehicle {

    private String vehName="Audi";
    private VehicleService vehServc;

    @Autowired
    public Vehicle(VehicleService vehServc) {
        this.vehServc = vehServc;
    }

    public String getVehName() {
        return vehName;
    }

    public void setVehName(String vehName) {
        this.vehName = vehName;
    }
}
