/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialPortofolio;

/**
 *
 * @author J_kula
 * 
 */


public class SavingsAccount {
    
     //add code here. Declare a private data of type string, call it accountNumber
     //add code here. Declare a private data of type double, call it balance
    private String accountNumber;
    private double balance;
    
  //ends constructor


    SavingsAccount() {
        accountNumber = "";
        balance = 0;
    }


   
public void setBalance(double bal)
    { 
        //add code here.Set the value here
        this.balance = bal;

    }
public void setaccountNumber(String num) 
    { 
        //add code here. Set the value here
        accountNumber = num;
    }
public double getBalance() 
    { 
         //add code here. Simply return the appropriate private data
        return balance;
    }
public String getaccountNumber() 
    { 
         //add code here. Simply return the appropriate private data
        return accountNumber;
    }
}  

