
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
	}	

}
