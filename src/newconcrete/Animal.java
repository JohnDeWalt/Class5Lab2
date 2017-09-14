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
public class Animal {
    //properties all animals share
    private String eat;
    private String drink;
    private String reproduce;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        if(eat == null){
            throw new IllegalArgumentException("Animals must eat to survive");
        }
        this.eat = eat;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        if(drink == null){
            throw new IllegalArgumentException("Animals must drink to survive");
        }
        this.drink = drink;
    }

    public String getReproduce() {
        return reproduce;
    }

    public void setReproduce(String reproduce) {
        if(reproduce == null){
            throw new IllegalArgumentException("Animals must reproduce to keep the species alive"); 
        }
        this.reproduce = reproduce;
    }
    
}
