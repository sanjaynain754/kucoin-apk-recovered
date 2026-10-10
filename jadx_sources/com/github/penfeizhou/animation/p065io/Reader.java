package com.github.penfeizhou.animation.p065io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public interface Reader {
    int available() throws IOException;

    void close() throws IOException;

    byte peek() throws IOException;

    int position();

    int read(byte[] bArr, int i11, int i12) throws IOException;

    void reset() throws IOException;

    long skip(long j11) throws IOException;

    InputStream toInputStream() throws IOException;
}
