package com.geetest.gtc4;

import java.io.IOException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.geetest.gtc4.d2 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6737d2 extends C6797k {
    @Override // com.geetest.gtc4.C6797k, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final int mo12612a(boolean z11) {
        int length = m12625i().length;
        return AbstractC6734d.m12622a(length, z11 ? 1 : 0, length);
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m12625i() {
        byte[] bArr = this.f11417a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!m12664a(10) || !m12664a(11)) {
            byte[] bArr2 = this.f11417a;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            int i11 = AbstractC6832n7.f11444a;
            byte[] bArr4 = new byte[5];
            for (int i12 = 0; i12 != 5; i12++) {
                bArr4[i12] = (byte) "0000Z".charAt(i12);
            }
            System.arraycopy(bArr4, 0, bArr3, this.f11417a.length - 1, 5);
            return bArr3;
        }
        if (!m12664a(12) || !m12664a(13)) {
            byte[] bArr5 = this.f11417a;
            byte[] bArr6 = new byte[bArr5.length + 2];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length - 1);
            int i13 = AbstractC6832n7.f11444a;
            byte[] bArr7 = new byte[3];
            for (int i14 = 0; i14 != 3; i14++) {
                bArr7[i14] = (byte) "00Z".charAt(i14);
            }
            System.arraycopy(bArr7, 0, bArr6, this.f11417a.length - 1, 3);
            return bArr6;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr8 = this.f11417a;
            if (i15 == bArr8.length) {
                return bArr8;
            }
            if (bArr8[i15] == 46 && i15 == 14) {
                int length = bArr8.length - 2;
                while (length > 0 && this.f11417a[length] == 48) {
                    length--;
                }
                byte[] bArr9 = this.f11417a;
                if (bArr9[length] == 46) {
                    byte[] bArr10 = new byte[length + 1];
                    System.arraycopy(bArr9, 0, bArr10, 0, length);
                    bArr10[length] = BuiltinOptions.MatrixSetDiagOptions;
                    return bArr10;
                }
                byte[] bArr11 = new byte[length + 2];
                int i16 = length + 1;
                System.arraycopy(bArr9, 0, bArr11, 0, i16);
                bArr11[i16] = BuiltinOptions.MatrixSetDiagOptions;
                return bArr11;
            }
            i15++;
        }
    }

    public C6737d2(byte[] bArr) {
        super(bArr);
    }

    @Override // com.geetest.gtc4.C6797k, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final void mo12613a(C6887u c6887u, boolean z11) throws IOException {
        c6887u.m12723a(z11, 24, m12625i());
    }

    @Override // com.geetest.gtc4.C6797k, com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public final AbstractC6905w mo12600g() {
        return this;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public final AbstractC6905w mo12601h() {
        return this;
    }
}
