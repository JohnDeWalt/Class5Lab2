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
public class Amphibian extends Animal {
    private boolean coldBlooded; // mush be cold blooded to be an amphibian
    private boolean permeableSkin; //must have permeable skin to be a amphibian
    private boolean ecosystem; //must live on land and water
    
    @Override
    public boolean getMate(){
        if(coldBlooded == false && permeableSkin == false){
            throw new IllegalArgumentException("This animal is not an amphibain and cannot reproduce with one");
        }else{
            return true;
        }
    }

    public boolean getColdBlooded() {
        return coldBlooded;
    }

    public void setColdBlooded(boolean coldBlooded) {
        if(coldBlooded == false){
            throw new IllegalArgumentException("This animal is not an amphibian");
        }
        this.coldBlooded = coldBlooded;
    }

    public boolean getPermeableSkin() {
        return permeableSkin;
    }

    public void setPermeableSkin(boolean permeableSkin) {
        if(permeableSkin == false){
            throw new IllegalArgumentException("This animal is not an amphibian");
        }
        this.permeableSkin = permeableSkin;
    }

    public boolean getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(boolean ecosystem) {
        if(ecosystem == false){
            throw new IllegalArgumentException("This animal is not an amphibian");
        }
        this.ecosystem = ecosystem;
    }
    
}
