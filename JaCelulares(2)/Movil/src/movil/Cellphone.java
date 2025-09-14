
package movil;

public class Cellphone {
    private String name;
    private String number;
    private int batery;
    private float acountBalance;
    private boolean on;

    public Cellphone() {
    }
    
    public Cellphone(String name,String number, int batery, float acounBalance, boolean on) {
        this.name = name;
        this.number = number;
        this.batery = batery;
        this.acountBalance = acountBalance;
        this.on = on;
        
    }
 
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the batery
     */
    public int getBatery() {
        return batery;
    }

    /**
     * @param batery the batery to set
     */
    public void setBatery(int batery) {
        this.batery = batery;
    }

    /**
     * @return the acountBalance
     */
    public float getAcountBalance() {
        return acountBalance;
    }

    /**
     * @param acountBalance the acountBalance to set
     */
    public void setAcountBalance(float acountBalance) {
        this.acountBalance = acountBalance;
    }

    /**
     * @return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the on to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "Celphone{" +"name ="+getName()+ ", number=" + getNumber() + ", batery=" + getBatery() 
                + ", acountBalance=" + getAcountBalance() + ", on=" + isOn() + '}';
    }
    
}
