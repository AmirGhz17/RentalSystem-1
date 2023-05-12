import java.util.Date;

public class Main {
    public static void main(String[] args) {

        RentalStore shop=new RentalStore();

         Customer person=new Customer("Amir","amir@gmail.com","09350000000","Babolsar",11);
         shop.customers.add(person);

        Book book=new Book("Vampire Diaries","Horror & Fantasy",new Date(2009,1,1),22,"LJ Smith","Cengiz",10);
        shop.addItem(book);
        Game game=new Game("PES","Football",new Date(2001,2,2),33,"PS4","Konami",10);
        shop.addItem(game);
        Movie movie=new Movie("Game Of Thrones","Epic",new Date(2011,3,3),44,"Alan Taylor","1000",10);
        shop.addItem(movie);


    }

}
