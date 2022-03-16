import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;
public class test {
    public static void main(String[] args) {
        List<grades> l1 = new ArrayList<>();
        l1.add(new grades(1, 87, "Gamejoye"));
        l1.add(new grades(2, 96, "John"));
        l1.add(new grades(3, 90, "Mike"));
        System.out.println("before sorting");
        for(grades g:l1){
            System.out.println("[{id:"+g.id+"},{name:"+g.name+"},{grade:"+g.grade+"}]");
        }
        Collections.sort(l1);
        System.out.println("after sorting");
        for(grades g:l1){
            System.out.println("[{id:"+g.id+"},{name:"+g.name+"},{grade:"+g.grade+"}]");
        }
    }
}
