package oop_interface_homework.peoples;

public  abstract class Human implements CustomProfDescription {
    protected String name;
    protected int age;
    protected String profession;

    public Human(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public void printInfo() {
        System.out.println("\n* Human * \nName: "+name+"\nAge: "+age+"\nProfession: "+profession );
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
