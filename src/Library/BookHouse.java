package Library;

public class BookHouse {
    Book[] books = new Book[100];
    int size = 0;

    public void addBook(Book book) {
        books[size] = book;
        size++;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getData());
        }
    }

    int count = 0;
    void searchBook(String name) {
        for (int i = 0; i < size; i++) {
            if (books[i].bookName.equals(name)) {
                count++;
                System.out.println(books[i].getData());
            }
        }
        if (count == 0){
                System.out.println("Data Not Found");
            }
        }
    }
