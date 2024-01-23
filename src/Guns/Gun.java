package Guns;

public abstract class Gun {
    private int ID;
    private int damage;

    private int money;

    public Gun(int ID,int damage,int money){
        this.ID=ID;
        this.damage=damage;

        this.money=money;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
