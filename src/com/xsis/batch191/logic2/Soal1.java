package com.xsis.batch191.logic2;

import java.util.Scanner;

public class Soal1 {

	public void execute(int n1, int n2) {
		//System.out.println("n1 : "+ n1);
		//System.out.println("n2 : "+ n2);
		int rs1 = 1;
		int hasil = 0;
		for (int i = 0; i < n1; i++) {
			if(i <= n2) {
				hasil = hasil + rs1;
			}
			rs1 = rs1 * 3;
		}
		
		System.out.println(hasil);
	}
	
	public static void main(String[] args) {
		Soal1 jawab = new Soal1();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan nilai n 1 : >> ");
		int n1 = scan.nextInt();
		System.out.println("Masukkan nilai n 2 : >> ");
		int n2 = scan.nextInt();
		jawab.execute(n1, n2);
	}
}
