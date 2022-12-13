//comparator will provide the logic for specific purpose



import java.util.*;//it will import all the thing in the java.util package contained
//list provide the feature of indexing the position of the elements added

public class Collection_class_Comparator {

    public static void main(String[] args) {

        List <Integer>rupees=new ArrayList<>();//mutable
        List <Integer>Dollar=new ArrayList<>();
        //here we are specifing that the data type is Double
        rupees.add(3);//here we can provide index number as well as value

        rupees.add(8);

        rupees.add(8);

        rupees.add(58);

        Dollar.add(243);
        Dollar.add(253);
        Dollar.add(263);
        Dollar.add(783);
        Dollar.add(3,629);

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


        rupees.add(0,693);
        //list can hava any datatype value
        System.out.println(rupees);//by writing values inside it will print all the values

        //Collections.sort() class will sort the given list
        //Comparator will provide the logic of the sorting
        Comparator <Integer>cp=new Comparator<Integer>() {
            @Override
            //here we will define the logic
            public int compare(Integer i, Integer j) {
                if(i%10>j%10)
                return 1;
                else
                    return 0;
            }
        };
        Collections.sort(Dollar,cp);
        System.out.println("sorted List besed on the assending order of the middle term :"+Dollar);



        //using ternary operator in the comparators
        Comparator <Integer>cp1=new Comparator<Integer>() {
            @Override
            //here we will define the logic
            public int compare(Integer i, Integer j) {
                System.out.println("Using ternary operator");
                    return i%100>=i%10?1:-1;
            }
        };
        Collections.sort(Dollar,cp1);
        System.out.println("sorted List besed on the assending order of the middle term :"+Dollar);




    }
}


