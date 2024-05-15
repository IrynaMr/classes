public class Dog {
    String breed;
    int age;
    int weight;
    int prise;
    public Dog(String breed, int age, int weight, int prise){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.prise = prise;
    }
     String isWeight(int weight) {
        if (weight>5){
            return "Вам підходить собака " + breed;
            }
            else return "Вам не підходить собака " + breed;

        }
    }

