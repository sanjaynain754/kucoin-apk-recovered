package org.aspectj.lang;

/* JADX INFO: loaded from: classes61.dex */
public class NoAspectBoundException extends RuntimeException {
    Throwable cause;

    /* JADX WARN: Illegal instructions before constructor call */
    public NoAspectBoundException(String str, Throwable th2) {
        if (th2 != null) {
            str = "Exception while initializing " + str + ": " + th2;
        }
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public NoAspectBoundException() {
    }
}
