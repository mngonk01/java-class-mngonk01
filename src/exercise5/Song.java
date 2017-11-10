package exercise5;

import java.util.Objects;

/**
 * Class Song
 * Task 7: Create a class Song with the following private data members: String title, String artist.
 * Implement method equals. Two objects of type Song are equal if their titles and artists are equal.
 * Implement method hashCode. Hash code of an object is calculated as follows: numeric value of each letter in the title of a song is multiplied by that letter's position in the title and added to the accumulator (integer). Numeric value of each letter in the artist of a song is multiplied by that letter's position in the artist and added to the accumulator.
 * @author mngonk01
 */
public class Song {
        private String title;
        private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
}
public boolean equals (Object o){
    if (o == null) {
        return false;
    }
    if (o instanceof Song) {
        Song s = (Song)o;
        return title.equalsIgnoreCase(s.title) && artist.equalsIgnoreCase(s.artist);
    }
    return false;
}
public int hashcode() {
    int sum = 0;
    for (int i=0; i<title.length(); i++){
        sum = sum + i*title.charAt(i);
    }
    for (int i=0; i<artist.length(); i++){
        sum = sum + i*artist.charAt(i);
    }
    return sum;
}
public String getTitle() {
        return title;
    }
public String getArtist() {
        return artist;
    }
@Override
public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + '}';
    }
@Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.artist);
        return hash;
}

}
