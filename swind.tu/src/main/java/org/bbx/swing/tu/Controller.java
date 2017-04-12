package org.bbx.swing.tu;

public class Controller {

	private static final Controller INSTANCE = new Controller();
	
	private final String value;
	
	
	public static Controller getInstance() {
		return INSTANCE;
	}
	
	private Controller() {
		value = "whatever";
	}
	
	
	public String getValue() {
		return this.value;
	}
}
