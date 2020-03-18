package suitFibonacci;

import java.util.List;
import java.util.Scanner;

public class SuitFibonacci {
	
	public SuitFibonacci() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int[] suitfibo(int n) {
		
		
		int n_1=0; int n_2=1;
		int n_3=0; int i;
		int T[]= new int [n];
		
		
		/*System.out.println("entrez le nombre des termes de la suite:");	
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();*/
		
		T[0]=0;
		T[1]=1;
		for (i=2 ; i<n; i++)
		{
				n_3=n_1+n_2;
				n_1=n_2;
				n_2=n_3;
				//T[i]=T[i-1]+T[i-2];
				//T[i-1]=T[i];
				//T[i-2]=T[i-1];
				T[i]=n_3;
				
		}
		//System.out.println("la suite Finonacci est:");
		/*for (i=0 ; i<n; i++)
		{
			System.out.println("T["+i+"]= "+" "+T[i]);
			
		}*/
		return T;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int Tableau[]= suitfibo(29);
		for (i=0 ; i<29; i++)
		{
			System.out.println("T["+i+"]= "+" "+Tableau[i]);
			
		}
		
	}

}
