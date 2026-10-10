package io.noties.markwon.html.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes60.dex */
public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }

    public IOException ioException() {
        return (IOException) getCause();
    }
}
