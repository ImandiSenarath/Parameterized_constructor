class Para_con {
    int id;
    String name;

    // Creating a parameterized constructor
    Para_con(int id, String name) {
        id = id;
        name = name;
    }

    // Method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[]args) {
        // Creating objects and passing values
        Para_con s1 = new  Para_con(576, "Amal");
        Para_con s2 = new  Para_con(786, "Nayana");

        // Calling method to display the values of objects
        s1.display();
        s2.display();
    }
}
