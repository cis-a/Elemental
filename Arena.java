import java.util.Scanner;
import java.lang.Math;

public class Arena {

    public static void main(String[] args) throws Exception {
        int initDamage = 2;
        int initLife =9;

        Scanner keyIn = new Scanner (System.in);
        System.out.printf ("Which elemental monster do you choose? %n(please hit corresponding number followed by <enter>)%n(1) for fire%n(2) for grass%n(3) for water%n");
        int yourType = Character.getNumericValue(keyIn.next().trim().charAt(0));

        Monster myMo = Monster.getMonster("your", yourType, initDamage, initLife);

        System.out.printf("%s is your champion!%nNow an opponent will be picked at random...%n", myMo.getName());
        int typeX =1;

        typeX = 1 + (int)(Math.random() * 3 );

        Monster oppo = Monster.getMonster("my", typeX, initDamage, initLife);
        System.out.printf(typeX + /*"_" + oppo.getName()+*/" was chosen by fortune!%n");

        System.out.printf("%s is spawned with %s life and %s base damage!%n%n", oppo.getName(), oppo.getLife(), oppo.getDamage());
        Thread.sleep(800);
        System.out.printf("Finally, %s and %s are appearing in the arena!%n%n",myMo.getName(), oppo.getName());


        while (myMo.getLife() > 0 && oppo.getLife() > 0){

          if (Math.random() >= 0.5) {
            System.out.printf (myMo.takeHit (oppo));
            Thread.sleep(800);
            System.out.printf (myMo.getStatus());
            }
            else {
            System.out.printf (oppo.takeHit (myMo));
            Thread.sleep(800);
            System.out.printf (oppo.getStatus());;
            }
    }
}
}
