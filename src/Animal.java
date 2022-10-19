public abstract class Animal {
    int wight;
    String color;
    int kolLap;

    public int getWight() {
        return wight;
    }

    public String getColor() {
        return color;
    }

    public int getKolLap() {
        return kolLap;
    }

    public Animal(int wight, String color, int kolLap) {
        this.wight = wight;
        this.color = color;
        this.kolLap = kolLap;
    }
}
