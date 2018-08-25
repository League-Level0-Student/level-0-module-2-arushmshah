package random;

import java.util.Random;

public class LotteryNumbers {
public static void main(String[] args) {
	Random randomMaker = new Random();
	
	int randomNumber = randomMaker.nextInt(5);
	
	System.out.println(randomNumber);
}
}
