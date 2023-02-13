package day1;

import java.util.Scanner;

public class print4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the end value :");
	    int a = sc.nextInt();
	    int i;
	    for(i=1;i<=a;i++){
	        if(i%2==0)
	        {
	        System.out.print(i+" ");
	        }
	        }

	}

}
