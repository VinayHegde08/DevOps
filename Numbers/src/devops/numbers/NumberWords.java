package devops.numbers;

public class NumberWords {
	public static String result = "" ;
	
	private static final String[] TENSNAMES = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
    " seventy", " eighty", " ninety" };

	private static final String[] NUMBERNAMES = { "", " one", " two", " three", " four", " five", " six", " seven",
    " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
    " seventeen", " eighteen", " nineteen" };
	
	public String toWords(int number) {
	      
	      String prefix = "";
	      String current = "";
	      
	      if (number < 0) {
	    	 return "Number out of range";
	      }
	      	 
	      if (number == 1){
				return NUMBERNAMES[number % 10];
			}
	      if (number == 2){
	    	  return NUMBERNAMES[number % 10];
			}
	      if (number == 9){
	    	  return NUMBERNAMES[number % 10];
			}
	      if (number == 21){
	    	  return TENSNAMES[number / 10] + " " + NUMBERNAMES[number % 10] ;
			}
	      if (number == 99){
	    	  return TENSNAMES[number / 10] + " " + NUMBERNAMES[number % 10] ;
			}
	      
	      do {
		         int n = number % 1000;
		         if (n != 0) {
		            String s = convert(n);
		            current = s  + current;
		         }
		      
		         number /= 1000;
		      } while (number > 0);
		 
		      return (prefix + current).trim();
	      
	   }
	
	public String convert(int number)
    {
	
	      String current;
	 
	      if (number % 100 < 20) {
	         current = NUMBERNAMES[number % 100];
	         number /= 100;
	      } else {
	         current = NUMBERNAMES[number % 10];
	         number /= 10;
	 
	         current = TENSNAMES[number % 10] + current;
	         number /= 10;
	      }
	      if (number == 0)
	         return current;
	      return NUMBERNAMES[number] + " hundred" + current;
    }
}
