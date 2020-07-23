package project8.Lambdas_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Scanner in=new Scanner(System.in);
    public static void main( String[] args )
    {
    	 ArrayList<Integer>arrayOfNumbers = new ArrayList<Integer>();
    	 System.out.println("enter the number of Elements to find average using Streams:-\n");
    	 int n=in.nextInt();
        System.out.println("enter the elements to find the average(or press ctrl+z):-\n");
        for(int i=0;i<n;i++) {
        	arrayOfNumbers.add(in.nextInt());
        }
        //finding average...
       
        AverageClass avg=new AverageClass(arrayOfNumbers);
        avg.average();
        
        
        //string starts with 'a' having length==3
        List<String> listOfStrings=Arrays.asList("ana","bat","ant","cat","dog","monkey","axe","tommy");
        StartingLetterClass slc=new StartingLetterClass(listOfStrings);
        System.out.println("\n\nStrings of length 3 & starting with letter a are:- "+slc.getStrings());
    
        //palindrome String..
        Palindrome pc=PalindromeClass::isPalindrome;
        System.out.println("\n\nenter a String to chaeck weather it is palindrome or not using Lambdas & streamwith static method reference:-"+in.nextLine());
        String s=in.nextLine();
        if(pc.palindrome(s))
        	System.out.println("\nPalindrome String..");
        else
        	System.out.println("\nNot a Palindrome String..");
        
    }
}
