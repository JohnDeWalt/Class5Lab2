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
    private String coldBlooded;
    private String permeableSkin;
    private boolean ecosystem; //must live on land and water

    public String getColdBlooded() {
        return coldBlooded;
    }

    public void setColdBlooded(String coldBlooded) {
        if(coldBlooded == null){
            throw new IllegalArgumentException("This animal is not an amphibian");
        }
        this.coldBlooded = coldBlooded;
    }

    public String getPermeableSkin() {
        return permeableSkin;
    }

    public void setPermeableSkin(String permeableSkin) {
        if(permeableSkin == null){
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
