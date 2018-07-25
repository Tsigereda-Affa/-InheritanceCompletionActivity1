import java.util.Scanner;

public class ProductApplication {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Product p = new Product();
        // print(p.toString());
        // first i have to set it to change it from the defalt value and print it
        p.setCode("Super code");
        print("  Code : " + p.getCode());
        p.setDescription("This code is very new and easy to play game code");
        print("  Discrption : " + p.getDescription());
        p.setPrice(57);
        System.out.println("  Price : $" + p.getPrice());


        Book b = new Book();
        // this are the original to check te place
        // print(b.toString());
        // print(b.getAuthor());
        // System.out.println(b.getPages());
        // b.setAuthor("John");
        print("What is the author name?");
        b.setAuthor(sca.next());
        print("This is the Author of the book :" + b.getAuthor());
        b.setPages(23);
        System.out.println("This is the page number  : " + b.getPages());
        // to make a separet code,discription and price for each code
        b.setCode("Medium code");
        print("  Code : " + p.getCode());
        b.setDescription("The main thing about this codeis its application");
        print("   Discrption : " + p.getDescription());
        b.setPrice(33);
        System.out.println("  Price : $" + p.getPrice());



        Software s = new Software();
        s.setProgrammer("John");
        print("This is the programer : " + s.getProgrammer());
        s.setPlatform("Linux");
        print("This is the platform : " + s.getPlatform());
        s.setOs("Windos 10");
        print("This is the oprating system : " + s.getOs());
//       s.setOs("Windows 10");
//       s.setPlatform("Amc");
//       s.setProgrammer("Tsigereda the programmer");
//       print(s.toString());
//       print(s.getProgrammer());
//       print(s.getPlatform());
//       print(s.getOs());
//      // print(s.setPlatform());


    }

    private static void print(String s) {
        System.out.println(s);
    }
}
