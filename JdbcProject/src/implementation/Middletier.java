package implementation;

import beansPackage.Artist;

public class Middletier {

	public static void main(String[] args) {
		try(DataService ds = new DataService();
			Artist artist = new Artist("Kanye West");
			ds.insertArtist(artist);
		}
}
