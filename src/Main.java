import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        main2();
    }

    public static void main1(){
        ArrayList<Integer> ints = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            ints.add(random.nextInt(1,10));
        }
        for(Integer i : ints){
            System.out.print(i + " ");
        }
        System.out.println();
        Stream<Integer> stream = ints.stream();
        //stream.distinct().collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));
        //*stream.skip(6).filter(x-> x % 2 != 0).filter(Objects::nonNull).collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));
        //stream.map(x -> x * 2).collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));
        //stream.limit(4).sorted().collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));
        //System.out.println(stream.count());
        //*System.out.println(stream.mapToInt((x) -> Integer.parseInt(x)).average());
    }

    public static void main2(){
        ArrayList<String> str = new ArrayList<>();
        str.add("Алла");
        str.add("Максим");
        str.add("Михаил");
        str.add("Анджелина");
        str.add("Витя");
        str.add("Света");
        str.add("Алла");
        String myName = "Алла";
        for(String s : str){
            System.out.print(s + " ");
        }
        System.out.println();
        Stream<String> stream = str.stream();
        //System.out.println(stream.filter(x -> x.equalsIgnoreCase(myName)).count());
        //stream.filter(x -> x.toLowerCase().startsWith("а")).distinct().forEach(x -> System.out.println(x + " "));
        System.out.println(stream.sorted().findFirst().orElse("Empty"));

    }
}