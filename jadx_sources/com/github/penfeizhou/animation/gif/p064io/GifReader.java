package com.github.penfeizhou.animation.gif.p064io;

import com.github.penfeizhou.animation.p065io.C6954c;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class GifReader extends C6954c {
    private static ThreadLocal<byte[]> __intBytes = new ThreadLocal<>();

    private static byte[] ensureBytes() {
        byte[] bArr = __intBytes.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        __intBytes.set(bArr2);
        return bArr2;
    }

    public GifReader(Reader reader) {
        super(reader);
    }

    public int readUInt16() throws IOException {
        byte[] bArrEnsureBytes = ensureBytes();
        read(bArrEnsureBytes, 0, 2);
        return ((bArrEnsureBytes[1] & 255) << 8) | (bArrEnsureBytes[0] & 255);
    }
}
