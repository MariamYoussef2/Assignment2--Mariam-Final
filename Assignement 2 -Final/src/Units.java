import java.io.*; 
        import java.util.*;
        //-----------Class Unit--------------------//
        class Units
        {
            private String Suburb;       
            private String Address;    
            private String BuildingName;   
            private String BuildingNumber; 
            private String PostCode; 
            private String Bathroom;    
            private String Photoes;    
            private String Parking;     
            private int offer;          
            private int sale;           
            private boolean Booked;
            private boolean Cancel; 
            private String CXName;    
            private String CXAddress;     
            private String CXPhone;       
             private static int Count;   //Nu Units Added
        public Units ()  
            {
                Suburb        = null;
                Address    = null;
                BuildingName    = null;
               BuildingNumber  = null;
                PostCode         = null;
                Cancel      = false;
                Bathroom    = null;
                Photoes     = null;
                Parking     = null;
                Area        = 0;
                Rate        = 0;
                Booked      = false;
                CXName    = null;
                CXAddress     = null;
                CXPhone       = null;
              
                Count       = Count + 1;
            }
        
        public Units (String strSuburb, 
        		String strAddress, 
        		String strBuildingName, 
        		String strBuildingNumber, 
        		String strPostCode,
        		String strBathroom, 
        		String strParking,
        		String strPhotoes, int intArea, int intRate)
            {
                Suburb        = strSuburb;
                Address    = strAddress;
                BuildingName    = strBuildingName;
                BuildingNumber  = strBuildingNumber;
                PostCode         = strPostCode;
                Cancel      = false;
                Bathroom    = strBathroom;
                Photoes     = strPhotoes;
                Parking     = strParking;
                Area        = intArea;
                Rate        = intRate;
                Booked      = false;
                CXName    = null;
                CXAddress     = null;
                CXPhone       = null;
                
                Count       = Count + 1;        
            }
        
            public void SeeUnits()
            {
                Formatter fmt = new Formatter();
                System.out.println("Suburb          : " + Suburb);
                System.out.println("Unit Address  : " + Address);
                System.out.println("Building Name : " + BuildingName);
                System.out.println("Building Number   : " + BuildingNumber);
                System.out.println("Parking       : " + Parking);
                System.out.println("Building Area   : " + Area);
                System.out.println("Rate Rs./Square.Feet: " + Rate);
                System.out.println("Unit Cost:Rs " + fmt.format("%,.2f", (float)(Area*Rate)));
                System.out.print("Property Booked   : ");
                if(Booked==true) 
                    System.out.println(CXName+"; "+ CXAddress+"; "+ CXPhone); 
                else
                    System.out.println("No");
            }
        
            public static int getUnitsCount()
            {
                return Count;
            }
        
            public boolean getUnitBookingInfo()
            {
                return Booked;
            }
            public boolean getUnitCancelationInfo()
            {
                return Cancel;
            }
        
            public void CXInfo(String strCustomerName, String strCustomerAddress, String strPhone)
            {
                CXName    = strCustomerName;
                CXAddress     = strCustomerAddress;
                CXPhone       = strPhone;
                
                Booked      = true;
                Cancel = true; 
            }
        }