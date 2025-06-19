public class Main {
    public static void main(String[] args) {
        // Sample Product Array
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shampoo", "Personal Care"),
                new Product(3, "T-Shirt", "Clothing"),
                new Product(4, "Mobile", "Electronics"),
                new Product(5, "Notebook", "Stationery")
        };

        // 🔍 Linear Search (unsorted)
        String searchTerm1 = "T-Shirt";
        Product result1 = LinearSearch.linearSearch(products, searchTerm1);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // 🔃 Sort Products for Binary Search
        BinarySearch.sortProductsByName(products);

        // 🔍 Binary Search (sorted by productName)
        String searchTerm2 = "Mobile";
        Product result2 = BinarySearch.binarySearch(products, searchTerm2);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}
