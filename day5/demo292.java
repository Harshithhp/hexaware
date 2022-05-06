import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class demo292{
	public static void main(String args[]) {
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add("Rohit");
		a.add('a');
		a.add(2000);
		a.add(new Date());
		System.out.println(a);
		System.out.println(a.size());
	
		System.out.println(a.contains(200));
		System.out.println("---------------------------");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("-------Iterator-------------");
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}