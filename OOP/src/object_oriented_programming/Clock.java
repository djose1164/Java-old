package object_oriented_programming;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Date;

import javax.swing.Timer;

public class Clock {
 
    public void onGoing(int interval, final boolean sound) {

        class GetHour implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                LocalTime myClock = LocalTime.now();

                System.out.printf("%s\r", myClock);
    
                if (sound) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new GetHour();

        Timer clockTimer = new Timer(interval, listener);
        clockTimer.start();
    }
}