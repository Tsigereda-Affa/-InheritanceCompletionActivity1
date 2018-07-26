public class Product {

    public Product() {
        code = "NEW CODE";
        description = "NEW DESCRIPTION";
        price = 0.0;
        //formatPrice ="";
       System.out.println("  This is new product application");
    }
    private String code;
    private String description;
    private double price;
    // private String formatPrice;
    protected static int count = 0; // a protected static variable

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

//    private double price;
//   // private String formatPrice;
//    protected static int count = 0; // a protected static variable

//    public Product() {
//        code = "NEW CODE";
//        description = "NEW DESCRIPTION";
//        price = 0.0;
//       //formatPrice ="";
//    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
        //inside the  () you can write the parameter
    }

    private String getFormattedPrice() {
        // in the ()
        // Use the NumberFormat class to format the price to 2 decimal places
        String formatPrice = String.format("%.02f", price);
        return formatPrice;
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}