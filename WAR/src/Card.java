import java.util.*;

public class Card {
	
	public static void main(String[] args) {
	}
		
	
		private int value;
		
		private String name;
		
		final static String[] suits = {"Spades", "Hearts", "Diamonds","Clubs"};		
		
		final static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};

		
			public Card(String name, int value) {
			 
				this.setName(name);	
			 
					this.setValue(value);

	}     
		public Card(int i) {
				
			}
		public void describe() {
		
			System.out.println("Card: " + name + " " + value);
			
		}
	
	public void set( ) {
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
		
	}

