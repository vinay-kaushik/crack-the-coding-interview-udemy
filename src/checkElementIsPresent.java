public class checkElementIsPresent {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        if (isPresent4(a, 5, 5, 0)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");

        }
    }static boolean isPresent4(int a[], int n, int x, int i) {
        if (i == n) {
            return false;
        }
        if (a[i] == x) {
            return true;
        }
        return isPresent4(a, n, x, i + 1);
    }
}
