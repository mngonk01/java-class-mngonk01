package exercise5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author mngonk01
 */
public class Chart {
    private HashMap<Integer, Song> songMap;
    
    public Chart(String filename){
        Scanner reader = null;
        songMap = new HashMap<Integer, Song>();
        try {
            reader = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error: could not open file '" + filename + "'");
            System.exit(0);
        }
        while (reader.hasNextLine()){
            String[] fields = reader.nextLine().split(",");
            int position = Integer.parseInt(fields[0]);
            String title = fields[1];
            String artist = fields[2];
            Song song = new Song(title, artist);
            songMap.put(position, song);
        }
        reader.close();
    }
    public Song getSong(int position){
        return songMap.get(position);
    }
    public static void main(String[] args) {
        Chart chart = new Chart("top40pop.csv");
    }
}

