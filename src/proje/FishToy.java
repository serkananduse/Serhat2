package proje;

public class FishToy {
    double price;
    String Ability;
    int LeftInStock;
    int amount;
    int model;
    String name;
    double cost;
    String color;
    int LifeSpan;
    String Ocean;
    String Reason;
    public FishToy( double price,String Ability,int LeftInstock){
        this.price=price;
        this.Ability=Ability;
        this.LeftInStock=LeftInstock;
    }
    public void eat(){

    }
    public void swim(){

    }
    public void FreeToOcean(String Ocean, String Reason){
        this.Reason=Reason;
        this.Ocean=Ocean;
    }
    public void buy(int amount, int model, String name, double cost){
        this.amount=amount;
        this.model=model;
        this.name=name;
        this.cost=cost;
    }

}
