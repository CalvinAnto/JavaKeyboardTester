import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpacerFactory {

	public SpacerFactory() {
		
	}
	
	public static JPanel crateSpacer(int w, int h) {
		JPanel panel = new JPanel(new FlowLayout());
		panel.setPreferredSize(new Dimension(w, h));
		
		return panel;
	}

}
