package object_oriented_programming;

import javax.swing.JOptionPane;

public class Use_Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setColorString("Black");

        myCar.configureLeatherSeats(true);

        myCar.configureFragrance(false);

        myCar.setTotalPrice();

        myCar.setTotalWeight();

        JOptionPane.showMessageDialog(null, myCar.getGeneralData() + "\n" + myCar.getColorString() + "\n" + myCar.getConfigureFragranceString()
        + myCar.getConfigureSeatsString(), "Car's information", JOptionPane.INFORMATION_MESSAGE);
        
        Van myVan = new Van(5, 500);

        myVan.setColorString("Red");
        
        myVan.configureLeatherSeats(false);

        JOptionPane.showMessageDialog(null, myVan.getGeneralData() + "\n" + myVan.getCapacityLoadString() + "\n" + myVan.getExtraPlaceString());
    }
}