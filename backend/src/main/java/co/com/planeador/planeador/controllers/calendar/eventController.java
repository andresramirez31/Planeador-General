package co.com.planeador.planeador.controllers.calendar;
import co.com.planeador.planeador.services.calendar.eventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class eventController {

    @Autowired
    private eventService calendarioservice;

}
