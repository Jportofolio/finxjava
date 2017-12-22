/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinancialPortofolio;

/**
 *
 * @author J_kula
 */
public class Bonds {
    
    private String bondName;
    private double faceValue;
    private int numberOfBonds;
    public Bonds() {
    bondName = "";
    faceValue = 0;
    numberOfBonds = 0;
    }
    public void setfaceValue(double fvalue)
    { 
       // add code here.set the appropriate private data
        /* passing the facevalue in param */
        faceValue = fvalue;

    }
    public void setbondName(String bname) 
    { 
          //add code here.set the appropriate private data
        /* passing the bonds name in param */
        bondName = bname;

    }
    public void setnumberOfBonds(int bondnum) 
    { 
         //add code here.set the appropriate private data
        /* Setting bond number in parameters */
        numberOfBonds = bondnum;
    }
   public double getfaceValue() 
    { 
        //add code here.return appropriate private data
        /* Returning the face value*/
        return faceValue;
    }
   public String getbondName() 
    { 
          //add code here.return appropriate private data
        return bondName;
    }
   public int getBondNumber(int numBong) 
    { 
         //add code here.return appropriate private data
        return numberOfBonds = numBong;
    }

    double BondNumber() {
       return numberOfBonds;
    }
    
}
