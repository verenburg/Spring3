package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Autowired
    private ClassicalMusic classicalMusicList;
    @Autowired
    private RockMusic rockMusicList;

    //Инверсия управления
    public MusicPlayer() {

    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(MusicGenre genre) {

        Random rnd = new Random();
        int randomNum = rnd.nextInt(3);


        switch (genre){
            case ROCK:
                System.out.println("Plaing:" + rockMusicList.getSongs().get(randomNum));
                break;
            case CLASSICAL:
                System.out.println("Plaing:" + classicalMusicList.getSongs().get(randomNum));
                break;
        }
    }
}
