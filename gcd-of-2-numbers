class solution {
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;

        System.out.println("GCD: " + gcd(n1, n2));
    }
}
