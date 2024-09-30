package com.silver.experiment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silver.experiment.service.EventsService;

import java.util.List;

import com.silver.experiment.model.Event;

@RestController
@RequestMapping("api/events")
@CrossOrigin
public class EventsController {



    private final EventsService eventsService;

    @Autowired
    public EventsController(EventsService eventsService) {
        this.eventsService = eventsService;
    }


    @GetMapping
    public List<Event> getEvents() {
        return eventsService.getEvents();
    }


}
