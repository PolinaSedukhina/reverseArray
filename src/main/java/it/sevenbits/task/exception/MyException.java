 package it.sevenbits.task.exception;

/**
 * MyException.
 */
public class MyException extends Exception {
    /**
     * Constructor.
     * @param e is incoming param
     */
    public MyException(final Throwable e) {
        initCause(e);
    }
}
