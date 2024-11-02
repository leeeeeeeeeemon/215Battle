public interface Soundble {
    int OPEN = 1;
    int CLOSE = 0;
    default void sound(){
        System.out.println("default sound");
    }

}
