import services.StoreService;
import services.StoreServiceImpl;

public class MyApplication {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();
        storeService.start();
    }

}
