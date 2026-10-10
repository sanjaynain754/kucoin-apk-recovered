package com.fasterxml.jackson.core.p062io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public DataInput decorate(C6310d c6310d, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(C6310d c6310d, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(C6310d c6310d, byte[] bArr, int i11, int i12) throws IOException;

    public abstract Reader decorate(C6310d c6310d, Reader reader) throws IOException;
}
