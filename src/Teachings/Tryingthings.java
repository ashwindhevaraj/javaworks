package Teachings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tryingthings {
	public static void main(String args[]) {
		/*String results[][]= {
			{"checkout_test","attempt-1","FAIL"},
			{"checkout_test","attempt-2","PASS"},
			{"login_test","attempt-1","PASS"},
			{"search_test","attempt-1","FAIL"},
			{"search_test","attempt-2","FAIL"},
			{"profile_test","attempt-1","PASS"},
			{"profile_test","attempt-2","FAIL"},
			{"cart_test","attempt-1","SKIP"},
		};
		Map<String,Report> data=new HashMap<>();
		for(String exact[]:results) {
			if(!data.containsKey(exact[0])) {
				data.put(exact[0],new Report(exact[2]));
				}
			else {
				Report tr=data.get(exact[0]);
				tr.attempt++;
				tr.status2=exact[2];
				if(!tr.status1.equals(tr.status2))
				tr.flaky=true;
				}
			}
		System.out.printf("%-15s %-15s %-15s %-15s%n","TestName","Attempts","Status","Flaky");
		System.out.printf("----------------------------------------------------------------%n");
		List<Entry<String,Report>> li=new ArrayList<>(data.entrySet());
		li.sort((e1,e2)->Boolean.compare(e2.getValue().flaky,e1.getValue().flaky));
		for(Entry<String, Report> entry:li) {
			System.out.printf("%-15s %-15s %-15s %-15s%n",entry.getKey(),entry.getValue().attempt,entry.getValue().status2,entry.getValue().flaky);
		}*/
		checkformap();
		}
	public static void checkformap() {
		String results[][]= {
				{"checkout_test","attempt-1","FAIL"},
				{"checkout_test","attempt-2","PASS"},
				{"login_test","attempt-1","PASS"},
				{"search_test","attempt-1","FAIL"},
				{"search_test","attempt-2","FAIL"},
				{"profile_test","attempt-1","PASS"},
				{"profile_test","attempt-2","FAIL"},
				{"cart_test","attempt-1","SKIP"},
			};
		Map<String,List<String>> trys=new HashMap<>();
		for(String k[]:results) {
			List<String> temp=new ArrayList<>();
			temp.add(k[1]);
			temp.add(k[2]);
				trys.computeIfAbsent(k[0],r->new ArrayList<>()).addAll(temp);
				}
		System.out.printf("%-15s %-15s %-15s %-15s%n","testname","attempts","status","flaky");
		System.out.println("-----------------------------------------------------------------");
		for(Map.Entry<String,List<String>> ar:trys.entrySet()) {
			List<String> temp=new ArrayList<>();
			temp=ar.getValue();
			long attempts=temp.stream().filter(r->r.startsWith("attempt")).count();
			String testname=ar.getKey();
			long passresult=temp.stream().filter(r->r.equalsIgnoreCase("PASS")).count();
			long failresult=temp.stream().filter(r->r.equalsIgnoreCase("FAIL")).count();
			boolean flaky=false;
			String status="";
			if(attempts==passresult)
				status="PASS";
			else if(attempts==failresult)
				status="FAIL";
			else if(attempts!=passresult && attempts!=failresult) {
				flaky=true;
				status=temp.get(temp.size()-1);
			}
			System.out.printf("%-15s %-15s %-15s %-15s%n",testname,attempts,status,flaky);
		}
	}
}
	
class Report{
	int attempt;
	String status1;
	String status2;
	boolean flaky=false;
	public Report(String status) {
		this.status1=status;
		this.status2=status;
		this.attempt=1;
	}
}
