package project8.Lambdas_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageClass {
		private ArrayList<Integer>listOfNumbers=new ArrayList<Integer>();
		public AverageClass(ArrayList<Integer> arrayOfNumbers) {
			this.listOfNumbers=arrayOfNumbers;
		}

		void average() {
			listOfNumbers.stream()
						.mapToInt(number->number)
						.average()
						.ifPresent(avg->System.out.println("Average is:- "+avg));	
		}
		
}
