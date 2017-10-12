
package lab7;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListPractice {
	private LinkedList<String> list = new LinkedList<String>();
	private LinkedList<String> list2 = new LinkedList<String>();
	public void doStuff() {
		list.add("Tulsa");
		list.add("Ada");
		list.add("Broken Arrow");
		list.add("Owasso");
		list.add(1, "OKC");
		System.out.println("this is list 1:\n"+list.toString()+"\n");//[Tulsa, OKC, Ada, Broken Arrow, Owasso]
		list2.add("74104");
		list2.add("74135");
		list2.add("foo");
		list2.add("hello world");
		list2.add("777");
		System.out.println("this is list 2:\n"+list2.toString()+"\n");//[74104, 74135, foo, hello world, 777]
		for(String i:list2) {
			list.add(i);
		}
		System.out.println("this is the merged list:\n"+list.toString()+"\n");//[Tulsa, OKC, Ada, Broken Arrow, Owasso, 74104, 74135, foo, hello world, 777]
		for(int i = list.size()-1; i >=0;i--) {
			if(i%2!=0) {
				list.remove(i);
			}
		}
		System.out.println("this is list 1 with every second item taken out:\n"+list.toString()+"\n");//[Tulsa, Ada, Owasso, 74135, hello world]
		LinkedList<String> list3 = new LinkedList<String>();
		for(String i:list2) {
			list3.add(i);
		}
		System.out.println("this is the deep copy for list 2:\n"+list3.toString()+"\n");
		list3.removeFirst();
		System.out.println("this is the deep copy for list 2 with first item removed:\n"+list3.toString()+"\n");
		System.out.println("this is list 2 for comparrison to prove that the previous was a deep copy:\n"+list2.toString()+"\n");
	}
	
	
	public static void main(String... args) {
		ListPractice tester = new ListPractice();
		tester.doStuff();
	}
}
