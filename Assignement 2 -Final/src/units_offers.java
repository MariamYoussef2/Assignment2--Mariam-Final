import java.io.*; 
        import java.util.*;

import src.default package.Units;
import src.default package.Real_Estate;
  
      
        public class units_offers {
        	
        	private double basePrice;			
        	private double customerPrice;		
        	private static int numberOfcustomers = 4;				
        	public units_offers( double standard_price,  int numberOfbuyers)
        	{
        		
        		basePrice = standard_price;
        		numberOfcustomers = numberOfbuyers;
        	}
        	
        	
        	
        	public void setPriceBargin(double newPrice)
        	{
        		if (newPrice > 0)				
        		{
        			basePrice = newPrice;		
        		}
        	}
        	
        	public void setnumberOfbuyers(double newBuyer)
        	{
        		if (newBuyer > 0 && newBuyer <= 4)				
        		{
        			numberOfcustomers = newBuyer;		
        		}
        	}
        	
        	
        	
        	public String getbasePrice()
        	{
        		return basePrice;
        	}
        	
        	public double getcustomerPrice()
        	{
        		return customerPrice;
        	}
        	
        	public double getnumberOfcustomers()
        	{
        		return numberOfcustomers;
        	}
        	
        	
        	
        /////// Create adjustments /////////////////
        	public String toString()
        	{
        		
        		String adjustment = Unit + "(" " + " Time)";
        		
        		return adjustment;
        	}
        }
