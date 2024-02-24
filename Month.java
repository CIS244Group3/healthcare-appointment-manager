import java.util.ArrayList;
public class Month {
    ArrayList <Day> daysOfTheMonth;
    public Month(){
        for(int i = 1; i < 32; i++){
            this.daysOfTheMonth.add(new Day(i));
        }
    }
    // public makeDayAvailable
}
