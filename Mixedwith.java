abstract class Device {
    // Nested interface
    interface Camera {
        String BRAND = "Samsung";

        void turnOn();

        default void showBrand() {
            System.out.println("Brand: " + BRAND);
        }
    }
}

// Camera interface
interface Camera {
    int MAX_ZOOM = 10;

    void takePhoto();

    default void cameraInfo() {
        System.out.println("Camera is ready");
    }
}

// Music Player interface
interface MusicPlayer {
    String TYPE = "Digital";

    void playMusic();

    default void musicInfo() {
        System.out.println("Music player is ready");
    }
}

// Smartphone class
class Smartphone extends Device implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking Photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    public void turnOn() {
        System.out.println("Smartphone is turned ON");
    }

    public void showDeviceInfo() {
        System.out.println("Maximum Zoom: " + MAX_ZOOM);
        System.out.println("Music Type: " + TYPE);
    }
}

// Main class
public class Mixedwith {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        s.turnOn();
        s.takePhoto();
        s.playMusic();

        s.cameraInfo();
        s.musicInfo();

        s.showDeviceInfo();
    }
}