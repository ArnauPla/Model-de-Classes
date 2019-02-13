package com.videos.project;

import java.util.List;

public class Video {
	private String url;
	private String title;
	private List<String> tags;

	public Video(String url, String title , List<String> tags) throws Exception {
		
		checkInfo(url);
		checkInfo(title);
		
		this.url = url;
		this.title = title;
		this.tags = tags;
	}
	
	public String getInfo() {
		return "Títol: " + title + ". URL: " + url + ". Tags: " + tags;
		
	}
	
	public void checkInfo(String info) throws Exception {
		if (info == null) {
			throw new Exception("S'han d'omplir tots els camps.");
		}
		if (info.equals("")) {
			throw new Exception("S'han d'omplir tots els camps.");
		}
	}
	
	public void checkTags(List<String> tags) throws Exception {
		for(int i=0; i<tags.size(); i++) {
			if (tags.get(i) == null) {
				throw new Exception("S'han d'omplir tots els camps.");
			}
			if (tags.get(i).equals("")) {
				throw new Exception("S'han d'omplir tots els camps.");
			}
		}
	}
	

}
