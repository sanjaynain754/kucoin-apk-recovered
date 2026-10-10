package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.r2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6863r2 extends AbstractC6905w {

    /* JADX INFO: renamed from: b */
    public static final char[] f11477b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final byte[] f11478a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11478a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11478a);
    }

    public final String toString() {
        int i11;
        int length = this.f11478a.length;
        StringBuffer stringBuffer = new StringBuffer(((C6887u.m12720a(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            char[] cArr = f11477b;
            stringBuffer.append(cArr[(length >>> 4) & 15]);
            stringBuffer.append(cArr[length & 15]);
        } else {
            byte[] bArr = new byte[5];
            int i12 = length;
            int i13 = 5;
            while (true) {
                i11 = i13 - 1;
                bArr[i11] = (byte) i12;
                i12 >>>= 8;
                if (i12 == 0) {
                    break;
                }
                i13 = i11;
            }
            int i14 = i13 - 2;
            bArr[i14] = (byte) (128 | (5 - i11));
            while (true) {
                int i15 = i14 + 1;
                byte b11 = bArr[i14];
                char[] cArr2 = f11477b;
                stringBuffer.append(cArr2[(b11 >>> 4) & 15]);
                stringBuffer.append(cArr2[b11 & 15]);
                if (i15 >= 5) {
                    break;
                }
                i14 = i15;
            }
        }
        for (int i16 = 0; i16 < length; i16++) {
            byte b12 = this.f11478a[i16];
            char[] cArr3 = f11477b;
            stringBuffer.append(cArr3[(b12 >>> 4) & 15]);
            stringBuffer.append(cArr3[b12 & 15]);
        }
        return stringBuffer.toString();
    }

    public C6863r2(byte[] bArr) {
        this.f11478a = bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 28, this.f11478a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6863r2) {
            return Arrays.equals(this.f11478a, ((C6863r2) abstractC6905w).f11478a);
        }
        return false;
    }
}
