package org.bbx.swing.tu;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel {

	private JLabel label; 
	
	public View() {
		super();
		setupLayout();
	}
	
	private void setupLayout() {
		label = new JLabel();
		label.setText(Controller.getInstance().getValue());
		
		this.add(label);
	}
}
