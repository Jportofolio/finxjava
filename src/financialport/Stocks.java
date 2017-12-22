/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialport;

/**
 *
 * @author J_kula
 * 
 */
/** 
 * 
 * @Class Stocks
 *  this is a stock class that define data fields for stocks and its methods.
 */
public class Stocks {

    // Defining Stocks fields
    private String stockName;
    private double stockValue;
    private int numberofShares;
    
    public Stocks(){
    stockName = "";
    stockValue = 0;
    numberofShares = 0;

  }
            /* Setting the Stock name */


    
            public void setStockName(String skname)
            {
               stockName = skname;
            }
            // Setting the  stock value
            public void setStockValue(double stockv)
            {
              stockValue = stockv;
            }
            // Setting the stock NumberofShares
            public void setNumberofShares(int shareNum)
            {
              numberofShares = shareNum;
            }
            // Getting the stockName
            public String getStockName()
            {
              return stockName;
            }
            //Getting the stockValue
            public double getStockValue()
            {
              return stockValue;
            }
            //returning the StockNumber of Shares
            public int getNumberOfShares()
            {
              return numberofShares;
            }

    public double getstockValue() {
        return stockValue;
    }

    public int Shares() {
     return numberofShares;
    }

    public String getnameStock() 
    {
        return stockName;
    }
}
