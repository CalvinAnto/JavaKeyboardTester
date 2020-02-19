import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Key extends JLabel {

	public Color color;
	
	public Key(int w, int h) {
		setOpaque(false);
		setPreferredSize(new Dimension(w, h));
	}

	public Key(String text) {
		super(text);
		setOpaque(true);
		setPreferredSize(new Dimension(40, 40));
		setBorder(BorderFactory.createLineBorder(Color.black, 1));
		setVerticalAlignment(SwingConstants.CENTER);
		setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public void success() {
		setBackground(color);
	}

}
