import javax.xml.crypto.Data;

public class Timetable {
    private Data day;
    private Data hour;
    private String place;

    public Timetable(Data day, Data hour, String place) {
        this.day = day;
        this.hour = hour;
        this.place = place;
    }

    public Timetable() {
    }

    public Data getDay() {
        return day;
    }

    public void setDay(Data day) {
        this.day = day;
    }

    public Data getHour() {
        return hour;
    }

    public void setHour(Data hour) {
        this.hour = hour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
