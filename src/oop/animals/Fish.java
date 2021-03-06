package oop.animals;

public class Fish extends MarineAnimal{


    private boolean hasScales;

    public Fish(boolean canSwim, int length, int finCount,
                boolean isSaltwater, String name, boolean hasScales) {

        super(canSwim, length, finCount, isSaltwater, name);
        this.hasScales = hasScales;
    }

    public Fish(String name){
        super(name);
    }

    public Fish(){}


    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public String getName(){
        return super.getName().toUpperCase();
    }
    
}
