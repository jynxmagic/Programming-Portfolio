package week_13;

import java.util.Scanner;

public class Decorator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter hourly rate: ");
		float hourly_rate = reader.nextFloat();
		System.out.println();
		
		System.out.print("Please enter the rooms area: ");
		int area = reader.nextInt();
		System.out.println();
		
		System.out.print("Please enter the rooms unit cost: ");
		float unit_cost = reader.nextFloat();
		System.out.println();

		System.out.print("Please enter the rooms decorating time: ");
		int time = reader.nextInt();
		System.out.println();
		
		TiledRoom room = new TiledRoom(area, unit_cost, time, hourly_rate);
		
		float total_cost = room.calculate_cost();
		
		System.out.println("The job will cost £"+total_cost);
	}

}
