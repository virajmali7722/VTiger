class AirConditionerDriver 
{
	public static void main(String[] args) 
	{
		AirConditioner a1 = new AirConditioner();
		a1.Name = "Blue Star";
		a1.price = 39990.00;
		a1.color = "White";
		a1.MaxTemp = 50 ;
		a1.MinTemp = -15;
		a1.CurrentTemp = 25;
		a1.Area = 180 ;
		a1.Tons = 1.5;
		a1.Warranty = 1 ;
		a1.Star = 4;
		a1.Power = 932;
		

		a1.displayMaxTemp();

		System.out.println("*****************************");

		a1.displayMinTemp();

		System.out.println("*****************************");

		a1.displayCurrentTemp();

		System.out.println("*****************************");

		a1.displayOthers();

		System.out.println("*****************************");
	}
}
