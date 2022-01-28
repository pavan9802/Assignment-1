package vacc_clinic;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    public boolean isValid() { return false; }
    @Override
    public String toString() {return null; }
    @Override
    public int compareTo(Time time) {return 0; }

}