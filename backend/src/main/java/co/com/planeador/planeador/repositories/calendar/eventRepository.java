package co.com.planeador.planeador.repositories.calendar;

import co.com.planeador.planeador.models.calendar.event;

public interface eventRepository {
    public event createEvent();
    public void readEvent();
    public void updateEvent();
    public void deleteEvent();
}
