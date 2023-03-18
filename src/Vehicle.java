public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    abstract public void check();

    public void printTitle() {
        System.out.println("Обслуживаем " + modelName);
    }

    public void updateAllTyre() {
        //немного посомневался, надо ли это действие выносить в отдельный метод.
        //можно было и продублировать в каждом наследнике.
        //теперь наследники обязаны определять updateTyre().
        //А у кого-нибудь может замена шин и не требуется...
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
    abstract public void updateTyre();

}
