package oo;

public class Singleton {
    /**
     * Static initializer is run before class is available to code, avoiding
     * broken antipattern of lazy initialization in instance method.
     * For more complicated construction, could use static block initializer.
     */
    private static Singleton instance = new Singleton();

    /** A private Constructor prevents any other class from instantiating. */
    private Singleton() {
        // nothing to do this time
    }

    /** Static 'instance' method to obtain the one-and-only instance */
    public static Singleton instance() {
        return instance;
    }

    // other instance methods protected by singleton-ness would be here...

    /** A simple demo method */
    public String demoMethod() {
        return "demo";
    }
}
