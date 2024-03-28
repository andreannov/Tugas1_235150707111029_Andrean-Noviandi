package tugas2.kelas;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    // menyeting status
    public void setStatus(String  status) {
        this.status = status;
    }
    // menyeting volume
    public void setVolume(int volume) {
        this.volume = volume;
    }
    // mematikan tv
    public void TurnOff(){
        setStatus("mati");
    }
    // menyalakan tv
    public void TurnOn(){
        setStatus("menyala");
    }
    // membekukan tv
    public void Freeze(){
        setStatus("freeze");
    }

    // menaikkan volume
    public void VolumeUp(){
        volume++;
    }

    // menurunkan volume
    public void VolumeDown(){
        volume--;
    }

    // menaikkan brightness
    public void BrightnessUP(){
        brightness++;
    }

    // menurunkan brightness
    public void BrightnessDown(){
        brightness--;
    }

    // setting brightness
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    // mengatur kabel
    public void setCable(int option){
        String[] cables= {"VGA", "DVI", "HDMI", "Display Port"};
        this.cable = cables[option];
    }

    // display message 
    public void displayMessage(){
        System.out.println("Status tv saat ini adalah " + status);
        System.out.println("Volume saat ini adalah " + volume);
        System.out.println("Brightness saat ini adalah " + brightness);
        System.out.println("Di kabel "+ cable);
    }
}