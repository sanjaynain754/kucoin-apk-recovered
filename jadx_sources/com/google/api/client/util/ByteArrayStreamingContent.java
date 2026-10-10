package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
@Deprecated
public class ByteArrayStreamingContent implements StreamingContent {
    private final byte[] byteArray;
    private final int length;
    private final int offset;

    public ByteArrayStreamingContent(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ByteArrayStreamingContent(byte[] bArr, int i11, int i12) {
        this.byteArray = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length);
        this.offset = i11;
        this.length = i12;
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.byteArray, this.offset, this.length);
        outputStream.flush();
    }
}
