package ProjectDemo;

public class Collections_differences {
	
	/*Collections framework is a combination of classes and interfaces, which is uesd to store and manipulate the data 
	 * in group of objects.
	1. What is the difference between ArrayList and Vector?
			No.	ArrayList	Vector
			1)	ArrayList is not synchronized.	Vector is synchronized.
			2)	ArrayList is not a legacy class.	Vector is a legacy class.
			3)	ArrayList increases its size by 50% of the array size.	Vector increases its size by doubling the array size.
			4)	ArrayList is not ?thread-safe? as it is not synchronized.	Vector list is ?thread-safe? as it?s every method is synchronized.
			
	2. What is the difference between ArrayList and LinkedList?
		No.	ArrayList	LinkedList
		1)	It’s best for retrieval operations	It’s best choice for insertion & deletion in the middle.
		2)	It’s worst choice if frequent operation is  insertion & deletion 	It’s worst choice if frequent operation is  retrieval operations
		3)	It is resizable or growable array.	It is doubly Linked list.
		4)	ArrayList provides random access.	LinkedList does not provide random access.
		5)	ArrayList takes less memory overhead as it stores only object	LinkedList takes more memory overhead, as it stores the object as well as the address of that object.
	
	3. What is the difference between Iterator and ListIterator?
		No.	Iterator	ListIterator
		1) 	The Iterator traverses the elements in the forward direction only.	ListIterator traverses the elements in backward and forward directions both.
		2) 	The Iterator can be used in List, Set, and Queue.	ListIterator can be used in List only.
		3) 	The Iterator can only perform Read & remove operation while traversing the collection.	ListIterator can perform add, read, remove, replace and set operation while traversing the collection.
	
	4.What is the difference between HashMap and Hashtable?
		No.	HashMap	Hashtable
		1)	HashMap is not synchronized.	Hashtable is synchronized.
		2)	HashMap can contain one null key and multiple null values.	Hashtable cannot contain any null key or null value.
		3)	HashMap is not ?thread-safe,? so it is useful for non-threaded applications.	Hashtable is thread-safe, and it can be shared between various threads.
		4)	HashMap inherits the AbstractMap class 	Hashtable inherits the Dictionary class.
		
	5.What is the difference between List and Set?
		List	Set
		1. The List is an ordered sequence.	1. The Set is an unordered sequence.
		2. List allows duplicate elements	2. Set doesn’t allow duplicate elements.
		3. Elements by their position can be accessed.	3. Position access to elements is not allowed.
		4. Multiple null elements can be stored.	4. Null element can store only once.
		5. List implementations are ArrayList, LinkedList, Vector, Stack	5. Set implementations are HashSet, LinkedHashSet.
	
	6.What is the difference between HashSet and TreeSet?
		The HashSet and TreeSet, both classes, implement Set interface. The differences between the both are listed below.
		•	HashSet maintains no order whereas TreeSet maintains ascending order.
		•	HashSet impended by hash table whereas TreeSet implemented by a Tree structure.
		•	HashSet performs faster than TreeSet.
		•	HashSet is backed by HashMap whereas TreeSet is backed by TreeMap.
		
	7. What is difference between Array & Arraylist?
		No. Array 	ArrayList
		1. Array is static in size. 	ArrayList is dynamic in size.
		2. Array can be multi-dimensional. 	ArrayList is always single-dimensional.
		3. An array is a dynamically-created object.  	The ArrayList is a class of Java Collections framework.
		4. It serves as a container that holds the constant number of values of the same type. It contains popular classes like Vector, HashTable, and HashMap.

			*
			*
			*/

}
