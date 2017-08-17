package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	String type = "";
	String gone;
	Stack<String> words = new Stack<String>();
	Stack<String> delete = new Stack<String>();

	public static void main(String[] args) {
		TextUndoRedo text = new TextUndoRedo();
		text.hi();
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	void hi() {
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();

		frame.add(panel);
		frame.setVisible(true);

		panel.add(label);
		frame.addKeyListener(this);

		frame.pack();
		frame.setSize(2000, 50);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && !words.isEmpty()) {
			gone = words.pop();
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_1 && !words.isEmpty()) {

			label.setText(gone);
			

		} else {
			words.push(Character.toString(e.getKeyChar()));
		}
		type = "";
		for (String o : words) {
			type = type + o;
		}
		label.setText(type);
		panel.repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
