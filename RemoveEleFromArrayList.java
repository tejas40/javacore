import java.util.ArrayList;
import java.util.List;

public class RemoveEleFromArrayList {
	public static void main(String[] args)
	{
		List<Integer> ele = new ArrayList<>();
		ele.add(10);
		ele.add(20);
		ele.add(30);
		ele.add(1);
		ele.add(2);

		System.out.println("before removing ele");

		System.out.println(ele);
		ele.remove(1);
		ele.remove(2);
		System.out.println("after removing elements");
		System.out.println(ele);
	}
}
