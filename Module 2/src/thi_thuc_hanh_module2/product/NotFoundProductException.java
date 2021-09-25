package thi_thuc_hanh_module2.product;

public class NotFoundProductException extends Exception{
    public NotFoundProductException(String message){
        super(message);
    }

    public NotFoundProductException(){}
}
