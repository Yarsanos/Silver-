/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author yarsa
 */
public class BeerSong {


        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
private static void Ninety_Nine_Bottles_of_Beer(){
    int Bottle=99; 
    while (Bottle>2){
        System.out.println(Bottle + " bottles of beer on the wall," + Bottle + " bottles of beer");
        System.out.println("take one down, pass it around,"+ Bottle+" bottles of beer on the wall.");
        Bottle--;
    }
    if (Bottle==2) {
        System.out.println(Bottle + " bottles of beer on the wall," + Bottle + " bottles of beer");
        System.out.println("take one down, pass it around,"+ Bottle+" bottle of beer on the wall.");
        Bottle--;
    }
    if (Bottle==1){
        System.out.println(Bottle + " bottle of beer on the wall," + Bottle + " bottle of beer");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
}
}
