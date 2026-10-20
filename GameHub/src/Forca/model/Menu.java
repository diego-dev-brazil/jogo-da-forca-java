package Forca.model;

import Forca.Boneco;

public class Menu {
	Boneco boneco;
	String filme;
	String secreta;
	String letras = "";
	public String getSecreta() {
		return secreta;
	}
	public void setSecreta(String secreta) {
		this.secreta = secreta;
	}
	public Boneco getBoneco() {
		return boneco;
	}
	public void setBoneco(Boneco boneco) {
		this.boneco = boneco;
	}
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public Menu(Boneco boneco, String filme) {
		super();
		this.boneco = boneco;
		this.filme = filme;
	}
	
	public String GetLetras(){
		return letras;
	}
	
	public void AdicionarLetra(char letra) {
		letras = letras + letra;
	}
}
