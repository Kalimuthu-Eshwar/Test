package Recentplay;

		import java.util.*;

		import org.testng.Assert;
		import org.testng.annotations.DataProvider;
		import org.testng.annotations.Test;

		@SuppressWarnings("unused")
		public class RecentlyPlayedSongsStore {

		    private Map<String, List<Songs>> songsByUser;
		    private int capacity;
		  
		    public RecentlyPlayedSongsStore(int i) {
				// TODO Auto-generated constructor stub
			}
			public void RecentlyPlayedSongsStore(int capacity) {
		        this.songsByUser = new HashMap<>();
		        this.capacity = capacity;
		    }
		    @Test (dataProvider = "store", dataProviderClass = Songs.class , priority =0)
		    public void addSong(String user, Songs song) {
		    	  
		        List<Songs> songs = songsByUser.getOrDefault(user, new ArrayList<Songs>());
		        songs.add(song);
		        songsByUser.put(user, songs);
		        
		        if (songs.size() > capacity) {
		           
		            songs.remove(0);
		            Assert.assertEquals(songs, songs , "Capacity of store is full.");
		        }
		    }
		    @Test (dataProvider = "store", dataProviderClass = Songs.class, priority=1)
		    public List<Songs> getRecentlyPlayedSongs(String user) {
		    	
		    	return songsByUser.getOrDefault(user, new ArrayList<Songs>());
		    	
		    	}

	}


