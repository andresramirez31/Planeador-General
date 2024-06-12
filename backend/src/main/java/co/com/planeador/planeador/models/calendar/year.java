package co.com.planeador.planeador.models.calendar;

public class year {
    private int idYearDate;
    private month[] Year;

    public year(int idYearDate, month[] year) {
        this.idYearDate = idYearDate;
        Year = year;
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

    public month[] getYear() {
        return Year;
    }

    public void setYear(month[] year) {
        Year = year;
    }
}
