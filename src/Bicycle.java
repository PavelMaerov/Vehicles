public class Bicycle extends Vehicle{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем велосипедную покрышку");
    }

    @Override
    public void check() {
        printTitle();
        updateAllTyre();
    }
}
