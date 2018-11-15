package devops.numbers;

import java.io.BufferedReader;
import devops.numbers.NumberWords;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		
		while( true ) {
			try {
				System.out.println( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				if(number == 0){
					System.out.println( "Exicited!!" ) ;
					return;
				}
				else if (number < 0){
					System.out.println( "Enter numbers greater than zero" ) ;
				}
				else if (number > 999){
					System.out.println( "Enter numbers less than 1000" ) ;
				}
				else{
					System.out.print("After conversion number in words is : ");
					String res= numberWords.toWords(number);
					
					System.out.println(res);
					
////					String res1 = numberWords.toWords((number / 1000000000), " Hundred");
////		            System.out.print(res1);
////		            
////		            String res2 =numberWords.toWords((number / 10000000) % 100, " crore");
////		            System.out.print(res2);
////		            
////		            String res3 =numberWords.toWords(((number / 100000) % 100), " lakh");
////		            System.out.print(res3);
////		            
////		            String res4 =numberWords.toWords(((number / 1000) % 100), " thousand");
////		            System.out.print(res4);
////		            
//		            String res5 =numberWords.toWords(((number / 100) % 10), " hundred");
//		            System.out.print(res5);
//		            
//		            String res6 =numberWords.toWords((number % 100), " ");
//		            System.out.println(res6);
				}
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Invalid number" ) ;
			}
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
