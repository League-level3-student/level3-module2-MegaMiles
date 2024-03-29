package _01_Sorting_Algorithms;

import java.util.Random;

import _00_Intro_to_Sorting_Algorithms._01_SortedArrayChecker;

public class BogoSorter extends Sorter {

	Random ran = new Random();

	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	//
	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	@Override
	void sort(int[] array, SortingVisualizer display) {
		while (!_01_SortedArrayChecker.intArraySorted(array)) {
			int pos1 = ran.nextInt(array.length);
			int pos2 = ran.nextInt(array.length);
			int temp = array[pos1];
			array[pos1] = array[pos2];
			array[pos2] = temp;
			display.updateDisplay();
		}
	}
}
