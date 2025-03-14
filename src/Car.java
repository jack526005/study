public class Car {
    public int speed=0;
    public int gear=0;
    public boolean fired=false;
     void start(){     //打火
        if(!fired){
            fired=true;
            System.out.println("汽车已打火");
        }

    }
     void close(){        //熄火
        if (fired){
            fired=false;
            System.out.println("汽车已熄火");
        }

    }
     void changeGear(int gear){   //换挡
         this.gear=gear;



    }
    void rule(){            //汽车的规则
        switch (gear){
            case 1:
                if (speed>20)speed=20;
                else if (speed<0)speed=0;
                break;
            case 2:
                if (speed>30)speed=30;
                else if (speed<10) close();
                break;
            case 3:
                if (speed>50)speed=50;
                else if(speed<20)close();
                break;
            case 4:
                if(speed<40) close();
                else if(speed>120)speed=120;
                break;
        }
    }
    void upspeed(){        //加速
         speed+=10;
        rule();//调用汽车规则
    }

    void downspeed(){       //减速
         speed-=10;
         rule();//调用汽车规则

    }
}


