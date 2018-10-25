/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Random;

/**
 *
 * @author priscillajoye
 */
public class TicTacToe {
    public static String[][] board;
    public static Player p1 = new Player("X");
    public static Player p2 = new Player("O");
    
    public static void main(String[] args) {
        // TODO code application logic here
        //CreateBoard();
        //MakeMove(p1);
    }
    
    public int CreateBoard(){
        int count = 0;
        for(int col=0; col<3; col++){
            for(int row=0; row<3; row++){
                board[col][row] = "";
                count ++;
            }
        }
        return count;
    }
    
    public static String CurrentPlayer(Player p){
        String pawn = p.getPawn();
        return pawn;
    }
    
    public static String ChangePlayer(Player p){
        if(p==p1){
            p=p2;
        }else if(p==p2){
            p=p1;
        }
        String pawn = p.getPawn();
        return pawn;
    }
    
    public static void MakeMove(Player p){
        int move = (int)(Math.random()*9);
        int move2 = (int)(Math.random()*9);
        
        if(!SpaceInUse(move, move2)){
            String pawn = p.getPawn();
            if(pawn.equalsIgnoreCase("X")){
            board[move][move2] = "X";
            ChangePlayer(p2);
            } 
            else if(pawn.equalsIgnoreCase("O")){
                board[move][move2] = "O";
                ChangePlayer(p1);
            }
        }
    }
    public static boolean SpaceInUse(int col, int row){
        if(board[col][row].equals("X") || board[col][row].equals("O")){
            return true;
        }
        else {return false;}
    }
    
}
