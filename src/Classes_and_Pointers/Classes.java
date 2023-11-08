package Classes_and_Pointers;

public class Classes {
    private String color;
    public Classes(String color)
    {
        this.color=color;
    }
    public static void main(String[] args) {
        Classes clas=new Classes("green");
        System.out.println(clas.color);
    }
}
