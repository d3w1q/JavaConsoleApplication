public class Animal {
    private final String species;
    private double weight;
    private boolean alive;

   public Animal(String species, double weight) {
       this.species = species;
       this.weight = weight;
       this.alive = true;
   }

   public String getSpecies(){
       return species;
   }

   public double getWeight(){
       return weight;
   }

   public void setWeight(double weight){
       this.weight = weight;
   }

   public void feed(){
       if (!alive) {
           System.out.println("Nie można karmić martwego zwierzęcia.");
           return;
       }
       weight += 0.5;
   }

   public void takeForAWalk(){
       if (!alive) {
           System.out.println("Nie można wyprowadzać na spacer martwego zwierzęcia.");
           return;
       }
       weight -= 0.5;
       if (weight <= 0) {
           alive = false;
           weight = 0;
       }
   }
}
