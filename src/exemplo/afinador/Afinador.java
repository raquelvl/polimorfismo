package exemplo.afinador;

import java.util.Scanner;

public class Afinador {
    public String afina(Instrumento i, int numeroDeNotas) {
// ...
        return i.toca(numeroDeNotas) + " " + i.getNome() + " afinado!";
    }

    public static void main(String[] args) {
        Afinador afinador = new Afinador();
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        do {
            prompt();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    Piano piano = new Piano(Piano.NOME);
                    System.out.println(afinador.afina(piano, 10));
                    break;
                case 2:
                    Sax sax = new Sax(Sax.NOME);
                    System.out.println(afinador.afina(sax, 20));
                    break;
                case 3:
                    Baixo baixo = new Baixo(Baixo.NOME);
                    System.out.println(afinador.afina(baixo, 12));
                    break;
            }
        } while (escolha < 4 && escolha > 0);
        sc.close();
    }

    private static void prompt() {
        System.out.println("Que instrumento voce quer afinar?");
        System.out.println("1. Para afinar a piano;");
        System.out.println("2. Para afinar o sax;");
        System.out.println("3. Para afinar o baixo;");
        System.out.println(">3 ou <0 Para sair.");
    }
}
