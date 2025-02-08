public class oops {
    public static void main(String[] args) {
     mobile m1= new mobile();
     m1.model="Realme 7";
     m1.color="Mist White";
     m1.Screen_size=16.5f;
     m1.weight=196;
     m1.ram=8;
     m1.Storage=128;
     m1.OperatingSystem="realme UI Based on Android 10";
     m1.chargerType="Type C";
     m1.Battery=5000;
     m1.display();
    }
}
    class mobile{
        String model;
        String color;
        float Screen_size;
        int weight;
        int ram;
        int Storage;
        String OperatingSystem;
        String chargerType;
        int Battery;

        void display(){
            System.out.println("Model: "+model);
            System.out.println("Color: "+color);
            System.out.println("Screen Size: "+Screen_size);
            System.out.println("Weight: "+weight);
            System.out.println("Ram: "+ram);
            System.out.println("Storage: "+Storage);
            System.out.println("Operating System: "+OperatingSystem);
            System.out.println("Charger Type: "+chargerType);
            System.out.println("Battery: "+Battery);
        }
    }

