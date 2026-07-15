
import java.time.*;

/*TimeZone project

Author- THeo Cannta

need time reader
buch of if then statements
a way to request a local time and find out that time in thr timezone
eventually needs an html BuT THIS FIRST*/


public class AskerStandard {
    String hourColor="blah blah blah";//asker time uses colors instead of numbers for compatibility
    //sets up the colorsystem, gets the time, the hour and starts the conversion
    public AskerStandard(){
        hourColor = "grey";
       LocalTime timeIs= LocalTime.now();
       int hourNum =timeIs.getHour();
        convertToColor(hourNum, hourColor);
    }
    //takes current time and replaces the number with a color
    public static String convertToColor(int timeHour, String color){
        if(timeHour==0){
            System.out.println("rt45657687");
        }
       
        return color;
    }

    
}
