package com.monocept.work;
import java.util.Random;
import java.util.Scanner;
public class Win {
	public static void main(String[] args) {
		while(true) {
		Scanner sc= new Scanner(System.in);
		int score1=0;
		int score2=0;
		int turn1=0;
		int turn2=0;
		System.out.println("Enter 1 to Start Game and 0 for Exit");
		int a = sc.nextInt();
		if(a==0)
			break;
		System.out.println("Player 1");
		
		Random ran=new Random();
		while(true) {
			System.out.println("Enter 1 to Open Book: ");
			int val = sc.nextInt();
			if(val==0) break;
			else {
			int temp=ran.nextInt(300);
			turn1++;
			System.out.print("Page Number " + temp + "   "+ "Point : " + temp%7 + "   " );
            score1 += temp%7;
            System.out.println("Score : " + score1 );
        }
    }

    System.out.println("Player1 "+ " Total Score : " + score1 );
    System.out.println("Player1 "+" Takes " + turn1 + " Rounds" );
    System.out.println("Needs " + (score1+1) + " Score In " + turn1 + " Rounds to WIN MATCH");
    
    System.out.println("Player 2 : ");

    int flag = turn1;

    while(true){
        System.out.println("Enter 1 to Open Book : ");
        int val = sc.nextInt();
        if(val==0) break;
        else{
            flag--;
            turn2++;
            int temp = ran.nextInt(300);
            System.out.println("Page Number" + temp + "  ");
            System.out.println("Point : " + temp%7 + "  " );
            score2 += temp%7;
            System.out.println("Score : " + score2 + "  ");
            System.out.println("Rounds Left : " + flag);

            if(flag==0 && score1>score2){
                System.out.println("PLayer1 Win Match !!" );
                break;
            }

            if(score2>score1){
                System.out.println("PLayer2 Win Match !!" );
                break;
            }                
            else if(score2==score1){
                if(turn1>turn2){
                    System.out.println("PLayer2 Win Match !!" );
                    break;
                }
                else if (turn1<turn2){
                    System.out.println("Player1 Win Match !!");
                    break;
                }
            }

        }
    }
} 

 }    
}