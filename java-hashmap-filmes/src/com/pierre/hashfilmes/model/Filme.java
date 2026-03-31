package com.pierre.hashfilmes.model;

public class Filme {

	private String titulo;
	private String genero;
	private double nota;

	public Filme(String titulo, String genero, double nota) {

		this.titulo = titulo;
		this.genero = genero;
		this.nota = nota;
		
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
