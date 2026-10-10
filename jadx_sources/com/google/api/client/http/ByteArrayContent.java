package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
public final class ByteArrayContent extends AbstractInputStreamContent {
    private final byte[] byteArray;
    private final int length;
    private final int offset;

    public ByteArrayContent(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public ByteArrayContent(String str, byte[] bArr, int i11, int i12) {
        super(str);
        this.byteArray = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(bArr.length));
        this.offset = i11;
        this.length = i12;
    }

    public static ByteArrayContent fromString(String str, String str2) {
        return new ByteArrayContent(str, StringUtils.getBytesUtf8(str2));
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.byteArray, this.offset, this.length);
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public ByteArrayContent setCloseInputStream(boolean z11) {
        return (ByteArrayContent) super.setCloseInputStream(z11);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public ByteArrayContent setType(String str) {
        return (ByteArrayContent) super.setType(str);
    }
}
