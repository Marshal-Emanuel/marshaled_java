public class BookApp{
    public static void main(String[] args){
        
        Book book1=new Book("Wallah_Bin_Wallah", "Kiswahili_mufti", "Swahili", 30);
      /*   book1.author = "Wallah_Bin_Wallah";
        book1.title = "Kiswahili_mufti";
        book1.language = "Swahili";
        book1.pages=300;*/


        Book book2=new Book("J.p Rowling", "Harry Potter", "English", 400 );
        /*book2.author = "J.k Rowling";
        book2.title = "Harry Porter";
        book2.language = "English";
        book2.pages=400;*/

        System.out.println(book2.author);

    }
}