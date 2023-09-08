package singleton;

public class Main {

	public static void main(String[] args) {
		
		Connection.printConnectionStatus();
		Connection con = Connection.getInstance();
		con.tbValues().stream().forEach(a -> System.out.println(a));
		System.out.println("-------");
		Connection con2 = Connection.getInstance();
		con2.removeFirstIndexList();
		con2.tbValues().stream().forEach(a -> System.out.println(a));
		

	}

}
