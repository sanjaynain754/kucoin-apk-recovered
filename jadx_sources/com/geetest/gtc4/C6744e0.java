package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.geetest.gtc4.e0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6744e0 extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11343a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11343a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11343a);
    }

    public final String toString() {
        return AbstractC6832n7.m12686a(this.f11343a);
    }

    public C6744e0(byte[] bArr) {
        byte b11;
        byte b12;
        if (bArr.length >= 2) {
            this.f11343a = bArr;
            if (bArr.length > 0 && (b11 = bArr[0]) >= 48 && b11 <= 57 && bArr.length > 1 && (b12 = bArr[1]) >= 48 && b12 <= 57) {
                return;
            } else {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 23, this.f11343a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6744e0) {
            return Arrays.equals(this.f11343a, ((C6744e0) abstractC6905w).f11343a);
        }
        return false;
    }
}
