/**
 * 
 */
package uk.ac.ebi.brain.error;

/**
 * @author Samuel Croset
 *
 */
@SuppressWarnings("serial")
public class BadPrefixException extends  BrainException {

    public BadPrefixException(String message) {
	super(message);
    }

}