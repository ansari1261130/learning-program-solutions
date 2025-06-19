import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
    }

    public static Product binarySearch(Product[] products, String productName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(productName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
