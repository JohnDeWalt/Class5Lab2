/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newconcrete;

/**
 *
 * @author Jackie
 */
public class Startup {
    
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.setEat("grasshoppers");
        frog1.setDrink("Water");
        frog1.setReproduce("With frog2");
        frog1.setColdBlooded(true);
        frog1.setPermeableSkin(true);
        frog1.setEcosystem(true);
        frog1.setCarnivore(true);
        frog1.setJump(true);
        System.out.println("Frog 1 eats " + frog1.getEat() + "and drinks " + frog1.getDrink() + " and is " 
                + frog1.carnivore + frog1.jump + frog1.getPermeableSkin() + frog1.getColdBlooded() + frog1.getEcosystem() 
                + "so frog 1 can reproduce with another frog" );
        
        
        Frog frog2 = new Frog();
        frog2.setEat("worms");
        frog2.setDrink("Water");
        frog2.setReproduce("With frog1");
         frog2.setColdBlooded(true);
         frog2.setPermeableSkin(true);
         frog2.setEcosystem(true);
         frog2.setCarnivore(true); 
         frog2.setJump(true);
        
        System.out.println("Frog 1 eats " + frog2.getEat() + "and drinks " + frog2.getDrink() + " and is "  +
             frog2.carnivore + frog2.jump + frog2.getPermeableSkin() + frog2.getColdBlooded() + frog2.getEcosystem() +
             "so frog 2 can reproduce with another frog");
        
    }
    
}
