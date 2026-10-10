package com.geetest.gtc4;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.geetest.gtc4.n */
/* JADX INFO: loaded from: classes45.dex */
public final class C6824n extends AbstractC6905w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11439a;

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = this.f11439a.length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return false;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        return AbstractC6834o0.m12688b(this.f11439a);
    }

    public final String toString() {
        return new BigInteger(this.f11439a).toString();
    }

    public C6824n(byte[] bArr) {
        if (!m12685a(bArr)) {
            this.f11439a = bArr;
            int length = bArr.length - 1;
            int i11 = 0;
            while (i11 < length) {
                byte b11 = bArr[i11];
                i11++;
                if (b11 != (bArr[i11] >> 7)) {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 2, this.f11439a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (abstractC6905w instanceof C6824n) {
            return Arrays.equals(this.f11439a, ((C6824n) abstractC6905w).f11439a);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12685a(byte[] bArr) {
        Map map;
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1 && bArr[0] == (bArr[1] >> 7)) {
            ThreadLocal threadLocal = AbstractC6849p6.f11468a;
            try {
                String str = (String) AccessController.doPrivileged(new C6831n6());
                if (str == null && ((map = (Map) AbstractC6849p6.f11468a.get()) == null || (str = (String) map.get("com.geetest.gtc4.asn1.allow_unsafe_integer")) == null)) {
                    str = (String) AccessController.doPrivileged(new C6840o6());
                }
                if (str == null || str.length() != 4 || ((str.charAt(0) != 't' && str.charAt(0) != 'T') || ((str.charAt(1) != 'r' && str.charAt(1) != 'R') || ((str.charAt(2) != 'u' && str.charAt(2) != 'U') || (str.charAt(3) != 'e' && str.charAt(3) != 'E'))))) {
                    return true;
                }
            } catch (AccessControlException unused) {
            }
        }
        return false;
    }
}
