package object_oriented_programming;

public class Car {
    public Car() {
        wheels = 4;
        length = 2000;
        width = 300;
        motor = 1600;
        platform_weight = 500;
    }

    private int wheels, length, width, motor, platform_weight, total_weight;
    private String color;
    boolean fragance, leather_seats;

    public String getGeneralData() {
        return "The car has " + wheels + " wheels.\nThe car's length is " + length + ".\nThe car's width is " + width + ".\nThe car's motor is "
        + motor + ".\nThe car's platform weight is " + platform_weight + ".";
    }

    public void setColorString(String color) {
        this.color = color;
    }

    public String getColorString() {
        return "The car's color is " + color;
    }

    public void configureFragance(boolean status) {
        if (status) {
            fragance = true;
        } else {
            fragance = false;
        }
    }

    public void configureLetherSeats(boolean status) {
        if (status) {
            leather_seats = true;

        } else {
            leather_seats = false;
        }
    }

    public String getConfigureSeatsString() {
        if (leather_seats) {
            return "The car has leather seats installed!";
        } else {
            return "The car don't have leather seats installed!";
        }
    }

    public String getConfigureFraganceString() {
        if (fragance) {
            return "The car has fragance installed!";
        } else {
            return "The car dont have fragance installed!";
        }
    }

    public String setTotalPrice() {
        int accumulated = 2000;
        if (fragance) {
            accumulated += 500;
        }
        
        if (leather_seats) {
            accumulated += 1000;
        }

        return "The total price is " + accumulated;
    }

    public String setTotalWeight() {
        total_weight = platform_weight;
        if (fragance) {
            total_weight += 100;
        }

        if (leather_seats) {
            total_weight += 300;
        }

        return "The car's total weight is " + total_weight;
    }
}