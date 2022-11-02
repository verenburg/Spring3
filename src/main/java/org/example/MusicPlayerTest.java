package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        //ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        /*List<Music> playList = new ArrayList<Music>();
        playList.add(rockMusic);
        playList.add(classicalMusic);*/

        Computer computer1 = context.getBean("computer", Computer.class );

        computer1.getPlayer().playMusic(MusicGenre.CLASSICAL);
        System.out.println(computer1.getPlayer().getName());
        System.out.println(computer1.getPlayer().getVolume());

        Computer computer2 = context.getBean("computer", Computer.class );
        System.out.println(computer2 == computer1);

        context.close();

    }

}
