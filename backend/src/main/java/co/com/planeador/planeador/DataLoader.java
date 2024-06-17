package co.com.planeador.planeador;

import co.com.planeador.planeador.models.calendar.event;
import co.com.planeador.planeador.repositories.calendar.eventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private eventRepository eventrepository;

    @Override
    public void run(String... args) throws Exception{
        if(eventrepository.count() == 0){
            loadInitialData();
        }
    }

    private void loadInitialData(){
        event event1 = new event();
        event1.setId(1);
        event1.setEventName("Medicamentos");
        event1.setEndTime(1800);
        event1.setStartTime(1500);
        event1.setChosenDay(15);

        event event2 = new event();
        event2.setId(2);
        event2.setEventName("Ejercicio");
        event2.setEndTime(1400);
        event2.setStartTime(1000);
        event2.setChosenDay(22);

        eventrepository.save(event1);
        eventrepository.save(event2);
    }
}
