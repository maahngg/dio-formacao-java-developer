package selecao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 0;
        boolean continuarTentando;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com "+candidato+" na tentativa nº "+tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com "+candidato+", número máximo de tentativas "+tentativasRealizadas);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado: " + candidato);
        }
    }

    static void selecaoCandidatos() {

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("candidato %s solicitou este valor: %.2f\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato não selecionado");
            }

            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double pretencaoSalarial) {
        double salarioBase = 2000.0;

        if (salarioBase > pretencaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == pretencaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

}
