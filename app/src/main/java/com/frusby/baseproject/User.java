package com.frusby.baseproject;

/**
 * Created by deeekitty on 4/30/16.
 */
public class User {
    protected String firstname;
    protected String lastname;
    protected double money;
    protected boolean housing;
    protected boolean food;
    protected boolean health;
    protected boolean clothes;
    protected boolean education;
    protected boolean refugee;
    public User(String firstname, String lastname, boolean refugee) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.refugee = refugee;
        this.money = 0;
        this.housing = false;
        this.food = false;
        this.health = false;
        this.clothes = false;
        this.education = false;
    }

    public void setHealth (boolean health) {
        this.health = health;
    }

    public void setHousing (boolean housing) {
        this.housing = housing;
    }

    public void setClothes(boolean clothes) {
        this.clothes = clothes;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setEducation(boolean education) {
        this.education = education;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
