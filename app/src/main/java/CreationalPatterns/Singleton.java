//The Singleton Pattern specifies that only a single instance of a class should exist with a global point of access.
// This works well when modeling real-world objects only having one instance:

public class ExampleSingleton {
    private static ExampleSingleton instance = null;

    private ExampleSingleton() {
        // customize if needed
    }

    public static ExampleSingleton getInstance() {
        if (instance == null) {
            instance = new ExampleSingleton();
        }
        return instance;
    }
}

//The above class “hides” the creation of the single instance behind the static method getInstance() to ensure you only initialize the class once.
// When you need to access the singleton object, you simply make a call as follows:

ExampleSingleton.getInstance();

//You’ll then know you’re using the same instance of that class throughout your app.

//The Singleton is probably the easiest pattern to initially understand, but can be dangerously easy to overuse – and abuse.
// Since it’s accessible from multiple objects, the singleton can undergo unexpected side effects that are difficult to track down – exactly what Future You doesn’t want to deal with. It’s important to understand the pattern, but other design patterns may be safer and easier to maintain.