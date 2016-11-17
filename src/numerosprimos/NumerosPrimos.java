package numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class NumerosPrimos {

    /**
    Codificado por: sAfOrAs
   Istar los numeros según el numero de digitos indicado
    Considero solo hasta numeros menores a 100000 (5 digitos), 
    por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    */
    public static boolean p = false;
    
    public static void main(String arg[])
        {
        int numDigitos=pedirNumDigitos();
        int ndigitos=0;
        for(int i = 1; i <= 99999; i++ )
        {
            int divisionEntera = i;
 
            int contador=0;
 
            while (divisionEntera != 0)
        {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        ndigitos=contador;
            
            
            if(ndigitos==numDigitos){
                   if (i < 4) p = true;
            else
            {
            if (i % 2 == 0) p = false; 
                else
                {
                    int contador1 = 0;  
                    int i1 = 1; 
                    int limite = (i - 1) / 2; 
                    if  (limite % 2 == 0) limite--;  
             
                    while(i1 <= limite)
                    {
                        if (i % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = limite + 1;
                    }
 
        if (contador1 == 1) p = true;
            } 
        } 
     
                if (p == true) 
                    System.out.println(i);    
            }
        }
        }
 
       public static int pedirNumDigitos(){
            int numDigitos=Integer.parseInt(JOptionPane.showInputDialog("Numero de digitos "));
           if(numDigitos<=0||numDigitos>5)
           System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
           return numDigitos;
       }
 
}