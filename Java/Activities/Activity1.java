package activities;

public class Activity1 {
    public static void main(String[] args)
    {
        Car toyota  = new Car();
        toyota.make = 2024;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        toyota.displayCharacteristics();
        toyota.accelarate();
        toyota.brake();
    }
}
