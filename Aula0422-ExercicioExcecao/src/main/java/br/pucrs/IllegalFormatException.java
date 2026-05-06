package br.pucrs;

public class IllegalFormatException extends Exception {
    public IllegalFormatException() {
        super();
    }
    public IllegalFormatException(String m) {
        super(m);
    }
    public IllegalFormatException(Throwable c) {
        super(c);
    }
    public IllegalFormatException(String m, Throwable c) {
        super(m,c);
    }
}