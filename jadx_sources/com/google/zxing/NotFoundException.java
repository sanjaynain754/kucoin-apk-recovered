package com.google.zxing;

/* JADX INFO: loaded from: classes56.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException INSTANCE;

    static {
        NotFoundException notFoundException = new NotFoundException();
        INSTANCE = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    public static NotFoundException getNotFoundInstance() {
        return INSTANCE;
    }

    private NotFoundException() {
    }
}
