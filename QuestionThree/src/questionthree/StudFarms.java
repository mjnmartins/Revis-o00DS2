
package questionthree;

public class StudFarms {
   private int horse, horseshoe;

    public StudFarms(int horse, int horseshoe) {
        this.horse = horse;
        this.horseshoe = horseshoe;
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
    public void result(){
        System.out.println("O numero de ferraduras para os novos cavalos são:\n" + this.horseshoe + " ferraduras");
    }
    
}
