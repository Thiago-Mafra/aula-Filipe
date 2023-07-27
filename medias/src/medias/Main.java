package medias;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


/*Para um trecho de texto digitado */


public class Main {

    public static void main(String[] args) {
       menorMaiorMedia();
    }
     
    
    public static void menorMaiorMedia(){
        
        ArrayList<Integer> numbers = new ArrayList<>();
        String resp = "";

        ///entrada de dados
        while (!resp.equals("x")) {

            resp = JOptionPane.showInputDialog("digite numero inteiro ou x para sair: ");
            if (!resp.equals("x")) {
                numbers.add(Integer.parseInt(resp));

            }

        }
        // System.out.println(numbers);
        Integer menor = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < menor) {
                menor = numbers.get(i);
            }

        }
        //System.out.println(menor);

        Integer maior = numbers.get(0);
        for (int i = 1; i > numbers.size(); i++) {
            if (numbers.get(i) < menor) {
                maior = numbers.get(i);
            }

        }
        //System.out.println(maior);

        Double media = 0.0;
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            media += it.next();
        }
        media /= numbers.size();
        
        JOptionPane.showMessageDialog(null, "Dos numeros inteiros digitados \n"+
                                             "O menor número é: "+menor+ "\n"+
                                             "O maior número é: "+maior+ "\n"+
                                             "A média é: "+media);

    }

}

