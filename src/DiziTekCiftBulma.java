import java.util.Scanner;

public class DiziTekCiftBulma {

	public static void main(String[] args) {
        Scanner klavye = new Scanner (System.in);  
	int a [] = new int [10];
	System.out.println("10 tane tam sayı degeri giriniz");
	for(int i =0 ; i<10 ; i++) {
		
		
		 
		
		a [i] = klavye.nextInt();	
	}
	diziBuyuk(a);
	
	 
}
public static int []  diziBuyuk(int [] a ) {
int Zeynel [];
int o = 0 ;


	for(int i = 0 ; i< a.length ; i++) {
		if ( a[i]%2==0 ) {
			
				
			
			System.out.println("çift sayı >>  " + a[i]);
			
		}
		

			if  (a[i]%2==1) {
				System.out.println("tek sayı >> " + a[i]);
				
		
			}
			
			
			
		
		
		
		
		
	
	
}

return a ;

}}
	

