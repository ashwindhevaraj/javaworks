package Teachings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapconcepts {
	public static void main(String args[]) {
	Map<Integer,String> k=new HashMap<Integer,String>();
	k.put(1,"ash");
	k.put(2,"dev");
	//System.out.println(k); {1=ash, 2=dev}
	k.putIfAbsent(2,"cec");
	k.putIfAbsent(3, "lia");
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
	
	}
}
