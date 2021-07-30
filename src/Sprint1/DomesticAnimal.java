package ArticleAssignments;

public abstract class DomesticAnimal {
    public abstract String getSound();

    public abstract String getName();

    public abstract int getAge();

}
class Dog extends DomesticAnimal {

    @Override
    public String getSound() {

        return "Гав";
    }

    @Override
    public String getName() {
        return "Шарик";
    }

    @Override
    public int getAge() {
        return 3;
    }
}
class Cat extends DomesticAnimal{

    @Override
    public String getSound() {
        return "Мяу";
    }

    @Override
    public String getName() {
        return "Мурка";
    }

    @Override
    public int getAge() {
        return 4;
    }
}
