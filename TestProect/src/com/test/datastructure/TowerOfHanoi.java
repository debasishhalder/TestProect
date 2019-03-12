/**
 * 
 */
package com.test.datastructure;

/**
 * @author dhalder
 *
 */
public class TowerOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		towerOfHanoi(3, "A", "C", "B");
	}

	static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod) {
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
			return;
		}

		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);

	}
}
