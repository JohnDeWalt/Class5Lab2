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
public class Frog {
    public boolean jump;
    public boolean carnivore;//all frogs are carnivores

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        if(jump == false){
            throw new IllegalArgumentException("This is not a frog");
        }
        this.jump = jump;
    }

    public boolean getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(boolean carnivore) {
        if(carnivore == false){
            throw new IllegalArgumentException("All frogs are carnivores");
        }
        this.carnivore = carnivore;
    }
    
}
