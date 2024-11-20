public class TimeCalc {
    public static void main(String[] args) {
        //String currentTime = args[0];
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutestoadd = Integer.parseInt(args[1]);
        // System.out.println("Hours: "+hours);
        //System.out.println("Minutes: "+minutes);
        //System.out.println("Minutes to add: "+minutestoadd);
        int total_minutes = ( hours * 60 ) + minutes + minutestoadd;
        //System.out.println(total_minutes);
        int total_hours = total_minutes / 60;
        //System.out.println(total_hours);            
        int new_hours = total_hours % 24;
        //System.out.println(new_hours);
        int new_minutes = total_minutes - (total_hours * 60);
        //System.out.println(new_minutes);
        if (new_hours < 10) {
            System.out.print("0"+new_hours+":");
            if (new_minutes<10) {
                System.out.print("0"+new_minutes);

                
            }
            else
            {
                System.out.print(new_minutes);
            }
        }
        else
        {
            System.out.print(new_hours+":");
            if (new_minutes<10) {
                System.out.print("0"+new_minutes);

                
            }
            else
            {
                System.out.print(new_minutes);
            }    
        }
        

    }
}
