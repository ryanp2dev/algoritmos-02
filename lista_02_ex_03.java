import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] qnumeros = new int[20];
    int qn = 1;
    int qPositivos = 0;

//    int[] qTotalP = new int[qPositivosi];
    for (int i = 0; i <=19 ;i++){
        System.out.println("Digite o "+ (qn + i)+ ":");
        qnumeros[i] = in.nextInt();
        if(qnumeros[i] > 0) {
            qPositivos +=1;
        }

    }


        System.out.println("numeros posivos: " + qPositivos);

        for(int i = 0; i<=19;i++){
            if(qnumeros[i] >0) {
                System.out.println("OS numeros Posivos sao " + qnumeros[i]);
            }
        }
    }
}
