package oop_interface_homework.animals;

public abstract class Animal implements CustomDescription {
    protected String typeAnimal;
    protected String foodType;
    protected String habitat;
    protected boolean isWools;

    public Animal(String typeAnimal, String foodType, String habitat, boolean isWools) {
        this.typeAnimal = typeAnimal;
        this.foodType = foodType;
        this.habitat = habitat;
        this.isWools = isWools;
    }

    @Override
    public void printInfo() {
        System.out.println("\n * Animal *" + "\nType: "+this.typeAnimal+"\nEating type: "+ this.foodType+
                "\nAreal: "+ this.habitat+ "\nWool presence: "+this.isWools);
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isWools() {
        return isWools;
    }

    public void setWools(boolean wools) {
        isWools = wools;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", foodType='" + foodType + '\'' +
                ", habitat='" + habitat + '\'' +
                ", isWools=" + isWools +
                '}';
    }
}
