package com.videos.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
	}
	
	public static Video createVideo() throws Exception {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quina és la URL del vídeo?");
		String url = entrada.nextLine();

		System.out.println("Quin és el títol del vídeo?");
		String title = entrada.nextLine();
		
		List<String> tags = new ArrayList();
		
		String tag = "";
		
		while(!tag.equals("exit")) {
			System.out.println("Introdueix un tag ('exit' si no n'hi ha més)");
			tag = entrada.nextLine();
			tags.add(tag);
		}

		return new Video(url, title, tags);
		
	}
}