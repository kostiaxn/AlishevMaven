public class NetworkUtils {
    public static void getConnection(){
        // получаем соединение с сервером
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
