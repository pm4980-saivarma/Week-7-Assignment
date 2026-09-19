import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int maximumSize) {
        if (maximumSize <= 0) {
            throw new IllegalArgumentException("Playlist size must be positive.");
        }
        songs = new String[maximumSize];
    }

    public void addSong(String song) {
        if (song == null) {
            throw new IllegalArgumentException("Song title cannot be null.");
        }
        if (songCount == songs.length) {
            throw new IllegalStateException("Playlist is full.");
        }
        songs[songCount++] = song;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist(10);
        playlist.addSong("Song A");
        playlist.addSong("Song B");

        String[] copy = playlist.getSongs();
        copy[0] = "Hacked";

        System.out.println("Playlist: " + Arrays.toString(playlist.getSongs()));
        System.out.println("Song count: " + playlist.getSongCount());
    }
}
