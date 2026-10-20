package Forca.services;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Forca.model.Menu;

public class MenuService {
		public static void MenuPrincipal(Menu menu) throws InterruptedException, IOException {
	        LimpaTela.limparConsole();

			System.out.println("""
					
▀▓▓▀▀▓  ▄░▀▀░▄  ▀▓▓▀▀▓▄    ▄░▀▀▀░  ░▀▀▀░▄  
 ░░    ▒▒    ▒▒  ▒▒  ▄▒▀  ▒▒            ▓▓ 
 ▄▄    ▄▄    ▄▄  ▄▄ ▄▄▄   ▄▄        ▄▄▄▄▄▄ 
 ▓▓    ▓▓    ▓▓  ▓▓  ▀▓▄  ▓▓      ▄▓▀   ▓▓ 
 ▒▒▄█  ▒▒    ▒▒  ▒▒   ▒▒  ▒▒      ▒▒    ▒▒ 
 ░░ ▀  ░░    ░░  ░░   ░░  ░░      ░░    ░░ 
 ██    ██    ██  ██   ██  ██      ██    ██ 
 ██    ██    ██  ██   ██  ██      ██    ██ 
 ░█    ░█    ░█  ░█   ░█  ░█      ░█    ░█ 
 ░█    ░█    ░█  ░█   ░█  ░█      ░█    ░█ 
▄░█▄    ▀█▄▄░▀  ▄░█▄ ▄░█▄  ▀█▄▄░▒  ▀█▄▄▄░█▄			        
			        \n
			        """);
			menu.getBoneco().MostrarBoneco();
			
			System.out.println(menu.getSecreta() + "        "  + "Letras: "+menu.GetLetras());
			
			System.out.println("\n Insira a primeira letra: ");
			System.out.println("Para dar o palpite do filme, insira '#'");
		}
		
		public static String gerarPalavraSecreta(Menu menu) {
			String palavra = menu.getFilme();
			String secreta = palavra.replaceAll("[^\\s]", String.valueOf("_"));
			return secreta;
		}
	
	
		public static void desenharMenu () throws InterruptedException, IOException{
	        System.out.println("""
▀▓▓▀▀▓  ▄░▀▀░▄  ▀▓▓▀▀▓▄    ▄░▀▀▀░  ░▀▀▀░▄  
	        """);
	        TimeUnit.SECONDS.sleep(1);
	        LimpaTela.limparConsole();
	        System.out.println("""
▀▓▓▀▀▓  ▄░▀▀░▄  ▀▓▓▀▀▓▄    ▄░▀▀▀░  ░▀▀▀░▄  
 ░░    ▒▒    ▒▒  ▒▒  ▄▒▀  ▒▒            ▓▓ 
	        """);
	        TimeUnit.SECONDS.sleep(1);
	        LimpaTela.limparConsole();
	
	        System.out.println("""
▀▓▓▀▀▓  ▄░▀▀░▄  ▀▓▓▀▀▓▄    ▄░▀▀▀░  ░▀▀▀░▄  
 ░░    ▒▒    ▒▒  ▒▒  ▄▒▀  ▒▒            ▓▓ 
 ▄▄    ▄▄    ▄▄  ▄▄ ▄▄▄   ▄▄        ▄▄▄▄▄▄ 
 ▓▓    ▓▓    ▓▓  ▓▓  ▀▓▄  ▓▓      ▄▓▀   ▓▓ 
 ▒▒▄█  ▒▒    ▒▒  ▒▒   ▒▒  ▒▒      ▒▒    ▒▒ 
	        """);
	        TimeUnit.SECONDS.sleep(1);
	        LimpaTela.limparConsole();
	
	        System.out.println("""
▀▓▓▀▀▓  ▄░▀▀░▄  ▀▓▓▀▀▓▄    ▄░▀▀▀░  ░▀▀▀░▄  
 ░░    ▒▒    ▒▒  ▒▒  ▄▒▀  ▒▒            ▓▓ 
 ▄▄    ▄▄    ▄▄  ▄▄ ▄▄▄   ▄▄        ▄▄▄▄▄▄ 
 ▓▓    ▓▓    ▓▓  ▓▓  ▀▓▄  ▓▓      ▄▓▀   ▓▓ 
 ▒▒▄█  ▒▒    ▒▒  ▒▒   ▒▒  ▒▒      ▒▒    ▒▒ 
 ░░ ▀  ░░    ░░  ░░   ░░  ░░      ░░    ░░ 
 ██    ██    ██  ██   ██  ██      ██    ██ 
 ██    ██    ██  ██   ██  ██      ██    ██ 
	        """);
	        TimeUnit.SECONDS.sleep(1);
	        LimpaTela.limparConsole();
	
	        System.out.println("""
▀▓▓▀▀▓  ▄░▀▀░▄  ▀▓▓▀▀▓▄    ▄░▀▀▀░  ░▀▀▀░▄  
 ░░    ▒▒    ▒▒  ▒▒  ▄▒▀  ▒▒            ▓▓ 
 ▄▄    ▄▄    ▄▄  ▄▄ ▄▄▄   ▄▄        ▄▄▄▄▄▄ 
 ▓▓    ▓▓    ▓▓  ▓▓  ▀▓▄  ▓▓      ▄▓▀   ▓▓ 
 ▒▒▄█  ▒▒    ▒▒  ▒▒   ▒▒  ▒▒      ▒▒    ▒▒ 
 ░░ ▀  ░░    ░░  ░░   ░░  ░░      ░░    ░░ 
 ██    ██    ██  ██   ██  ██      ██    ██ 
 ██    ██    ██  ██   ██  ██      ██    ██ 
 ░█    ░█    ░█  ░█   ░█  ░█      ░█    ░█ 
 ░█    ░█    ░█  ░█   ░█  ░█      ░█    ░█ 
▄░█▄    ▀█▄▄░▀  ▄░█▄ ▄░█▄  ▀█▄▄░▒  ▀█▄▄▄░█▄	
	        """);
	    }
		
		public static boolean verificarLetra(Menu menu, char letra_min) {
			boolean a = false;
			char letra = Character.toUpperCase(letra_min);
		    StringBuilder modificador = new StringBuilder(menu.getSecreta());
			for (int i = 0; i < menu.getFilme().length(); i++) {
				if (menu.getFilme().charAt(i) == letra) {
		            modificador.setCharAt(i, letra);
		            a = true;
				}
			}
			menu.setSecreta( modificador.toString());
			return a;
		}
		
		public static boolean verificarFilme(Menu menu, String filme) {
			boolean a = false;
			System.out.println(filme);
			String filme_upper = filme.toUpperCase().replaceAll("\\s", "");
			String filme_verificar = menu.getFilme().toUpperCase().replaceAll("\\s", "");
		    if (filme_upper.equals(filme_verificar)) {
		    	a = true;
			    menu.setSecreta(menu.getFilme());

		    }
			return a;
		}
		
		public static boolean verificarVitoria(Menu menu) {
			if (menu.getSecreta().contains("_")) {
				return false;
			}else {
				return true;
			}
		}
}
