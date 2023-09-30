// Истомин Сергей Андреевич группа 4832
public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Shoda", 15, false);
        cat[1] = new Cat("Vasa", 10, false);
        cat[2] = new Cat("Barsic", 5, false);

        Plate plate = new Plate(15);
        plate.info();

        for (Cat i : cat) {
            if ((plate.getFood() - i.getAppetite()) >= 0){
                plate.setFood(plate.getFood() - i.getAppetite());
                i.eat();
                //plate.info();
                i.setSatiety(true);
            }
            else {
                System.out.printf("Кот по имени %s не смог поесть %d единиц корма, в тарелке столько нет \n"
                        , i.getName(), i.getAppetite());
                plate.increaseFood();
            }

            if (i.isSatiety()){
                System.out.printf("Кот по имени %s сыт!!! \n", i.getName());
            }
            else {
                System.out.printf("Кот по имени %s остался голодным!!! \n", i.getName());
            }
            plate.info();
        }
    }
}
