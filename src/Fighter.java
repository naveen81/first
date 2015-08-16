/**
 * Created by Naveen on 8/15/2015.
 */
public class Fighter {

    public String name;
    public int age;
    public int energy =100;

    public void punch(){
    //    System.out.println("player 1 is "+ this.name + "age is" + this.age + "energy is" + energy);

    this.energy  = this.energy - 5;
        System.out.println("Remaining energy of"+ this.name+"is" + this.energy);
    }
    public void kick(){
        this.energy = this.energy - 10;
        System.out.println("Remaining energy of"+ this.name+"is" + this.energy);

    }

    public Fighter(String name, int age){
        this.name = name;
        this.age= age;
        this.energy = energy;
    }
}
