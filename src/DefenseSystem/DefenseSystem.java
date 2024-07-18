/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DefenseSystem;

import DefenseSystem.com.Observable;
import DefenseSystem.Components.MainController;
import DefenseSystem.Components.Helicopter;
import DefenseSystem.Components.Submarine;
import DefenseSystem.Components.Tank;

/**
 *
 * @author yasaru sandaruwan
 */
public class DefenseSystem {

    private static int index = 1;

    private static int id() {
        return index++;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observable observable = new Observable();
        MainController mainController = new MainController(observable, 0);
        observable.addObserver(new Helicopter(id(), mainController));
        observable.addObserver(new Submarine(id(), mainController));
        observable.addObserver(new Tank(id(), mainController));

        mainController.setVisible(true);
    }
}
