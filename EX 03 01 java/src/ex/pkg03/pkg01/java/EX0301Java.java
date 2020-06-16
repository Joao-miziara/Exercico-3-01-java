
package ex.pkg03.pkg01.java;

import java.util.Scanner;

public class EX0301Java {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o lado A do triangulo");
        int num = entrada.nextInt();
        System.out.println("Digite o lado B do triangulo");
        int num2 = entrada.nextInt();
        System.out.println("Digite o lado C do triangulo");
        int num3 = entrada.nextInt();
        

            if ((num + num2 > num3) && (num + num3 > num2) && (num2 + num3 > num))
            {
                if ((num == num2) && (num == num3) && (num2 == num3))
                
                 System.out.println  ("e um triangulo equilatero");
                




                else
                {
                    if ((num != num2) && (num != num3) && (num2 != num3))
                    
                        System.out.println  ("e um triangulo escaleno");
                    

                    else
                    {

                        if (num == num2 && num != num3 || num == num3 && num != num2 || num2 == num3 && num2 != num)
                            System.out.println ("e um triangulo issoceles");

                    }
                }
            }
            else
             System.out.println ("nao e um triangulo");
                }      
    }             
            
