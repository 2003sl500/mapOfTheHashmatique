public class TestHash{
    public static void main(String[] args) {
        Hash hash = new Hash();

        hash.inputTracks("track1", "lyrics1");
        hash.inputTracks("track2", "lyrics2");
        hash.inputTracks("track3", "lyrics3");
        hash.inputTracks("track4", "lyrics4");
        hash.inputTracks("track5", "lyrics5");

        hash.searchHash("track2");

        hash.iterateHash();
    }
}