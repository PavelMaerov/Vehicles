public class Car extends Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем автомобильную покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем автомобильный двигатель");
    }
    @Override
    public void check() {
        printTitle();
        updateAllTyre();
        checkEngine();
    }
}
