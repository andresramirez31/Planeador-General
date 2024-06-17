package co.com.planeador.planeador.services.calendar;

import co.com.planeador.planeador.models.calendar.event;
import co.com.planeador.planeador.repositories.calendar.eventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class eventService {

    @Autowired
    private eventRepository eventrepository;

    public List<event> getAllEvents() {
        return eventrepository.findAll();
    }

    public event saveEvent(event newEvent){
        return eventrepository.save(newEvent);
    }

    public event getEventById(int id){
        return eventrepository.findById(id).orElse(null);
    }

    public List<event> getEventsByChosenDay(int chosenDay) {
        return eventrepository.findByChosenDay(chosenDay);
    }
}
