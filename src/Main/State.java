package Main;

public interface State {
	public State run();
	public Options getOptions();
}
