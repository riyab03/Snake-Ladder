import javax.swing.plaf.basic.BasicBorders;
import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        Player p1=new Player();
        Player p2=new Player();

        p1.roll1= p1.RollValue();
        p2.roll2= p2.RollValue();

        System.out.println("value in dice 1:"+p1.roll1);
        System.out.println("value in dice 2:"+p2.roll2);

        while((p1.pos1<=99) && (p2.pos2<=99)) {

            int option1 = r.nextInt(3);
            int option2 = r.nextInt(3);

            p1.countDice++;
            System.out.println("Dice count: "+p1.countDice);

            p1.SwitchCase1(option1);
            p2.SwitchCase2(option2);
        }

        System.out.println("Final Position of Player 1: "+p1.pos1);
        System.out.println("Final Position of Player 2: "+p2.pos2);
        System.out.println("Winner is:"+((p1.pos1>p2.pos2)?"Player1":"Player2"));
    }
}