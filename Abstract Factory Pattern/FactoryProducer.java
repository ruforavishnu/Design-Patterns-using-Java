public class FactoryProducer
{
	public static AbstractFactory getFactory(boolean rounded)
	{
		if(rounded)
		{
			return new RoundedShapeFactory();
		}
		else
		{
			System.out.println("DebugMode:Inside AbstractFactory.java. Inside getFactory() method. Inside rounded==false condition.");
			return new ShapeFactory();
		}
	}
}