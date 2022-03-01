import java.util.HashMap;

public class ShapeFactory 
{
	@SuppressWarnings("unchecked")
	private static final HashMap circleMap = new HashMap();

	public static Shape getCircle(String color)
	{
		Circle circle = (Circle) circleMap.get(color);

		if(circle == null)
		{
			circle = new Circle(color);
			circleMap.put(circle, color);
			System.out.println("\nCreating circle of color: "+color);
		}
		return circle;
	}
	
}