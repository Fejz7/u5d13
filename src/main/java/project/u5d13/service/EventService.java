package project.u5d13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.u5d13.entities.Event;
import project.u5d13.repository.EventRepository;

import java.util.List;

// EventService.java
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return null;
    }

    public void createEvent(Event event) {
    }
}
