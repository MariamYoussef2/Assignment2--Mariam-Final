import java.io.*; 
        import java.util.*;

import src.default package.Units;
import src.default package.Real_Estate;
  
      
public class price_evaluation {
	private String priceRange1 = "$450,000-$490,000";			
	private String priceRange2 = "$550,000-$590,000";			
	
	
	
	public price_evaluation(String range1, String range2 )
	{
	
		priceRange1 = range1;
		priceRange2 = range2;
	
	}
	
	
	
	
	
	public String getpriceRange1()
	{
		return priceRange1;
	}
	
	public String getpriceRange2()
	{
		return priceRange2;
	}
	
	
	public String toString()
	{
		String range_details = name + "("  + duration + " minutes)";
		
		return range_details;
	}
}
