package lezione6.Forme;
//Classe / sottoclasse
//Crea le classi: Poligono, Rettangolo, Quadrato, Triangolo. Le classi Rettangolo, Quadrato e Triangolo
// devono essere sottoclassi di Poligono. Creare gli attributi base, altezza per Rettangolo, Quadrato e Triangolo,
// lato1, lato2, lato3 per Triangolo.
//Tutte le forme devono avere i metodi area e perimetro.
//return 0 => poligono area

//Creare una List<Poligono> forme, inserire un triangolo, un quadrato, un rettangolo e calcolare la somma
// delle aree.
public class Poligono { //public abstract class Poligono così da non farlo leggere perchè non ci serve
     public double area() { return 0; } //posso togliere il return e specificare che sia astratto


    public double perimetro() {
        return 0;
    } //public abstract perimetro() => modo per dire che quella classe/metodo
    //non siamo capaci di descriverlo,ma diciamo che esiste


    //una classe non astratta deve fare gli override => rettangolo,quadrato,triangolo

}
