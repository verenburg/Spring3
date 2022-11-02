package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Computer {
    @Autowired
    private MusicPlayer player;

    public MusicPlayer getPlayer() {
        return player;
    }
}
