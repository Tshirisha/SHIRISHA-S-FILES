class MethodOverloading {
    private static void display(int a){
        System.out.println("Parameters " + a);
    }

    private static void display(int a, int b){
        System.out.println("parameters: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
