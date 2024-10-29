class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public static void main(String args[]) {
        String name = "Sudeep";

        try {
            if (name == "sudeep") {
                throw new MyException("name is Sudeep");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}