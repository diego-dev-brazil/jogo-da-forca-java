
package Forca;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Forca.model.Menu;
import Forca.services.FilmeService;
import Forca.services.LimpaTela;
import Forca.services.MenuService;

public class Forca {
	public static Scanner sc = new Scanner(System.in);

	public static void forca() throws IOException, InterruptedException {
		FilmeService filme = new FilmeService();

		// DESENHANDO
		try {
			MenuService.desenharMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ========================
		Menu menu = new Menu(new Boneco(), filme.roletarFilme());
		String secreta = MenuService.gerarPalavraSecreta(menu);
		menu.setSecreta(secreta);

		while (true) {
			if (menu.getBoneco().getPartes() == 0) {
				System.out.println("""
						▀▓▓▀▀▓▄  ▀░░▀▀░ ▀▓▓▀▀▓▄   ▀▓▓▀▀▓▄    ▄░▀▀░▄  ░▀▀░░▀▀░  ░▀▀▀░▄
						 ▒▒   ▒▒  ▒▒     ▒▒  ▄▒▀   ▒▒  ▄▒▀  ▒▒    ▒▒    ▒▒          ▓▓
						 ▄▄   ▄▄  ▄▄     ▄▄ ▄▄▄    ▄▄ ▄▄▄   ▄▄    ▄▄    ▄▄      ▄▄▄▄▄▄
						 ▓▓   ▓▓  ▓▓     ▓▓  ▀▓▄   ▓▓  ▀▓▄  ▓▓    ▓▓    ▓▓    ▄▓▀   ▓▓
						 ▒▒   ▒▒  ▒▒▄█   ▒▒   ▒▒   ▒▒   ▒▒  ▒▒    ▒▒    ▒▒    ▒▒    ▒▒
						 ░░   ░░  ░░ ▀   ░░   ░░   ░░   ░░  ░░    ░░    ░░    ░░    ░░
						 ██   ██  ██     ██   ██   ██   ██  ██    ██    ██    ██    ██
						 ██   ██  ██     ██   ██   ██   ██  ██    ██    ██    ██    ██
						 ░█   ░█  ░█     ░█   ░█   ░█   ░█  ░█    ░█    ░█    ░█    ░█
						 ░█   ░█  ░█     ░█   ░█   ░█   ░█  ░█    ░█    ░█    ░█    ░█
						▄░█▄▄█▀  ▄░█▄▄░ ▄░█▄ ▄░█▄ ▄░█▄ ▄░█▄  ▀█▄▄░▀    ▄░█▄    ▀█▄▄▄░█▄
												""");
				System.out.println("O FILME ERA: " + menu.getFilme());
				break;
			}
			if (MenuService.verificarVitoria(menu)) {
				LimpaTela.limparConsole();
				System.out.println("""
						▀░░▀  ▀░░▀ ▀▓▓▀ ░▀▀░░▀▀░  ▄░▀▀░▄  ▀▓▓▀▀▓▄   ▀▓▓▀  ░▀▀▀░▄
						 ▒▒    ▒▒   ▒▒     ▒▒    ▒▒    ▒▒  ▒▒  ▄▒▀   ▒▒        ▓▓
						 ▄▄    ▄▄   ▄▄     ▄▄    ▄▄    ▄▄  ▄▄ ▄▄▄    ▄▄    ▄▄▄▄▄▄
						 ▓▓    ▓▓   ▓▓     ▓▓    ▓▓    ▓▓  ▓▓  ▀▓▄   ▓▓  ▄▓▀   ▓▓
						 ▒▒    ▒▒   ▒▒     ▒▒    ▒▒    ▒▒  ▒▒   ▒▒   ▒▒  ▒▒    ▒▒
						 ░░    ░░   ░░     ░░    ░░    ░░  ░░   ░░   ░░  ░░    ░░
						 ██    ██   ██     ██    ██    ██  ██   ██   ██  ██    ██
						 ██    ██   ██     ██    ██    ██  ██   ██   ██  ██    ██
						 ▐█▌  ▐░▌   ░█     ░█    ░█    ░█  ░█   ░█   ░█  ░█    ░█
						  ██  █░    ░█     ░█    ░█    ░█  ░█   ░█   ░█  ░█    ░█
						   ▀██▀    ▄░█▄   ▄░█▄    ▀█▄▄░▀  ▄░█▄ ▄░█▄ ▄░█▄  ▀█▄▄▄░█▄
						        				""");
				menu.getBoneco().MostrarBonecoVitoria();
				System.out.println("O FILME ERA: " + menu.getFilme());
				break;
			}
			MenuService.MenuPrincipal(menu);
			char letra = sc.next().charAt(0);
			sc.nextLine();
			while (true) {
				if (menu.GetLetras().indexOf(Character.toUpperCase(letra)) != -1) {
					System.out.println("Caractere ja utilizado, tente novamente");
					letra = sc.next().charAt(0);

				} else {
					break;
				}
			}
			

			if (letra == '#') {
				System.out.println("Insira nome do filme inteiro se for capaz: ");
				String palavra = sc.nextLine();
				if (MenuService.verificarFilme(menu, palavra)) {
					System.out.println("");
				} else {
					menu.getBoneco().DiminuirBoneco();
				}
			}else {
				menu.AdicionarLetra(Character.toUpperCase(letra));

			}
				if (MenuService.verificarLetra(menu, letra)) {
					LimpaTela.limparConsole();
					menu.getBoneco().MostrarBoneco();
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.println("Muito bem");
					TimeUnit.MILLISECONDS.sleep(500);
					System.out.println("O boneco nao sofreu danos");
					TimeUnit.MILLISECONDS.sleep(2200);
				}

			 else if(letra != '#') {
					menu.getBoneco().DiminuirBoneco();
			}
		}
	}

}