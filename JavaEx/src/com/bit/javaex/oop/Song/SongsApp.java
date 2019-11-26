package com.bit.javaex.oop.Song;

public class SongsApp {

	public static void main(String[] args) {
		
		Songs music = new Songs();
		music.setArtist("아이유");
		music.setTitle("좋은날");
		music.setAlbum("Real");
		music.setYear(2010);
		music.setTrack(3);
		music.setComposer("이민수");
	
		
		music.showInfo();

	}
	
	

}
