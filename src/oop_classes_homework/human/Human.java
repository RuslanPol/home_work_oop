package oop_classes_homework.human;

public class Human {
    private String name;
    private String gender;
    private int age;
    private String profession;
    private String address;


    public Human(String name, String gender, int age, String profession, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.profession = profession;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo() {
        System.out.println("\nHuman name: " + this.name + "\nHuman age: " + this.age +
                "\nHuman gender: " + this.gender);

    }

    public void printInfo(String newName, int newAge, String newProfession) {
        this.name = newName;
        this.age = newAge;
        this.profession = newProfession;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
