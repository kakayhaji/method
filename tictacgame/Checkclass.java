package tictacgame;

public class Checkclass{

public void PrintArray(String[][] array){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(" " + array[i][j]);
            if (j < 2) System.out.print(" |");
        }
        System.out.println();
        if (i < 2) System.out.println("-----------");

    }
}

    public String checkmethod(String[][] player_name,String[][] array){
        if (    (array[0][0].equals(player_name[0][1]) && array[0][1].equals(player_name[0][1]) && array[0][2].equals(player_name[0][1])) ||
                (array[1][0].equals(player_name[0][1]) && array[1][1].equals(player_name[0][1]) && array[1][2].equals(player_name[0][1])) ||
                (array[2][0].equals(player_name[0][1]) && array[2][1].equals(player_name[0][1]) && array[2][2].equals(player_name[0][1]))    ) {
            System.out.println(player_name[0][0] + " 'S winner");
            return player_name[0][0];
        } else if ((array[0][0].equals(player_name[0][1]) && array[1][0].equals(player_name[0][1]) && array[2][0].equals(player_name[0][1])) ||
                (array[0][1].equals(player_name[0][1]) && array[1][1].equals(player_name[0][1]) && array[2][1].equals(player_name[0][1])) ||
                (array[0][2].equals(player_name[0][1]) && array[1][2].equals(player_name[0][1]) && array[2][2].equals(player_name[0][1]))) {
            System.out.println(player_name[0][0] + " 'S winner");
            return player_name[0][0];

        } else if ((array[0][0].equals(player_name[0][1]) && array[1][1].equals(player_name[0][1]) && array[2][2].equals(player_name[0][1])) ||
                (array[0][2].equals(player_name[0][1]) && array[1][1].equals(player_name[0][1]) && array[2][0].equals(player_name[0][1]))) {
            System.out.println(player_name[0][0] + " 'S winner");
            return player_name[0][0];
        } else if ((array[0][0].equals(player_name[1][1]) && array[0][1].equals(player_name[1][1]) && array[0][2].equals(player_name[1][1])) ||
                (array[1][0].equals(player_name[1][1]) && array[1][1].equals(player_name[1][1]) && array[1][2].equals(player_name[1][1])) ||
                (array[2][0].equals(player_name[1][1]) && array[2][1].equals(player_name[1][1]) && array[2][2].equals(player_name[1][1]))) {
            System.out.println(player_name[1][0] + " 'S winner");
            return player_name[1][0];
        } else if ((array[0][0].equals(player_name[1][1]) && array[1][0].equals(player_name[1][1]) && array[2][0].equals(player_name[1][1])) ||
                (array[0][1].equals(player_name[1][1]) && array[1][1].equals(player_name[1][1]) && array[2][1].equals(player_name[1][1] ) ) ||
                (array[0][2].equals(player_name[1][1]) && array[1][2].equals(player_name[1][1]) && array[2][2].equals(player_name[1][1]) ) ) {
            System.out.println(player_name[1][0] + " 'S winner");
            return player_name[1][0];
        } else if ((array[0][0].equals(player_name[1][1]) && array[1][1].equals(player_name[1][1]) && array[2][2].equals(player_name[1][1])) ||
                (array[0][2].equals(player_name[1][1]) && array[1][1].equals(player_name[1][1]) && array[2][0].equals(player_name[1][1]))) {
            System.out.println(player_name[1][0] + " 'S winner");
            return player_name[1][0];
            }
return "null";
    }

    public Boolean Enter_element(String input_player_1,String[][] array,String[][] player_name,int b) {
        if (input_player_1.equals("1") || input_player_1.equals("2") || input_player_1.equals("3") || input_player_1.equals("4") || input_player_1.equals("5") || input_player_1.equals("6") || input_player_1.equals("7") || input_player_1.equals("8") || input_player_1.equals("9")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (array[i][j].equals(input_player_1))
                        if (!array[i][j].equals("X") && !array[i][j].equals("O")) {
                            array[i][j] = player_name[b][1];
                            return true;
                        }
                }
            }
        } else System.out.println("ERROR please Enter Right Number");

        return false;
    }
    public Boolean Draw(String[][] array){
   if( ( array[0][0].equals("X")|| array[0][0].equals("O") ) &&
       ( array[0][1].equals("X")|| array[0][1].equals("O") ) &&
       ( array[0][2].equals("X")|| array[0][2].equals("O") ) &&
       ( array[1][0].equals("X")|| array[1][0].equals("O") ) &&
       ( array[1][1].equals("X")|| array[1][1].equals("O") ) &&
       ( array[1][2].equals("X")|| array[1][2].equals("O") ) &&
       ( array[2][0].equals("X")|| array[2][0].equals("O") ) &&
       ( array[2][1].equals("X")|| array[2][1].equals("O") ) &&
       ( array[2][2].equals("X")|| array[2][2].equals("O") ) )return true;
   return false;
}
}//class
