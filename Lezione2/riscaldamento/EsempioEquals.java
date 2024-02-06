package lezione2.riscaldamento;

public class EsempioEquals {
    public static void main(String[] args) {
        String nome= "Vale";
        // modo sbagliato per confronto oggetti
        System.out.println(nome == "AVale".substring(1));
        //modo corretto:
        System.out.println(nome.equals("AVale".substring(1)));
        System.out.println(nome.equalsIgnoreCase("vvale".substring(1
        )));
    }
}
