import org.junit.Test;

import java.util.Calendar;

public class AppointmentServiceTest {

    @Test
    public void addAppointment() {
        AppointmentService appointmentService = new AppointmentService();
        String id = "123456789";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 11, 23);
        appointmentService.addAppointment(id, new
                Appointment(id, calendar.getTime(), "This is a description"));
    }

    @Test
    public void deleteAppointment() {
        AppointmentService appointmentService = new AppointmentService();
        String id = "123456789";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 01, 01);
        appointmentService.addAppointment(id, new
                Appointment(id, calendar.getTime(), "Blahh"));
        appointmentService.deleteAppointment(id);
    }

}