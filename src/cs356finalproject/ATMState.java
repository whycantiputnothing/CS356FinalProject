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
public interface ATMState {
    String insertCard();
    String ejectCard();
    String insertPin(int pinEntered);
    String requestCash(int cashToWithdraw);
    
}
