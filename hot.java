import java.util.*;

class HoT{
    static void Toss(){
	Random rand = new Random();
	int head = 0;
	int tail = 0;
	int coin;
	String result;

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
    }

    public static void main(String[] args){
	Toss();
    }
}
    
