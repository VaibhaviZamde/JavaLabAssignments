//Develop a functionality to get the count of valid registration numbers from the given array.

class SY2023bit503
{
	public static void main(String args[])
	{
		SY2023bit503 sy503 = new SY2023bit503(); //Creating instance of class
		
		//Registration array for IT,CSE,Mechanical,Chemical engineering depts
		String registration[] = {"2020bit001", "2021bcs165", "2022bme053", 
		"2023bch502", "2023BIT503", "2025bce423", "2023bce42"};
		
		int count = sy503.getValidRegistrationsCount(registration);
		System.out.println(count); 
	}
	
	public int getValidRegistrationsCount(String registrations[]) 
	{
		int len = registrations.length;
		int validcount = 0;
		
		for(int i=0 ; i<len;i++)
		{
		
			if(registrations[i].length() != 10)
			{
				continue;
			}
			
			String year = registrations[i].substring(0,4);
			String dept = registrations[i].substring(4,7);
			String dig = registrations[i].substring(7,10);
			
			int conYear = Integer.parseInt(year);
			int conDig = Integer.parseInt(dig);
			
            		if (conYear >= 2000 && conYear <= 2024) 
            		{
                		if (dept.equals("bit") || dept.equals("bcs") || dept.equals("bme") || dept.equals("bch") ) 
            			{
                			if (dig.matches("\\d+"))
           				{
                				validcount++;
           				}
            			}
            		}
           	}

        return validcount;
		
	}
}

