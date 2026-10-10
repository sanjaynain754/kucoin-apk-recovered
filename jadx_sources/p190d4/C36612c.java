package p190d4;

import java.io.IOException;
import java.io.InputStream;
import p712w3.C45708h;

/* JADX INFO: renamed from: d4.c */
/* JADX INFO: compiled from: StreamUtil.java */
/* JADX INFO: loaded from: classes34.dex */
public class C36612c {
    /* JADX INFO: renamed from: a */
    public static long m81931a(InputStream inputStream, long j11) throws IOException {
        boolean z11;
        C45708h.m100896g(inputStream);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        long j12 = j11;
        while (j12 > 0) {
            long jSkip = inputStream.skip(j12);
            if (jSkip <= 0) {
                if (inputStream.read() != -1) {
                    jSkip = 1;
                } else {
                    return j11 - j12;
                }
            }
            j12 -= jSkip;
        }
        return j11;
    }
}
