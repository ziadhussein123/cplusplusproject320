import org.junit.Test;

import java.util.Calendar;

public class AppointmentTest {

    @Test
    public void normal() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 01, 01);
        Appointment appointment =
                new Appointment("12345",calendar.getTime(),"description");
    }

    @Test(expected = IllegalArgumentException.class)
    public void idIsNull() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 01, 01);
        Appointment appointment =
                new Appointment(null,calendar.getTime(),"description");
    }

    @Test(expected = IllegalArgumentException.class)
    public void idIsMoreThan10Characters() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 01, 01);
        Appointment appointment =
                new Appointment("More than 10 character",calendar.getTime(),"description");
    }

    @Test(expected = IllegalArgumentException.class)
    public void dateIsInThePast() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, 11, 11);
        Appointment appointment =
                new Appointment("12345",calendar.getTime(),"description");
    }

    @Test(expected = IllegalArgumentException.class)
    public void descriptionIsMoreThan50Characters() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 01, 01);
        Appointment appointment =
                new Appointment("12345",calendar.getTime(),"sdfsdfsdfdf sdfdsf sdf" +
                        "sdfsdfsdfdsfsdfsdf" +
                        "sdfsdf sdfsd fdsf " +
                        "dsf sdfdsf fdf dfsdf " +
                        "sdf sdf df fds f");
    }
}