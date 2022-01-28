
package vacc_clinic;
/**
 * The Patient class represents a patient and hold
 * the patients name and dob.
 *
 * @author  Pavan Patel & Khushi Patel
 * @since   2022-03-27
 */
public class Patient implements Comparable<Patient> {
    private String fname;
    private String lname;
    private Date dob;


    /**
     * This is the constuctor for the Patient class;
     */
    public Patient(String fname, String lname, Date dob) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    /**
     * This method turns the values a Patient value holds into a String.
     * @return String Returns the First and Last name of the Patient object
     *  and the DOB of the Patient object.
     */
    @Override
    public String toString() {
        return fname + " " + lname + "dob: " +dob;
    }

    /**
     * This method compares two Patient object.
     * @param patient This is a patient that is to be be compared.
     * @return int Returns 1 if two patients are the same and
     *             0 otherwise.
     */
    @Override
    public int compareTo(Patient patient) {
        if(this.fname ==patient.fname &&  this.lname ==patient.lname  &&
                this.dob ==patient.dob )
        {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
//        Pateint 1 = new Patient ("pavan", "patel", new Date());
    }
}