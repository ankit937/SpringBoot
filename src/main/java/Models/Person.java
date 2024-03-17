package Models;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name = "Ankit";

    private Vehicle vh;

    @Autowired
    public Person(Vehicle veh) {
        this.vh = veh;
    }

    public Vehicle getVh() {
        return vh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
