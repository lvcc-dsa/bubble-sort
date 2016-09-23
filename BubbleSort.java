/**
* BUBBLE SORT is based on the idea of repeatedly comparing pairs of 
* adjacent elements, then switching positions if they exist in the wrong order.
*
* @author  Renaldo Valente
* @link    https://github.com/arrowbrave
* @version 1.1
* @since   22/09/2016
*/

import java.util.Scanner;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		int size, x, y, swap, array[];

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size to sort: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println();
		System.out.println(size + " random numbers generated.");

		for (x = 0; x < size; x++) {
			array[x] = rand.nextInt(1000);
			System.out.print(array[x] + " ");
		}

		System.out.println();

		for (x = 0; x < size-1; x++) {
			for (y = 0; y < size-x-1; y++) {
				if (array[y] > array[y+1]) {
					swap = array[y];
					array[y] = array[y+1];
					array[y+1] = swap;
				}
			}
		}

		System.out.println();

		System.out.println("Bubble Sorting... Done!");
		
		for (x = 0; x < size; x++) {
			System.out.print(array[x] + " ");
		}

	}

}