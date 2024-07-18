/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DefenseSystem.Interfaces;

/**
 *
 * @author yasaru sandaruwan
 */
public interface ObservableInterface {

    public void setAreaClearance(String areaCl);

    public void setMessage(String msg);

    public void setStrength(int strength);

    public void setIndex(int index);

    public void setPrivateMsg(int index, String msg);

    public void getInfo(int index);

    public void setAmmoAmount(int index, int amount);
}
