package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: renamed from: com.geetest.gtc4.q2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6854q2 extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11472a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6854q2) {
            return Arrays.equals(this.f11472a, ((C6854q2) abstractC6905w).f11472a);
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
        return AbstractC6834o0.m12688b(this.f11472a);
    }

    public final String toString() {
        byte[] bArr = this.f11472a;
        int i11 = AbstractC6832n7.f11444a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = AbstractC6859q7.f11475a;
        int length2 = bArr.length;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i12 < length2) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 < 0) {
                short s11 = AbstractC6859q7.f11475a[b11 & 127];
                int i15 = s11 >>> 8;
                byte b12 = (byte) s11;
                while (true) {
                    if (b12 >= 0) {
                        if (i14 < length2) {
                            int i16 = i14 + 1;
                            byte b13 = bArr[i14];
                            i15 = (i15 << 6) | (b13 & 63);
                            b12 = AbstractC6859q7.f11476b[b12 + ((b13 & 255) >>> 4)];
                            i14 = i16;
                        }
                    } else if (b12 != -2) {
                        if (i15 <= 65535) {
                            if (i13 < length) {
                                cArr[i13] = (char) i15;
                                i13++;
                                i12 = i14;
                            }
                        } else if (i13 < length - 1) {
                            int i17 = i13 + 1;
                            cArr[i13] = (char) ((i15 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            i13 += 2;
                            cArr[i17] = (char) ((i15 & 1023) | Utf8.LOG_SURROGATE_HEADER);
                            i12 = i14;
                        }
                    }
                    i13 = -1;
                    break;
                }
            }
            if (i13 >= length) {
                i13 = -1;
                break;
            }
            cArr[i13] = (char) b11;
            i12 = i14;
            i13++;
        }
        if (i13 >= 0) {
            return new String(cArr, 0, i13);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public C6854q2(byte[] bArr) {
        this.f11472a = bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11472a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 12, this.f11472a);
    }
}
