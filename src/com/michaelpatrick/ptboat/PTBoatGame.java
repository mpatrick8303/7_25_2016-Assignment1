package com.michaelpatrick.ptboat;

public class PTBoatGame
{
	private PTBoat[] ptboats = new PTBoat[6];
	private int numberOfBoats = 0;
	
	
	public PTBoatGame()
	{
		
	}
	
	public void addBoat(String row, int column)
	{
			ptboats[numberOfBoats++] = new PTBoat(row, column);//creates a new instance(object) of the PT Boat class 
	}
	
	public boolean guess(String row, int column)
	{
		for (int i = 0; i<ptboats.length ; i++)
		{
			if(ptboats[i].isHit(row, column))					
			{
				return true;
			}
			
			
		}
		return false;
	}
	
	public void printHit(String row, int column)
	{
		
		if (this.guess(row, column) == true)
		{
			
			System.out.println("You hit a ship in this location " + row + " " + column);
		}else
		{
			System.out.println("you missed");
		}
	}
	
	public static void main(String[] args)
	{
		PTBoatGame ptg = new PTBoatGame();//creates new instance(object) of this class 
		ptg.addBoat("A",2);//uses the created instance to call the addBoat method (which then creates another object from PTBoat class)
		ptg.addBoat("B",3);
		ptg.addBoat("C",4);
		ptg.addBoat("D",5);
		ptg.addBoat("E",6);
		ptg.addBoat("F",7);
		
		ptg.printHit("A", 2);
		ptg.printHit("B", 10);
		ptg.printHit("F", 7);
		ptg.printHit("l", 7);
		ptg.printHit("C", 4);
		ptg.printHit("C", 3232);
		
		
		
	}
}
