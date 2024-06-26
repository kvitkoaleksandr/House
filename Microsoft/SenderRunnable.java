package Microsoft;

public record SenderRunnable(int startIndex, int endIndex) implements Runnable {

    @Override
    public void run() {
        System.out.println("Письма отправлены от индекса " + startIndex
                + " до " + endIndex + " успешно.");
    }
}
