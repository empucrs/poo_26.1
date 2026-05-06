package br.pucrs;
import java.io.IOException;

public class UmaExcecaoNova extends IOException {
    public UmaExcecaoNova() {
        super();
    }
    public UmaExcecaoNova(String m) {
        super(m);
    }
    public UmaExcecaoNova(Throwable c) {
        super(c);
    }
    public UmaExcecaoNova(String m, Throwable c) {
        super(m,c);
    }
}