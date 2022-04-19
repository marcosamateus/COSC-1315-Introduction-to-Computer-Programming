/*
 * Marcos Mateus
 * 11/17/20
 * This program is going to write the Old MacDonald song by using a method
 * JDK version 1.8
 */
package macdonald;


public class MacDonald {
    public static void main(String[] args) {
        animalVerse("pig", "oink");
        animalVerse("cow", "moo");
        animalVerse("sheep", "baa");
        
    }
    
    public static void animalVerse(String animal, String sound){
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O."
                + "\nAnd on this farm he had a " + animal + ", EE-I-EE-I-O,"
                + "\nWith a " + sound + " " + sound + "here and a "
                + sound + " " + sound + " there. "
                + "\nHere a " + sound + " there a " + sound
                + " everywhere a " + sound + " " + sound
                + "\nOld Macdonald had a farm, EE-I-EE-I-O.\n");
    
    }
}
