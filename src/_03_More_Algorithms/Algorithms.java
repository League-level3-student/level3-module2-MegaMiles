package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		String returnNum = "";
		int Product = num1 * num2;
		returnNum = num1 + " x " + num2 + " = " + Product;
		return returnNum;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int returnNum = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				returnNum = i;
				break;

			}
		}
		return returnNum;
	}

	public static int countPearls(List<Boolean> oysters) {
		int returnNum = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				returnNum++;
			}
		}
		return returnNum;
	}

	public static double findTallest(List<Double> peeps) {
		Double returnNum = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > returnNum) {
				returnNum = peeps.get(i);
			}
		}
		return returnNum;
	}
	
	public static Object findLongestWord(List<String> words) {
		String returnWord = "";
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > returnWord.length()) {
				returnWord = words.get(i);
				
			}
		}
		return returnWord;
	}
	
	public static Object containsSOS(List<String> message2) {
String message = "... --- ...";
boolean containsornot = false;
if (message2.contains(message)) {
containsornot = true;	
}
		return containsornot;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		
		for (int i = 0; i < results.size(); i++) {
            for (int k = 0; k < results.size() - 1; k++) {  
            	
            	 if(results.get(k) > results.get(k+1) ) {   
            		 
                     Double temp = results.get(k);
                     results.set(k, results.get(k+1));
                     results.set(k+1, temp);
                 }
            }
        }
		System.out.println(results);
		return results;
	}
	
	public static Object sortDNA(List<String> unsortedSequences) {
		
		for (int i = 0; i < unsortedSequences.size(); i++) {
            for (int k = 0; k < unsortedSequences.size() - 1; k++) {  
            	
            	 if(unsortedSequences.get(k).length() > unsortedSequences.get(k+1).length() ) {   
            		 
                     String temp = unsortedSequences.get(k);
                     unsortedSequences.set(k, unsortedSequences.get(k+1));
                     unsortedSequences.set(k+1, temp);
                 }
            }
        }
		System.out.println(unsortedSequences);
		return unsortedSequences;
	}
	
	public static List<String> sortWords(List<String> words) {
		
		for (int i = 0; i < words.size(); i++) {
            for (int k = 0; k < words.size() - 1; k++) {  
            	
            	 if(words.get(k).compareTo(words.get(k+1)) > 0) {   
            		 
                     String temp = words.get(k);
                     words.set(k, words.get(k+1));
                     words.set(k+1, temp);
                 }
            }
        }
		System.out.println(words);
		return words;
	}


	public static boolean isPrime(int Num) {
		boolean isP = true;
		for (int i = 2; i < Num; i++) {
		if(Num % i == 0) {
			isP = false;	
		}
		}
		return isP;
	}

	public static boolean isSquare(int Num) {
		boolean isS = false;
		for (int i = 1; i < Num+1; i++) {
		if (i == Math.sqrt(Num)) { 
			isS = true;	
		}	
		}
		return isS;
	}

	public static boolean isCube(int Num) {
		boolean isC = false;
		for (int i = 1; i < Num+1; i++) {
		if (i == Math.cbrt(Num)) {
			isC = true;	
		}	
		}
		return isC;
	}




}
