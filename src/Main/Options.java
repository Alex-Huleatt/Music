package Main;

public class Options {
	
	String[] myOptions;
	State[] subsequent;
	int[] keys;
	public Options(int[] keys, String[] opt, State[] subs) {
		this.keys = keys;
		this.myOptions = opt;
		this.subsequent = subs;
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < myOptions.length; i++) {
			str += keys[i] + ": " + myOptions[i] + "\n"; 
		}
		return str;
	}
	public State get(int s) {
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == s) {
				return subsequent[i];
			}
		}
		return null;
	}
}
