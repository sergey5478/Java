package Seminar6_3;
import java.util.ArrayList;
import java.util.List;
public class Cat {
    private int age;
    private String name;// this.name
    private List<String> seekStory;
    private long passport;
    private Doctor doctor;

    public Cat(String name) {
        this.name = name; // name - это то что передают сюда
        seekStory = new ArrayList<>();
    }

    public void invite() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Age=" + age +
                ", name='" + name + '\'' +
                ", seekStory=" + seekStory +
                ", passport=" + passport +
                ", doctor=" + doctor +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        if(this.getName().equals(cat.getName()) && this.passport == cat.getPassport()){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {        
        return (int) passport + name.hashCode();
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSeekStory() {
        return seekStory;
    }

    public void setSeekStory(List<String> seekStory) {
        this.seekStory = seekStory;
    }

    public long getPassport() {
        return passport;
    }

    public void setPassport(long passport) {
        this.passport = passport;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}