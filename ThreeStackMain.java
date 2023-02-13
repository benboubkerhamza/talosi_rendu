package talosi;
public class ThreeStackMain {

	public static void main(String[] args) {
		
		ThreeStack pile = new ThreeStack();
		
		
		pile.push(1, "salut1");
		pile.push(1, "salut2");
		pile.push(1, "salut3");
		pile.push(2, "salut1");
		pile.push(2, "salut2");
		pile.push(2, "salut3");
		pile.push(3, "salut1");
		pile.push(3, "salut2");
		pile.push(3, "salut3");
		
		for(int i = 0;i<9;i++) {
			System.out.println(pile.getTab()[i]);
		}
		System.out.println(pile.getTab()[2]);
		pile.pop(1);
		System.out.println(pile.getTab()[2]);
		pile.pop(1);
		System.out.println(pile.getTab()[8]);
		pile.pop(3);
		System.out.println(pile.getTab()[8]);
		
		

}
}

