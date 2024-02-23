import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------------Sistemas de Aluno------------------------------------------------");
        int[] qalunos = new int[5];
        int qNotasA=0;
        int qnotasB=0;

        int qualAluno = 1;
        float totalDeNotas = 0;
        for (int i =0 ; i<= 4;i++){
            System.out.println("Digite a nota do Aluno : "+ (qualAluno + i) );
            qalunos[i] = entrada.nextInt();
            totalDeNotas +=qalunos[i];

            if(qalunos[i] >= 6){
                qNotasA +=1;
            } else  {
                qnotasB+=1;
            }

        }

        System.out.println(totalDeNotas + "total das notas");
        System.out.println((totalDeNotas / 55 ) + " MEDIA DAS NOTAS ");
        System.out.println(qnotasB + " notas abaixo da media ");
        System.out.println(qNotasA + " notas acima da media ");

    }

}
