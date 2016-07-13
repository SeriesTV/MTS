package mtc.common.exceptions;

/**
 * Created by Michal Czarnecki on 13.07.2016.
 */
public class EmailAlreadyInUseException extends Exception {

    EmailAlreadyInUseException(String message){
        super(message);
    }

}
