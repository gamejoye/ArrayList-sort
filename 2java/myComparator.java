import java.util.Comparator;

public class myComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        grades g1 = (grades)o1;
        grades g2 = (grades)o2;
        if(g1.grade<g2.grade){return 1;}
        else if(g1.grade==g2.grade){return 0;}
        else{return -1;}
    }
}
