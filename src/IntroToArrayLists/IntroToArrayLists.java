package IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("1");
		strings.add("2");
		strings.add("3");
		strings.add("4");
		strings.add("5");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String n = strings.get(i);
			System.out.println(n);
		}
		// 4. Print all the Strings using a for-each loop
		for (String j : strings) {

			System.out.println(j);
		}
		// 5. Print only the even numbered elements in the list.
		for (String o : strings) {
			int num = Integer.parseInt(o);

			if (num % 2 == 0) {
				System.out.println(o);
			}

		}

		// 6. Print all the Strings in reverse order.
for (int i = 5; i < strings.size(); i--) {
	String n = strings.get(i);
	System.out.println(n);
}
		// 7. Print only the Strings that have the letter 'e' in them.
	}
}
