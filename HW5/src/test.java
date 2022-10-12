import java.io.File;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList add test
		LinkedList l1 = new LinkedList();
		l1.add(2.5);
		l1.add(0);
		l1.add(-342);
		System.out.println(l1.toString());
		
		//LinkedList remove test
		l1.remove(0);
		l1.remove(2.5);
		l1.remove(-342.0);
		System.out.println(l1.toString());
		
		//Mean function
		l1.add(2.5);
		l1.add(0);
		l1.add(-342);
		System.out.println(l1.mean());
		
		//standard deviation
		l1.add(643);
		l1.add(346);
		l1.add(898);
		l1.add(42);
		System.out.println(l1.standardDeviation());
		System.out.println(l1.toString());
		
		File f1 = new File("C:\\Users\\hayde\\OneDrive\\Desktop\\numberSet1.txt");
		LinkedList l2 = new LinkedList();
		l2.add(f1);
		System.out.println(l2.toString());
		System.out.println(l2.standardDeviation());
		System.out.println(l2.mean());
		
	}	

}
