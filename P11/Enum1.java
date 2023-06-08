package P11;

import java.util.Arrays;

public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1 == w2);
        System.out.println(w1 == w3);
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));
        WeekDays w4 = WeekDays.valueOf("MONDAY");
        System.out.println(w4);
        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }

}

enum WeekDays {

    MONDAY("terrible"),
    TUESDAY("bad"),
    WEDNESDAY("bad"),
    THURSDAY("bad"),
    FRIDAY("OK"),
    SATURDAY("good"),
    SUNDAY("OK");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

}

enum WeekDays2 {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}

class Today {

    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can have some rest");
                break;
        }
        System.out.println("Mood: " + weekDay.getMood());
    }

}


