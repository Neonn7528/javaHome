import java.util.HashSet;
import java.util.Set;

public class home6 {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Samsung", 1000, "Windows10", "blaсk"));
        set.add(new Notebook("Samsung", 1000, "Windows10", "white"));
        set.add(new Notebook("Lenovo", 500, "Windows8", "blaсk"));
        set.add(new Notebook("HP", 500, "Windows10", "pink"));
        set.add(new Notebook("Honor", 1000, "Linux", "grey"));
        actions actions = new actions(set);
        actions.start();
    }
    
}
