package project8.Lambdas_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingLetterClass {
	private List<String> listOfStrings=new ArrayList<String>();
	
	public StartingLetterClass(List<String> listOfStrings2) {
		this.listOfStrings=listOfStrings2;
	}

	public List<String> getStrings() {
		return listOfStrings.stream().filter(str->str.length()==3 && str.startsWith("a")).collect(Collectors.toList());
	}
}
