public class ObserverPatternDemo
{
	public static void main(String args[])
	{
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("\nFirst state change: 1500345");
		subject.setState(1500345);
		System.out.println("\nSecond state change: 10");
		subject.setState(10);
	}
}