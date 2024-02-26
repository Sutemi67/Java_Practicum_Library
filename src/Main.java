//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        interface Transportable {
            String getCurrentLibrary();

            void moveToNewLibrary();
        }
        interface Ownable {
            void takeFromLibrary();

            void returnToLibrary();
        }

        abstract class LibraryItem implements Ownable, Transportable {
            String title;
            String text;
            String owner;
            String library;

            public void read() {
                System.out.println("Читаем:");
                System.out.println(title);
                System.out.println(text);
            }


            public void takeFromLibrary(String newOwnerName) {
                owner = newOwnerName;
            }

            public void returnToLibrary() {
                owner = "";
            }

            public String getCurrentLibrary() {
                return library;
            }

            public void moveToNewLibrary(String libraryName) {
                library = libraryName;
            }
        }

        class Book extends LibraryItem {

            @Override
            public void moveToNewLibrary() {

            }

            @Override
            public void takeFromLibrary() {

            }
        }

        class Journal extends LibraryItem {

            @Override
            public void moveToNewLibrary() {

            }

            @Override
            public void takeFromLibrary() {

            }
        }

        class EBook extends LibraryItem {
            @Override
            public void moveToNewLibrary() {

            }

            @Override
            public void takeFromLibrary() {

            }
        }
    }
}