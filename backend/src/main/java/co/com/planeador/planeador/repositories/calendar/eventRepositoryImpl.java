package co.com.planeador.planeador.repositories.calendar;

import co.com.planeador.planeador.models.calendar.event;

public class eventRepositoryImpl implements eventRepository {

    private event cEvent;

    public eventRepositoryImpl(event cEvent) {
        this.cEvent = cEvent;
    }

    @Override
    public event createEvent() {
        event cEventNew = new event(this.cEvent.getId());
        return cEventNew;
    }

    @Override
    public void readEvent() {

    }

    @Override
    public void updateEvent() {

    }

    @Override
    public void deleteEvent() {

    }
}
