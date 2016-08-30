package sample;


public class SLRCamera extends Camera implements SLRCameraImpl, LensTask{
    private int filmType;
    public SLRCamera(String name, String lens, String lightSensor, int filmType) {
        super(name, lens, lightSensor);
        setFilmType(filmType);
    }

    public int getFilmType() {
        return filmType;
    }

    public void setFilmType(int filmType) {
        this.filmType = filmType;
    }

    @Override
    public void shutterOperation() {
        System.out.println("Shutter is working...");
    }

    @Override
    public void doMirrorFlipsOut() {
        System.out.println("Mirror flips out!");
    }

    @Override
    public void doChemicalReaction() {
        System.out.println("Film has exposed!");
    }

    @Override
    public void doFilmRewind() {
        System.out.println("Film has rewinded!");
    }
}
