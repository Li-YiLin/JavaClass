package HomeWork1;
import HomeWork1.*;
import People.Teacher;

public class Test {
    public static void main(String args[]){
        PC pc = new PC();
        Cpu cpu = new Cpu();
        HardDisk HD = new HardDisk(4000, (float) 2.5,true);
        cpu.setSpeed(2200);
        HD.setAmount(200);
        pc.setCPU(cpu);
        pc.setHardDIsk(HD);
        pc.show();
        System.out.println("cpu品牌："+cpu.getbrand("AMD"));
        System.out.println("硬盘类型:");
        HD.gettype();
        Teacher ZSB = new Teacher(pc,"男");
        pc.setName("vegetable");
        Teacher.showname();
    }
}
