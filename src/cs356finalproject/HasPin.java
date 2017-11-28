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
public class HasPin implements ATMState {
    private ATMMachine atmMachine;
    
    public HasPin(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public String insertCard() {
        System.out.println("You already entered a card");
        return "You already entered a card";
    }

    @Override
    public String ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
        return "Your card is ejected";
    }

    @Override
    public String insertPin(int pinEntered) {
        System.out.println("You already entered a PIN");
        return "You already entered a PIN";
    }

    @Override
    public String requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.getCashInMachine()) {
            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
            return "You don't have that much cash available\n" + 
                    "Your card is ejected";
        } else {
            System.out.println("$" + cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashToWithdraw);
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
            
            if(atmMachine.getCashInMachine() <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
            
            return "$" + cashToWithdraw + " is provided by the machine\n" + 
                    "Your card is ejected";
        }
    }
    
    
}
