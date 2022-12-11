package Seminar6_2;


public class Doctor {
    private String name;

    Doctor(String name) {
        this.name = name;
    }
    @Override
    public String toString() {        
        return "Doctor{" +        
                "name='" + name + '\'' +        
                '}';
    }
}
