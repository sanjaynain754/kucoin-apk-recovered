package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.k */
/* JADX INFO: loaded from: classes45.dex */
public class C6797k extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11417a;

    /* JADX INFO: renamed from: a */
    public final boolean m12664a(int i11) {
        byte b11;
        byte[] bArr = this.f11417a;
        return bArr.length > i11 && (b11 = bArr[i11]) >= 48 && b11 <= 57;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public int mo12612a(boolean z11) {
        int length = this.f11417a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return new C6737d2(this.f11417a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11417a);
    }

    public C6797k(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f11417a = bArr;
            if (m12664a(0) && m12664a(1) && m12664a(2) && m12664a(3)) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 24, this.f11417a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6797k) {
            return Arrays.equals(this.f11417a, ((C6797k) abstractC6905w).f11417a);
        }
        return false;
    }
}
