package Microsoft;

public class MailSender {
    public static void main(String[] args) {

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            int value = i; // для видимости и подсчёта реализации потока
            int startIndex = i * 200 + 1;
            int endIndex = (i + 1) * 200;
            SenderRunnable letters = new SenderRunnable(startIndex, endIndex);
            threads[i] = new Thread(() -> {
                System.out.println("Поток " + value);
                System.out.println("Письма от " + letters.startIndex()
                        + " до " + letters.startIndex() + " были отправлены");
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Все сообщения были отправлены");
    }
}