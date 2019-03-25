package com.xsis.batch191.logic2;

import java.util.Arrays;
import java.util.Spliterator;

public class Soal5 {

	public void execute(String word) {
		String[] split = word.split(" ");
		//System.out.println(Arrays.toString(split));
		//System.out.println(split[0]);
		//System.out.println(split[1]);
		String[] hasil = new String[split.length];
		for(int wr = 0; wr < split.length; wr++ ) {
			String data = ""; 
			for(int i = 0; i < split[wr].length(); i++) {
				if(i == 0 || i == split[wr].length()-1) {
					data += split[wr].charAt(i);
				} else {
					data += "*";
				}
			}
			hasil[wr] = data;
		}	
		
		//join string
		String hasilnya = "";
		for(int i = 0; i < hasil.length; i++) {
			hasilnya = hasilnya + hasil[i] + " ";
		}
		
		System.out.println(hasilnya);
	}
	
	
	public static void main(String[] args) {
		Soal5 jawab = new Soal5();
		jawab.execute("oke lah kalo begitu");
	}
}
