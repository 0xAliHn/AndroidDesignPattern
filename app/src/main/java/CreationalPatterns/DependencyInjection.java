//Dependency injection is like moving into a furnished apartment. Everything you need is already there; you don’t have to wait for furniture delivery or follow pages of IKEA instructions to put together a Borgsjö bookshelf.

//In strictly software terms, dependency injection has you provide any objects required when you instantiate a new object; the new object doesn’t need to construct or customize the objects itself.

//In Android, you might find you need to access the same complex objects from various points in your app, such as a network client, an image loader, or SharedPreferences for local storage.
// You can inject these objects into your activities and fragments and access them right away.

//Dagger 2 is the most popular open-source dependency injection framework for Android and was developed in collaboration between Google and Square. You simply annotate a class with @Module, and populate it with @Provides methods such as the following:

@Module
public class AppModule {
    @Provides SharedPreferences provideSharedPreferences(Application app) {
        return app.getSharedPreferences("prefs", Context.MODE_PRIVATE);
    }
}

//The module above creates and configures all required objects. As an additional best-practice in larger apps, you could even create multiple modules separated by function.

//Then, you make a Component interface to list your modules and the classes you’ll inject:

@Component(modules = AppModule.class)
interface AppComponent {
}


//The component ties together where the dependencies are coming from (the modules), and where they are going to (the injection points).

//Finally, you use the @Inject annotation to request the dependency wherever you need it:

@Inject SharedPreferences sharedPreferences;

//As an example, you could use this approach in an Activity and then use local storage, without any need for the Activity to know how the SharedPreferences object came to be.

//Admittedly this is a simplified overview, but you can read up on the Dagger documentation for more detailed implementation details.
// This pattern may seem complicated and “magical” at first, but its use can help simplify your activities and fragments.