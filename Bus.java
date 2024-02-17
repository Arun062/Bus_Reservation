package project;

class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	
	Bus(int busNo,boolean ac,int capacity)
	{
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int cap)
	{
		capacity=cap;
	}
	public int getBusNo()
	{
		return busNo;
	}
	public boolean getac()
	{
		return ac;
	}
}
