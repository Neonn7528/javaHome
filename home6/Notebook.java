import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private String name;
    private int memory;
    private String operatingSystem;
    private String color;

    public Notebook(String name, int memory, String operatingSystem, String color){
        this.name = name;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    public boolean examination(){
        return true;
    }
    public static List<String>properties(){
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("memory");
        list.add("operatingSystem");
        list.add("color");
        return list;
    }
    @Override
    public String toString(){
        return "Notebook:(" + name + "): " + 
        "SSD:" + memory + ". " + "Operating System:" + operatingSystem + ". " +
        "Color:" + color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMemory(){
        return memory;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
     public String getOperatingSystem(){
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }
     public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}

