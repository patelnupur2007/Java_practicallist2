class TemperatureConverter
{
	public double FaherenheitToCelcius(double faherenheit)
	{
		return (faherenheit-32)*5/9;
	}
	public double CelciusToFaherenheit(double celcius)
	{
		return(celcius*9/5)+32;
	}
}
class P14
{
	public static void main(String [] args)
	{
		TemperatureConverter converter=new TemperatureConverter();
		
		double FaherenheitTemp=68.0;
		double CelciusEquivalent=Converter.FaherenheitToCelcius(FaherenheitTemp);
		System.out.println(FaherenheitTemp+"Faherenheit is equal to"+CelciusEquivalent+"celcius");
	
		double CelciusTemp=20.0;
		double FaherenheitEquivalent=converter.CelciusToFaherenheit(celciusTemp);

		System.out.println(CelciusTemp+"Celcius is equal to"+FaherenheitEquivalent+"Faherenheit");
	}
	
}