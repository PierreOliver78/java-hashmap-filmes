package com.pierre.hashmapfilmes.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.pierre.hashfilmes.model.Filme;

public class TesteFilmes {
	
	public static void main(String[] args) {
		
		Filme filme01 = new Filme("Matrix", "Ficção", 9.8);
		Filme filme02 = new Filme("Titanic", "Drama", 9.5);
		Filme filme03 = new Filme("Mad Max", "Ficção", 8.9);
		Filme filme04 = new Filme("Tubarão", "Suspense", 8.3);
		Filme filme05 = new Filme("Vingadores", "Ficção", 8.9);
		Filme filme06 = new Filme("Tempo de Matar", "Suspense", 7.8);
		Filme filme07 = new Filme("Os Goonies", "Aventura", 7.7);
		Filme filme08 = new Filme("A Teoria de Tudo", "Drama", 7.7);
		
		
		List<Filme> filmes = new ArrayList<Filme>();
		
		filmes.add(filme01);
		filmes.add(filme02);
		filmes.add(filme03);
		filmes.add(filme04);
		filmes.add(filme05);
		filmes.add(filme06);
		filmes.add(filme07);
		filmes.add(filme08);
		
		/*
		for (Filme filme : filmes) {
			
			
		}
		*/
		
		HashMap<String, List<Filme>> generoFilme = new HashMap<>();
		
		
		generoFilme.put("Ficção", new ArrayList<>());
		generoFilme.put("Drama", new ArrayList<>());
		generoFilme.put("Suspense", new ArrayList<>());
		generoFilme.put("Aventura", new ArrayList<>());
		
		
		for (Filme filme : filmes) {
			generoFilme.get(filme.getGenero()).add(filme);
		}
		
		for (String genero : generoFilme.keySet()) {
			System.out.println("******* " + genero + " *******");
			System.out.println();
			
			for (Filme filme : generoFilme.get(genero)) {
				System.out.println("Filme: " + filme.getTitulo() + " | " + "Nota: " + filme.getNota());
			}
			System.out.println();
		}
		
		
		
	}

}
