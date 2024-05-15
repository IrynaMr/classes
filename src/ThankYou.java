public class ThankYou {
    private String message;
    public ThankYou(String breed){
        this.message = "Дякуємо за покупку !" ;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void displayMessange(){
        System.out.println(message);
    }

}

