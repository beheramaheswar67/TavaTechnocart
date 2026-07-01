import java.util.*;

public class VectorDemo{
    public static void main(String[] args) {
        ArrayList aa = new ArrayList();

        aa.add("Java");
        aa.add("React JS");
        aa.add("Java Script");
        aa.add("JSP");
        aa.add("Servelet");
        aa.add("EJB");

        System.out.println("Size of Array object is: " +aa.size());

        Vector v = new Vector();

        v.add("Oracle");
        v.add("My SQL");
        v.add("SQL Server");
        v.add("DB2");
        v.add("Mongo DB");

        System.out.println("Size of Vector is: "+v.size()+" Capacity of Vector is: "+v.capacity());
        v.addAll(aa);
        System.out.println("Size of Vector is: "+v.size()+" Capacity of Vector is: "+v.capacity());

    }
}