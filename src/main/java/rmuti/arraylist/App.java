package rmuti.arraylist;

public class App {
	public static void main(String[] args) {
		ArrayList arrlist = new ArrayList();
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		arrlist.add(2, 100);
		arrlist.addFirst(70);
		arrlist.addLast(90);
		// arrlist.remove(1);
		//arrlist.removeEven();
		System.out.println(arrlist);

	}
}
