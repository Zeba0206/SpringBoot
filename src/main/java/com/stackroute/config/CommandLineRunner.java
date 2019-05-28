package com.stackroute.config;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
//import java.util.logging.Logger;

public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    public static final Logger logs = LoggerFactory.getLogger(CommandLineRunner.class);
    private TrackRepository trackRepository;

    @Autowired
    public CommandLineRunner(TrackRepository trackRepository){
        this.trackRepository=trackRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        logs.info("Inserting data on start");

        Track trackOne = new Track(5,"Rise","Singer : Jonas Blue");
        trackRepository.save(trackOne);
        Track trackTwo = new Track(6,"Better now","Singer : Post Malone");
        trackRepository.save(trackTwo);

        logs.info("data successfully inserted");
    }
}
