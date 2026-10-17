package Teachings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Mapconcepts {
	public static void main(String args[]) {
	/*Map<Integer,String> k=new HashMap<Integer,String>();
	k.put(1,"ash");
	k.put(2,"dev");*/
	//System.out.println(k); {1=ash, 2=dev}
	//k.putIfAbsent(2,"cec");
	//k.putIfAbsent(3, "lia");
	//System.out.println(k); {1=ash, 2=dev, 3=lia}
	//System.out.println(k.get(2)); dev\
	//System.out.println(k.getOrDefault(4,"notfound")); notfound
	//System.out.println(k.containsKey(3)); true
	//System.out.println(k.containsValue("lia"));true
	/*System.out.println(k.remove(3)); lia
	System.out.println(k);{1=ash, 2=dev}*/
	//System.out.println(k.remove(2,"lia")); false
	//System.out.println(k.remove(2,"dev")); true
	
	/*System.out.println(k.replace(2,"dai")); dev
	System.out.println(k); {1=ash, 2=dai, 3=lia}*/
	
	/*System.out.println(k.replace(2,"dev","dai")); true
	System.out.println(k); {1=ash, 2=dai, 3=lia}*/
	
	//System.out.println(k.size()); 3
	//System.out.println(k.isEmpty()); false
	/*k.clear();
	System.out.println(k.isEmpty()); true*/
	
	/*Set<Integer> v=k.keySet();
	v.forEach(r-> System.out.println(r)); 1,2,3*/
	
	//System.out.println(k.values()); [ash, dev, lia]
	
	/*for(Map.Entry i:k.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue()); key and value displayed
	}*/
	
	/*k.forEach((r,v)->{
		System.out.println(r+" "+v); above display
	});*/
	
	//compute - to compute new value
	/*k.compute(1,(r,v)->
	v+="ashs"
	);
	System.out.println(k); {1=ashashs, 2=dev, 3=lia}*/
	
	/*Map<Integer,List<String>> mapse = new HashMap<>();
	mapse.computeIfAbsent(1,p->new ArrayList<>()).add("data");
	mapse.computeIfAbsent(1, p-> new ArrayList<>()).add("devs");
	System.out.println(mapse); {1=[data, devs]}*/
	
	
	/*k.computeIfPresent(1,(p,l)->l=l+"data");
	System.out.println(k); {1=ashdata, 2=dev, 3=lia}*/
	
	//map.merge(key, value, remappingFunction);
	/*k.merge(1,"ashsss", String::concat);
	System.out.println(k);{1=ashashsss, 2=dev, 3=lia}*/
	
	// count characters in string
	/*String s="ashss";
	Map<Character,Integer> mm=new HashMap<>();
	for(Character c:s.toCharArray()) {
		mm.merge(c,1,Integer::sum); get c corresponding value in map and merge with 1
	}
	System.out.println(mm); {a=1, s=3, h=1}*/
		
		
	//TreeMap is a NavigableMap implementation that stores entries sorted by key (natural ordering or a custom Comparator).
		
		/*TreeMap<Integer,String> tree=new TreeMap<>();
		tree.put(2,"ash");
		tree.put(1,"dev");
		tree.put(3, "user");*/
		//System.out.println(tree);
		// above is by default sort by key - will give result as {1 dev, 2 ash, 3 user}
		// if tree map declared as TreeMap<Integer,String> tree=new TreeMap<>(Collections.reverseOrder());
		//output will be {3 user,2 ash,1 dev}
		
		//put
		//putIfAbsent
		//get
		//getOrDefault
		//containsKey
		//containsValue
		//remove
		//replace
		//size
		//isEmpty
		//clear
		//keySet
		//values
		//entrySet
		
		//Tree specific methods
		//firstKey()
		//lastKey()
		//firstEntry()
		//lastEntry()
		//higherKey()- returns next greater key
		//lowerKey()- returns next lower key
		//higherEntry()- returns next higher entry
		//lowerEntry()- returns next lower entry
		//ceilingKey()- return the key that are greater than or equal to key
		//floorKey() - return the key that are lowerthan or equal to key
		//ceilingEntry()-return the entry that are greater than or equal to key
		//floorEntry()- return the entry that are lowerthan or equal to key
		//pollFirstEntry()- removes and return the first entry
		//pollLastEntry()- removes and return the last entry
		//descendingMap()- display data in descending order based on keys
		//descendingKeySet()- display key in descending order
		//headMap()- entries less than specified key displayed
		//tailMap()- entries greater than or equal to specified key displayed
		//subMap()- map entries from and to will be fetched
		
		
		/*System.out.println(tree.firstKey()); //1
		System.out.println(tree.lastKey()); //3
		System.out.println(tree.firstEntry());//1=ash
		System.out.println(tree.lastEntry());//3=user
		System.out.println(tree.higherKey(2)); //3
		System.out.println(tree.lowerKey(2)); //1
		System.out.println(tree.higherEntry(2));//3=user
		System.out.println(tree.lowerEntry(2));//1=ash
		System.out.println(tree.ceilingKey(2));//2
		System.out.println(tree.floorKey(2)); //2
		System.out.println(tree.ceilingEntry(1));//1=ash
		System.out.println(tree.floorEntry(3));//3=user*/
		//System.out.println(tree.pollFirstEntry());//1=ash
		//System.out.println(tree.descendingMap());//{3=user, 2=dev, 1=ash}
		//System.out.println(tree.descendingKeySet());//[3,2,1]
		//System.out.println(tree.headMap(2));//1=ash
		//System.out.println(tree.tailMap(2));//{2=dev, 3=user}
		//System.out.println(tree.subMap(1,3));//{1=ash,2=dev}
		/*TreeMap<Integer,String> tree1=new TreeMap<>(new Comparatorexample());
		tree1.put(1,"aaa");
		tree1.put(2,"aab");
		tree1.put(3, "aac");
		System.out.println(tree1); //{3=aac, 2=aab, 1=aaa}*/
		
		//firstuniquecharacter();
		//findsecondlargestfrequency();
		System.out.println(longestCommonPrefix(new String[] {"as","ashs","ash"}));
	}
	// programs in map
	public static void firstuniquecharacter() {
		Map<Character,Integer> b=new LinkedHashMap<>();
        String a="automation";
		for(char c:a.toCharArray()){
            b.put(c,b.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:b.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
        System.out.println(b);
	}
	public static void findsecondlargestfrequency() {
		Map<Character,Integer> b=new LinkedHashMap<>();
        String a="aaabbbbcc";
		for(char c:a.toCharArray()){
            b.put(c,b.getOrDefault(c,0)+1);
        }
		
		//sorting without streams
        /*List<Map.Entry<Character,Integer>> k=new ArrayList<>(b.entrySet());
        k.sort(Map.Entry.comparingByValue());
        System.out.println(k);
        System.out.println(k.get(1));*/
		
		//sorting using streams
		Map<Character,Integer> c=
		//b.entrySet().stream().sorted(Map.Entry.<Character,Integer>comparingByValue().reversed()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(x,y)->x,LinkedHashMap::new));
		b.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(x,y)->x,LinkedHashMap::new));
		System.out.println(c);
	}
	public static String longestCommonPrefix(String[] strs) {
        TreeMap<Integer,List<String>> storage=new TreeMap<>();
        for(String a:strs){
            storage.computeIfAbsent(a.length(),k-> new ArrayList<>()).add(a);
        }
        String first=storage.firstEntry().getValue().get(0);
        List<String> last1 = storage.lastEntry().getValue();
        String last=last1.get(last1.size()-1);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return result.toString();
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}
class Comparatorexample implements Comparator
{
	public int compare(Object obj1,Object obj2) {
		String objs1=obj1.toString();
		String objs2=obj2.toString();
		return objs2.compareTo(objs1);
	}
}
