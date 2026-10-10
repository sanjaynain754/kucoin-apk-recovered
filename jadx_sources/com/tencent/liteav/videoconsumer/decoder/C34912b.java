package com.tencent.liteav.videoconsumer.decoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.decoder.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34912b {

    /* JADX INFO: renamed from: b */
    int f74452b;

    /* JADX INFO: renamed from: c */
    private InputStream f74453c;

    /* JADX INFO: renamed from: d */
    private int f74454d;

    /* JADX INFO: renamed from: e */
    private int f74455e;

    /* JADX INFO: renamed from: f */
    private final OutputStream f74456f;

    /* JADX INFO: renamed from: h */
    private int f74458h;

    /* JADX INFO: renamed from: a */
    protected C34911a f74451a = new C34911a();

    /* JADX INFO: renamed from: g */
    private int[] f74457g = new int[8];

    /* JADX INFO: renamed from: c */
    private int m76572c(boolean z11) throws IOException {
        if (this.f74452b == 8) {
            m76574f();
            if (this.f74454d == -1) {
                return -1;
            }
        }
        int i11 = this.f74454d;
        int i12 = this.f74452b;
        int i13 = (i11 >> (7 - i12)) & 1;
        this.f74452b = i12 + 1;
        if (z11 && this.f74456f != null) {
            m76575f(i13);
        }
        return i13;
    }

    /* JADX INFO: renamed from: e */
    private long m76573e(int i11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long jM76572c = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            jM76572c = (jM76572c << 1) | ((long) m76572c(true));
        }
        return jM76572c;
    }

    /* JADX INFO: renamed from: f */
    private void m76574f() throws IOException {
        this.f74454d = this.f74455e;
        this.f74455e = this.f74453c.read();
        this.f74452b = 0;
    }

    /* JADX INFO: renamed from: g */
    private int m76576g() throws IOException {
        int i11 = 0;
        while (m76572c(true) == 0) {
            i11++;
        }
        if (i11 <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i11) - 1)) + m76573e(i11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76580a(boolean z11) throws IOException {
        return m76572c(z11) == 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m76582b(int i11) throws IOException {
        m76579a(i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m76586d() throws IOException {
        int i11 = 0;
        while (m76572c(true) == 0) {
            i11++;
        }
        if (i11 > 0) {
            m76579a(i11);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m76577h() throws IOException {
        int[] iArr = this.f74457g;
        this.f74456f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    /* JADX INFO: renamed from: a */
    public final long m76578a() throws IOException {
        long jM76573e = m76573e(8);
        String.valueOf(jM76573e);
        return jM76573e;
    }

    /* JADX INFO: renamed from: b */
    public final int m76581b() throws IOException {
        int i11 = 0;
        while (m76572c(false) == 0) {
            i11++;
        }
        if (i11 <= 0) {
            return 0;
        }
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long jM76572c = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            jM76572c = (jM76572c << 1) | ((long) m76572c(false));
        }
        return (int) (((long) ((1 << i11) - 1)) + jM76572c);
    }

    public C34912b(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f74453c = inputStream;
        this.f74456f = outputStream;
        this.f74454d = inputStream.read();
        this.f74455e = inputStream.read();
    }

    /* JADX INFO: renamed from: d */
    public final void m76587d(int i11) throws IOException {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 15) {
            int i15 = (1 << i13) + i14;
            if (i11 < i15) {
                i12 = i13;
                break;
            } else {
                i13++;
                i14 = i15;
            }
        }
        m76571a(0L, i12);
        m76575f(1);
        m76571a(i11 - i14, i12);
    }

    /* JADX INFO: renamed from: e */
    public final void m76588e() throws IOException {
        m76575f(1);
        m76571a(0L, 8 - this.f74458h);
        for (int i11 = this.f74458h; i11 < 8; i11++) {
            this.f74457g[i11] = 0;
        }
        this.f74458h = 0;
        m76577h();
    }

    /* JADX INFO: renamed from: f */
    private void m76575f(int i11) throws IOException {
        if (this.f74458h == 8) {
            this.f74458h = 0;
            m76577h();
        }
        int[] iArr = this.f74457g;
        int i12 = this.f74458h;
        this.f74458h = i12 + 1;
        iArr[i12] = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m76579a(int i11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            m76572c(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76583b(boolean z11) throws IOException {
        m76575f(z11 ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    private void m76571a(long j11, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            m76575f(((int) (j11 >> ((i11 - i12) - 1))) & 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m76584c() throws IOException {
        int iM76576g = m76576g();
        String.valueOf(iM76576g);
        return iM76576g;
    }

    /* JADX INFO: renamed from: c */
    public final void m76585c(int i11) throws IOException {
        int[] iArr = new int[i11];
        int i12 = 8;
        int i13 = 8;
        for (int i14 = 0; i14 < i11; i14++) {
            if (i12 != 0) {
                int iM76576g = m76576g();
                int i15 = iM76576g & 1;
                int i16 = ((iM76576g >> 1) + i15) * ((i15 << 1) - 1);
                String.valueOf(i16);
                i12 = ((i16 + i13) + 256) % 256;
            }
            if (i12 != 0) {
                i13 = i12;
            }
            iArr[i14] = i13;
        }
    }
}
