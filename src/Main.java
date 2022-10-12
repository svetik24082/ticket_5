public class Main {
    private static final Pair[]pairs= new Pair[10];
    public static void main(String[] args) {

        System.out.println("Билет 5");
        pairs[0]= new Pair(" Отцы и дети", "Тургенев", "Иван", " Сергеевич");
        pairs[1]= new Pair(" Война и мир", " Толстой", " Лев", "Николаевич");
        printAllPairs();
    }
    public static void printAllPairs(){
        for (Pair pair: pairs){
            if (pair !=null){
                System.out.println( pair);
            }
        }

    }
}