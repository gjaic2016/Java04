import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String bookTitle;
        String authorName;

        Scanner scanner = new Scanner(System.in);

        Map<String, String> books = new HashMap<>();
//        Map<String, String> books = new TreeMap<>();

        System.out.println("Enter your favourite books and authors. Enter 'stop' to finish");

//        books.put("Mačak", "Zlatko Tomičić");
//        books.put("Vlak u snijegu", "Mato Lovrak");
//        books.put("Robinson Crusoe", "Daniel Defoe");
//        books.put("Mećava", "Damir Miloš");
//        books.put("Dnevnik Anne Frank", "Anna Frank");
//        books.put("Miris knjige", "Jadranka Klepac");
//        books.put("Alkar", "Dinko Šimunović");
//        books.put("Noćni svirač", "Dubravko Detoni");
//        books.put("Starac i more", "Ernest Hemingwey");
//        books.put("Grand hotel", "Josip Laća");
//        books.put("Tirena", "Marin Držić");
//        books.put("Mećava", "Damir Miloš");


        while (true) {

            System.out.println("Book title: ");
            bookTitle = scanner.nextLine();
            if ("stop".equals(bookTitle)) {
                break;
            }

            System.out.println("Author name: ");
            authorName = scanner.nextLine();
            if ("stop".equals(authorName)) {
                break;
            }

            books.put(bookTitle, authorName);

//          check entered books with autors
//            System.out.println("Book: " + bookTitle + " by " + authorName);

        }

        System.out.println("---------Before--------");

        for (String bookTitleKey : books.keySet()) { // Iterate over the keys
            String authorOfBook = books.get(bookTitleKey);
            System.out.println(bookTitleKey + " by " + authorOfBook);
        }

        System.out.println("---------------");
        System.out.println("---------After-------");

        //FIRST EXAMPLE

        List<String> sortedBooks = books.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey, Comparator.naturalOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        sortedBooks.forEach(System.out::println);

//        List<String> sortedBooks = books.entrySet()
//                .stream()
//                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
//                .map(e -> e.getKey())
//                .collect(Collectors.toList());

//        for (String book : sortedBooks) {
//            System.out.println(book);
//        }



        //SECOND EXAMPLE
        /*
        List<String> bookTitleKeys = books.keySet().stream().collect(Collectors.toList());
        List<String> bookAuthorValues = books.values().stream().collect(Collectors.toList());

        System.out.println(bookTitleKeys);
        System.out.println(bookAuthorValues);
        */

        //THIRD EXAMPLE
        /*
        Iterator iterator = books.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry bookEntries = (Map.Entry) iterator.next();
            System.out.println(bookEntries.getKey() + " by " + bookEntries.getValue());
        }
        */
    }
}