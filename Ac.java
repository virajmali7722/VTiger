class AirConditioner
{
	String Name;
	double price;
	String color;
	int MaxTemp;
	int MinTemp;
	int CurrentTemp;
	int Area;
	double Tons;
	int Warranty;
	int Star;
	int Power;

	public void displayMaxTemp()
	{
		System.out.println("MaxTemp : "+MaxTemp);
	}
	public void displayMinTemp()
	{
		System.out.println("MinTemp : "+MinTemp);
	}
	public void displayCurrentTemp()
	{
		System.out.println("CurrentTemp : " +CurrentTemp);
	}
	public void displayOthers()
	{
		
		System.out.println("Name : "+Name);
		System.out.println("price : "+price);
		System.out.println("color : "+color);
		System.out.println("Area : "+Area);
		System.out.println("Tons : "+Tons);
		System.out.println("Warranty : "+Warranty);
		System.out.println("Star : "+Star);
		System.out.println("Power : "+Power);
	}
}
