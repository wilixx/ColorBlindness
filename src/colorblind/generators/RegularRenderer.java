package colorblind.generators;

/**
 * 
 * Regular renderer that doesn't do anything special.
 * 
 * This is useful if you want to make Camera3D render "normally" without
 * altering too much of your code.
 * 
 * @author James Schmitz
 *
 */
public class RegularRenderer extends Generator {

    public RegularRenderer() {

    }

    public void generateTransformedFrame(int[] pixels) {
        // do nothing
    }

}
