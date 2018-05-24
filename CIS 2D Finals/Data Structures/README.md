<H1>Intro to Data Structures</H1>
<br />

-   A data structure is a collection of data organized in a way. The structure not only stores data but also supports operations for accessing that data and manipulating the data. 

-	A data structure as like a container or a container object that stores other objects.

-  A data structure is similar to defining a class, where the class for a data structure includes data fields to store data and provides methods to supports operations such as search, insert, modify, and delete.

- Applications make use of data structures to store data that can be utilized throughout the lifetime of an application instance.

- The Java language contains a number of data structures that are known as collection types.

-	The data structures implement the java.util.Collection interface, which provides a variety of methods that are useful for adding, removing, and modifying the data that is used with the collection.
<br />
<br />
<br />
<br />
<br />
<br />

<H1>What are Data Structures?</H1>
<br />

-	In computer science a data structure is a way of collecting and organizing data.

-	Choosing the right data structure impacts the efficiency of your program. The collection of data can be from many sources such as retrieved from a database, or a file, or even acquired over the network.

-	Many data structures, for example, stacks, queues, and binary trees, are often implemented using the concept of linked lists.

-	ArrayList is an array that stores objects that can grow and shrink as needed.

-	A LinkedList is an array that uses pointers to keep track of elements. A vector can grow and shrink, and it provides synchronization.

-	A vector can grow and shrink, and it provides synchronization.

-	A stack operates on a last in, first out basis, which you'll hear me refer to as LIFO, L I F O.

-	Queue operates on a first in, first out basis, or FIFO.

-	Pros and cons of using some of the most popular data structures. Different data structures offer different advantages and disadvantages.

-	The advantages of an ArrayList and vector. Both of the data structures provide fast access to the individual elements using indexing. They also have memory coherence. The elements are stored sequentially in memory. The initial size of the data structure is optional.

-	ArrayList uses an internal array for storage which makes it particularly fast for random access. The elements are stored in sequential memory addresses.

-	The disadvantage is that adding elements in an ArrayList or a vector in the middle can be time consuming.

-	ArrayList can waste space if the array is not full.

-	ArrayLists need to be resized when they reach capacity.

-	LinkedLists allow for insertion and deletion operations easily. They're very efficient when you want to add or delete elements anywhere in the list, whether it's the beginning, the middle, or the end.

-	 Elements in a LinkedList must be read sequentially and elements are not stored sequentially in memory as they are in an ArrayList. Random access to elements can be inefficient. If you needed to access the 50th element, you have to first read the first 49 to get to the 50th.

-	The main source of information is the Java API documentation from Oracle.
<br />
<br />
<br />
<br />
<br />
<br />

<H1>Using Data Structures</H1>
<br />

-	All data structures implement the collection interface which is part of the Collections framework.

-	ArrayList implements a List. The LinkedList implements a List as well. And that means that all the methods that are available in the List interface are also available in the ArrayList and the LinkedList.

-	The Collections Framework provides high performance, high-quality implementations of usable data structures and algorithms.

-	There is a Collections class that contains some static methods that are inherited by all the subclasses, and there is a Collection interface. 

-	The static methods that are available in the Collections class can be used to sort a Collection, search one, for example a binary search, copy a Collection, fill a Collection, find a min or mix, and reverse a list.

-	Each of the static methods throws a NullPointerException if the Collection or class objectsprovided to them are null.

-	The interface defines the common operations for Lists, Vectors, Stacks, Queues, Priority Queues, and Sets.

-	Lists store an ordered Collection of elements. Sample Lists include an ArrayList, a Vector, a Stack,and a LinkedList.

-	A set stores a group of nonduplicate elements. That's the difference with a set, you cannot have any duplicates.

-	Examples of sets are a SortedSet, a TreeSet, a HashSet, and Queues store objects that are processed in a First In First Out fashion. That includes Deque and PriorityQueue.

-	Collections are used to store, manipulate, and aggregate data.

-	In Java, we have two types of containers. Some containers store a collection of elements, and other containers store key/value pairs. Those types of containers are called a Map.

-	The Collections interface provides the basic operations for adding and removing elements in a Collection.

-	A commonly used method is the toArray method, which allows us to take a Collection and returns an Array, representing that Collection. And the opposite is true, we can convert an Array to a List. We use Arrays.toList.

-	 Each collection in Java has an Iterator object that can be used to traverse all the elements in the collection. Meaning that it can navigate from one element to the next.

-	One of the benefits of using the Iterator is that it provides tools for walking through a data structure. It hides the details of how the data is stored.

-	The Iterable interface in turn, has the following methods. It has an iterator method and a foreach method.

-	The iterator method returns an Iterator object which is simply an object that provides methods that allow you to access the objects in the collection one at a time. The iterator method returns an instance of the Iterator interface.

-	We've seen hasNext before when were, reading information from a file. It checks to see if there is another element in the list.

-	Then we have the next, which will retrieve that element

-	Remove to actually take an element out of the list.


-	There is ListIterator that defines some addition methods that are appropriate, for iterating through, list collections. The ListIterator is actually used for list data structures, such as your link list.

-	The Iterator interface only allows access to each element in order, starting at the beginning, the ListIterator adds functionality, so we can actually walk through the list, backwards. It includes the methods, previous, hasPrevious, and previousIndex.

-	The ArrayList data type. Both the ArrayList and the LinkedList both implement the List interface. 

-	ArrayList list approach to implementing the List interface is simply to define an object array and increase the size of that array as necessary to support the number of elements contained within the collection.

-	ArrayList can contain duplicate elements.

-	You can also add null values to an ArrayList.

-	It is possible to specify the initial capacity of an ArrayList and it also includes a method to reduce the size, based on the existing elements. That method is called the trimTo.

-	Before Java 7, linked lists were created manually by the programmer.

-	The LinkedList class operates very similar to an ArrayList. The biggest difference is the access to the elements and a LinkedList is always linear although it is bi-directional. 

-	The LinkedList class uses a linked list to manage the collection of objects. Each node of the list contains a pointer to the node that proceeds it and one to the node that follows it which in turn means the list can be traversed in either direction. 

-	A node contains the element and the pointers required for the next and previous node.

-	Null indicates the end of the list.

-	Remember the last item points to null to indicate that's the end of the list.

-	The LinkedList provides methods for retrieving, inserting, and removing elements from both ends of the list. 

-	A LinkedList is good if you know that you're going to be adding elements to the middle or to the end of the list because it doesn't take as much overhead as it does to do that with an ArrayList.

-	The vector's data structure is one of the few collection classes that have existed since the early releases of Java. Vector is very similar to the behavior of an ArrayList. 

-	Vectors are not in wide use now.

-	Another data structure in Java is stacks. Java provides a stacks class for the familiar last in, first out data structure or LIFO.  When you add a new element, it gets stacked on top of the others. When you pull an element off the stack, it comes off the top. In other words, the last element you added to the stack is the first one to come back off.

-	A stack is a linear list in which items are added at one end and deleted from the same end.

-	When using a stack, when an item is added, you use the term push or the push method. When we want to remove an item from the stack, we use pop.

-	A stack is an easy way to reverse a collection of values.
