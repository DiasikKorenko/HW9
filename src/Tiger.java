public class Tiger extends Animal implements Animals {
    public Tiger(int wight, String color, int kolLap) {
        super(wight, color, kolLap);
    }

    @Override
    public void eat() {
        System.out.println("Описание тигра:");
        System.out.println("Вес: "+ wight+" Цвет: "+color+" Количество лап: "+kolLap);
        System.out.println("Метод:");
        System.out.println("Тигры едят мясо");
    }
}
