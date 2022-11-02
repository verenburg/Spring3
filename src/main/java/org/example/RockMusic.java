package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component//("musicBean")
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<String>();

    {
        songs.add("Wind of change");
        songs.add("We will rock you");
        songs.add("Can't seem to make you mine");
    }
    public List<String> getSongs() {
        return songs;
    }
}
