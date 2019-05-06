import java.util.Deque;
import java.util.*;
public class Shuffle<T> {
	private static ArrayDeque cards; 
	
	public Shuffle(T[] c){
		cards = new ArrayDeque(c.length);
		for (int i = 0; i < c.length; i++){
			cards.addFirst(c[i]);
		}
	}
	
	public static void inShuffle(){
		shuffle(true);
	}
	
	public static void outShuffle(){
		shuffle(false);
	}
	
	public static void shuffle(boolean inShuffle){
		int size = cards.size();
		ArrayDeque topHalf = new ArrayDeque((int)(cards.size()/2.0));
		ArrayDeque bottomHalf = new ArrayDeque((int)(cards.size()/2.0));
		ArrayDeque shuffled = new ArrayDeque();
		
		if (size % 2 != 0){
			shuffled.addFirst(cards.removeLast());
			size--;
		}
		for (int i = 0; i < size; i++){
			if (i <= (int)(cards.size()/2)){
				topHalf.addFirst(cards.pollFirst());
			}
			else{
				bottomHalf.addFirst(cards.pollFirst());
			}
		}
		if (!inShuffle){
			ArrayDeque a = topHalf;
			topHalf = bottomHalf;
			bottomHalf = a;
		}

		for (int i = 0; i < size/2; i++){
			shuffled.addFirst(bottomHalf.removeLast());
			shuffled.addFirst(topHalf.removeLast());
		}
		
		cards = shuffled;
	}
	
	
	
	public ArrayDeque getCards(){
		return cards;
	}
	
}
