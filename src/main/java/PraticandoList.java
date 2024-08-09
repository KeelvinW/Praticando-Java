import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PraticandoList {

    public static void main (String [] args){

        List<String> list = new ArrayList<>();


        //Adicionar elementos na lista.
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Inserir elemento na posição desejada.
        list.add(2, "Marco");

        //Mostrar o tamanho da lista e mostrar elementos da lista.
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-----------");

        //Remover elementos da lista (elemento posição 1, nomes com a letra M).
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-----------");

        //Encontrar posição de um elemento na lista (posição do nome na lista)
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------");
        //Filtrar na lista elementos, letra ou numero especifico (Elementos que começam com a letra M.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-----------");
        //Encontrar um elemento que atenda um certo predicado (encontrar o primeiro elemento que comece com a letra A).
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
