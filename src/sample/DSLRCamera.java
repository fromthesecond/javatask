package sample;

public class DSLRCamera extends Camera implements LensTask {
    private String CPU;
    private String battery;

    public DSLRCamera(String name, String lens, String lightSensor,
                     String battery, String CPU) {
        super(name, lens, lightSensor);
        setBattery(battery);
        setCPU(CPU);
    }
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void takePhoto() {
        System.out.println(getOutInfo() + getName() + " " + getLens() + " "
                + getLightSensor() + " " + getCPU() + " " + getBattery()) ;
        savePhotoToMemoryCard();
    }
    private void savePhotoToMemoryCard() {
        System.out.println("Saving photo to memory...");

    }
    public void sendViaWiFi () {
        System.out.println("Sending photo via WiFi...");
        System.out.println("......TASK DONE!");
    }


    @Override
    public void shutterOperation() {
        System.out.println("Electronic shutter is working...");
    }

    @Override
    public void doMirrorFlipsOut() {
        System.out.println("Mirror flips out!");
    }
}
