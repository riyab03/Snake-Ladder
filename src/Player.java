import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int pos1=0;
    int pos2=0;
    int countDice=0;
    int roll1=0;
    int roll2;


    public int RollValue(){
        Random r=new Random();
        return r.nextInt(6)+1;
    }

    public void SwitchCase1(int option){
        switch (option) {
            case 0 -> {
                System.out.println("    Player1 : NO CHANGE,value of pos:" + pos1);
            }
            case 1 -> {
                pos1 = pos1 + roll1;
                if(pos1>100){
                    pos1=(pos1- roll1);
                }
                System.out.println("    Player1 : ladder , value of pos:" + pos1);
            }
            case 2 -> {
                pos1 = pos1 - roll1;
                if (pos1 < 0) {
                    pos1 = 0;
                }
                System.out.println("    Player1 : Snake , value of pos:" + pos1);
            }
            default -> {
                break;
            }
        }
    }
    public void SwitchCase2(int option) {
        switch (option) {
            case 0 -> {
                System.out.println("    Player2 : NO CHANGE,value of pos:" + pos2);
            }
            case 1 -> {
                pos2 = pos2 + roll2;
                if(pos2>100){
                    pos2=(pos2-roll2);
                }
                System.out.println("    Player2 : ladder , value of pos:" + pos2);
            }
            case 2 -> {
                pos2 = pos2 - roll2;
                if (pos2 < 0) {
                    pos2= 0;
                }
                System.out.println("    Player2 : Snake , value of pos:" + pos2);
            }
            default -> {
                break;
            }
        }
    }

}
