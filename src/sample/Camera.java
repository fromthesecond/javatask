package sample;

public class Camera {
    private String name;
    private String lens;
    private String lightSensor;
    private final String outInfo = "Taking picture with: ";

    public Camera (String name, String lens, String lightSensor) {
        setName(name);
        setLens(lens);
        setLightSensor(lightSensor);
    }

    public String getOutInfo() {
        return outInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getLightSensor() {
        return lightSensor;
    }

    public void setLightSensor(String lightSensor) {
        this.lightSensor = lightSensor;
    }

    public void takePhoto(){
        System.out.println(getOutInfo()+ " " + getLens() + " " + getLightSensor() + " "+ getName());
        System.out.println("......TASK DONE!");
    }

    public String takePhoto(Camera camera) {
        return camera.getOutInfo()+ " " + camera.getLens() + " " + camera.getLightSensor() + " "+ camera.getName();
    }


}
