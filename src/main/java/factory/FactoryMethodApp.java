package factory;

public class FactoryMethodApp {


    public static void main(String[] args) {

        Store store = new GroceryStore();
        store.saleGood();

        StoreFactory storeFactory = new GroceryStoreFactory();
        Store storeGrocery = storeFactory.createStore();
        storeGrocery.saleGood();

        WearStoreFactory wearStoreFactory = new WearStoreFactory();
        Store wearStore = wearStoreFactory.createStore();
        wearStore.saleGood();


    }


}
