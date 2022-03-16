public class grades implements Comparable<grades>{
    int id,grade;
    String name;
    public grades(int id, int grade, String name){
        this.id=id;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int compareTo(grades o) {
        // TODO Auto-generated method stub
        if(this.grade<o.grade){return 1;}
        else if(this.grade==o.grade){return  0;}
        else{return -1;}
    }
}
