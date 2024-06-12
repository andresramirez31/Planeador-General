package co.com.planeador.planeador.models.calendar;
import java.time.*;

public class event{

    private int id;
    private String eventName;
    private LocalTime startTime;
    private LocalTime endTime;
    private day chosenDay;

    public event(int id, String eventName, LocalTime startTime, LocalTime endTime, day chosenDay) {
        this.id = id;
        this.eventName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.chosenDay = chosenDay;
    }


    public event(int id) {
        this.id = id;
    }

    public day getChosenDay() {
        return chosenDay;
    }

    public void setChosenDay(day chosenDay) {
        this.chosenDay = chosenDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
