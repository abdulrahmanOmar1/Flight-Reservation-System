package application;

import java.util.Date;
import java.util.Scanner;



public class test {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter any numebr");
		int sum1=0;
		int n=input.nextInt();
		int m=n;
		int is=isPa(n);
		if(is==0) {
			System.out.println("its pal");
		}
		else {
			System.out.println("its not pal");
		}
		while(n>0) {
			sum=sum+n%10;
			sum1=sum1*10+n%10;
			n=n/10;
			
		}
		int max=0;
		while(m>0) {
		int	f=f=m%10;
			if(f>max) {
				max=f;
			}
			m=m/10;
		}
		System.out.println("the revers is " + sum);
		System.out.println("the sum of dight" + sum1 ); 
System.out.println("the max number is :");



	}
	public static int isPa(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 1;
			}
		}
		return 0;
	}

	

}
