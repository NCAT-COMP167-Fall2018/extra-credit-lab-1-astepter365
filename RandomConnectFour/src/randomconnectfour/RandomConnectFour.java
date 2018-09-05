/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomconnectfour;

import java.util.Random;

/**
 *
 * @author Ashton
 */
public class RandomConnectFour {
    private static char[][]gameBoard;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameBoard = createBoard('b');
        printBoard();
        takeTurn('y');
        
    }
    private static char[][] createBoard(char startingCharacter){
        char[][]createBoardArray = new char[6][7];
        for(int i = 0 ; i < createBoardArray.length; i++){
            
            for(int j = 0; j < createBoardArray[i].length; j++){
                createBoardArray[i][j] = startingCharacter;
            }
        
        }
        
        return createBoardArray;
    }
    private static void printBoard(){
        for(int i  = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){
                System.out.print(gameBoard[i][j]);
            }
            
            System.out.println();
        }
    }
    private static void takeTurn(char currentPlayer){
        Random rand =  new Random();
        int row  = 5;
        int col = 6;
        while(true){
            if(gameBoard[row][col] == 'b'){
                gameBoard[row][col] = currentPlayer;
                break;
            }
            else if(row == 0)  {
                col = rand.nextInt(7);
            }
     
        else{
                   
             row--;
                   }
   
        }
    }
    private static char playGame(char[][] gameBoard){
      int turn = 10;
        return 0 ;
      
    }
}

