package Teachings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistconcept {
public static void main(String args[]) {
	//1. initial creation
	ArrayList<String> list = new ArrayList<>();
	
	//2. from another list
	//List<String> names = List.of("John", "Sam");
	//ArrayList<String> list = new ArrayList<>(names);
	
	//3. add method
	list.add("ash");
	list.add("user");
	//System.out.println(list); [ash,user]
	
	//4. at index
	//list.add(1,"dev");
	//System.out.println(list);[ash,dev,user]
	
	//5. add all
	List<String> list2 = List.of("cec","wife");
	//list.addAll(list2);
	//System.out.println(list);[ash,user,cec,wife]
	
	//6. at position
	list.addAll(1,list2);
	//System.out.println(list);ash, cec, wife, user]
	
	//7 retrieval 
	//System.out.println(list.get(0));  ash
	
	//8 replace element
	//list.set(1,"try");
	//System.out.println(list);[ash, try, wife, user]
	
	//9 remove by index
	//list.remove(1);
	//System.out.println(list);[ash, wife, user]
	
	//10. remove by object
	//list.remove("wife");
	//System.out.println(list);[ash,user]
	
	//11. remove all occurances
	/*list.add("wife");// [ash, cec, wife, user, wife]
	List<String> list3=List.of("wife");
	list.removeAll(list3);
	System.out.println(list);//[ash, cec, user]*/
	
	//12. retain all -display common elements
	//i/p [ash, cec, wife, user]
	/*List<String> list3=List.of("wife");
	list.retainAll(list3); 
	System.out.println(list); [wife]*/
	
	//13. clear and size- applicable to arraylist
	/*List<String> list3=List.of("wife");
	ArrayList list33=new ArrayList<>(list3);
	list33.clear();
	System.out.println(list33.isEmpty()); true
	System.out.println(list33.size()); 0*/
	
	//14. contains
	//i/p [ash, cec, wife, user]
	//System.out.println(list.contains("ash")); true
	
	//15 containsAll
	//list i/p [ash, cec, wife, user]
	//List<String> list3=List.of("wife","user");
	//System.out.println(list.containsAll(list3));
	
	//16 indexOf - returns first occurance
	//list i/p [ash, cec, wife, user]
	//System.out.println(list.indexOf("cec")); 1
	
	//17 lastIndexOf - returns last occurance
	//list i/p [ash, cec, wife, user]
	//list.add("user");
	//System.out.println(list.lastIndexOf("user")); 4
	
	//18. clone
	//ArrayList<String> list4= (ArrayList<String>)list.clone();
	//System.out.println(list4);[ash, cec, wife, user]
	
	//19 toArray
	/*Object arr[]=list.toArray();
	for(Object i:arr) {
		System.out.print(i.toString());
	}*/
	/*String arr[]=list.toArray(new String[0]);
	for(String i:arr) {
		System.out.print(i);
	}*/
	
	//20 Iterator
	/*Iterator k=list.iterator();
	while(k.hasNext()) {
		System.out.println((String)k.next());
	}*/
	
	//21 List iterator
	/*ListIterator k= list.listIterator();
	while(k.hasNext()) {
		System.out.println(k.next());
	}
	while(k.hasPrevious())
		System.out.println(k.previous());*/
	
	//22 forEach
	//list.forEach(System.out::print); ash cec wife user
	//list.forEach(x-> System.out.println(x)); ash cec wife user
	
	//23 sublist
	//System.out.println(list.subList(0, 2)); [ash, cec]
	
	//24 sort
	/*Collections.sort(list);
	System.out.println(list); //[ash, cec, user, wife]
	list.sort(Collections.reverseOrder());
	System.out.println(list);*///[wife, user, cec, ash]
	//Collections.reverse(list);
	//System.out.println(list);[wife, user, cec, ash]
	
	//25 replaceAll
	/*list.replaceAll(x-> x.toUpperCase());
	System.out.println(list); [ASH, CEC, WIFE, USER]*/
	
	//26 remove if
	//list i/p [ash, cec, wife, user]
	//list.removeIf(x-> x.startsWith("a"));
	//System.out.println(list); [cec, wife, user]
	
	//27 equals
	//list.equals(list2) - checks contents and order
	
	//28 stream
	//list.stream().filter(x-> x.length()>3).forEach(System.out::println);wife, user
	
	//Collections.max(list)
	//Collections.min(list);
	//Collections.frequency(list,"ash");
	//Collections.swap(list,0,2);
	//Collections.rotate(list,2);
	
	
	
}
}
