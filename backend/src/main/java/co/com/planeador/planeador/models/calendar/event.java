package co.com.planeador.planeador.models.calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.*;

@Entity
public class event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String eventName;
    private int startTime;
    private int endTime;
    private int chosenDay;


    public event(int id, String eventName, int startTime, int endTime, int chosenDay) {
        this.id = id;
        this.eventName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.chosenDay = chosenDay;
    }


    public event(int id) {
        this.id = id;
    }

    public int getChosenDay() {
        return chosenDay;
    }

    public void setChosenDay(int chosenDay) {
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

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
