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
public class NoCard implements ATMState {
    
    private ATMMachine atmMachine;
    
    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public String insertCard() {
        System.out.println("Please enter your pin");
        atmMachine.setATMState(atmMachine.getYesCardState());
        return "Please enter your pin";
    }

    @Override
    public String ejectCard() {
        System.out.println("A card has not been inserted yet");
        return "A card has not been inserted yet";
    }

    @Override
    public String insertPin(int pinEntered) {
        System.out.println("A card has not been inserted yet");
        return "A card has not been inserted yet";
    }

    @Override
    public String requestCash(int cashToWithdraw) {
        System.out.println("A card has not been inserted yet");
        return "A card has not been inserted yet"; 
    }
    
}
