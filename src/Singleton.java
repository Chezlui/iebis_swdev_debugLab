// Source code: https://refactoring.guru/design-patterns/singleton/java/example#example-2
public final class Singleton {
    // The field must be declared volatile so that double check lock would work.
    //
    // See: https://refactoring.guru/java-dcl-issue
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(value);
                }
            }
        }
        return instance;
    }
}