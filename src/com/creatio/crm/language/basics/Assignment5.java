package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		//1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		List <String> PopulatedTop5 = new ArrayList <String>();
		PopulatedTop5.add("India");
		PopulatedTop5.add("China");
		PopulatedTop5.add("United States");
		PopulatedTop5.add("Indonsia");
		PopulatedTop5.add("Pakistan");
		
		String SecondContry = PopulatedTop5.get(2);
		System.out.println(SecondContry);
		
		//2.Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		Set <String> Top10VisitedTourist = new LinkedHashSet <String> ();
		Top10VisitedTourist.add("Eiffel Tower");
		Top10VisitedTourist.add("GGreate wall of china");
		Top10VisitedTourist.add("Colosseum");
		Top10VisitedTourist.add("Dubai");
		Top10VisitedTourist.add("London");
		Top10VisitedTourist.add("Louvre Museum");
		Top10VisitedTourist.add("Acropolis of Athens");
		Top10VisitedTourist.add("Basílica de la Sagrada Familia");
		Top10VisitedTourist.add("Taj Mahal");
		Top10VisitedTourist.add("Grand Canyon");
		
		int Size = Top10VisitedTourist.size();
		System.out.println(Size);
		
		
		//3.Create a map of the 5 largest cities in the United States and their populations.
		
		Map <String ,Integer> Top5LargestCity = new HashMap <String ,Integer> ();
		Top5LargestCity.put("New York", 8804190);
		Top5LargestCity.put("Los Angeles",3898747);
		Top5LargestCity.put("Chicago", 2746388);
		Top5LargestCity.put("Houston",  2304580);
		Top5LargestCity.put("Phoenix", 1644409);
		
		System.out.println(Top5LargestCity);
		
		//4.Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		int [] Integers = new int [] {10,23,34,35,54,65,56,87,43,67};
		
		int Add = Integers[2] + Integers[4];
		System.out.println(Add);
		
		
		//5.Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List <String> Top5Movies = new ArrayList <String> ();
		Top5Movies.add("Avatar");
		Top5Movies.add("Avengers: Endgame");
		Top5Movies.add("Avatar- The Way of Water");
		Top5Movies.add("Titanic");
		Top5Movies.add("Spider-Man: No Way Home");
		
		String ThirdMovie = Top5Movies.get(2);
		System.out.println(ThirdMovie);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
