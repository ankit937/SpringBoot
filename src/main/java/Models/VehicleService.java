package Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class VehicleService {

    private Speaker speaker;

    private Tyre tyre;

    @Autowired
    public VehicleService(Speaker speaker,Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }
}
