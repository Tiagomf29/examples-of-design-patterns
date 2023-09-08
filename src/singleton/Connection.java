package singleton;

import java.util.ArrayList;
import java.util.List;

public class Connection {
	
	private static Connection connection;
	private List<String> list = null;
	private Connection () {
		list =  new ArrayList<String>();
		list.add("value 1");
		list.add("value 2");
		list.add("value 3");
	}
	
	public static Connection getInstance() {
		
		if(connection == null ) {
			connection = new Connection();
		}
		
		return connection;
		
	}
	
	public static void printConnectionStatus() {
		
		if(connection == null)
			System.out.println("not connected!");
		else {
			System.out.println("is connected!");
		}
	}
	
	public List<String> tbValues(){
		return list;
	}
	
	public void removeFirstIndexList() {
		if(list.size() > 0) {
			list.remove(0);
		}else {
			System.out.println("list is empty!");
		}
	}
	
	

}
