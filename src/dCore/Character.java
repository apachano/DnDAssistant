package dCore;

public class Character {
    private string Name;
    private Inventory Inventory;
    private Stats Stats;
    private Class Class;

    public Character(String Name, Inventory Inventory, Stats Stats, Class Class){
        this.Name = Name;
        this.Inventory = Inventory;
        this.Stats = Stats;
        this.Class = Class;
    }

    public string getName(){
        return Name;
    }
}
