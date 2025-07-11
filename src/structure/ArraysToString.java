import java.util.Arrays;

record Cat(String name){
    public String toString() { return "Meower(" + name + ")";}
}

public static void main(String[] args) {
    Cat[] pets = new Cat[]{new Cat("Tom"), new Cat("Slinky")};
    System.out.println("Pets are " + Arrays.toString(pets));
}
