abstract class GoldShape {
    abstract double getVolume();

    double getPrice(){
        double volume = getVolume();
        return volume * 250 + 1200;
    }
}
