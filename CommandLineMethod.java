class CommandLineMethod {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Hello! Please provide two integer arguments.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        CommandLineMethod obj = new CommandLineMethod();
        obj.add(x, y);
    }
}
