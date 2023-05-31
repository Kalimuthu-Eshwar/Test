package Recentplay;

import java.util.List;

public class Songs {
	public Songs(String string) {
		
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		
		RecentlyPlayedSongsStore store = new RecentlyPlayedSongsStore(10);

		
		store.addSong("Muthu", new Songs("Song1"));

		
		store.addSong("Muthu", new Songs("Song2"));

		store.addSong("Muthu", new Songs("Song3"));
		
		store.addSong("Muthu", new Songs("Song4"));
		
		List<Songs> recentlyPlayedSongs = store.getRecentlyPlayedSongs("Muthu");

}}