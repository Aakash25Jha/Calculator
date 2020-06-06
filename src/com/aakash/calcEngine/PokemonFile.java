package com.aakash.calcEngine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PokemonFile {

	public static void readfile() {
		BufferedReader br = null;
		int total = 0;
		try {
			br = new BufferedReader(new FileReader("D:\\Projects\\Files\\Pokemon.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				total++;
			}
			System.out.println("The total number of pokemons are:" +" "+ total);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
		}
	}

	public static void main(String args[]) {
		PokemonFile.readfile();
	}
}