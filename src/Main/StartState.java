package Main;

public class StartState implements State {

	@Override
	public State run() {
		int s = Main.getScanner().nextInt();
		return getOptions().get(s);
	}

	@Override
	public Options getOptions() {
		int[] keys = new int[] {1,2};
		String[] myOptions = new String[] {"Go to state 1", "Go to state 2"};
		State[] subs = new State[] {new StartState(), new Bye()};
		return new Options(keys, myOptions, subs);
	}

	
}
