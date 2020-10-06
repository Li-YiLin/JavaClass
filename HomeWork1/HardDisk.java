package HomeWork1;

public class HardDisk {
    private int amount;
    private float speed;
    private boolean typeG;
    HardDisk(){

    }
    HardDisk(int amount,float speed,boolean typeG){
        this.typeG=typeG;
        this.amount=amount;
        this.speed=speed;
    }
    void setAmount(int m){
        amount = m;
    }
    int getAmount(){
        return amount;
    }
    void gettype(){
        if(typeG==true){
            System.out.println("硬盘为固态硬盘");
        }
        else{
            System.out.println("硬盘为非固态硬盘");
        }
    }
}
