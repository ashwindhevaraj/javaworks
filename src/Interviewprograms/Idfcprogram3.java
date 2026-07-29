package Interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Idfcprogram3 {
	public static void main(String args[]) {
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
		Map<String,Report> data=new HashMap<>();
		for(String first[]:results) {
			if(!data.containsKey(first[0])) {
				data.put(first[0],new Report(first[2]));
				}
			else {
				Report tr=data.get(first[0]);
				tr.attempt++;
				tr.finalstatus1=first[2];
				if(!tr.firststatus1.equals(tr.finalstatus1)) {
					tr.flaky=true;
				}
			}
		}
		System.out.printf("%-15s %-15s %-15s %-15s%n","TestName","Attempts","Finalstatus","Flaky");
		System.out.println("--------------------------------------------------------");
		for(Map.Entry<String, Report> r1:data.entrySet()) {
			Report r2=r1.getValue();
			System.out.printf("%-15s %-15s %-15s %-15s%n",r1.getKey(),r2.attempt,r2.finalstatus1,r2.flaky?"YES":"NO");
		}
	}
}
	
class Report{
	int attempt;
	String firststatus1;
	String finalstatus1;
	boolean flaky;
	public Report(String status){
		this.attempt=1;
		this.firststatus1=status;
		this.finalstatus1=status;
		this.flaky=false;
	}
	
}
