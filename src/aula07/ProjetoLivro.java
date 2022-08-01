package aula07;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Renan", 29, "Masculino");
        p[1] = new Pessoa("Diovana", 28, "Feminino");

        l[0] = new Livro("Inteligencia Emocional", "Daniel Golleman",250, p[0]);
        l[1] = new Livro("A Arte da Guerra", "Sun Tzu", 150, p[1]);
        l[2] = new Livro("Casais Inteligentes Enriquecem Juntos", "Gustavo Cerbasi", 180, p[1]);

        l[1].abrir();
        l[1].folear(125);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }
}
