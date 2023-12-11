package Task121;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1,1,1978);
        date1.setDay(1);
        date1.setMonth(1);
        date1.setYear(1978);
        DateTask date2 = new DateTask(9,21,1984);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        // display leapyears
        System.out.println("LeapYears:");
        DateTask.leapYears();

    }
}
