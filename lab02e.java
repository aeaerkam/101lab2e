public class Lab02e 
{
    
    public static void main(String[] args) 
    {
    	
	    	// I am declaring below all of the variables I will use ;
	    
	    double a;
	    double b;
	    double c;
	    double area ;
	    double s ;
	    int flowersPlant; 
	    //----------------------------------------------------------------------------------
	    //I am assigning them gradually
	    a = 5.0; 
	    b = 7.0;	
	    c = 10.0;
	     
	    s = ( a + b + c)/2;
	    
	    area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
	    
	    flowersPlant = (int)(area*17); // By this way I omit the decimal points so the number of flowers will be
	                                  // an integer.         
	   //--------------------------------------------------------------------------------------------------------  
	    System.out.println(  a + ", "+ b +" and " + c +" meters are three side lengths of a triangle shaped garden.");
	    System.out.println( area +  " metersquare is the area of this garden. ");
	    System.out.println( "We can plant 17 flowers to one metersquare area");
	    System.out.println(flowersPlant + " flowers will be planted to the garden.");
	    
	    System.out.println(" ");
	    System.out.println("---End of Wednesday Lab02e---");
	    
    
    
    }
}
