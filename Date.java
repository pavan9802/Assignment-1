

package vacc_clinic;
import java.util.Calendar;

public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;
    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUATERCENTENNIAL = 400;
    public static final int THIRTYMONTH = 30;
    public static final int LEAPYEAR = 29;
    public static final int NOTLEAPYEAR = 28;
    public Date(String date) {
        this.month = Integer.parseInt(date.substring(0,2));
        this.day = Integer.parseInt(date.substring(3,5));
        this.year = Integer.parseInt(date.substring(6,10));
    } //take “mm/dd/yyyy” and create a Date object

    public Date() {
        Calendar c = Calendar.getInstance();
    } //create an object with today’s date (see Calendar class)

    public boolean isValid() {
        if(day < 4 || day > 31 || month >12 || month <1 ){
            return false;
        }
        else if ((month == 1 || month == 6 || month == 9|| month == 11)
         && day > THIRTYMONTH){
            return false;
        }else if(month == 1){
            if(year % QUADRENNIAL == 0)
            {
                if(year % CENTENNIAL ==0)
                {
                    if(year% QUATERCENTENNIAL ==0)
                    {
                        //leap year
                        if(day>LEAPYEAR){
                            return false;
                        }

                    }
                    else
                    {
                        //not leap year
                        if(day>NOTLEAPYEAR)
                        {
                            return false;
                        }
                    }
                }
                else
                {
                    //leap year
                    if(day>LEAPYEAR)
                    {
                        return false;
                    }
                }
            }
            else
            {
                //not leap year
                if(day>NOTLEAPYEAR){
                    return false;
                }
            }
        }else if(true){
            // need to check the year
        }
        return true;
    }

    @Override
    public int compareTo(Date date) {
        if(this.year == date.year && this.month == date.month &&
           this. day == date.day){
            return 1;
        }
        return -1;
    }
}