import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        imprimirSelecionado();
    }

    static void imprimirSelecionado () {
        String [] candidatos = {"Felipe", "Marcia","Julia","Paulo","Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice ++) {
            System.out.println("O Candidato de N° "+ indice + "é" + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
       
        for (String candidato : candidatos ) {
            System.out.println("O candidato selecionado foi" + candidato);
        }
    }

    static void selecaoCandidatos () {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
        
        int candidatosSelecionados = 0;
        int canidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && canidatosAtual < candidatos.length){
            String candidato = candidatos [canidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato+"Solicitou esse valor de salário" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "Foi selecionado para a vaga ");
                candidatosSelecionados ++;
            }
            canidatosAtual ++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
     static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if (salarioBase > salarioPretendido) 
            System.out.println("Ligar para o candidato");

        if (salarioBase == salarioPretendido ){
            System.out.println("Ligar para o candidato com contra proposta");
        } 
        else{ 
            System.out.println("Agurdando resultado demais candidatos");
        } 
    }
    
}

