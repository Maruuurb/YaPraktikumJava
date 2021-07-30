package ArticleAssignments;

class Bank {
    private long money; // поле класса с названием money

    Bank() {
        this.money = 0; // this указывает на поле текущего класса
    }

    Bank(long money) {
        this.money = money;
        // значение поля экземпляра текущего класса money равно значению аргумента money
        // без this поле не изменилось бы
    }

    public long getMoney() {
        return money;
    }

    // this нужен, если у поля класса и параметра метода одинаковые названия
    public void setMoney(long money) {
        this.money = money;

    }
}