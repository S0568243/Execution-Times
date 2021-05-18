package testit;

import java.util.Arrays;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		
		
		long sum = 0;
		List<Integer> ListOfNs = Arrays.asList(10, 100, 1000, 10000, 100000);
		int n = ListOfNs.size();
		
		for (int x = 0; x < ListOfNs.size(); x++) {
			System.out.println(ListOfNs.get(x));
			
		
			
		//################Frag1##############################
		
		/*	for ( int i = 0; i < ListOfNs.size(); i ++)
			    sum++;
			System.out.println("Frag 1: " + sum);
			
		*/
		//################Frag1##############################
			
		//################Frag2############################	
			
		/*	for ( int i = 0; i < ListOfNs.get(x); i ++)
			    for ( int j = 0; j < ListOfNs.get(x); j ++)
			        sum++;
			System.out.println("Frag 2: " + sum);
		
		*/	
		//################Frag2##########################	
		
		//################Frag3##############################
		/*
			for ( int i = 0; i < ListOfNs.get(x); i ++)
			    for ( int j = i; j < ListOfNs.get(x); j ++)
			        sum++;
			System.out.println("Frag 3: " + sum);
			
		*/	
		//################Frag3##############################
		
		//################Frag4##############################
		/*	
			for ( int i = 0; i < ListOfNs.get(x); i ++)
			    sum ++;
			    for ( int j = 0; j < ListOfNs.get(x); j ++)
			        sum ++;
				System.out.println("Frag 4: " + sum);
		*/		
		//################Frag4##############################
			
		//################Frag5##############################
			/*
			 //bei 10000 hat es ein wenig gedauert und bei 100000 zu lange
			 
			for ( int i = 0; i < ListOfNs.get(x) ; i ++)
			    for ( int j = 0; j < ListOfNs.get(x)*ListOfNs.get(x); j ++)
			    sum++;
			System.out.println("Frag 5: " + sum);
			*/
		//################Frag5##############################
			
		//################Frag6##############################
			/*
			for ( int i = 0; i < ListOfNs.get(x); i ++)
			    for ( int j = 0; j < i; j ++)
			        sum++;
			System.out.println("Frag 6: " + sum);
			*/
		//################Frag6##############################
			
		//################Frag7##############################
			
			// bei 1000 hat es lange gedauert 2 min und bei 10000 garnicht mehr
			/*
			for ( int i = 1; i < ListOfNs.get(x); i ++)
			    for ( int j = 0; j < ListOfNs.get(x)*ListOfNs.get(x); j ++)
			        if (j % i == 0)
			           for (int k = 0; k < j; k++)
			               sum++;
			System.out.println("Frag 7: " + sum);
			*/
		//################Frag7##############################
			
		//################Frag8##############################
			/*
			int i = ListOfNs.get(x);
			while (i > 1) {
			    i = i / 2;
			    sum++;
			}
			
			System.out.println("Frag 8: " + sum);
			*/
		//################Frag8##############################
		}
		
		sum = 0;
	}
	
}
