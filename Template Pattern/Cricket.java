public class Cricket extends Game
{
	@Override
	void endPlay()
	{
		System.out.println("Cricket Game finished");
	}

	@Override
	void initialize()
	{
		System.out.println("Cricket Game initialized! Start playing");
	}

	@Override
	void startPlay()
	{
		System.out.println("Cricket Game started. Enjoy the game");
	}
}