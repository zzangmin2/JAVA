package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shlefQueue = new BookShelf();
        shlefQueue.enQueue("태백산맥 1");
        shlefQueue.enQueue("태백산맥 2");
        shlefQueue.enQueue("태백산맥 3");

        System.out.println(shlefQueue.deQueue());
        System.out.println(shlefQueue.deQueue());
        System.out.println(shlefQueue.deQueue());

    }
}
