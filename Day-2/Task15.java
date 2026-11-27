interface Printable {
    void printDocument();
}
interface Scannable {
    void scanDocument();
}
class SmartPrinter implements Printable, Scannable {
    public void printDocument() {
        System.out.println("Printing document...");
    }
    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}

class Task15 {
    public static void main(String[] args) {
        SmartPrinter s = new SmartPrinter();
        s.printDocument();
        s.scanDocument();
    }
}