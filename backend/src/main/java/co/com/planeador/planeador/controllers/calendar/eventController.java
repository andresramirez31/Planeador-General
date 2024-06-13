package co.com.planeador.planeador.controllers.calendar;
import co.com.planeador.planeador.models.calendar.event;
import co.com.planeador.planeador.services.calendar.eventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class eventController {

    @Autowired
    private eventService eventservice;

    @GetMapping
    public List<event> getAllEvents() {
        return eventservice.getAllEvents();
    }

}
