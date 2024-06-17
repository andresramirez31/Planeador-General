package co.com.planeador.planeador.repositories.calendar;


import co.com.planeador.planeador.models.calendar.year;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YearRepository extends JpaRepository<year, Long> {
}
