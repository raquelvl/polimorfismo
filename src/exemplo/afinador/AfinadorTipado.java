package exemplo.afinador;

import java.util.Scanner;

public class AfinadorTipado {

    public void afina(Piano p) {
        int numeroDeNotas = 10;
// ...
        System.out.println(p.toca(numeroDeNotas));
// ...
        System.out.println(p.getNome() + " afinado!");
    }

    public void afina(Sax s) {
        int numeroDeNotas = 12;
// ...
        System.out.println(s.toca(numeroDeNotas));
// ...
        System.out.println(s.getNome() + " afinado!");
    }

    public void afina(Baixo b) {
        int numeroDeNotas = 20;
// ...
        System.out.println(b.toca(numeroDeNotas));
// ...
        System.out.println(b.getNome() + " afinado!");
    }

    public static void main(String[] args) {
        AfinadorTipado afinador = new AfinadorTipado();
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        do {
            prompt();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    Piano piano = new Piano(Piano.NOME);
                    afinador.afina(piano);
                    break;
                case 2:
                    Sax sax = new Sax(Sax.NOME);
                    afinador.afina(sax);
                    break;
                case 3:
                    Baixo baixo = new Baixo(Baixo.NOME);
                    afinador.afina(baixo);
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
