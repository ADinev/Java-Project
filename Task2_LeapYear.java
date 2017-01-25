/*
Високосна година е тази, която се дели на 4. В случаите, 
в които се дели на 100, за да е високосна,трябва да се дели на 400. 
Напишете програма Task2_LeapYear, в която да се съдържа израз, който
да проверява дали годината записана в променлива year е високосна.
 */
package swiftAcademy.Lecture2;

public class Task2_LeapYear {

    public static void main(String[] args) {

        {
            short year;            
            year = 2016;
            
            System.out.println("Year 2016 = " + (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0))); 
        }

        {
            short year;
            year = 1992;
            
            System.out.println("Year 1992 = " + (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)));
        }
        
        {
            short year;
            year = 2001;
            
            System.out.println("Year 2001 = " + (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)));
        }        
        
        {
            short year;
            year = 1900;
            
            System.out.println("Year 1900 = " + (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)));
        }
        
        {
            short year;
            year = 2400;
            
            System.out.println("Year 2400 = " + (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)));
        }
    }
}
