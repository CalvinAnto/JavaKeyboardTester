import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class KeyboardFrame extends JFrame implements KeyListener, MouseListener, MouseWheelListener {

	public JTextField input;
	public Key[] keys = new Key[1001];
	public Key k16, k17, k18, k524, k525;
	public JPanel functionRow, numberRow, row1, row2, row3, row4, keyboard;
	
	public KeyboardFrame() {
		initFrame();
		addListeners();
		
//		keyboard = new JPanel(new GridLayout(7, 1, 0, 0));
		keyboard = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		add(keyboard);
		
		for (int i = 44; i < 100; i++) {
			keys[i] = new Key(""+(char)i);
		}
		
		// -----------------------------------------
		
		functionRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		
		
		
		
		keyboard.add(functionRow, c);
		
		keys[27] = new Key("Esc");
		functionRow.add(keys[27]);
		
		functionRow.add(new Key(40, 40));
		
		for (int i = 112; i <= 123; i++) {
			keys[i] = new Key("F"+(i-111));
			functionRow.add(keys[i]);
			
			if (i == 115) functionRow.add(new Key(20, 40));
			if (i == 119) functionRow.add(new Key(20, 40));
		}
		
		functionRow.add(new Key(10, 40));
		
		keys[KeyEvent.VK_PRINTSCREEN] = new Key("PrtSc");
		functionRow.add(keys[KeyEvent.VK_PRINTSCREEN]);
		
		keys[145] = new Key("ScrLk");
		functionRow.add(keys[145]);
		
		keys[19] = new Key("Pause");
		functionRow.add(keys[19]);
		
		
		// -----------------------------------------
		
//		keys[2] = new Key("F2");
//		keys[2].setPreferredSize(new Dimension(10,10));
//		keys[2].setSize(new Dimension(10, 10));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 1;
		keyboard.add(SpacerFactory.crateSpacer(10, 10), c);
		
//		keyboard.add(SpacerFactory.crateSpacer(1, 1));
		
		// -----------------------------------------
		
		numberRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 2;
		keyboard.add(numberRow, c);
		
		keys[192] = new Key("`");
		numberRow.add(keys[192]);
		
		for (int i = 49; i <= 57; i++) {
			keys[i] = new Key(""+(char)i);
			numberRow.add(keys[i]);
		}
		
		keys[48] = new Key(""+(char)48);
		numberRow.add(keys[48]);
		
		keys[45] = new Key("-");
		numberRow.add(keys[45]);
		
		keys[61] = new Key("=");
		numberRow.add(keys[61]);
		
		keys[8] = new Key("Backspace");
		keys[8].setPreferredSize(new Dimension(80, 40));
		numberRow.add(keys[8]);
		
		numberRow.add(new Key(10, 40));
		
		keys[155] = new Key("Ins");
		numberRow.add(keys[155]);

		keys[36] = new Key("Home");
		numberRow.add(keys[36]);
		
		keys[33] = new Key("PgUp");
		numberRow.add(keys[33]);
		
		// -------------------------------------------
		
		row1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 3;
		keyboard.add(row1, c);
		
		keys[9] = new Key("Tab");
		keys[9].setPreferredSize(new Dimension(60, 40));
		row1.add(keys[9]);
		
		row1.add(keys[81]);
		row1.add(keys[87]);
		row1.add(keys[69]);
		row1.add(keys[82]);
		row1.add(keys[84]);
		row1.add(keys[89]);
		row1.add(keys[85]);
		row1.add(keys[73]);
		row1.add(keys[79]);
		row1.add(keys[80]);
		row1.add(keys[91]);
		row1.add(keys[93]);
		
		keys[92].setPreferredSize(new Dimension(60, 40));
		row1.add(keys[92]);
		
		row1.add(new Key(10, 40));
		
		keys[127] = new Key("Del");
		row1.add(keys[127]);

		keys[35] = new Key("End");
		row1.add(keys[35]);
		
		keys[34] = new Key("PgDn");
		row1.add(keys[34]);
		
		
		
		// -------------------------------------------
		
		row2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 4;
		keyboard.add(row2, c);
		
		keys[20] = new Key("Caps");
		keys[20].setPreferredSize(new Dimension(70, 40));
		row2.add(keys[20]);
		
		row2.add(keys[65]);
		row2.add(keys[83]);
		row2.add(keys[68]);
		row2.add(keys[70]);
		row2.add(keys[71]);
		row2.add(keys[72]);
		row2.add(keys[74]);
		row2.add(keys[75]);
		row2.add(keys[76]);
		
		keys[59] = new Key(";");
		row2.add(keys[59]);
		
		keys[222] = new Key("\'");
		row2.add(keys[222]);
		
		keys[10] = new Key("Enter");
		keys[10].setPreferredSize(new Dimension(90, 40));
		row2.add(keys[10]);
		
		row2.add(new Key(130, 40));
		
		// -------------------------------------------
		
		row3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 5;
		keyboard.add(row3, c);
		
		keys[16] = new Key("Shift");
		keys[16].setPreferredSize(new Dimension(90, 40));
		row3.add(keys[16]);
		
		row3.add(keys[90]);
		row3.add(keys[88]);
		row3.add(keys[67]);
		row3.add(keys[86]);
		row3.add(keys[66]);
		row3.add(keys[78]);
		row3.add(keys[77]);
		row3.add(keys[44]);
		row3.add(keys[46]);
		row3.add(keys[47]);
		
		k16 = new Key("Shift");
		k16.setPreferredSize(new Dimension(110, 40));
		row3.add(k16);
		
		row3.add(new Key(50, 40));
		
		keys[38] = new Key("^");
		row3.add(keys[38]);
		
		row3.add(new Key(40, 40));

		// -------------------------------------------
		
		row4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 6;
		keyboard.add(row4, c);
		
		keys[17] = new Key("Ctrl");
		keys[17].setPreferredSize(new Dimension(50, 40));
		row4.add(keys[17]);
		
		keys[524] = new Key("Win");
		keys[524].setPreferredSize(new Dimension(50, 40));
		row4.add(keys[524]);
		
		keys[18] = new Key("Alt");
		keys[18].setPreferredSize(new Dimension(50, 40));
		row4.add(keys[18]);
		
		keys[32] = new Key("Space");
		keys[32].setPreferredSize(new Dimension(250, 40));
		row4.add(keys[32]);
		
		k18 = new Key("Alt");
		k18.setPreferredSize(new Dimension(50, 40));
		row4.add(k18);
		
		k524 =  new Key("Win");
		k524.setPreferredSize(new Dimension(50, 40));
		row4.add(k524);
		
		k525 =  new Key("Sel");
		k525.setPreferredSize(new Dimension(50, 40));
		row4.add(k525);
		
		k17 =  new Key("Ctrl");
		k17.setPreferredSize(new Dimension(50, 40));
		row4.add(k17);
		
		row4.add(new Key(10, 40));
		
		keys[37] = new Key("<");
		row4.add(keys[37]);
		
		keys[40] = new Key("V");
		row4.add(keys[40]);
		
		keys[39] = new Key(">");
		row4.add(keys[39]);
		
		// -------------------------------------------
		
//		this.add(input, BorderLayout.NORTH);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		this.add(keyboard, BorderLayout.CENTER);
		
		openFrame();
	}
	
	void addListeners() {
//		input = new JTextField();
//		input.setFocusTraversalKeysEnabled(false);
//		input.addKeyListener(this);
//		input.addMouseListener(this);
//		input.addMouseWheelListener(this);
		
		this.setFocusTraversalKeysEnabled(false);
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseWheelListener(this);
	}
	
	void initFrame() {
		this.setSize(750, 290);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Keyboard Tester");
		this.setResizable(false);
	}
	
	void openFrame() {
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Keyboard: " + e.getKeyCode());
		Color color = Color.orange;
		
		int code = e.getKeyCode();
		
		if (code == 16) {
			k16.color = color;
			k16.success();
		}
		
		if (code == 18) {
			k18.color = color;
			k18.success();
		}
		
		if (code == 524) {
			k524.color = color;
			k524.success();
		}
		
		if (code == 525) {
			k525.color = color;
			k525.success();
		}
		
		if (code == 17) {
			k17.color = color;
			k17.success();
		}
		
		if (keys[code] != null) {
			keys[code].color = color;
			keys[code].success();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Keyboard: " + e.getKeyCode());
		Color color = Color.green;
		
		int code = e.getKeyCode();
		
		if (code == 16) {
			k16.color = color;
			k16.success();
		}
		
		if (code == 18) {
			k18.color = color;
			k18.success();
		}
		
		if (code == 524) {
			k524.color = color;
			k524.success();
		}
		
		if (code == 525) {
			k525.color = color;
			k525.success();
		}
		
		if (code == 17) {
			k17.color = color;
			k17.success();
		}
		
		if (keys[code] != null) {
			keys[code].color = color;
			keys[code].success();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Keyboard: " + e.getKeyCode());
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse: " + e.getButton());
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("Mouse Wheel: " + e.getButton());
		
	}

}
