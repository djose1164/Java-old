package object_oriented_programming;

public class Car {
    public Car() {
        wheels = 4;
        length = 2000;
        width = 300;
        motor = 1600;
        platform_weight = 500;
    }

    private final int wheels;
    private final int length;
    private final int width;
    private final int motor;
    private final int platform_weight;
    private String color;
    boolean fragrance, leather_seats;

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

    public void configureFragrance(boolean status) {
        fragrance = status;
    }

    public void configureLeatherSeats(boolean status) {
        leather_seats = status;
    }

    public String getConfigureSeatsString() {
        if (leather_seats) {
            return "The car has leather seats installed!";
        } else {
            return "The car don't have leather seats installed!";
        }
    }

    public String getConfigureFragranceString() {
        if (fragrance) {
            return "The car has fragrance installed!";
        } else {
            return "The car dont have fragrance installed!";
        }
    }

    public void setTotalPrice() {
        int accumulated = 2000;
        if (fragrance)
        {
            accumulated += 500;
        }
        
        if (leather_seats) {
            accumulated += 1000;
        }

    }

    public void setTotalWeight() {
        int total_weight = platform_weight;
        if (fragrance) {
            total_weight += 100;
        }

        if (leather_seats) {
            total_weight += 300;
        }

    }
}