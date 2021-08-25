public class store {
    private int redherb;
    private int orangeherb;
    private int blueherb;
    private int redpotion;
    private int orangepotion;
    private int bluepotion;
    private boolean newbie;
    private boolean rich;
    private int sum;
    private int pay;
    private int change;
    

    

    public store(int redherb, int orangeherb, int blueherb, int redpotion, 
            int orangepotion, int bluepotion, boolean newbie, boolean rich
            ) {
        if(redherb>=0 && orangeherb>=0 && blueherb>=0
                && redpotion>=0 && orangepotion>=0 && bluepotion>=0){
    }
        this.redherb = redherb;
        this.orangeherb = orangeherb;
        this.blueherb = blueherb;
        this.redpotion = redpotion;
        this.orangepotion = orangepotion;
        this.bluepotion = bluepotion;
        this.newbie = newbie;
        this.rich = rich;
        this.pay = pay;
        this.change =change;
        
        
        sum=redherb*150+orangeherb*300+blueherb*500+redpotion*299
                +orangepotion*599+bluepotion*999;
        
        if(newbie==true) sum=(int)(sum*0.8);
        
        else if(rich==true) sum=(int)(sum*1.2);
        
        change=sum-pay;
       
    }



    
    public int getRedherb() {
        return redherb;
    }

    public void setRedherb(int redherb) {
        this.redherb = redherb;
    }

    public int getOrangeherb() {
        return orangeherb;
    }

    public void setOrangeherb(int orangeherb) {
        this.orangeherb = orangeherb;
    }

    public int getBlueherb() {
        return blueherb;
    }

    public void setBlueherb(int blueherb) {
        this.blueherb = blueherb;
    }
    
    public int getRedpotion() {
        return redpotion;
    }

    public void setRedpotion(int redpotion) {
        this.redpotion = redpotion;
    }
    
    public int getOrangepotion() {
        return orangepotion;
    }

    public void setOrangepotion(int orangepotion) {
        this.orangepotion = orangepotion;
    }
    
     public int getBluepotion() {
        return bluepotion;
    }

    public void setBluepotion(int bluepotion) {
        this.bluepotion = bluepotion;
    }

    public int getSum() {
        return sum;
    }
    
    public int getPay() {
        return pay;
    }
    
    public void setPay(int pay){
        this.pay = pay;
    }
   
String show()
    {
        {return "紅藥草:"+getRedherb()+
                "\n橘藥草:"+getOrangeherb()+
                "\n藍藥草:"+getBlueherb()+
                "\n紅藥水:"+getRedpotion()+
                "\n橘藥水:"+getOrangepotion()+
                "\n藍藥水:"+getBluepotion()+
                "\n總費用:"+getSum();
        }
    }

String show p()
    {return "找您 千元 x:"+
            "\n找您 百元 x"+
            "\n找您 十元 x"+
            "\n找您 一元 x";
    }
}        
        
   
