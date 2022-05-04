import java.io.*; 
        import java.util.*;

import src.default package.Real_Estate;
import src.default package.Units;



public class units_schedule {
	private Units[] scheduleOfinspections;		
	private int houses_added;				
	private static final int MAX_Houses = 2;		
	
	public units_schedule()
	{
		scheduleOfinspections = new Units[MAX_Houses];		
		houses_added = 0;						
	}
	
	
	public boolean addunitscheduale(Units UnitToAdd)
	{
		boolean Added = false;		
		
		if (UnitToAdd != null)			
		{
			if (houses_added < MAX_Houses && )		
			{
				scheduleOfinspections[houses_added] = UnitToAdd;		
				houses_added++;					
				Added = true;						
			} else {								
				Added = false;
			}
		}
		else {				
			Added = false;
		}
		
		return Added;
	}
	
	/** Retrieve the Movie that is in a particular position, using a 0-based index.
	 * @param position a number from 0 up to 1 below MAX_MOVIES
	 * @return The specific Movie that is scheduled to happen in that position of ordering.
	 */
	public UnitsSchedualed getUnitsSchedualed(int index)
	{
		if (index < 0 || index >= Units)
			return null;		// The position is invalid, based on the current contents of this RoomSchedule.
		else
			return scheduleOfinspections[index];		// The position is valid, so use it to access the array.
	}
	
	
}
