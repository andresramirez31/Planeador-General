package co.com.planeador.planeador.repositories.calendar;


import co.com.planeador.planeador.models.calendar.month;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthRepository extends JpaRepository<month, Long> {
}
