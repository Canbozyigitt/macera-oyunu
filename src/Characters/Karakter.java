package Characters;

public abstract class Karakter {
    private int ID;
    private int damage;
    private int healty;
    private int money;
    private String name;

    public Karakter(int ID, int damage, int healty, int money,String name){
        this.ID=ID;
        this.damage=damage;
        this.healty=healty;
        this.money=money;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
