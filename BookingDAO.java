package project;


import java.util.Date;
import java.sql.*;


class BookingDAO {
	public int getBookedCount(int busNo,Date date) throws SQLException
	{
		String query="select count(passengerName) from booking where bus_no=? and travel_date=?";
		Connection con=Dbconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, busNo);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	public void addBooking(Booking booking) throws SQLException
	{
		String query="insert into booking values(?,?,?)";
		Connection con=Dbconnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		pst.setString(1, booking.passenger_name);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}

}
