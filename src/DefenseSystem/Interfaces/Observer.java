/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DefenseSystem.Interfaces;

/**
 *
 * @author yasaru sandaruwan
 */
public interface Observer {

    public void areaClearance(String clearance);

    public void message(String msg);

    public void strength(int strength);

    public void comboBoxIndex(int index);

    public void setPrivateMsg(int index2, String msgPri);

    public void getInfo(int index3);
    
    public void setAmmoAmount(int index, int amount);
}
