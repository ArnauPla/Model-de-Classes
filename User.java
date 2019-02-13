package com.videos.project;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class User {
	private String name;
	private String surname;
	private String password;
	private Calendar data;
	private List<Video> videos;

	public User(String name, String surname, String password) throws Exception {
		
		checkInfo(name);
		checkInfo(surname);
		checkInfo(password);
		
		
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.data = Calendar.getInstance();
		
	}
	
	public void checkInfo(String info) throws Exception {
		if (info == null) {
			throw new Exception("S'han d'omplir tots els camps.");
		}
		if (info.equals("")) {
			throw new Exception("S'han d'omplir tots els camps.");
		}
	}


	public void getAllVideos() {
		for (int i = 0; i < videos.size(); i++) {
			System.out.println(videos.get(i).getInfo());
		}

	}

	public void addVideo(Video video) {
		videos.add(video);
	}

}
