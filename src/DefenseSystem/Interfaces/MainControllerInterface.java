/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DefenseSystem.Interfaces;

/**
 *
 * @author yasaru sandaruwan
 */
public interface MainControllerInterface {

    public void setFields(String msg, String title);

    public void setComboBox(String componentName);

    public void setInfo(int soldier, int ammo, int fuel, String oxygen);
}