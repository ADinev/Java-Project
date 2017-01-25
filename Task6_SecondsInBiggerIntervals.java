package swiftAcademy.Lecture2;

public class Task6_SecondsInBiggerIntervals {

    public static void main(String[] args) {
        {
            int seconds = 1234567;

            int sec = seconds % 60;
            int minutes = seconds % 3600 / 60;
            int hours = seconds % 86400 / 3600;
            int days = seconds / 86400;

            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + sec + " seconds");
        }
        
        
        {
            int seconds = 3600;
            
            int sec = seconds % 60;
            int minutes = seconds % 3600 / 60;
            int hours = seconds % 86400 / 3600;
            int days = seconds / 86400;
            
            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + sec + " seconds");
        }
        
        //
        {
            int seconds = 129600;
            
            int sec = seconds % 60;
            int minutes = seconds % 3600 / 60;
            int hours = seconds % 86400 / 3600;
            int days = seconds / 86400;
            
            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + sec + " seconds");
        }
    }
}
