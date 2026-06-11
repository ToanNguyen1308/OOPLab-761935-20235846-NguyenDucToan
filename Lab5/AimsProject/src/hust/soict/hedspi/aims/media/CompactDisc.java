package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import hust.soict.hedspi.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    private static int nbCompactDiscs = 0;

    public CompactDisc(String title) {
        super(++nbCompactDiscs, title, "", 0.0f, "", 0);
        this.artist = "";
    }

    public CompactDisc(String title, String category) {
        super(++nbCompactDiscs, title, category, 0.0f, "", 0);
        this.artist = "";
    }

    public CompactDisc(String title, String category, float cost) {
        super(++nbCompactDiscs, title, category, cost, "", 0);
        this.artist = "";
    }

    public CompactDisc(String title, String category, String artist, float cost) {
        super(++nbCompactDiscs, title, category, cost, "", 0);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(++nbCompactDiscs, title, category, cost, director, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track not found.");
        }
    }

    public int getLength() {
        if (tracks.isEmpty()) {
            return super.getLength();
        }
        int totalLength = 0;
        for (Track t : tracks) {
            totalLength += t.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() <= 0) {
            System.err.println("ERROR: CD length is non-positive!");
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD Length: " + this.getLength());
        for (Track t : tracks) {
            try {
                t.play();
            } catch (PlayerException e) {
                System.err.println("Cannot play track: " + t.getTitle() + ". Reason: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return this.getId() + ". CD - " + getTitle() + " - " + getArtist() + " - " + getLength() + ": " + getCost() + " $";
    }
}
