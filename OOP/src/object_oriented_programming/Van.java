package object_oriented_programming;

public class Van extends Car {
    public Van(int capacity_load, int extra_place) {
        super(); //call the builder
        this.capacity_load = capacity_load;
        this.extra_place = extra_place;
    }

    int capacity_load;
    int extra_place;

    public String getCapacityLoadString() {
        return "The car's capacity load is " + capacity_load + ".";
    }

    public String getExtraPlaceString() {
        return "The car's extra place is " + extra_place + ".";
    }
}