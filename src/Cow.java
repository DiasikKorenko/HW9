public class Cow extends Animal implements Animals{


    public Cow(int wight, String color, int kolLap) {
        super(wight, color, kolLap);
    }

    @Override
    public void eat() {
        System.out.println("Описание коровы:");
        System.out.println("Вес: "+ wight+" Цвет: "+color+" Количество лап: "+kolLap);
        System.out.println("Метод:");
        System.out.println("Коровы едят сено");
    }
}
