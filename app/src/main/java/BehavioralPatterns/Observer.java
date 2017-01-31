//The Observer pattern defines a one-to-many dependency between objects. When one object changes state, all of its dependents are notified and updated automatically.

//This is a versatile pattern; you can use it for operations of indeterminate time, such as API calls. You can also use it to respond to user input.

//The RxAndroid framework (aka Reactive Android) will let you implement this pattern throughout your app:

apiService.getData(someData)
       .observeOn(AndroidSchedulers.mainThread())
       .subscribe (/* an Observer */);

//In short, you define Observable objects that will emit values. These values can emit all at once, as a continuous stream, or at any rate and duration.

//Subscriber objects will listen for these values and react to them as they arrive.
// For example, you can open a subscription when you make an API call, listen for the response from the server, and react accordingly.