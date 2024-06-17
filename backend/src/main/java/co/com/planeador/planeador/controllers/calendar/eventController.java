package co.com.planeador.planeador.controllers.calendar;
import co.com.planeador.planeador.models.calendar.event;
import co.com.planeador.planeador.services.calendar.eventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class eventController {

    @Autowired
    private eventService eventservice;

    @GetMapping
    public List<event> getAllEvents() {
        return eventservice.getAllEvents();
    }

    @PostMapping
    public event createEvent(@RequestBody event newEvent){
        return eventservice.saveEvent(newEvent);
    }

    @GetMapping("/{id}")
    public event getEventById(@PathVariable int id) {

        return eventservice.getEventById(id);
    }

    @GetMapping("/day/{chosenDay}")
    public List<event> getEventsByChosenDay(@PathVariable int chosenDay) {

        return eventservice.getEventsByChosenDay(chosenDay);

    }

}
