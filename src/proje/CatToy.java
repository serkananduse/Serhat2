package proje;
public class CatToy {
    double price;
    String Ability;
    int LeftInStock,amount,model,duration;

    String name="";
    double cost;

    String soap="";
    String shampoo="";
    public CatToy( double price,String Ability,int LeftInstock){
        this.price=price;
        this.Ability=Ability;
        this.LeftInStock=LeftInstock;
    }
    public void DrinkMilk(){

    }
    public void meow(){

    }
    public void HuntBirds(){

    }
    public void TakeBathWithCat(int duration, String shampoo,String soap){
        this.shampoo=shampoo;
        this.soap=soap;
        this.duration=duration;

    }
    public void buy(int amount,int model,String name, double cost){
        this.amount=amount;
        this.model=model;
        this.name=name;
        this.cost=cost;
    }
}
