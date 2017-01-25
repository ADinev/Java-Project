package swiftAcademy.Lecture2;

public class SwapVariables {

    public static void main(String[] args) {


        {
            int a = 5;
            int b = 9;
            int c = a;
            
            System.out.println(a + " " + b);
            
            a = b;
            b = c;

            System.out.println(a + " " + b);
        }
        
        {
            int a = 11;
            int b = 7;
            int c = a;
            
            System.out.println(a + " " + b);
            
            a = b;
            b = c;
            
            System.out.println(a + " " + b);
        }
    }
}
