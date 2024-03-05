package lezione6;

public class BottigliaConTappo extends Lezione5.Bottiglia {

    public boolean aperta;

    public BottigliaConTappo(int capacita) {
        super(capacita);
        this.aperta = true;
    }

    public BottigliaConTappo(int capacita, int quantita) {
        super(capacita, quantita);
        this.aperta = true;
    }

    public void chiudi() {
        this.aperta = false;
    }

    public void apri() {
        this.aperta = true;
    }

    @Override
    public String toString() {
        return super.toString() + " aperto: " + aperta;
    }

    @Override
    public void riempi(int quantita) {
        if (this.aperta) // riempi solo se bottiglia aperta
            super.riempi(quantita);
    }

    @Override
    public void svuota(int quantita) {
        if (this.aperta) {
            super.svuota(quantita);
        }


    }
}
