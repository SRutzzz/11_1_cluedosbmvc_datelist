package ch.bbw.sru.cluedo.model;

public class Person {

    private String name;
    private String formOfAdress;
    private int age;
    private String hairColor;
    private String clothingColor;

    public Person(String name, String formOfAdress, int age, String hairColor, String clothingColor) {
        this.name = name;
        this.formOfAdress = formOfAdress;
        this.age = age;
        this.hairColor = hairColor;
        this.clothingColor = clothingColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormOfAdress() {
        return formOfAdress;
    }

    public void setFormOfAdress(String formOfAdress) {
        this.formOfAdress = formOfAdress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getClothingColor() {
        return clothingColor;
    }

    public void setClothingColor(String clothingColor) {
        this.clothingColor = clothingColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", formOfAdress='" + formOfAdress + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                ", clothingColor='" + clothingColor + '\'' +
                '}';
    }
}
