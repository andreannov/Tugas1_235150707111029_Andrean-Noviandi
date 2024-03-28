package tugas2.kelas;

public class mainLCD {
    public static void main(String[] args) {
        LCD joni = new LCD();

            joni.TurnOff();
            joni.TurnOn();
            joni.setVolume(20);
            joni.VolumeUp();
            joni.VolumeDown();
            joni.setBrightness(50);
            joni.BrightnessDown();
            joni.setCable(2); 
            joni.displayMessage();

        System.out.println("=============================");

        LCD Revan = new LCD();
            Revan.TurnOff();
            Revan.setVolume(50);
            Revan.VolumeUp();
            Revan.VolumeDown();
            Revan.setBrightness(50);
            Revan.BrightnessDown();
            Revan.setCable(1); 
            Revan.displayMessage();

        System.out.println("=============================");

        LCD Sugarminto = new LCD();
            Sugarminto.TurnOn();
            Sugarminto.Freeze();
            Sugarminto.setVolume(90);
            Sugarminto.VolumeUp();
            Sugarminto.VolumeUp();
            Sugarminto.VolumeUp();
            Sugarminto.VolumeDown();
            Sugarminto.setBrightness(50);
            Sugarminto.BrightnessDown();
            Sugarminto.BrightnessDown();
            Sugarminto.BrightnessDown();
            Sugarminto.BrightnessUP();
            Sugarminto.setCable(0); 
            Sugarminto.displayMessage();
    }
}
