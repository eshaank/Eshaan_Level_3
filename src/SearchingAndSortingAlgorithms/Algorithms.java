package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		// <- this needs changing
		for (String o : eggs) {

			// System.out.println(o);
			eggs.indexOf(o);
			if (o.equals("cracked")) {

				return eggs.indexOf(o);

			}

		}
		return 0;

	}

	// Add other methods here

	public static int countPearls(List<Boolean> oysters) {

		for (Boolean o : oysters) {
			oysters.indexOf(o);
			if (o == true) {
				System.out.println(oysters.indexOf(o));
				return oysters.indexOf(o);
			}
		}
		return 0;

	}

	public static double findTallest(List<Double> peeps) {
		double tall = 0;
		for (Double o : peeps) {
			peeps.indexOf(o);

			if (o > tall) {
				tall = o;
				System.out.println(o);
			}

		}
		return tall;

	}

	public static String findLongestWord(List<String> words) {

		String size1 = "";
		for (String o : words) {
			if (size1.length() < o.length()) {
				o.indexOf(o);
				size1 = o;

				// words.indexOf(o);
				System.out.println(o);

			}

		}
		return size1;

	}

	public static Boolean containsSOS(List<String> message1) {
		for (String o : message1) {
			System.out.println(o);
			if (o.contains("... --- ...")) {
				System.out.println("hi");
				return true;
			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {

		for (int i = 0; i < results.size(); i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(j) < results.get(i)) {
					double temp = results.get(i);
					results.set(i, results.get(j));
					results.set(j, temp);
				}

			}

		}

		return results;

	}
	public static List<String> sortDNA(List<String> unsortedSequences) {
		
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i + 1; j < unsortedSequences.size(); j++) {
				String s1 = unsortedSequences.get(j);
			String s2	= unsortedSequences.get(i);
				if (s1.length() < s2.length()) {
					String temp = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(j));
					unsortedSequences.set(j, temp);
					System.out.println(unsortedSequences);
				}

			}

		}
		return unsortedSequences;
		
	}
	
	public static List<String> sortWords(List<String> words){
//		for (int i = 0; i < words.size(); i++) {
//			for (int j = i + 1; j < words.size(); j++) {
//				String s1 = words.get(j);
//			String s2	= words.get(i);
//				if (s1.length() < s2.length()) {
//					String temp = words.get(i);
//					//words.set(i, words.get(j));
//					words.set(j, temp);
//					System.out.println(words);
//				}
//
//			}
//
//		}
		
		
		return words;
		
	}
} 