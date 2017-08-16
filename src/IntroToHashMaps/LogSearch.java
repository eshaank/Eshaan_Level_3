package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button1;
	JButton button2;
	JButton button3;

	HashMap<Integer, String> entry = new HashMap<Integer, String>();

	public static void main(String[] args) {

		LogSearch log = new LogSearch();
		log.hi();

	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After
	 * an ID is entered, use another input dialog to ask the user to enter a
	 * name. Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that
	 * name to the user. Otherwise, tell the user that that entry does not
	 * exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list
	 * in a message dialog in the following format: ID: 123 Name: Harry Howard
	 * ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4:
	 * Remove Entry When this button is clicked, prompt the user to enter an ID
	 * using an input dialog. If this ID exists in the HashMap, remove it.
	 * Otherwise, notify the user that the ID is not in the list.
	 *
	 */
	void hi() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();

		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button.setText("Add Entry");
		button1.setText("Search by ID");
		button2.setText("View List");
		button3.setText("Remove Entry");

		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String ID = JOptionPane.showInputDialog("Enter your ID number");
			int id = Integer.parseInt(ID);
			String name = JOptionPane.showInputDialog("Enter your name");

			entry.put(id, name);
			System.out.println(entry);
		}
		if (e.getSource() == button1) {
			String ID = JOptionPane.showInputDialog("Enter your ID number");
			int id = Integer.parseInt(ID);
			if (entry.containsKey(id)) {
				entry.get(id);
				JOptionPane.showMessageDialog(null, entry.get(id));
			} else {
				JOptionPane.showMessageDialog(null, "This entry does not exist");
			}
		}
		if (e.getSource() == button2) {
			String out = " ";
			for (Integer o : entry.keySet()) {
				out += "ID: " + o + " Name: " + entry.get(o) + "\n";

			}
			JOptionPane.showMessageDialog(null, out);
		}
		if (e.getSource() == button3) {
			String ID = JOptionPane.showInputDialog("Enter your ID number, in order to remove your Name");
			int id = Integer.parseInt(ID);
			if (entry.containsKey(id)) {
				entry.remove(id);
			}
			else{
				JOptionPane.showMessageDialog(null, "This ID does not exist");
			}
		}
	}

}
