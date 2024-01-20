import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quale esercizio desideri eseguire? (1, 2, 3)");
        int excersizeNum = scanner.nextInt();

        switch (excersizeNum) {

            case 1 :

            System.out.println("Quante parole desideri inserire?");
            int wordsQty = scanner.nextInt();

            Set<String> words = new HashSet<>();
            List<String> duplicates = new ArrayList<>();

            for (int i = 0; i < wordsQty; i++) {
                System.out.println("Inserisci parola:");
                String word = scanner.next();
                if (!words.add(word)) duplicates.add(word);

            }

            System.out.println("************** Parole duplicate: ****************");
            for (String word : duplicates) {
                System.out.println(word);
            }
            System.out.println("*************** N. parole distinte: " + (words.size() - duplicates.size()) + " ****************");
            System.out.println("*************** Parole distinte: ****************");
            words.forEach(elem -> {if (!duplicates.contains(elem)) {
            System.out.println(elem);
            }
            });

            break;
            case 2 :
                System.out.println("************* Premi un numero per creare l'array di numeri randomici: *************");
                int num = scanner.nextInt();

                List<Integer> orderedList = new ArrayList<>();

                for (int i = 1; i <= num ; i++) {
                    Random rand = new Random();
                    orderedList.add(rand.nextInt(0, 100));
                }

                orderedList.sort(Integer::compareTo);

                System.out.println(orderedList);

                List<List<Integer>> newList = new ArrayList<>();

                newList.add(orderedList);
                newList.add(orderedList.reversed());

                System.out.println("************ Array contenente valori in ordine naturale e inverso ************");

                System.out.println(newList);

                System.out.println("******* Scrivi 'true' per visualizzare gli elementi in posizione pari, 'false' per i dispari: *******");
                boolean evenOrOdd = scanner.nextBoolean();

                if (evenOrOdd) {
                    orderedList.forEach(elem -> {if (orderedList.indexOf(elem) % 2 == 0) {
                        System.out.println(elem);
                    }
                    });
                } else {
                    orderedList.forEach(elem -> {if (!(orderedList.indexOf(elem) % 2 == 0)) {
                    System.out.println(elem);
                    }
                    });
                }

                break;

            case 3 :
                Map<String, Integer> rubrica = new HashMap<>();

                rubrica.put("Mario", 38975625);
                rubrica.put("Giovanni", 1254895);
                rubrica.put("Jerago", 54896342);
                rubrica.put("Orago", 87941258);

                System.out.println( rubrica.size() + " contatti sono stati aggiunti alla rubrica.");

                System.out.println("Scrivi il nome di un contatto da cancellare: " + rubrica);
                String toDelete = scanner.next();

                rubrica.remove(toDelete);

                System.out.println("Rubrica aggiornata: " + rubrica);

                System.out.println("Digita il numero del contatto: ");
                Integer toSearch = scanner.nextInt();



        }
    }
}