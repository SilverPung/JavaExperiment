package com.silver.experiment.service;

import com.silver.experiment.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.silver.experiment.repo.EventsRepo;

import java.util.List;

@Service
public class EventsService {

    private final EventsRepo eventsRepo;

    @Autowired
    public EventsService(EventsRepo eventsRepo) {
        this.eventsRepo = eventsRepo;
    }

    public List<Event> getEvents() {
        return  eventsRepo.findAll();
    }


}
