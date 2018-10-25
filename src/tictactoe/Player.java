package tictactoe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author priscillajoye
 */
public class Player {
    public static String pawn;
    public Player(String p){
        this.pawn = p;
    }
    public void setPawn(String n) {
    pawn = n;
    } 
    public String getPawn() {
    return pawn;
    } 
}
