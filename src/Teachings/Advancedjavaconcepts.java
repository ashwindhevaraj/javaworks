package Teachings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Advancedjavaconcepts {
	public static void displayhighfrequencyelements() {
		String a="applee";
		Map<Character,Integer> data=new HashMap<>();
		for(char b:a.toCharArray()) {
			data.put(b,data.getOrDefault(b,0)+1);
		}
		int maxfrequency=data.values().stream().max(Integer::compareTo).orElse(0);  //2
		//int maxfrequency=data.values().stream().max((c,d)->c.compareTo(d)).orElse(0); this also works
		data.entrySet().stream().filter(e->e.getValue()==maxfrequency).forEach(System.out::println);//p=2,e=2
	}
	public static void countcharacters() {
		String a="automation";
		Map<Character,Long> temp=a.chars()  // convert to unicode value of characters
				.mapToObj(c->(char)c)       // will convert primitive to object - here char to Character
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); //function.identify will be same as c->c which gives same element
		temp.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
	}
	public static void countwords() {
		String word="Java is a ocean now Java ocean";
		Map<String,Long> temp=Arrays.stream(word.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		temp.forEach((k,v)->{
			System.out.println(k+" "+v);  //a 1 java 2 ocean 2 now 1 is 1
		});
	}
	public static void duplicateelementdisplay() {
		List<Integer> a=Arrays.asList(1,2,3,4,5,1,2,3,6,7,8);
		Set<Integer>b = new HashSet<>();
		a.stream().filter(n->!b.add(n)).forEach(System.out::println);  // 1 2 3
	}
	public static void primitiveduplicate() {
		int a[]= {1,2,3,4,5,5,4,3};
		Set<Integer> data=new HashSet<>();
		Arrays.stream(a).filter(n->!data.add(n)).forEach(System.out::println); //5 4 3
	}
	public static void uniqueelementdisplay() {
		List<Integer> a=Arrays.asList(1,2,3,4,5,1,2,3,6,7,8);
		Set<Integer>b = new HashSet<>();
		a.stream().filter(n->b.add(n)).forEach(System.out::println); //1 2 3 4 5 6 7 8
		// a.stream().distinct().forEach(System.out::println);
	}
	public static void maxelementdisplayprimitive() {
		int a[]={1,1,2,3,4,5};
	       Map<Integer,Long> data=
	       Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       long max=data.values().stream().mapToLong(Long::longValue).max().orElse(0);
	       data.entrySet().stream().filter(e->e.getValue()==max).forEach(System.out::println);
	       //output 1=2
	}
	public static void firstnonrepeatingcharacter() {
		String a="automation";
		Character result=a.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		System.out.println(result);
	}
	public static void firstnonrepeat2() {
		String a="aaabbbccd";
        a.chars().mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().filter(e->e.getValue()==1)
        .map(Map.Entry::getKey).forEach(System.out::println); // d
	}
	public static void stringduplication() {
		String a="aaabbbcccd";
        Set<Character> b=a.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(
            Function.identity(),Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e->e.getValue()<2)
        .map(Map.Entry::getKey)
        .collect(Collectors.toSet());
        System.out.println(b);      // d as answer
	}
	public static void compressionprogram() {
		String a="aaabbcc";
        Map<Character,Integer> data=new LinkedHashMap<>();
        for(char b:a.toCharArray()){
            data.put(b,data.getOrDefault(b,0)+1);
        }
        data.entrySet().stream().forEach(d->System.out.print(d.getKey()+""+d.getValue())); //a3b2c2
    }
	public static void reducesum() {
		List<Integer> a=Arrays.asList(1,2,3,4,5);
		int sum=a.stream().reduce(0,Integer::sum);
		System.out.println(sum);
	}
	public static void reduceproduct() {
		List<Integer> a=Arrays.asList(1,2,3,4,5);
		int product = a.stream().reduce(1,(b,c)->b*c);
		System.out.println(product);
	}
	public static void reducemax() {
		List<Integer> a=Arrays.asList(1,2,3,4,5);
		int maxs= a.stream().reduce(Integer.MIN_VALUE,Integer::max);
		System.out.println(maxs);
	}
	public static void reducemin() {
		List<Integer> a=Arrays.asList(1,2,3,4,5);
		int mins= a.stream().reduce(Integer.MAX_VALUE,Integer::min);
		System.out.println(mins);
	}
	public static void reduceconcatenate() {
		List<String> a=Arrays.asList("aa","bb","cc");
		String result=a.stream().reduce("",(b,c)->b+c);
		System.out.println(result);
	}
	public static void reducereverse() {
		List<String> a=Arrays.asList("aa","bb","cc");
		String result=a.stream().reduce("",(b,c)->c+b);
		System.out.println(result);
	}
	public static void mapconcept1() {
		List<String> a= Arrays.asList("ash","dev");
		a.stream().map(b->b.toUpperCase()).forEach(c->System.out.println(c)); //ASH DEV
	} 
	public static void mapconcept2() {
		//flatmap- will merge two list into one
		List<List<String>> a=Arrays.asList(List.of("ash","dev"),List.of("cec","dai")); //ash dev cec dai
		a.stream().flatMap(Collection::stream).forEach(System.out::println);
	}
	public static void distinctconcept() {
		//distinct will remove duplicates in list
		List<String> a=Arrays.asList("aa","bb","cc","aa","bb");
		a.stream().distinct().forEach(System.out::println); //aa bb cc
	}
	public static void limitconcept() {
		// limit will print top n values
		List<String> a=Arrays.asList("aa","bb","cc","aa","bb");
		a.stream().limit(2).forEach(System.out::println);   // aa bb
	}
	public static void skipconcept() {
		//skip is opposite to limit concept
		List<String> a=Arrays.asList("aa","bb","cc","aa","bb"); 
		a.stream().skip(2).forEach(System.out::println); // cc aa bb
	}
	public static void sortedconcept() {
		List<String> a=Arrays.asList("cc","bb","aa");
		a.stream().sorted().forEach(System.out::println); //aa bb cc
	}
	public static void countconcept() {
		List<String> a=Arrays.asList("cc","bb","aa");
		long b=a.stream().count();
		System.out.println(b);        //3
	}
	public static void maxconcept() {
		List<Integer> data=Arrays.asList(1,2,3,4,5);
		Optional<Integer> d=data.stream().max((a,b)->a.compareTo(b));
		System.out.println(d);  //5
	}
	public static void minconcept() {
		List<Integer> data=Arrays.asList(1,2,3,4,5);
		Optional<Integer> d=data.stream().min((a,b)->a.compareTo(b));
		System.out.println(d);   // 1
	}
	public static void collectconcept() {
		// collect into set
		Integer[] a= {1,2,3,4,3,4};
		Set<Integer> data=new HashSet<>();
		Set<Integer> data1=Arrays.stream(a).filter(n->!data.add(n)).collect(Collectors.toSet());
		data.removeAll(data1);
		System.out.println(data);
	}
	public static void collectconcept1() {
		// collecting as list
		List<String> a=Arrays.asList("ash","dev","dai","cec");
		List<String> c=a.stream().map(b->b.toUpperCase()).collect(Collectors.toList());
		System.out.println(c);  //["ASH","DEV,"DAI","CEC"]
	}
	public static void collectconcept2() {
		//collecting as map
		List<Employee> data= Arrays.asList(new Employee(1,"Ash","IT"),new Employee(2,"Dev","IT"));
		Map<Integer,String> data1= data.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
		System.out.println(data1);
	}
	public static void collectconcept3() {
		// group by concept in collectors
		List<Employee> data= Arrays.asList(new Employee(1,"Ash","IT"),new Employee(2,"Dev","IT"),new Employee(3,"Cec","CSE"));
		Map<String, List<Employee>> data1=data.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
		
		//printing the above map
		data1.forEach((department,employee)->{
			System.out.println(department);
			(employee).forEach(e->{
				System.out.println(e.getId());
				System.out.println(e.getName());
			});
		});
	}
	public static void uppercaseinstream() {
		char a[]= {'a','s','w','i','n'};
		char b[]=IntStream.range(0, a.length).mapToObj(x->Character.toUpperCase(a[x]))
				.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString().toCharArray();
		//collect is three parameter function- parameter 1 supplier- StringBuilder::new
		                                       //parameter 2 accumulator - StringBuilder::append- appends each character
		                                        //parameter 3 combiner - combines StringBuilders
		System.out.println(b);   //ASWIN
	}
	public static void uppercaseinstream2() {
		//remove spaces and convert to uppercase
		String a=" aswin oo i";
		char b[]=a.toCharArray();
		IntStream.range(0, b.length)
		.filter(x->b[x]!=' ').mapToObj(x->Character.toUpperCase(b[x])).forEach(System.out::println);
		//ASWINOOI
	}
	public static void convertinttoarraylist() {
		int a[]= {0,1,2,3,4,5,6};
		ArrayList<Integer> data=Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(data);
	}
	public static void displayfrequencyindescending() {
		//above tcs program1 defined using streams here
		String b="aaabbbbcc";
        Map<Character,Integer> data=new HashMap<>();
        for(char a:b.toCharArray()){
            data.put(a,data.getOrDefault(a,0)+1);
        }
        Map<Character,Integer> data1=data.entrySet()
        		.stream()
        		.sorted(Map.Entry.<Character,Integer>comparingByValue().reversed())
        		.collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(x,y)->x,LinkedHashMap::new));
        
        for(Map.Entry<Character,Integer>data3:data1.entrySet()){
            for(int i=0;i<data3.getValue();i++){
                System.out.print(data3.getKey());  //bbbbaaacc
            }
        }
	}
	public static void main(String args[]) {
		//countcharacters();
		//countwords();
		//duplicateelementdisplay();
		//primitiveduplicate();
		//uniqueelementdisplay();
		//firstnonrepeatingcharacter();
		//reducesum();
		//reduceproduct();
		//reducemax();
		//reducemin();
		//reduceconcatenate();
		//reducereverse();
		//mapconcept1();
		//mapconcept2();
		//distinctconcept();
		//limitconcept();
		//skipconcept();
		//sortedconcept();
		//countconcept();
		//maxconcept();
		//minconcept();
		//collectconcept();
		//collectconcept1();
		//collectconcept2();
		//collectconcept3();
		//uppercaseinstream();
		//uppercaseinstream2();
		//stringduplication();
		//maxelementdisplayprimitive();
		//displayhighfrequencyelements();
		//compressionprogram();
		convertinttoarraylist();
	}

}
class Employee{
	private int id;
	private String name;
	private String department;
	public Employee(int id,String name,String dept) {
		this.id=id;
		this.name=name;
		this.department=dept;
	}
	public int getId() {
		return this.id;
		}
	public String getName(){
		return this.name;
	}
	public String getDepartment() {
		return this.department;
	}
}



/*Find duplicate elements.
Find first non-repeated character.
Find second highest salary.
Group employees by department.
Partition odd and even numbers.
Count character frequency.
Remove duplicate strings.
Convert list to map.
Sort employees by salary.
Find the longest string.
Merge two lists.
Flatten nested lists.
Count word occurrences.
Find common elements between two lists.
Convert list of names to uppercase.
Group strings by length.
Find the highest-paid employee in each department.
Find missing numbers.
Separate positive and negative numbers.
Group numbers by their absolute value (similar to the example you asked earlier).*/
