import java.lang.Math;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1=new Player();
        Random r=new Random();
        int roll=r.nextInt(6)+1;
        System.out.println("value in die:"+roll);

    }
}