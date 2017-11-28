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
public class NoCash implements ATMState {

    private ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public String insertCard() {
        System.out.println("This atm has insufficient funds");
        System.out.println("Your card is ejected");
        return "This atm has insufficient funds\n" + "Your card is rejected";
    }

    @Override
    public String ejectCard() {
        System.out.println("A card has not been inserted yet");
        return "A card has not been inserted yet";
    }

    @Override
    public String insertPin(int pinEntered) {
        System.out.println("This atm has insufficient funds");
        return "A card has not been inserted yet";
    }

    @Override
    public String requestCash(int cashToWithdraw) {
        System.out.println("This atm has insufficient funds");
        return "A card has not been inserted yet";
    }

}
