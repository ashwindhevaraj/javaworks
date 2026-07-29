package Interviewprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Idfcprogram2 {
public static void main(String args[]) {
	Map<String,List<Report>> finaldata=new HashMap<>();
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
	//final report - attemps count
	//                 result final
	//boolean flaky
	for(String[] exactdata:results) {
		for(String exact:exactdata) {
			int flaky=0;
			String testname="";
			int attempts=0;
			if(exact.endsWith("test")) {
				testname=exact;
			}
			else if(exact.startsWith("attempt")) {
				attempts++;
			}
			else if(exact.equals("PASS")|| exact.equals("FAIL") || exact.equals("SKIP")){
				if(exact.equals("PASS")) {
					flaky++;
				}
				else{
					flaky--;
				}
			}
			List<Report> Report1=new ArrayList<>();
			//report1.add(new Report(testname,attempts,flaky));
		}
	}
	finaldata.forEach((k,v)->{
		System.out.println(k+" "+v);
	});
	}
}
class Report2{
	String reportname;
	int attempts;
	int flaky;
	public Report2(String reportname,int attempts,int flaky){
		this.reportname=reportname;
		this.attempts=attempts;
		this.flaky=flaky;
		}
}
