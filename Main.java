package com.videos.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
	}
	
	public static Video createVideo() throws Exception {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quina �s la URL del v�deo?");
		String url = entrada.nextLine();

		System.out.println("Quin �s el t�tol del v�deo?");
		String title = entrada.nextLine();
		
		List<String> tags = new ArrayList();
		
		String tag = "";
		
		while(!tag.equals("exit")) {
			System.out.println("Introdueix un tag ('exit' si no n'hi ha m�s)");
			tag = entrada.nextLine();
			tags.add(tag);
		}

		return new Video(url, title, tags);
		
	}
}