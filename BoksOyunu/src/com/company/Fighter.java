public class Fighter {
    String name;
    int damaege;
    int health;
    int weight;
    double dodge;

    Fighter(String name,int damaege,int health,int weight){
        this.name= name;
        this.damaege= damaege;
        this.health= health;
        this.weight = weight;
        this.dodge = dodge;


    }
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
