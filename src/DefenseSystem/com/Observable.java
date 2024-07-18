/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefenseSystem.com;

import DefenseSystem.Interfaces.ObservableInterface;
import DefenseSystem.Interfaces.Observer;
import java.util.*;

/**
 *
 * @author yasaru sandaruwan
 */
public class Observable implements ObservableInterface {

    private final ArrayList<Observer> observerList = new ArrayList<>();
    private String isCleared;
    private String msg;
    private int strength;
    private int index;
    private String privateMsg;
    private int index2;
    private int index3;
    private int index4;
    private int amount;

    public void addObserver(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void setAreaClearance(String isCleared) {
        if (!isCleared.equals(this.isCleared)) {
            this.isCleared = isCleared;
            notifyDevices();
        }
    }

    @Override
    public void setMessage(String msg) {
        this.msg = msg;
        notifyDevices();
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
        notifyDevices();
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
        notifyDevices();
    }

    @Override
    public void setPrivateMsg(int index2, String privateMsg) {
        this.index2 = index2;
        this.privateMsg = privateMsg;
        notifyDevices();
    }

    @Override
    public void getInfo(int index3) {
        this.index3 = index3;
        notifyDevices();
    }

    @Override
    public void setAmmoAmount(int index, int amount) {
        this.index4 = index;
        this.amount = amount;
        notifyDevices();
    }

    public void notifyDevices() {
        for (Observer ob : observerList) {
            ob.areaClearance(isCleared);
            ob.message(msg);
            ob.strength(strength);
            ob.comboBoxIndex(index);
            ob.setPrivateMsg(index2, privateMsg);
            ob.getInfo(index3);
            ob.setAmmoAmount(index4, amount);
        }
    }

}
