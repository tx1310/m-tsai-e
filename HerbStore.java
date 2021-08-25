public class HerbStore {
    // goods
    private int redherb;
    private int orangeherb;
    private int blueherb;
    private int redpotion;
    private int orangepotion;
    private int bluepotion;

    // customer identity
    private boolean newbie;
    private boolean rich;

    // 
    private int sum;
    private int pay;

	public void setStore(int redherb, int orangeherb, int blueherb, int redpotion, 
            int orangepotion, int bluepotion, boolean newbie, boolean rich) 
    {
        setRedherb(redherb);
        setOrangeherb(orangeherb);
        setBlueherb(blueherb);
        setRedpotion(redpotion);
        setOrangepotion(orangepotion);
        setBluepotion(bluepotion);
        setNewBie(newbie);
        setRich(rich);
    }
    
    public int getRedherb() {
        return redherb;
    }

    public void setRedherb(int redherb) {
        if (redherb < 0) return;
        this.redherb = redherb;
    }

    public int getOrangeherb() {
        return orangeherb;
    }

    public void setOrangeherb(int orangeherb) {
        if (orangeherb < 0) return;
        this.orangeherb = orangeherb;
    }

    public int getBlueherb() {
        return blueherb;
    }

    public void setBlueherb(int blueherb) {
        if (blueherb < 0) return;
        this.blueherb = blueherb;
    }
    
    public int getRedpotion() {
        return redpotion;
    }

    public void setRedpotion(int redpotion) {
        if (redpotion < 0) return;
        this.redpotion = redpotion;
    }
    
    public int getOrangepotion() {
        return orangepotion;
    }

    public void setOrangepotion(int orangepotion) {
        if (orangepotion < 0) return;
        this.orangepotion = orangepotion;
    }
    
    public int getBluepotion() {
        return bluepotion;
    }

    public void setBluepotion(int bluepotion) {
        if (bluepotion < 0) return;
        this.bluepotion = bluepotion;
    }
 
    public void setNewBie(boolean newbie) {
        this.newbie = newbie;
    }

    public void setRich(boolean rich) {
        this.rich = rich;
    }

    public int getSum() {
        this.sum = this.redherb * 150 + this.orangeherb * 300 + this.blueherb * 500 + this.redpotion * 299
                + this.orangepotion * 599 + this.bluepotion * 999;
        
        if (this.newbie) 
            this.sum = (int)(this.sum*0.8);
        else if(this.rich) 
            this.sum = (int)(this.sum*1.2);

        return sum;
    }
    
    public int getPay() {
        return pay;
    }
    
    public void setPay(int pay) {
        this.pay = pay;
    }

    String showStore()
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

    String showChange()
    {
        int change = this.sum - this.pay;

        int one = change % 10;
        int ten = (change % 100) / 10;
        int hundred = (change % 1000) / 100;
        int thousand = (change % 10000) / 1000;

        return "找您 千元 x" + thousand +
            "\n找您 百元 x" + hundred +
            "\n找您 十元 x" + ten +
            "\n找您 一元 x" + one; 
    }
}        

