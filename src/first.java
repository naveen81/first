import java.util.Scanner;

/**
 * Created by Naveen on 8/15/2015.
 */
public class first {

    public static Scanner a = new Scanner(System.in);
public static void main(String[] args){

    Fighter first = new Fighter("first", 100);
    Fighter second = new Fighter("second", 90);

  while(true){
      System.out.println("Enter the choice of yours");
      int b = a.nextInt();
      int c;
      int type = a.nextInt();
      switch(b){
          case 1:

               if(type==1)
                   second.punch();

              else if(type==2){
                  second.kick();
              }
              else if(first.energy<10)
              {System.out.println("player 1 is looser & player 2 is winner");
                  System.exit(0);}
              else if (second.energy<10)
              {System.out.println("player 2 is looser & player 1 is winner");
                  System.exit(0);}

              break;
          case 2:

               if(type==1) {
                   first.punch();
              }
              else if(type==2){
                   first.kick();
              }
              else if(first.energy<10)
              {System.out.println("player 1 is looser &player 2 is winner");
                  System.exit(0);}
              else if (second.energy<10)
              {System.out.println("player 2 is looser &player 1 is winner");
                  System.exit(0);}
      }
  }
   // System.out.println("Choose a player");
   // System.out.println("1 for name:"+first.name + "age:" + first.age +"energy is:" +first.energy);
   // System.out.println("2 for name:"+second.name + "age:" + second.age +"energy is:" +second.energy);
   // int b = a.nextInt();
   /* switch (b){
        case 1:
            System.out.println("adsad");
            if(b=a.nextInt()==1) {
            second.punch();
            }
            else if(b=a.nextInt()==2){
                second.kick();
            }
            break;
        case 2:
            System.out.println("sdfsd");
            if((b=a.nextInt())==1) {
                first.punch();
            }
            else if((b=a.nextInt())==2){
                first.kick();
            }
            break;
        default:System.out.println("No player selected");
    }*/


}
}
