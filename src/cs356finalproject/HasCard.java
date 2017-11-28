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
public class HasCard implements ATMState {

    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public String insertCard() {
        String str = "You can only insert one card at a time";
        System.out.println("You can only insert one card at a time");
        return str;
    }

    @Override
    public String ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
        return "Your card is ejected";
    }

    @Override
    public String insertPin(int pinEntered) {
        if(pinEntered == 1234) {
            System.out.println("You entered the correct PIN");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setATMState(atmMachine.getHasPin());
            return "You entered the correct PIN";
        } else {
            System.out.println("You entered the wrong PIN");
            atmMachine.setCorrectPinEntered(false);
            return "You entered the wrong PIN";
        }
    }

    @Override
    public String requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your PIN");
        return "You have not entered your PIN";
    }

}
