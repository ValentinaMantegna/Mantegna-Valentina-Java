package lezione6;
import Lezione5.Bottiglia;
public class TipoRealeApparente {

    public static void main(String[] args) {
        Bottiglia a = new Bottiglia(500);
        Bottiglia b = new Bottiglia (600);
        BottigliaConTappo c = new BottigliaConTappo(500);
        Bottiglia d = new BottigliaConTappo(600);
        a.riempi(500);
        c.apri();
      //  d.chiudi(); //devo fare un cast perchè d ha il tappo ma viene dalla bottiglia apparente senza
        BottigliaConTappo e = (BottigliaConTappo) d;
        e.chiudi();
        ((BottigliaConTappo) d).chiudi();
        e = new BottigliaConTappo(500); // mi riferiscfo all'apparente con il tappo
    }
}
