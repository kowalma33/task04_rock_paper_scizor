package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome to rock, paper, scissor");
	    Scanner input = new Scanner(System.in);
        int win=0, draw = 0, lose=0;
        System.out.println("Choose value: rock, paper, scissor or x to exit");

        do{
            String userMove = input.nextLine();
            userMove = userMove.toLowerCase();

            if(userMove.equals("x")){
                System.out.println("you quit!");
                break;
            }

            String computerMoves[] = new String[]{"rock", "paper", "scissor" };
            int rand = (int)(Math.random() * 3);
            String computerMove = computerMoves[rand];

            //validate user move
            if(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissor")){

                if(userMove.equals(computerMove)){
                    System.out.println("draw!");
                    draw++;
                }
                if(userMove.equals("rock") && computerMove.equals("scissor") ||
                        userMove.equals("paper")&& computerMove.equals("rock") ||
                        userMove.equals("scissor")&& computerMove.equals("paper")
                ){
                    System.out.println("you won!");
                    win++;
                }
                else{
                    System.out.println("you lose!");
                    lose++;
                }

            }else{
                System.out.println("invalid move");
                continue;
            }

        }while(true);
        System.out.println("wins= "+win+", draws= "+draw+", loses= "+lose);
    }
}
