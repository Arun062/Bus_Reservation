package project;

import java.sql.*;
import java.util.Scanner;

public class BusDemo1 {
	public static void main(String[] args) throws SQLException 
	{	
		BusDAO busdao=new BusDAO();
		try {
			busdao.displayBusInfo();
			int userOpt=1;
			Scanner sc1=new Scanner(System.in);
			while(userOpt==1)
			{
				System.out.println("**************************");
				System.out.println("Enter 1 to Book and 2 to exit");
//				System.out.println();
				userOpt=sc1.nextInt();
				if(userOpt==1)
				{
					Booking booking=new Booking();
					if(booking.isAvailable())
					{
						BookingDAO bookingdao=new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("your booking is confirmed");
						System.out.println("-------------------------------");
					}
					else
					{
						System.out.println("Sorry! bus is full, Try another date or bus");
					}
				}
				
			}
			sc1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

}

