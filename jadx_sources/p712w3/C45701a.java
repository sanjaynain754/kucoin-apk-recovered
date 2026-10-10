package p712w3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: w3.a */
/* JADX INFO: compiled from: ByteStreams.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45701a {
    /* JADX INFO: renamed from: a */
    public static long m100878a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C45708h.m100896g(inputStream);
        C45708h.m100896g(outputStream);
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return j11;
            }
            outputStream.write(bArr, 0, i11);
            j11 += (long) i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m100879b(InputStream inputStream, byte[] bArr, int i11, int i12) throws IOException {
        C45708h.m100896g(inputStream);
        C45708h.m100896g(bArr);
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                int i14 = inputStream.read(bArr, i11 + i13, i12 - i13);
                if (i14 == -1) {
                    break;
                }
                i13 += i14;
            }
            return i13;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
