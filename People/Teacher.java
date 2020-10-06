package People;
import HomeWork1.*;
public class Teacher {
    static PC pc;
    private String sex;
    public Teacher(PC pc,String sex){
        this.pc=pc;
        this.sex=sex;
    }
    String getSex(String sex){
        return sex;
    }
    void setPc(PC pc){
        this.pc=pc;
    }
    public static void showname(){
        System.out.println("主机名："+pc.getName());
    }
}
