package co.com.planeador.planeador.models.calendar;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "calendarYear")
public class year {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idYearDate;

    @OneToMany(mappedBy = "calendarYear")
    @OrderColumn(name = "year_order")
    private List<month> calYear;

    public year(int idYearDate, List<month> calYear) {
        this.idYearDate = idYearDate;
        this.calYear = calYear;
    }

    public year(int idYearDate) {
        this.idYearDate = idYearDate;
    }

    public int getIdYearDate() {
        return idYearDate;
    }

    public void setIdYearDate(int idYearDate) {
        this.idYearDate = idYearDate;
    }

    public List<month> getCalYear() {
        return calYear;
    }

    public void setCalYear(List<month> calYear) {
        this.calYear = calYear;
    }
}
