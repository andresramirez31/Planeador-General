package co.com.planeador.planeador.models.calendar;

import javax.persistence.*;
import java.time.Year;
import java.util.List;

@Entity
@Table(name = "calendarMonth")
public class month {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMonthDate;

    @OneToMany(mappedBy = "calendarDay")
    @OrderColumn(name = "month_order")
    private List<day> calendarMonth;

    @ManyToOne
    private year calendarYear;

    public month(int idMonthDate, List<day> calendarMonth, year calendarYear) {
        this.idMonthDate = idMonthDate;
        this.calendarMonth = calendarMonth;
        this.calendarYear = calendarYear;
    }

    public year getCalendarYear() {
        return this.calendarYear;
    }

    public void setCalendarYear(final year calendarYear) {
        this.calendarYear = calendarYear;
    }

    public month(int idMonthDate) {
        this.idMonthDate = idMonthDate;
    }

    public int getIdMonthDate() {
        return idMonthDate;
    }

    public void setIdMonthDate(int idMonthDate) {
        this.idMonthDate = idMonthDate;
    }

    public List<day> getCalendarMonth() {
        return calendarMonth;
    }

    public void setCalendarMonth(List<day> calendarMonth) {
        this.calendarMonth = calendarMonth;
    }
}
