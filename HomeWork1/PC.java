package HomeWork1;
import test.sss;

public class PC {
    Cpu cpu;
    HardDisk HD;
    private String name;

    void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    void setCPU(Cpu c){
        cpu = c;
    }
    void setHardDIsk(HardDisk h){
        HD = h;
    }
    void show(){
        System.out.println("硬盘的容量是"+HD.getAmount());
        System.out.println("cpu的运行速度是"+cpu.getSpeed());
    }

}
