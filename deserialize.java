import java.io.*;

public class deserialize {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        emp em=null;
        try{
            FileInputStream filein = new FileInputStream("C:\\bytes\\char.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            em=(emp) in.readObject();
            in.close();
            filein.close();


        }
        finally {
            System.out.println("deserialization employee..... ... .. .");
            System.out.println("first name of employee :"+ em.name);
            System.out.println("Last name of employee:"+em.address);
        }
    }
}
