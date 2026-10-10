package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.e1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6745e1 extends AbstractC6869s {

    /* JADX INFO: renamed from: d */
    public final int f11344d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6869s[] f11345e;

    public C6745e1(AbstractC6869s[] abstractC6869sArr) {
        super(m12628a(abstractC6869sArr));
        this.f11345e = abstractC6869sArr;
        this.f11344d = 1000;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12628a(AbstractC6869s[] abstractC6869sArr) {
        int length = abstractC6869sArr.length;
        if (length == 0) {
            return AbstractC6869s.f11486c;
        }
        if (length == 1) {
            return abstractC6869sArr[0].f11487a;
        }
        int length2 = 0;
        for (AbstractC6869s abstractC6869s : abstractC6869sArr) {
            length2 += abstractC6869s.f11487a.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (AbstractC6869s abstractC6869s2 : abstractC6869sArr) {
            byte[] bArr2 = abstractC6869s2.f11487a;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return true;
    }

    public C6745e1(byte[] bArr) {
        super(bArr);
        this.f11345e = null;
        this.f11344d = 1000;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int iMo12612a = z11 ? 4 : 3;
        if (this.f11345e == null) {
            int length = this.f11487a.length;
            int i11 = this.f11344d;
            int i12 = length / i11;
            int iM12720a = ((C6887u.m12720a(i11) + 1 + i11) * i12) + iMo12612a;
            int length2 = this.f11487a.length - (i12 * this.f11344d);
            return length2 > 0 ? C6887u.m12720a(length2) + 1 + length2 + iM12720a : iM12720a;
        }
        int i13 = 0;
        while (true) {
            AbstractC6869s[] abstractC6869sArr = this.f11345e;
            if (i13 >= abstractC6869sArr.length) {
                return iMo12612a;
            }
            iMo12612a += abstractC6869sArr[i13].mo12612a(true);
            i13++;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12722a(z11, 36);
        c6887u.f11520a.write(128);
        AbstractC6869s[] abstractC6869sArr = this.f11345e;
        if (abstractC6869sArr == null) {
            int i11 = 0;
            while (true) {
                byte[] bArr = this.f11487a;
                if (i11 >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i11, this.f11344d);
                byte[] bArr2 = this.f11487a;
                c6887u.m12722a(true, 4);
                c6887u.m12726b(iMin);
                c6887u.f11520a.write(bArr2, i11, iMin);
                i11 += iMin;
            }
        } else {
            c6887u.mo12668a((AbstractC6905w[]) abstractC6869sArr);
        }
        c6887u.f11520a.write(0);
        c6887u.f11520a.write(0);
    }
}
