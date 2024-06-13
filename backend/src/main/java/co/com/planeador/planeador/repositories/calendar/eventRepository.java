package co.com.planeador.planeador.repositories.calendar;


import org.springframework.data.jpa.repository.JpaRepository;
import co.com.planeador.planeador.models.calendar.event;

public interface eventRepository extends JpaRepository<event, Long> {

}
