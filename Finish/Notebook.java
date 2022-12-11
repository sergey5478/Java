package Finish;

public class Notebook {
    private String name;
    private int ram;
    private int ssd;
    private String color;
    private String system;

    public Notebook(String name) {
        this.name = name;
    }
    @Override
    public String toString() {        
        return "Notebook{" +        
            "ram=" + ram +
            ", ssd=" + ssd + 
            ", name='" + name + '\'' +
            ", color=" + color +            
            ", system=" + system +
            '}';
    }
    public void invite() {
    }



    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getSsd() {
        return ssd;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSystem() {
        return system;
    }
    public void setSystem(String system) {
        this.system = system;
    }
}
