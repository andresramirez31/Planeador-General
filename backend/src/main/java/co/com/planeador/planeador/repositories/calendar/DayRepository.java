package co.com.planeador.planeador.repositories.calendar;

import co.com.planeador.planeador.models.calendar.day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<day, Long> {
}
