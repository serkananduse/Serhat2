package proje;

public class DogToy {
    double price;
    String Ability;
    int LeftInStock;
    int amount;
    int model;
    String name="";
    double cost;
    public DogToy(double price,String Ability,int LeftInStock) {
        this.price= price;
        this.Ability= Ability;
        this.LeftInStock=LeftInStock;

    }
    public void move(){

    }
    public void bite(){

    }
    public void buy(int amount,int model,String name, double cost){
        this.amount=amount;
        this.model=model;
        this.name=name;
        this.cost=cost;
    }
}
