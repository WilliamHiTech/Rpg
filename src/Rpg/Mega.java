package Rpg;


import java.util.Scanner;

public class Mega {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        Scanner resposta = new Scanner(System.in);
        Scanner classeGuerreiro = new Scanner(System.in);
        Scanner armaEscolha = new Scanner(System.in);


        System.out.println("Qual o seu nome?");
        System.out.println("Ola " + nome.nextLine());
        System.out.println("Vamos começar o jogo?");
        resposta.nextLine();
        if (resposta.equals("Nao")) {
            System.out.println("FIM DE JOGO"+resposta.nextLine());
        }

        System.out.println("OK,escolha sua classe de personagem");
        System.out.println("OK, voce escolheu uma otima classe = "+classeGuerreiro.nextLine());
        System.out.println("Agora escolha sua Arma: ");
        System.out.println("Boa escolha de armas = "+ armaEscolha.nextLine());

        System.out.println("Terminamos por aqui, Boa aventura amigo!");





    }
}
