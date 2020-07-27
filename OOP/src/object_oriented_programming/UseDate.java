package object_oriented_programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class UseDate implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Date hourDate = new Date();
         
        System.out.println(hourDate);
    }

}