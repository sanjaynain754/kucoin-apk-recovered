package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.y1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6925y1 extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final char[] f11559a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6925y1) {
            return Arrays.equals(this.f11559a, ((C6925y1) abstractC6905w).f11559a);
        }
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        char[] cArr = this.f11559a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return new String(this.f11559a);
    }

    public C6925y1(char[] cArr) {
        this.f11559a = cArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11559a.length * 2;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        int length = this.f11559a.length;
        c6887u.m12722a(z11, 30);
        c6887u.m12726b(length * 2);
        byte[] bArr = new byte[8];
        int i11 = length & (-4);
        int i12 = 0;
        while (i12 < i11) {
            char[] cArr = this.f11559a;
            char c11 = cArr[i12];
            char c12 = cArr[i12 + 1];
            char c13 = cArr[i12 + 2];
            char c14 = cArr[i12 + 3];
            i12 += 4;
            bArr[0] = (byte) (c11 >> '\b');
            bArr[1] = (byte) c11;
            bArr[2] = (byte) (c12 >> '\b');
            bArr[3] = (byte) c12;
            bArr[4] = (byte) (c13 >> '\b');
            bArr[5] = (byte) c13;
            bArr[6] = (byte) (c14 >> '\b');
            bArr[7] = (byte) c14;
            c6887u.f11520a.write(bArr, 0, 8);
        }
        if (i12 < length) {
            int i13 = 0;
            do {
                char c15 = this.f11559a[i12];
                i12++;
                int i14 = i13 + 1;
                bArr[i13] = (byte) (c15 >> '\b');
                i13 += 2;
                bArr[i14] = (byte) c15;
            } while (i12 < length);
            c6887u.f11520a.write(bArr, 0, i13);
        }
    }
}
