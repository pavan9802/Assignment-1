package vacc_clinic;

public class Schedule {
    private Appointment [] appointments;
    private int numAppts;

    private int find(Appointment appt) {return 0;} //return the index, or NOT_FOUND
    private void grow() {} //increase the capacity of the container by 4
    public boolean add(Appointment appt) {return false;}
    public boolean remove(Appointment appt) {return false;}
    public void print() {} //print all the appointments in current order
    public void printByZip() {} //sort by zip codes and print
    public void printByPatient() {} //sort by patient and print
 }