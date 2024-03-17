package Configuration;

import Models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("Models")
public class Config {

    @Bean
    public Person person(Vehicle vehicle) {
        var p = new Person(vehicle);
        return p;
    }

    @Bean
    public Vehicle vehicle(VehicleService vehser)
    {
        var veh = new Vehicle(vehser);
        return veh;
    }

    @Bean
    public VehicleService vehService(Speaker s, Tyre t)
    {
        var vehSer = new VehicleService(s,t);
        return vehSer;
    }

    @Bean
    public Speaker speaker()
    {
        var spkr = new SonySpeaker();
        spkr.makeSound();
        return spkr;
    }

    @Bean
    public Tyre tyre()
    {
        var tyr = new Mrf();
        tyr.rotate();
        return tyr;

    }
}
