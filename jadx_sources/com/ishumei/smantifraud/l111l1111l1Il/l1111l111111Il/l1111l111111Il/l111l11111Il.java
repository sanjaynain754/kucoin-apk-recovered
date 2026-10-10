package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
public final class l111l11111Il {
    private final int l1111l111111Il;
    private final InputStream l111l11111I1l = null;
    private final byte[] l111l11111Il;
    private final int l111l11111lIl;

    public final int l1111l111111Il() {
        return this.l1111l111111Il;
    }

    public final byte[] l111l11111I1l() {
        return this.l111l11111Il;
    }

    public final InputStream l111l11111Il() {
        if (this.l111l11111Il != null) {
            return new ByteArrayInputStream(this.l111l11111Il);
        }
        return null;
    }

    public final int l111l11111lIl() {
        return this.l111l11111lIl;
    }

    public l111l11111Il(int i11, byte[] bArr) {
        this.l1111l111111Il = i11;
        this.l111l11111lIl = bArr.length;
        this.l111l11111Il = bArr;
    }
}
