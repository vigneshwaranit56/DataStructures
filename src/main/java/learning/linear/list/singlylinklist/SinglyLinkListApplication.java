package learning.linear.list.singlylinklist;

public class SinglyLinkListApplication {
public static void main(String args[]) {
	SinglyLinkList<Integer> sLL = new SinglyLinkList<Integer>();
	sLL.add(1);
	sLL.add(2);
	sLL.add(3);
	sLL.add(4);
	sLL.add(5);
	sLL.print();
	sLL.remove((Object)2);
	sLL.print();
	System.out.println(sLL.isEmpty());
	System.out.println(sLL.contains((Object)2));


}
}
