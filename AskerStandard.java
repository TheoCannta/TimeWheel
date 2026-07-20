
import java.time.*;

/*TimeZone project

Author- THeo Cannta

need time reader
buch of if then statements
a way to request a local time and find out that time in thr timezone
eventually needs an html BuT THIS FIRST*/


public class AskerStandard {
    // String hourColor="blah blah blah";//asker time uses colors instead of numbers for compatibility
    
    public static void main(String[] args) {
        LocalTime timeIs= LocalTime.now();
        int hourNum = timeIs.getHour();
        String hourColor="blah blah blah";//asker time uses colors instead of numbers for compatibility


        convertToColor(hourNum, hourColor);
        System.out.println(timeIs.getHour());
    }

     public static String convertToColor(int timeHour, String color){
        if(timeHour==0){
           System.out.println("purble");
       } else if(timeHour==1){
           System.out.println("black");
       } else if(timeHour==2){
           System.out.println("white");
       } else if(timeHour==3){
           System.out.println("grey");
       } else if(timeHour==4){
           System.out.println("brown");
       } else if(timeHour==5){
           System.out.println("teal");
       } else if(timeHour==6){
           System.out.println("cyan");
       } else if(timeHour==7){
           System.out.println("magenta");
       } else if(timeHour==8){
           System.out.println("cherry");
       } else if(timeHour==9){
           System.out.println("grape");
       } else if(timeHour==10){
           System.out.println("olive");
       } else if(timeHour==11){
           System.out.println("lime");
       } else if(timeHour==12){
           System.out.println("lemon");
       } else if(timeHour==13){
           System.out.println("pomegranate");
       } else if(timeHour==14){
           System.out.println("pink");
       } else if(timeHour==15){
           System.out.println("gold");
       } else if(timeHour==16){
           System.out.println("silver");
       } else if(timeHour==17){
           System.out.println("broze");
       } else if(timeHour==18){
           System.out.println("red");
       } else if(timeHour==19){
           System.out.println("orange");
       } else if(timeHour==20){
           System.out.println("yellow");
       } else if(timeHour==21){
           System.out.println("green");
       } else if(timeHour==22){
           System.out.println("blue");
       } else if(timeHour==23){
           System.out.println("indigo");
       } else {
        System.out.println("rt45657687");
        }
        return color;
   }

    // //sets up the colorsystem, gets the time, the hour and starts the conversion
    //  int hourNum=0;
    // public AskerStandard(){
    //     hourColor = "grey";
    //    LocalTime timeIs= LocalTime.now();
    //    hourNum =timeIs.getHour();
    //    System.out.println(hourNum+hourColor);
    //    // 
    // }

    // public static int getHourNum(){
    //     return hourNum;
    // }
    //takes current time and replaces the number with a color
  //  public static String convertToColor(int timeHour, String color){
      //  if(timeHour==0){
       //     System.out.println("rt45657687");
       // }
       
        //return color;
   // }

}
