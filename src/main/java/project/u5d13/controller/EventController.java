package project.u5d13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.u5d13.entities.Event;
import project.u5d13.service.EventService;

import java.util.List;

@Controller
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public String getAllEvents(Model model) {
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("events", events);
        return "events";
    }

    @GetMapping("/events/create")
    public String showEventCreationForm(Model model) {
        model.addAttribute("event", new Event());
        return "create_event";
    }

    @PostMapping("/events/create")
    public String createEvent(@ModelAttribute("event") Event event) {
        eventService.createEvent(event);
        return "redirect:/events";
    }


}
