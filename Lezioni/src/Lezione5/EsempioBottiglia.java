package Lezione5;

public class EsempioBottiglia {

    public static void main(String[] args) {
        Bottiglia b1 = new Bottiglia(1500);
        b1.quantità = 1;
        System.out.println(b1.quantità);
        System.out.println(b1.capacità);
        System.out.println(b1); // ci stampa l'indirizzo di memoria
        b1.riempi(5);
        System.out.println(b1);
        b1.svuota(1000);
        System.out.println(b1);
        //b1.quantità= 99999999
        System.out.println(b1);
        Bottiglia b2 = new Bottiglia(500);
        b2.riempi(200);
        b2.svuota(150);
    }
}
