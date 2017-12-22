/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialPortofolio;
//import FinancialPortofolio.*;

import financialport.Stocks;


/**
 *
 * @author J_kula
 */
public class FinancialPortofolio 
{
                //add code here to declare the private data firstName, of type string
                //add code here to do the same thing for lastName
                // add code hereto declare private data of type integer, call it portfolioNumber
                //add code here to declare private data member protfolioValue of type type double
                private final SavingsAccount Sav; // here you are declaring the sav of type class SavingsAccount
                private final Bonds Bnd;          // Do the same thing for Bond
                private final Stocks Stk; 

                private String firstName;
                private String lastName;
                private int portfolioNumber;
                private double portfolioValue;

                public FinancialPortofolio()  //constructor
              {
                firstName = "";
                lastName = "";
                portfolioNumber = 0;
                portfolioValue = 0;
               Sav = new SavingsAccount();
                Bnd = new Bonds();
                Stk = new Stocks();
              }//end constructor

            public SavingsAccount getSavingsAccount() 
              { 
                 //add code here. this method will simply return sav
                return Sav;
              }
           
            
            public Bonds getBonds() 
                { 
                    //add code here. this method will simply return Bnd
                  return Bnd;
                }
            public Stocks getStocks() 
                { 
                    //add code here. will return stk
                  return Stk;
                }
            public void setfirstName(String fname)
               {  
                   //add code here. Assign the value passed to this method to the appropriate private data
                   firstName = fname; 
               }
            public void setlastName(String lname)
                { 
                     //add code here.do as above
                  lastName = lname ;
                }
            public void setportfolioNumber(int n) 
                { 
                     //add code here.The appropriate private data will be assigned the value passed to this method
                  portfolioNumber = n;
                }
            public String getfirstName() 
                { 
                    //add code here.simply return the appropriate private data
                  return firstName;
                }
            public String getlastName() 
                { 
                       //add code here.simply retunr the appropriate private data 
                  return lastName;
                }
                int getportfolioNumber() 
                { 
                     //add code here.simply return the appropriate private data
                  return portfolioNumber;
                }

            public void setportfolioValue( double pvalue){
              portfolioValue = pvalue;
            }
            

            public void update_portFolio()   // this method will calculate the value of the portfolio
                { 
                    portfolioValue = portfolioValue + Sav.getBalance() +
                    Bnd.getfaceValue() * Bnd.BondNumber() + Stk.getstockValue() * Stk.Shares(); 
                }

            public double getportfolioValue() 
                { 
                     //add code here.this method will simply return the appropriate private data 
                  return portfolioValue;
                }
       } 
            
