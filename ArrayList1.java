//ArrayList in java

import java.util.*;

class ArrayListeg1
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();

al.add("sam");
al.add("sonal");
al.add("aniket");
al.add("prathmesh");
al.add("shreya");

System.out.println(al);

System.out.println("element at index 1 is ="+al.get(1));
System.out.println("does list contain naina="+al.contains("naina"));
al.add(3,"Shriyansh");
System.out.println(al);
System.out.println("is array empty="+al.isEmpty());
System.out.println("index of naina ="+al.indexOf("naina"));
System.out.println("Size of the arraylist "+al.size());

}
}
