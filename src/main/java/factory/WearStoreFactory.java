package factory;

public class WearStoreFactory implements StoreFactory{
    @Override
    public Store createStore() {
        return new WearStore();
    }
}
