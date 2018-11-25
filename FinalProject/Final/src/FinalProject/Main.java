/*
 *Modifications: 
 * 11/5 Added inventory, character, and item classes.
 *      inventory has basic functionality to hold items, and to display itself, and has a default inventory.
 *      item has 4 values, name, rarity, count, and value, i might split this up into the future to be an itemstack class
 *      character has nothing but a constructor right now.
 * 
 * 11/6 Added a method to add items to the inventory. added location and a utils folder for ease later.
 *      Added equals testing for items.    
 * 
 * 11/7 Added a method to add an inventory to another inventory and to clear an Inventory
 *      added some more instance variables to Character
 *      at this point, main is just being used to test my new additions to the base classes.
 *      added a way for a character to take damage, and if the character dies, the inventory is given to the attacker
 *      added a way to set an item to null, will make a nullItem class later.
 *      
 * 11/9 Added some convenience methods to inventory class.
 * 
 * 11/19 HOLY SHIT WHAT A REWRITE. i rewrote the inventory class to break down into a character inventory and a chest inventory.
 * 		got rid of the ArrayList<ArrayList<Item>> that was my way of storing the items, and replaced with Item[][].
 * 
 * 11/24 Worked on finishing the Inventory class. added some more item subclasses, potion and weapon. potions will be usable items 
 * 		that can apply different effects. as of right now, i can have infinite items/potions/weapons, but i may hardcode in my items
 * 		 in the future and store them in a file or something, that way i can have more control and so i can make items do different things. 
 * 		Also added the GameManager finally. as of right now it doesn't do much, but you can tell it when the game is supposed to end, 
 * 		and set the Playable Character. i might go back and redo these update logs into a form of:
 * 			+: feature
 * 			-: removed thing
 * 			^: rewrite
 * 			B: bug fix
 * 			R: move/rename something.
 * 		might make it display that somewhere too. who knows. if you are reading this, it didn't happen (yet) or are looking at older 
 * 		versions of my code (please don't do that, its ugly in here)
 * 11/25 its 3 weeks in and i finally added a menu! wooooooot! so much PROGRESS. current menu options: play, requirements, update log, quit.
 * 		ive tried adding a way to detect the arrow keys in a console app, but from hours of searching through stack overflow, that may not be possible....
 * 
 * 
 * 
 * 
 * 
 */
package FinalProject;

import Character.*;
import Character.Character;
import Exceptions.*;
import GameManager.GameManager;
import Items.*;
import Utils.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import Animation.*;
@SuppressWarnings("unused")
public class Main{
	static char[] cs = {'[',']',' ',' ',' ',' ',' ',' '};
    public static void main(String[] args) throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

           while (line.equalsIgnoreCase("quit") == false) {
               line = in.readLine();
               System.out.println(line);
               
           }

           in.close();
    	
    	
    	
    	
    	/*
    	GameManager.setPlayer(new Character());
    	CharacterInventory inv = new CharacterInventory();
    	try {
			inv.setDefaultInventory();
		} catch (InventoryTooSmallException e) {
			
			e.printStackTrace();
		}
    	inv.displayInventory();
    	inv.clearInventory();
    	inv.displayInventory();
		*/
    }
    public static void display1DItemArray(Item[] items) {
    	for(Item i : items) {
    		System.out.println(i);
    	}
    }
    public static void Menu(char...cs){
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    	System.out.println("Welcome!");
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    	System.out.println("  " + cs[0] + "Play" + cs[1]);
    	System.out.println("  " + cs[2] + "Requirements" + cs[3]);
    	System.out.println("  " + cs[4] + "Update Log" + cs[5]);
    	System.out.println("  " + cs[6] + "Quit" + cs[7]);
    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    	
    }
    
    
}
