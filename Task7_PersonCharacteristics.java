package swiftAcademy.Lecture2;

public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        
        String firstName = "Anzhelo";
        String lasteName = "Dinev";
        byte age = 26;
        float weight = 77.5f;
        float height = 177.7f;
        String business = "Java Developers";
        
        System.out.println(
                firstName + " " + lasteName + " is " + 
                age + " years old. His weight is " + weight + " and he is\n"
                + height + "cm tall. He is a " + business);
    }
}