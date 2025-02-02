import java.util.*;

class BookingSys {
    static class Booking {
        String name, date, startTime, endTime;
        Booking(String name, String date, String startTime, String endTime) {
            this.name = name; this.date = date; this.startTime = startTime; this.endTime = endTime;
        }
    }

    static List<Booking> bookings = new ArrayList<>();

    public static void bookRoom(String name, String date, String startTime, String endTime) {
        for (Booking b : bookings) {
            if (b.date.equals(date) && b.startTime.equals(startTime) && b.endTime.equals(endTime)) {
                System.out.println("Room already booked.");
                return;
            }
        }
        bookings.add(new Booking(name, date, startTime, endTime));
        System.out.println("Booked by " + name + " on " + date + " from " + startTime + " to " + endTime);
    }

    public static void checkAvailability(String date, String startTime, String endTime) {
        for (Booking b : bookings) {
            if (b.date.equals(date) && b.startTime.equals(startTime) && b.endTime.equals(endTime)) {
                System.out.println("Room not available on " + date + " from " + startTime + " to " + endTime);
                return;
            }
        }
        System.out.println("Room available on " + date + " from " + startTime + " to " + endTime);
    }

    public static void main(String[] args) {
        bookRoom("John", "2025-02-02", "10:00", "12:00");
        checkAvailability("2025-02-02", "10:00", "12:00");
        checkAvailability("2025-02-02", "12:00", "14:00");
    }
}
