package Main;

public class Bye implements State {

	@Override
	public State run() {
		int s = Main.getScanner().nextInt();
		return getOptions().get(s);
	}

	@Override
	public Options getOptions() {
		int[] keys = new int[] {999};
		String[] opts = new String[] {"Go to state 1"};
		State[] sts = new State[] {new StartState()};
		return new Options(keys,opts,sts);
	}

} 
