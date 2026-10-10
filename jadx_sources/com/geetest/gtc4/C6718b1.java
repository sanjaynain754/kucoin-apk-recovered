package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.b1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6718b1 extends AbstractC6716b {

    /* JADX INFO: renamed from: d */
    public final int f11315d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6716b[] f11316e;

    public C6718b1(byte[] bArr, int i11) {
        super(bArr, i11);
        this.f11316e = null;
        this.f11315d = 1000;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12611a(AbstractC6716b[] abstractC6716bArr) {
        int length = abstractC6716bArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC6716bArr[0].f11312a;
        }
        int i11 = length - 1;
        int length2 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = abstractC6716bArr[i12].f11312a;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC6716bArr[i11].f11312a;
        byte b11 = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b11;
        int i13 = 1;
        for (AbstractC6716b abstractC6716b : abstractC6716bArr) {
            byte[] bArr4 = abstractC6716b.f11312a;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i13, length3);
            i13 += length3;
        }
        return bArr3;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return this.f11316e != null || this.f11312a.length > this.f11315d;
    }

    public C6718b1(AbstractC6716b[] abstractC6716bArr) {
        super(m12611a(abstractC6716bArr));
        this.f11316e = abstractC6716bArr;
        this.f11315d = 1000;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        if (!mo12610f()) {
            int length = this.f11312a.length;
            return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
        }
        int iMo12612a = z11 ? 4 : 3;
        if (this.f11316e == null) {
            byte[] bArr = this.f11312a;
            if (bArr.length < 2) {
                return iMo12612a;
            }
            int length2 = bArr.length - 2;
            int i11 = this.f11315d;
            int i12 = length2 / (i11 - 1);
            int iM12720a = ((C6887u.m12720a(i11) + 1 + i11) * i12) + iMo12612a;
            int length3 = this.f11312a.length - ((this.f11315d - 1) * i12);
            return C6887u.m12720a(length3) + 1 + length3 + iM12720a;
        }
        int i13 = 0;
        while (true) {
            AbstractC6716b[] abstractC6716bArr = this.f11316e;
            if (i13 >= abstractC6716bArr.length) {
                return iMo12612a;
            }
            iMo12612a += abstractC6716bArr[i13].mo12612a(true);
            i13++;
        }
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        if (!mo12610f()) {
            byte[] bArr = this.f11312a;
            int length = bArr.length;
            c6887u.m12722a(z11, 3);
            c6887u.m12726b(length);
            c6887u.f11520a.write(bArr, 0, length);
            return;
        }
        c6887u.m12722a(z11, 35);
        c6887u.f11520a.write(128);
        AbstractC6716b[] abstractC6716bArr = this.f11316e;
        if (abstractC6716bArr != null) {
            c6887u.mo12668a((AbstractC6905w[]) abstractC6716bArr);
        } else {
            byte[] bArr2 = this.f11312a;
            if (bArr2.length >= 2) {
                byte b11 = bArr2[0];
                int length2 = bArr2.length;
                int i11 = length2 - 1;
                int i12 = this.f11315d;
                int i13 = i12 - 1;
                while (i11 > i13) {
                    c6887u.m12722a(true, 3);
                    c6887u.m12726b(i12);
                    c6887u.f11520a.write(0);
                    c6887u.f11520a.write(this.f11312a, length2 - i11, i13);
                    i11 -= i13;
                }
                c6887u.m12722a(true, 3);
                c6887u.m12726b(i11 + 1);
                c6887u.f11520a.write(b11);
                c6887u.f11520a.write(this.f11312a, length2 - i11, i11);
            }
        }
        c6887u.f11520a.write(0);
        c6887u.f11520a.write(0);
    }
}
