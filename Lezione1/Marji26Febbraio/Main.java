package Marji26Febbraio;

public class Main {
    public static void main(String[] args) {
        Persona miaPersona = new Persona ( "Ciccio",  "Pasticcio", 40);
        //System.out.println(miaPersona) non è utile;
        miaPersona.nomePersona= "Riccardo"; //accesso pubblico
        System.out.println(miaPersona);
        Persona secondaPersona = new Persona ("Alberto", "Malesiani");
        System.out.println(secondaPersona); //stampa bella perchè usato toString
    }
}
