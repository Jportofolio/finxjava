/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialPortofolio;

import java.util.Scanner;

/**
 *
 * @author J_kula
 */
public class Bootstrap {
       //The classname here should match your java file name

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                        FinancialPortofolio Portfolio = new FinancialPortofolio();  //instantiate a new object portfolio

                    Scanner in = new Scanner(System.in); //keyboard input

                    System.out.println("Please Enter The Following Information :");

                    System.out.println("First Name :");
                    String firstName = in.nextLine();   //capture first name from the keyboard

                    Portfolio.setfirstName(firstName);
                    System.out.println("Last Name :"); 
                    //add code here.capture last name from the keyboard, as we did above
                    String lastName = in.nextLine();

                     //add code here.use the appropriate setter to set the last name
                    Portfolio.setlastName(lastName);

                    System.out.println("Portofolio Number :");
                     //add code here.capture portfolio number and store in a local integer variable
                    int portNum = in.nextInt();
                     //add code here.use the setter to set the portfolio number using the local integer variable we just captured from the keyaboard
                    Portfolio.setportfolioNumber(portNum);

                    System.out.println("Account Number :"); 
                     //add code here.read the account number from the keybaord and assign to a local variable accountNumber of type string
                    String accountNumber = in.nextLine();
                  Portfolio.getSavingsAccount().setaccountNumber(accountNumber);
                    in.nextLine();
                    System.out.println("Account Balance :");
                    double accountBalance = in.nextDouble();
                   Portfolio.getSavingsAccount().setBalance(accountBalance);
                   in.nextLine();

                    //Bonds
                    System.out.println("Bond Name :");
                    String bondName = in.nextLine();          //capture bond name
                    Portfolio.getBonds().setbondName(bondName); 
                    in.nextLine();
                    System.out.println("Face Value :"); 
                     double faceValueBonds = in.nextDouble(); // capture face value
                    Portfolio.getBonds().setfaceValue(faceValueBonds);
                    
                   // System.out.println("Number of Stocks :");
                    
                    
                    System.out.println("Number Of Bonds :");
                    int numberOfBonds = in.nextInt();        //capture number of bonds
                    Portfolio.getBonds().setnumberOfBonds(numberOfBonds);      //use the setter to set the number of bonds.

                    in.nextLine();
                    

                    //Stocks
                    System.out.println("Stocks Name:");
                    String stknam = in.nextLine();
                    Portfolio.getStocks().setStockName(stknam);
                    
                    System.out.println("Stocks Value:");
                    double stckv = in.nextFloat();
                    Portfolio.getStocks().setStockValue(stckv);
                    
                    System.out.print("Number of shares:");
                    int numshare = in.nextInt();
                    Portfolio.getStocks().setNumberofShares(numshare);
                    
                     //for stocks, follow the algorithm for Bonds

                    Portfolio.update_portFolio();  //This is a very important step, it would calculate/update based on the current data captured

                    System.out.println("Portfolio Name: "+Portfolio.getfirstName() + " " + Portfolio.getlastName()+"'s Portfolio");
                    System.out.println("Savings Acount: Blue Bank ($"+Portfolio.getSavingsAccount().getBalance()+ ")");
                    System.out.println("Bonds:          "+Portfolio.getBonds().getbondName() + "($"+(Portfolio.getBonds().getfaceValue()*Portfolio.getBonds().BondNumber())+ ")");
                    System.out.println("Stocks:         "+Portfolio.getStocks().getnameStock() + "($"+(Portfolio.getStocks().getstockValue()*Portfolio.getStocks().Shares())+ ")");
                    System.out.println("Total Value:    $"+Portfolio.getportfolioValue());
                    }  
    
}  
    
