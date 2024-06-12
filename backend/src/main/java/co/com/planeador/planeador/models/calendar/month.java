package co.com.planeador.planeador.models.calendar;

public class month {
    private int idMonthDate;
    private day[] Month;

    public month(int idMonthDate, day[] month) {
        this.idMonthDate = idMonthDate;
        Month = month;
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

    public day[] getMonth() {
        return Month;
    }

    public void setMonth(day[] month) {
        Month = month;
    }
}
