package Characters;

import java.util.Scanner;

public class Player {


    private String name;
    public Player( String name){

        this.name=name;


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(){
        System.out.println("seçmek istediğiniz karakteri giriniz: ");
        System.out.println("1- Samuray");
        System.out.println("2- Okçu");
        System.out.println("3- Şovalye ");
        Scanner input1=new Scanner(System.in);
        int secim=input1.nextInt();




    }
}
