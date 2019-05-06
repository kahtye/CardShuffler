import java.util.Deque;
public class ShuffleTest <T> {
	public static void main(String[] args){
		Object[] a = {1,2,3,4,5,6};
		Shuffle s = new Shuffle(a);
		
		print(s);
		s.inShuffle();
		print(s);
		
		Object[] b = {"Orange", "Apple", "Blueberry", "Strawberry", "Banana", "Kiwi", "Mango"};
		Shuffle s2 = new Shuffle(b);
		print(s2);
		s.outShuffle();
		print(s2);
	}
	
	public static void print(Shuffle s){
		for (Object o : s.getCards()){
			System.out.print(o + ",");
		}
		System.out.println();
	}
}
