public class destructor {
    public void finalize() {
        System.out.println("Object is being destroyed");
    }

    public static void main(String[] args) {
        destructor obj = new destructor();
        // Perform operations with obj
        obj = null; // Making obj eligible for garbage collection
        // Other operations
        // At some point, the garbage collector will destroy obj
    }
}
