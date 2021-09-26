import java.util.HashMap;
import java.util.Set;

public class Hash {
    
    HashMap<String, String> trackList = new HashMap<String, String>();

    public void inputTracks (String key, String lyric){
        trackList.put(key, lyric);
    }

    public void searchHash (String search){
        System.out.println( search + ": " + trackList.get(search) + "\n");
    }

    public void iterateHash (){
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.print(key + ": " + trackList.get(key) + "\n");
        }
    }
}
