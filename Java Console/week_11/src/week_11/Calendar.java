package week_11;

import java.util.Scanner;

public class Calendar {
	
	public static void main(String[] args)
	{
		//could maybe do something with an array to make this a lot cleaner, but the assignment specified using a switch. switch inside for loop is dirty
		boolean finished = false;
		Scanner reader = new Scanner(System.in);
		while(!finished)
		{
		  //get user input
		  System.out.print("Please input the month (1-12): ");
		  int month = reader.nextInt();
		  System.out.println(); //go next line
		  System.out.print("Please input the day (1-31)");
		  int day = reader.nextInt();
		  System.out.println();
		  
		  switch(month)
		  {
		    case 1:
		        if(day > 31)
		        {
		           System.out.println("January does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in January");
		        }
		        break;
		    case 2:
		        if(day > 28)
		        {
		           System.out.println("February does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in Februrary");
		        }
		        break;
		    case 3:
		        if(day > 31)
		        {
		           System.out.println("March does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in March");
		        }
		        break;
		    case 4:
		        if(day > 30)
		        {
		           System.out.println("April does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in April");
		        }
		        break;
		    case 5:
		        if(day > 31)
		        {
		           System.out.println("May does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in May");
		        }
		        break;
		    case 6:
		        if(day > 30)
		        {
		           System.out.println("June does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in June");
		        }
		        break;
		    case 7:
		        if(day > 31)
		        {
		           System.out.println("July does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in July");
		        }
		        break;
		    case 8:
		        if(day > 31)
		        {
		           System.out.println("August does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in Auguest");
		        }
		        break;
		    case 9:
		        if(day > 30)
		        {
		           System.out.println("September does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in September");
		        }
		        break;
		    case 10:
		        if(day > 31)
		        {
		           System.out.println("October does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in October");
		        }
		        break;
		    case 11:
		        if(day > 30)
		        {
		           System.out.println("November does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in November");
		        }
		        break;
		    case 12:
		        if(day > 31)
		        {
		           System.out.println("December does not contain "+ day +" days");
		        }
		        else
		        {
		          System.out.println("You are correct! There are " + day + " days or more in December");
		        }
		        break;
		    default:
		        System.out.println("That month does not exist!");
		        System.out.println("Terminating program");
		        finished = true;
		        break;
		  }
		}
		reader.close();
	}
}
