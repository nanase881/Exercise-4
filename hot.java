import java.util.*;

class HoT{
    static void Toss(){
	Scanner s = new Scanner(System.in);
	Random rand = new Random();
	int head = 0;
	int tail = 0;
	int coin;
	String result;
	String name;

	System.out.println("Who are you?");
	name = s.next();
	System.out.println("Hello, " + name + "!");
	
	System.out.println("Tossing a coin...");

	for(int i = 0; i < 3; i++){
	    coin = rand.nextInt(2);

	    if(coin == 0){
		result = "Heads";
		head++;
	    }else{
		result = "Tails";
		tail++;
	    }

	    System.out.println("Round " + (i+1) + ": " + result);
	}

	System.out.println("Heads: " + head + ", Tails: " + tail);

	if(head > tail) System.out.println(name + " won!");
	else System.out.println(name + " lost...");
    }

    public static void main(String[] args){
	Toss();
    }
}
    
