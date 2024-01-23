package Monsters;

public  abstract class Monster {
    private int ID;
    private int damage;
    private int healty;
    private int money;

    public Monster(int ID,int damage,int healty,int money){
        this.ID=ID;
        this.damage=damage;
        this.healty=healty;
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

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
