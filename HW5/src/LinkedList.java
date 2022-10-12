import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedList {
	public Node head;
	public Node tail;

	public LinkedList() {
		head = null;
		tail = head;
	}

	public void add(double in) {
		Node x = new Node(in);
		
		if (isEmpty()) {
			head = x;
			tail = x;
		} else if (head == tail) {
			tail = x;
			head.next = tail;
		} else {
			tail.next = x;
			tail = tail.next;
		}
		
	}
	
	public void add(String str) {
		System.out.println("error you cannot add a string");
	}

	public void remove(double in) {
		if (isEmpty()) {
			System.out.println("Cannot remove a number from an empty linked list");
		}
		Node temp = head;
		Node prev = head;
		if (head == tail) {
			if (head.n == in) {
				head = null;
				tail = null;
				return;
			}
		} else {
			temp = temp.next;
			prev.next = temp;
			if (head.n == in) {
				head = temp;
				return;
			} else {
				while (temp != tail) {
					if (temp.next == tail && tail.n == in) {
						tail = temp;
						return;
					} else if (temp.n == in) {
						prev.next = temp.next;
						return;
					} else {
						temp = temp.next;
						prev = prev.next;

					}

				}

			}

		}

	}

	public String toString() {
		Node temp = head;
		String str = "[";
		if (isEmpty()) {
			return str + "]";
		}
		while (temp.next != null) {
			str += temp.toString() + ", ";
			temp = temp.next;
		}
		return str + temp.toString() + "]";
	}
	public double mean() {
		Node temp = head;
		double total = 0;
		double i = 0;
		if (!isEmpty()) {
			while (temp != null) {
				total += temp.n;
				i++;
				if (temp.next == null) {
					break;
				}
				temp = temp.next;
			}
		}
		return total/i;
	}
	public double standardDeviation() {
		int n = size();
		double x = distribution();
		return Math.sqrt(x/n);
		
	}
	public double distribution() {
		Node temp = head;
		double sum = 0;
		double mean = mean();
		while(temp != null) {
			sum += Math.pow((temp.n - mean),2);
			temp = temp.next;
		}
		return sum;
	}
	public int size() {
		int size = 0;
		Node temp = head;
		while(temp != tail) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	public void add(File f) {
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {
				add(s.nextFloat());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
