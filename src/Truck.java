public class Truck extends Vehicle{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку фуры");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель фуры");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check() {
        printTitle();
        updateAllTyre();
        checkEngine();
        checkTrailer();
    }
}
