package com.creatio.crm.language.basics;

public class ArrayAssignment {

	public static void main(String[] args) {

		String [] [] [] supermarket = new String [2] [4] [5] ;
		//Main Category 1 (Groceries)
		//Beverages Category
		supermarket [0][0][0]= "Cola";
		supermarket [0][0][1]= "orange juice";
		supermarket [0][0][2]= "lemonade";
		supermarket [0][0][3]= "Green tea";
		supermarket [0][0][4]= "Black Coffee";
		
		//Snacks category
		supermarket [0][1][0]= "Popcorn";
		supermarket [0][1][1]= "Trail Mix";
		supermarket [0][1][2]= "Beef Jerky";
		supermarket [0][1][3]= "Salted Nuts";
		supermarket [0][1][4]= "Rice Cakes";

		//Dairy Product category
		supermarket [0][2][0]= "Cottage Cheese";
		supermarket [0][2][1]= "Heavy Cream";
		supermarket [0][2][2]= "Ice Cream";
		supermarket [0][2][3]= "Parmesan Cheese";
		supermarket [0][2][4]= "Eggnog";

		//Produce category
		supermarket [0][3][0]= "Apples";
		supermarket [0][3][1]= "Bananas";
		supermarket [0][3][2]= "Carrots";
		supermarket [0][3][3]= "Potatoes";
		supermarket [0][3][4]= "Onions";
		
		
		//Main Category 2 (Electronics)
		//Beverages Category
				supermarket [1][0][0]= "Cola";
				supermarket [1][0][1]= "orange juice";
				supermarket [1][0][2]= "lemonade";
				supermarket [1][0][3]= "Green tea";
				supermarket [1][0][4]= "Black Coffee";
				
				//Snacks category
				supermarket [1][1][0]= "Popcorn";
				supermarket [1][1][1]= "Trail Mix";
				supermarket [1][1][2]= "Beef Jerky";
				supermarket [1][1][3]= "Salted Nuts";
				supermarket [1][1][4]= "Rice Cakes";

				//Dairy Product category
				supermarket [1][2][0]= "Cottage Cheese";
				supermarket [1][2][1]= "Heavy Cream";
				supermarket [1][2][2]= "Ice Cream";
				supermarket [1][2][3]= "Parmesan Cheese";
				supermarket [1][2][4]= "Eggnog";

				//Produce category
				supermarket [1][3][0]= "Apples";
				supermarket [1][3][1]= "Bananas";
				supermarket [1][3][2]= "Carrots";
				supermarket [1][3][3]= "Potatoes";
				supermarket [1][3][4]= "Onions";
				
				System.out.println(supermarket [1][0][0]);
		
	
		
		
	}

}
