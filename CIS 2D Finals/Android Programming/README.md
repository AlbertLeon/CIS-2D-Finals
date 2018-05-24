<H1>CHAPTER 2</H1> 
<br />

-	Programming Android apps with Java is similar to other Java platforms. The syntax is the same, and most of Java's core APIs work the same.

-	The Java version that you use in Android isn't exactly the same as Oracle's version. 

-	The version of Java in Android is based on Apache Harmony which is an open-source of  implementation of Java that was created by the Apache Foundation as a clean room implementation.

-	You can evaluate string values with switch statements. And you can use multi-catch clauses and underscores in numeric literals. 

-	All features that were added to Oracle's version of Java 7 are supported in Android.

-	Try-with-resources is a useful feature that you can’t use in Android.

-	Android SDK includes many APIs or libraries which are specific to the Android operating system and application framework.

-	Custom APIs are unique to Android. These packages start with android dot, and then have a sub-package that describes what that package does. Android.database defines interfaces and classes that are used to manage database.

-	When you write a Java code for an Android app, you start the same files as you do for other Java application platforms.

-	Android doesn't have a complete java virtual machine. It has its own custom runtimes. These run times look for a format known as DEX (Dalvik Executable Format).

-	The first state that an activity goes to as it starts up is called the Created state. To get there, a method named onCreate is called. It then goes to the Started state, and calls a method called onStart, and from there, the Resumed state. It gets there through the onResume Method.

-	The Resumed state is the state of an app that's active and in use by the user. 

-	As the user navigates away or shuts down an activity, the activity will go through a paused state, a stopped state, and then when it's completely removed from memory, that is it's destroyed, it'll go through a method called onDestroy.

-	If an activity is in the stopped state and it goes to the started state, it'll go through two life cycle methods called onRestart and onStart.

-	If an activity is in the paused state and goes to a resumed state, it'll go through onResume.

-	Optimizing your code can improve the performance and memory usage of your app.

-	Mobile device doesn't have the same amount of memory or processing power that a desktop computer has.

-	Avoid creating unnecessary Java objects. Every Java object that you create memory on the device. 

-	The garbage collectors in the Dalvik and ART runtimes work differently. ART's garbage collector is significantly faster and leads to less stuttering and pauses than the old garbage collector.

-	A string in Java is immutable. As soon as you assign a string, a copy of the value was made. You will have two values.

-	Another thing you can do to reduce memory usage is to prefer static methods over virtual or instance methods. 

-	You can improve memory and performance by calling internals fields directly.
<br />
<br />
<br />
<br />
<br />
<br />

<H1>CHAPTER 3</H1>
<br />

-	Java developers who work in Android should have knowledge on inheritance. How each class can extend and inherit the capabilities of a super class.
 
-	When you declare an event handler in Java code, you're implementing an interface. 

-	A strategy to organize code in Java Android is to organize commonly used code in static methods. And then to keep these methods in their own separate classes.

-	Most of the techniques for managing data in memory in Java don't change in Android. You use basic Java architectures.

-	Instance variables are lost when their parent objects are destroyed. These values taken together are known in Android as instance state and Android gives you an easier way to save and restore that state when activities are destroyed or recreated.

-	The Java programming language doesn't intrinsically support global variables. Every bit of data you store in memory in Java is a member of some class or object.

-	The Android Application Framework gives you a way to store application data in memory globally using the Application Context.

-	The Application Context process isn't permanent, it can be destroyed by Operating System and App Framework if the device is in a low memory state.

-	To make data truly persistent you can save it to persistent device storage using Shared Preferences or an SQLite database.

-	Java callback methods are used to implement event handlers and other common Android design patterns. You can also use callback methods to let Java objects communicate with each other at runtime.

-	 The abstract class "AsyncTask" is one of the most popular concurrency tools in Android. It lets you run code in a background thread while communicating with the user interface.

-	AsyncTask has an issue. If you declare an AsyncTask object as a member of an activity, the task can be destroyed along with its paired activity during a configuration change, such as a change in orientation.
<br />
<br />
<br />
<br />
<br />
<br />

<H1>CHAPTER 4</H1>
<br />

-	The Android SDK's Java implementation includes packages that exactly follow Oracle's API specifications.

-	Both current Android implementation and OpenJDK has the same package, class, and interface names, method headers, and other elements that define an API.

-	Java packages that are implemented in the Android SDK includes packages for input and output, core language elements, math, security, database management, working with XML, and the collections framework.

-	Packages that are introduced in Java 8, java.ultil.stream, don't exist anymore, because without Java 8 syntax, it wouldn't be usable.

-	The ArraySet can replace the HashNet.

-	If you use Java's HashMap class, the keys has to be stored as objects.

-	the SparseArray class manages memory more efficiently than HashMap.

-	The core Java runtime library includes the java.sql and javax.sql packages.

-	A content provider is an interface that lets you create, read, update and delete data regardless of how that data is stored in the persistent storage.

-	SON, or JavaScript Object Notation, is the preferred data format for exchanging data between mobile apps and hosted services on the web.
<br />
<br />
<br />
<br />
<br />
<br />

<H1>CHAPTER 5</H1>
<br />

-	Many of the Android SDKs Java packages are designed to accomplish tasks that are specific to the Operating System and the Application Framework.

-	For game developers is best to use "android.graphics".

-	If it's a View object it can be added to any layout.

-	Mobile devices have sensors that can report all sorts of information about their own state and the world around them. Position sensors report the device's location, environment sensors can report atmospheric conditions, and motion sensors report the device's changes in position or orientation.

-	All the code for working with sensors is all in the same package, and its subpackages, "android.hardware".

-	A class named SoundPool can be used to play short sounds that have to be repeated.

-	For longer sounds such as music files you can use the media player class.
<br />
<br />
<br />
<br />
<br />
<br />

<H1>CHAPTER 6</H1>
<br />

-	You can add Java 8 support to an Android project in any recent version of Android studio.

-	a lambda expression allows you to pass methods as parameters, and can also pass in arguments so that are received within the code but without the syntactical heaviness of a full anonymous implementation of an interface.

-	When you're defining a template, a variable consists of two dollar signs wrapped around an identifier in uppercase.

-	A lambda expression creates an anonymous object from a class that has a single method, called functional interface.

-	A method reference in contrast let's you pass the class or object and the name of a method you want to call and then the compiler does the rest of the work.

-	you can use method references with instance methods of instantiated objects and with class constructors.

-	In Java 8, an interface can have default and static methods.

-	Static methods can be called directly from the interface itself whereas default methods can be called from any instance of any class that implements the interface.

-	The key features that are supported in all Android versions, lambda expressions, method references, and default and static methods that you can define in an interface.
