package monostate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Connection {
	
	private static List<String> list = new ArrayList<>();
	
	private static final int MAX_CONNECTIONS = 3;
	
	public static List<String> getList() {
		return Collections.unmodifiableList(list);
	}

	public Connection () throws Exception {
		
		if(list.size() <= MAX_CONNECTIONS-1) {

			list.add("Data for connection: "+list.size());
			
		}else {
			throw new Exception("no connections available!");
		}

	}
	
	public void removeFirstList() {
		if(list.size() > 0) {
			list.remove(0);
		}else {
			System.out.println("list is empty!");
		}
	}
	
}
