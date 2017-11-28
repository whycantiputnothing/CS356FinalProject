/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356finalproject;

/**
 *
 * @author Brandon
 */
public class ATMMachine {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    private ATMState atmState;

    private int cashInMachine = 2000;

    private boolean correctPinEntered;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {

            atmState = atmOutOfMoney;

        }
    }

    public void setATMState(ATMState atmState) {
        this.atmState = atmState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCashInMachine(int cash) {
        cashInMachine = cash;
    }

    public String insertCard() {
        return atmState.insertCard();
    }

    public String ejectCard() {
        return atmState.ejectCard();
    }

    public String requestCash(int cash) {
        return atmState.requestCash(cash);
    }

    public String insertPin(int pin) {
        return atmState.insertPin(pin);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    public boolean isCorrectPinEntered() {
        return correctPinEntered;
    }

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }

}
