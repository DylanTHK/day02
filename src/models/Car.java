package models
;

import java.util.Date;

public class Car {
    private String colour;
    private String make;
    private boolean started = false;
    private String registration;

    public Car(String registrationNum) {
        this.registration = registrationNum;
    }

    // String is added as expected type of return is String
    public String getColour() {
        return this.colour;
    }

    // void is added to as return value is expected
    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String newMake) {
        switch (newMake.toLowerCase()) {
            case "honda":
            case "toyota":
            case "mazda":
                this.make = newMake;
                break;
            default:
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public String getRegistrationDate() {
        return this.registration;
    }

    public void setRegistrationDate(String registration) {
        this.registration = registration;
    }

    // Behaviour method
    public void horn() {

    }
    
}
