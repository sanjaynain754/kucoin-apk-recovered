package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.h */
/* JADX INFO: loaded from: classes45.dex */
public final class C6770h extends AbstractC6905w {

    /* JADX INFO: renamed from: b */
    public static final C6770h[] f11375b = new C6770h[12];

    /* JADX INFO: renamed from: a */
    public final byte[] f11376a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11376a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11376a);
    }

    public C6770h(byte[] bArr, boolean z11) {
        byte[] bArrM12687a;
        if (!C6824n.m12685a(bArr)) {
            int i11 = 0;
            if ((bArr[0] & 128) == 0) {
                if (z11) {
                    bArrM12687a = AbstractC6834o0.m12687a(bArr);
                } else {
                    bArrM12687a = bArr;
                }
                this.f11376a = bArrM12687a;
                int length = bArr.length - 1;
                while (i11 < length) {
                    byte b11 = bArr[i11];
                    i11++;
                    if (b11 != (bArr[i11] >> 7)) {
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 10, this.f11376a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6770h) {
            return Arrays.equals(this.f11376a, ((C6770h) abstractC6905w).f11376a);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static C6770h m12653a(byte[] bArr, boolean z11) {
        if (bArr.length > 1) {
            return new C6770h(bArr, z11);
        }
        if (bArr.length != 0) {
            int i11 = bArr[0] & 255;
            C6770h[] c6770hArr = f11375b;
            if (i11 >= 12) {
                return new C6770h(bArr, z11);
            }
            C6770h c6770h = c6770hArr[i11];
            if (c6770h != null) {
                return c6770h;
            }
            C6770h c6770h2 = new C6770h(bArr, z11);
            c6770hArr[i11] = c6770h2;
            return c6770h2;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }
}
