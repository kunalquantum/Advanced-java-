//collection class is used to sort the data entered
//generic provides us the feature to store the element os the same data type


import java.util.*;//it will import all the thing in the java.util package contained
//list provide the feature of indexing the position of the elements added

public class Collection_class {

    public static void main(String[] args) {

        List <Integer>rupees=new ArrayList<>();//mutable
        List <Integer>Dollar=new ArrayList<>();
        //here we are specifing that the data type is Double
        rupees.add(3);//here we can provide index number as well as value

        rupees.add(8);

        rupees.add(8);

        rupees.add(58);

        Dollar.add(22);
        Dollar.add(23);
        Dollar.add(2);
        Dollar.add(72);
        Dollar.add(3,62);

        //advanced for loop
        System.out.println("Running the advanced for loop ");
        //syntax for(Object o : rupees)
        for(Integer k:rupees)
        {
            System.out.println("Rupees LIst : ");
            System.out.println(k);
        }

        //advanced for loop
        System.out.println("Running the advanced for loop ");
        //syntax for(Object o : rupees)
        for(Integer k:Dollar)
        {
            System.out.println("Dollar list :");
            System.out.println(k);
        }


        rupees.add(0,60);
        //list can hava any datatype value
        System.out.println(rupees);//by writing values inside it will print all the values

        //Collections.sort() class will sort the given list and return the sorted list
        Collections.sort(rupees);
        //Collections.reverse() will reverse the sorted list and return the opposite of sorted one
        Collections.reverse(rupees);

        //Collections.max() will return the maximum of the list
        Collections.max(rupees);
        System.out.println("Rupees list max: "+Collections.max(rupees));

        Collections.max(Dollar);
        System.out.println("dollar list max: "+Collections.max(Dollar));
        //Collections.min will return the minimum of the list

        Collections.min(rupees);
        System.out.println("Rupees list min: "+Collections.min(rupees));

        Collections.min(Dollar);
        System.out.println("dollar list min: "+Collections.min(Dollar));


        //Collections.frequency() of the object in the list
        Collections.frequency(rupees,8);
        System.out.println( "frequency of 8  : " +Collections.frequency(rupees,8));

        //Collection.shuffle() this will place the keys in the the list
        Collections.shuffle(Dollar);
        System.out.println("Shuffled list : "+Dollar);


        //Collections.copy() will copy the send parameter to the first parameter
        Collections.copy(rupees,Dollar);
        System.out.println(rupees);
        System.out.println(Dollar);


        // Collections.fill will fill all the index places with object given
        Collections.fill(rupees,5);
        System.out.println(rupees);



        //since the List supports the indexing we can use for loop




    }
}


