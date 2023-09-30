public class Plate {
    public int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке сейчас единиц корма: " + food);
    }

    void increaseFood() {
        this.food += 10;
        System.out.println("В миску добавили 10 единиц корма");
    }
}
