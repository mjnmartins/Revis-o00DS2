
package questionthree;

public class StudFarms {
   private int horse, horseshoe, paws;

    public StudFarms(int horse, int horseshoe, int paws) {
        this.horse = 00;
        this.horseshoe = 00;
        this.paws   = 4;
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public int getHorseshoe() {
        return horseshoe;
    }

    public void setHorseshoe(int horseshoe) {
        this.horseshoe = horseshoe;
    }
    
    public int getPaws(){
        return paws;
        }
    
    public void setPaws(int paws) {
        this.paws = paws;
    }
    public void result(){
        System.out.println("O numero de ferraduras para os novos cavalos são:\n" + this.horseshoe + " ferraduras");
    }
    
}
