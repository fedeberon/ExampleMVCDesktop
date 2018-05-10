package main;

import view.View;

import javax.swing.*;

/**
 * Created by Damian on 10/05/2018.
 */
public class SwingMVCDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                createAndShowGUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new View();
    }
}
