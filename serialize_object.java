//serialize is to convert the object into the stream and back to copy of the object //
//one of the class should have impplements the java.io.serialize the//


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;//importing interface for serialization//
import java.util.*;

class emp implements Serializable{//imokementing the sserializale interface//
    String name;
    String address;
}

public class serialize_object {
    public static void main(String[] args) {
        emp em =new emp();
        System.out.println("enter the names of yout favourite crickter");
        Scanner sc= new Scanner(System.in);
        em.name=sc.nextLine();
        System.out.println("enter the address : ");
        em.address=sc.nextLine();



        try{
            FileOutputStream fileOut=new FileOutputStream("C:\\bytes\\char.txt");
            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(em);
            out.close();
            fileOut.close();
            System.out.println("serializialed data is saved in char.txt file");


        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
