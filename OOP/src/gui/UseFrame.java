package gui;

import java.awt.Frame;

public class UseFrame {
    public static void main(String[] args) {
        FirstFrame frame = new FirstFrame(500, (500/2), 500, ((int)(500/2.5))); 
        frame.setTitle("My fisrt frame in java xD!");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);   
    }

}