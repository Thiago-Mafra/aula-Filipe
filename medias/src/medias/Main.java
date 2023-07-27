package medias;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //media();

        /*Double [] notas = new Double[1];
        String resp = "";
        
        int contador = 0;
        while(!resp.equals("-1")){  
                    
        resp = (JOptionPane.showInputDialog("digite a nota ou -1 para encerrar: "));
        if(!resp.equals("-1")){
            if(notas.length == contador){
                Double [] newNotas = new Double[contador]
            }*/
//////////////////////////////////////////////////////////////////////////////////
        //Utilizando ArrayList, pegar quantos numeros inteiros que usuario quiser digitar
        //no final indetifique qual menor numero , qual o maior numero e qual a media dos inteiros.
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
        System.out.println(menor);

        Integer maior = numbers.get(0);
        for (int i = 1; i > numbers.size(); i++) {
            if (numbers.get(i) < menor) {
                maior = numbers.get(i);
            }

        }
        System.out.println(maior);

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

// crie um program com JoptionPane , que peca 3 notas e informe a media do aluno.

/*public static void media() {
        Double[] notas = new Double[3];
        for (int i = 0; i <= 2; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a a " + (i + 1) + " nota"));
            Double media = (notas[0] + notas[1] + notas[2]) / 3;
            JOptionPane.showMessageDialog(null, "A média do aluno foi de " + media + ".");
}
}*/
