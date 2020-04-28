package Facade;

public class AnimalHome {
    private Dog doge;
    private Cat tom;
    private Duck tang;

    public AnimalHome() {
        this.doge = new Dog();
        this.tang = new Duck();
        this.tom = new Cat();
    }
    public void DogHowl(){
        doge.howl();
    }
    public void CatHowl(){
        tom.howl();
    }
    public void DuckHowl(){
        tang.howl();
    }
}
