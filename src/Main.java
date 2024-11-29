import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Player p1=new Player();
        Random r=new Random();
        int roll=r.nextInt(6)+1;
        System.out.println("value in die:"+roll);
        while(p1.pos<=99) {
            int option = r.nextInt(3);
            p1.countDice++;
            System.out.print(" Dice count: "+p1.countDice);
            switch (option) {
                case 0 -> {
                    System.out.println(" NO CHANGE IN POSITION therefore value of pos:" + p1.pos);
                }
                case 1 -> {
                    p1.pos = p1.pos + roll;
                    if(p1.pos>100){
                        p1.pos=(p1.pos-roll);
                        continue;
                    }
                    System.out.println("ladder, now position:" + p1.pos);
                }
                case 2 -> {
                    p1.pos = p1.pos - roll;
                    if (p1.pos < 0) {
                        p1.pos = 0;
                    }
                    System.out.println("Snake, now position:" + p1.pos);
                }
                default -> {
                    break;
                }
            }
        }
    }
}