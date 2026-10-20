package Forca.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class FilmeService {
	public  String roletarFilme() {
		String filme = "";
		InputStream stream = getClass().getResourceAsStream("/Forca/resources/filmes.csv");

		Random random = new Random();
		Integer id =  random.nextInt(1,2774);

		
		if (stream == null) {
		    throw new IllegalArgumentException("Arquivo não encontrado");
		    
		}
		String line;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(stream))){
			line = br.readLine();
			while(line != null) {
				String[] fields = line.split(";");
				if (id.toString().equals(fields[0].replaceAll("\"", ""))) {
					
					return fields[1].replaceAll("\"", "");
					
				}
				line = br.readLine();
			}
			System.out.println("deu errado");
			throw new RuntimeException("Erro na roleta");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filme;
	}
}
