package tictacgame;

import java.util.*;
public class Tic_Tac_Game {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        Checkclass check=new Checkclass();

        Boolean active=false;
        String WinnerName=null;
        String[][] player_name=new String[2][2];
        String input_player_1;
        String[][] array={
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.print("enter 2 player name.  \nplayer-1 name :");
        player_name[0][0]=con.next();
        System.out.print("player-2  name:");
         player_name[1][0]=con.next();
       player_name[0][1]="";
        player_name[1][1]="";

        do {
            System.out.print("please enter Capital letter\n" + player_name[0][0] + " choose X OR O : ");
            player_name[0][1] = con.next();
            if (player_name[0][1].equals("X")) {
                player_name[1][1] = "O";
                System.out.println("then " + player_name[1][0] + " is O");
            } else if (player_name[0][1].equals("O")) {
                player_name[1][1] = "X";
                System.out.println("then " + player_name[1][0] + " is X");
            }
           else      System.out.println("ERROR ");

        }while(!player_name[0][1].equals("X") && !player_name[0][1].equals("O"));
        System.out.println("Game Started");

while(true){
           for(int b=0; b<2; b++) {
               do {
                   check.PrintArray(array);
                   System.out.print(player_name[b][0] + " your turn Enter number :");
                   input_player_1 = con.next();
                  active= check.Enter_element(input_player_1,array,player_name,b);
                  if(!active) System.out.println("enter another number");
               } while (!active);

              WinnerName= check.checkmethod(player_name,array);
          if(WinnerName.equals(player_name[0][0]) || WinnerName.equals(player_name[1][0]) ) {
          break;
          }
               if(check.Draw(array)){

                   break;
               }
           }
    if(WinnerName.equals(player_name[0][0]) || WinnerName.equals(player_name[1][0])) {
        check.PrintArray(array);
        System.out.println(WinnerName + "'S Winner");
        break;
    }
    if(check.Draw(array)){
        System.out.println("Draw The Game");
        break;
    }
            }
        }
    }


