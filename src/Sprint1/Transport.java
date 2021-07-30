package ArticleAssignments;

public abstract class Transport { // объявлен абстрактный класс
    public abstract void ride(); // метод отвечает за перевозку людей

    public abstract String getPermitttedRoad(); // метод возвращает, по какой дороге разрешено передвигаться транспорт

    public abstract int getWheelsCount(); // метод возвращает количество колёс у транспортного средства

    public void turnLightOn(){ // метод включает фары; он не абстрактный
        System.out.println("Включаем фары");
    }
}
