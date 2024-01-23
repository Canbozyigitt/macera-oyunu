package Armors;

public  abstract class Armor {
    private String armor;
    private int ID;
    private int block;
    private int money;

    public Armor(int ID,int block,int money,String armor){
        this.ID=ID;
        this.block=block;
        this.money=money;
        this.armor=armor;

    }
    public static Armor[] armors(){
        Armor[] armor1={new Hafif(),new Orta(),new Agir()};
        return armor1;
        }


    public static Armor getArmorById(int id) {
        for (Armor armor: Armor.armors()) {
            if(armor.getID() == id) {
                return armor;
            }
        }
        return null;
    }
    public String getArmor() {
        return this.armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
