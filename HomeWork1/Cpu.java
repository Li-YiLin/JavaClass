package HomeWork1;

public class Cpu {
    private int speed;
    private String brand;

    Cpu(){

    }
    Cpu(int speed){
        this.speed=speed;
    }
    void setSpeed(int m){
        speed = m;
    }
    int getSpeed(){
        return speed;
    }
    public String getbrand(String brand){
        if (brand == "AMD"||brand == "Intel"){
            return brand;
        }
        else{
            return "others";
        }
    }
}
