//collection package and its interfaces
// /syntax:  Collection value = new implementing_class()(it implements the Collection interface )
//the data type of the value is the object type , which means we can have any data type inside our object
//if we want a value of same data type in my collection then we will use generics
//syntax: Collection <datatype> = new class(implementing class)< datatype >;
//example : Collection <integers> = Apple<integers>
//we have a collection interface
//Collection was introduced in the 1.2 version
//Generics was introduced in the version 1.5
//in version 1.7 there was a update which converted Collection<datatype> =class_name()<datatype> to Collection<datatype> =class_name<>()removing the datatype on lhs
//as the collection is the interface hence we cannot have a object of its
//we need an class which will implement the collection interface
//if we are using the list interface hence the hirarchy goes like implementing class -> list interface -> which extends the collection interface
//now we have accesed to the collection interface so we can add values using void ()
//the purpose of using collection is we dont have a fix size we can increase or decrease the size as per requirement
//it is a dynamically allocating the memory area for the value we wish to add
//we will use collection when we dont know the actual count of the elements to be stored or added,however it is slower then array
//collection does not work with index number,but if we want to use the index number then
// there will be change in the syntax: List <datatype>= new class_name<datatype>()
//List will extends to Collection interface and then ultimately we are using collection through List in order to work with index in collection
//set is also an interface extended from collection interface
//we can also use set syntax: set<datatype>=Hashset<datatype>()
//the reason of using set is we can avoid the repeatation of duplicate value
//we can use treeset() this will give everything in a sorted form syntax: Set<datatype>=treeset<>()
//map is the interface of the extended from the collection interface
//we have Map will have a key value (unique key)s syntax: Map<key,value> m=new Hasmap<>()








public class collection_theory {
}
