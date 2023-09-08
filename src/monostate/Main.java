package monostate;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Connection con1 = new Connection();
		Connection.getList().stream().forEach(a -> System.out.println(a));
		con1.removeFirstList();
		System.out.println("--------");		
		Connection con2 = new Connection();
		Connection.getList().stream().forEach(a -> System.out.println(a));
		con2.removeFirstList();


	}

}
