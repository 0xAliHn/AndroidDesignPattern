//When you order some excellent Saag Paneer at an Indian restaurant, you don’t necessarily know which cook will prepare your dish; you only give your order to the waiter, who posts the order in the kitchen for the next available cook.

//Similarly, the Command pattern lets you issue requests without knowing the receiver. You encapsulate a request as an object and send it off; deciding how to complete the request is an entirely separate mechanism.

//Greenrobot’s EventBus is a popular Android framework that supports this pattern in the following manner:


//An Event is a command-style object that can be triggered by user input, server data, or pretty much anything else in your app. You can create specific subclasses which carry data as well:

public class MySpecificEvent { /* Additional fields if needed */
}

//After defining your event, you obtain an instance of EventBus and register an object as a subscriber:

eventBus.register(this);

//Now that the object is a subscriber, tell it what type of event to subscribe to and what it should do when it receives one:

public void onEvent(MySpecificEvent event){/* Do something */};

//Finally, create and post one of those events based on your criteria:

        eventBus.post(event);

//Since so much of this pattern works its magic at run-time, Future You might have a little trouble tracing this pattern unless you have good test coverage.
// Still, a well-designed flow of commands balances out the readability and should be easy enough to follow at a later date.