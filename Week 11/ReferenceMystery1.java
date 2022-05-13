
public class ReferenceMystery1 {
public static void main(String[] args) {
	int hp = 10;
	Pokemon squirtle = new Pokemon(5);
	
	battle(squirtle,hp);
	System.out.println("Level "+squirtle.lvl+"," +hp +"hp");
 
	hp = hp + squirtle.lvl;
	
	battle(squirtle,hp+1);
	System.out.println("Level " + squirtle.lvl +"," +hp +"hp");
}
public static void battle(Pokemon poke, int hp) {
	
	poke.lvl++;
	hp -= 5;
	System.out.println("Level "+poke.lvl+"," + hp + "hp");
}
}
