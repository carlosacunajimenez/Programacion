package trimestre2;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int [] num = new int [10];
        int ceros = 0;
        int pos = 0;
        int neg = 0;
        //todo inicializado a 0. int ceros, pos, neg = 0;
        for(int i=0;i<num.length;i++) {
            System.out.println("Introduzca un valor");
            num[i] = sc.nextInt();
            if(num[i]>0) {
                pos++;
            }else if(num[i]<0){
                neg++;
            }else {
                ceros++;
            }
        }
        System.out.println("hay: " + pos + "positivos, " + neg + "negativos y " + ceros + "ceros.");

    }

	}


