package service;

public class ProductServiceImpl implements ProductService {
    @Override
    public void addProduct() {
        System.out.println("add Product");
    }

    @Override
    public void updateProduct() {
        System.out.println("update Product");
    }

    @Override
    public void deleteProduct() {
        System.out.println("delete Product");
    }
}
