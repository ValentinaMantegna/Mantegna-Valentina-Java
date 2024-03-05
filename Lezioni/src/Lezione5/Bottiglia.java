package Lezione5;
//classi e oggetti
public class Bottiglia {
  //private int capacità;// //nasconde il valore

  //private int quantità; //nasconde il valore

    int capacità;
    int quantità;


    public Bottiglia(int capacità) {
        this.capacità = capacità;
        this.quantità = 0;
    }

    public Bottiglia(int capacità, int quantità) {
        this.capacità = capacità;
        this.quantità = quantità;
    }


    public void riempi(int quantità) { // quantità si riferirà quello più vicino
        this.quantità += quantità;
        if(this.quantità>capacità )
            this.quantità = capacità;
        // terzo metodo this.quantità = Math.min(this.capacità,this.quantità + quantità);

    }

    public void svuota(int quantità) {
        if(this.quantità<0 )
            this.quantità = 0;

        this.quantità -= quantità;
     //terzo metodo    this.quantità= Math.max(0,this.quantità - quantità);
    }



    @Override
    public String toString() {
        return "Bottiglia{" +
                "capacità=" + capacità +
                ", quantità=" + quantità +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bottiglia bottiglia = (Bottiglia) o;

        if (capacità != bottiglia.capacità) return false;
        return quantità == bottiglia.quantità;
    }

    @Override
    public int hashCode() {
        int result = capacità;
        result = 31 * result + quantità;
        return result;
    }
}
