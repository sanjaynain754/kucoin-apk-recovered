package p523p2;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: p2.c */
/* JADX INFO: compiled from: ContentLengthInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43356c extends FilterInputStream {

    /* JADX INFO: renamed from: b */
    public final long f95744b;

    /* JADX INFO: renamed from: c */
    public int f95745c;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f95744b - ((long) this.f95745c), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i11;
        i11 = super.read();
        m95483a(i11 >= 0 ? 1 : -1);
        return i11;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static InputStream m95482b(@NonNull InputStream inputStream, long j11) {
        return new C43356c(inputStream, j11);
    }

    /* JADX INFO: renamed from: a */
    public final int m95483a(int i11) throws IOException {
        if (i11 >= 0) {
            this.f95745c += i11;
            return i11;
        }
        if (this.f95744b - ((long) this.f95745c) <= 0) {
            return i11;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f95744b + ", but read: " + this.f95745c);
    }

    public C43356c(@NonNull InputStream inputStream, long j11) {
        super(inputStream);
        this.f95744b = j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) throws IOException {
        return m95483a(super.read(bArr, i11, i12));
    }
}
