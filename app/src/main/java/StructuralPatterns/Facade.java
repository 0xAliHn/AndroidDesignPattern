//The Facade pattern provides a higher-level interface that makes a set of other interfaces easier to use.

//If your Activity needs a list of books, it should be able to ask a single object for that list without understanding the inner workings of your local storage, cache, and API client.
// Beyond keeping your Activities and Fragments code clean and concise, this lets Future You make any required changes to the API implementation without any impact on the Activity.

//Retrofit from SquareOne is an open-source Android library that helps you implement the Facade pattern; you create an interface to provide API data to client classes like so:


public interface BooksApi {
    @GET("/books")
    void listBooks(Callback&lt;List&gt;callback);
}

//The client simply needs to call listBooks() to receive a list of Book objects in the callback. It’s nice and clean; for all it knows, you could have an army of Tribbles assembling the list and sending it back via transporter beam. :]

//This lets you make all types of customizations underneath without affecting the client. For example, you can specify a customized JSON deserializer about which the Activity has no clue:

    RestAdapter restAdapter =
            new RestAdapter.Builder()
                    .setConverter(new MyCustomGsonConverter(new Gson()))
                    .setEndpoint("http://www.myexampleurl.com")
                    .build();
return restAdapter.create(BooksApi.class);

//Notice the use of MyCustomGsonConverter, working behind the scenes as a JSON deserializer. With Retrofit, you can further customize operations with RequestInterceptor and OkClient to control caching behavior without the client knowing what’s going on.

//The less each object knows about what’s going on behind the scenes, the easier it will be for Future You to manage changes in the app. This pattern can be used in a lot of other contexts; Retrofit is only one mechanism among many.
