public class Main {
    public static void main(String[] args) {
        System.out.println("Небольшой библиотечный справочник.");

        String[] title = {"War and Peace","Garden of Cherry"};
        int[] publishingYear = {2021, 1903};
        String[] name = {"Lev","Anton"};
        String[] surname = {"Tolstoy","Chekhov"};

        for (int i = 0; i < title.length; i++) {
            System.out.println("Название книги - " + title[i] +  ",автор - " + name[i] + " " + surname[i] +
                    " дата издания - " + publishingYear[i] + ".");
        }
        Book book = new Book ("War and Peace",2021);
        System.out.print("Название книги - " + book.getTitle() + ",");
        System.out.print(" дата издания - " + book.getPublishingYear() + "");
        Author author = new Author("Lev", "Tolstoy.");
        System.out.print(" ,автор : " + author.getName() + " ");
        System.out.print("" + author.getSurname() + " ");















    }
}