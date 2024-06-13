package co.com.planeador.planeador.models.calendar;

import javax.persistence.*;
import java.time.Month;

@Entity
@Table(name = "calendarDay")
public class day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDayNumber;

    @ManyToOne
    private month calendarDay;

    public day(int idDayNumber) {
        this.idDayNumber = idDayNumber;
    }

    public day(final int idDayNumber, final month calendarDay) {
        this.idDayNumber = idDayNumber;
        this.calendarDay = calendarDay;
    }

    public month getCalendarDay() {
        return this.calendarDay;
    }

    public void setCalendarDay(final month calendarDay) {
        this.calendarDay = calendarDay;
    }

    public int getIdDayNumber() {
        return idDayNumber;
    }

    public void setIdDayNumber(int idDayNumber) {
        this.idDayNumber = idDayNumber;
    }
}
