public class Shop {
    String name;
    String color;
    public Shop(String name,String color){
        this.name = name;
        this.color = color;
    }

    String isColor(String Color){
        if(color.equalsIgnoreCase(Color)){
            return "Цей колір вам підходить:" + color;
        }
        else {
            return "Цей колір вам не підходить:"+ color;
        }
    }

}
