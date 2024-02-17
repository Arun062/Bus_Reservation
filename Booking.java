package project;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Booking {
	String passenger_name;
	int busNo;
	Date date;
	
	Booking()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name of the passenger:");
		passenger_name=sc1.next();
		System.out.println("Enter busno:");
		busNo=sc1.nextInt();
		System.out.println("Enter date you want to travel (dd-MM-yyyy)");
		String dateInput=sc1.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try 
		{
			date=dateFormat.parse(dateInput);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}
	public boolean isAvailable() throws SQLException
	{
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao=new BookingDAO();
		
		int capacity=busdao.getCapacity(busNo);
		
		int booked=bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;
	}
	
}
