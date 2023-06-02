public class LimitedInstancesClass {
    private static int instanceCount = 0;
    private static final int MAX_INSTANCES = 3;

    private static LimitedInstancesClass instance;

    private LimitedInstancesClass() {
        // Private constructor to prevent direct instantiation
        instanceCount++;
    }

    public static LimitedInstancesClass getInstance() {
        if (instance == null && instanceCount < MAX_INSTANCES) {
            instance = new LimitedInstancesClass();
        }
        return instance;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
public class Main {
    public static void main(String[] args) {
        LimitedInstancesClass instance1 = LimitedInstancesClass.getInstance();
        LimitedInstancesClass instance2 = LimitedInstancesClass.getInstance();
        LimitedInstancesClass instance3 = LimitedInstancesClass.getInstance();
        LimitedInstancesClass instance4 = LimitedInstancesClass.getInstance();

        System.out.println("Instance count: " + LimitedInstancesClass.getInstanceCount());
    }
}
