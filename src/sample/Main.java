package sample;

public class Main {

    public static void main(String[] args) {
        Camera oldCamera = new Camera("Camera Obscura", null, "photoplate");
        Camera digitalCamera = new DSLRCamera("Canon", "Canon EF 24-105", "matrix", "1550mAh", "DIGIC 7+");
        Camera filmCamera = new SLRCamera("Praktica L", "Pentacon 2.8/29", "film", 135);
        getCameraInfo(oldCamera);
        getCameraInfo(digitalCamera);
        getCameraInfo(filmCamera);
    }
    public static void getCameraInfo (Camera camera) {
        camera.takePhoto();
        if (camera instanceof DSLRCamera) {
            ((DSLRCamera) camera).sendViaWiFi();
        }
        if (camera instanceof SLRCamera) {
            ((SLRCamera)camera).shutterOperation();
            ((SLRCamera) camera).doMirrorFlipsOut();
            ((SLRCamera) camera).doChemicalReaction();
            ((SLRCamera) camera).doFilmRewind();
        }
    }
}
