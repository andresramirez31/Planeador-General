package co.com.planeador.planeador.controllers.calendar;

import co.com.planeador.planeador.models.calendar.event;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class eventControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private event testEvent;

    @BeforeEach
    public void setUp(){
        testEvent = new event();
        testEvent.setId(1);
        testEvent.setEventName("Medicamentos");
        testEvent.setEndTime(1800);
        testEvent.setStartTime(1500);
        testEvent.setChosenDay(15);
    }

    @Test
    public void testCreateEvent() throws Exception{
        mockMvc.perform(post("/events").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(testEvent))).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(content().json(objectMapper.writeValueAsString(testEvent)));
    }
}
