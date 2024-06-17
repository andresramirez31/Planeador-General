package co.com.planeador.planeador.repositories.calendar;


import org.springframework.data.jpa.repository.JpaRepository;
import co.com.planeador.planeador.models.calendar.event;

import java.util.List;

public interface eventRepository extends JpaRepository<event, Integer> {
    List<event> findByChosenDay(int chosenDay);
}
