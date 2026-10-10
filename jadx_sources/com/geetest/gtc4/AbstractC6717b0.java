package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: com.geetest.gtc4.b0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6717b0 extends AbstractC6905w implements Iterable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6752f[] f11313a;

    /* JADX INFO: renamed from: b */
    public InterfaceC6752f[] f11314b;

    public AbstractC6717b0() {
        InterfaceC6752f[] interfaceC6752fArr = C6761g.f11363d;
        this.f11313a = interfaceC6752fArr;
        this.f11314b = interfaceC6752fArr;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (!(abstractC6905w instanceof AbstractC6717b0)) {
            return false;
        }
        AbstractC6717b0 abstractC6717b0 = (AbstractC6717b0) abstractC6905w;
        int length = this.f11313a.length;
        if (abstractC6717b0.f11313a.length != length) {
            return false;
        }
        C6827n2 c6827n2 = (C6827n2) mo12600g();
        C6827n2 c6827n3 = (C6827n2) abstractC6717b0.mo12600g();
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC6905w abstractC6905wMo12598d = c6827n2.f11313a[i11].mo12598d();
            AbstractC6905w abstractC6905wMo12598d2 = c6827n3.f11313a[i11].mo12598d();
            if (abstractC6905wMo12598d != abstractC6905wMo12598d2 && !abstractC6905wMo12598d.mo12606a(abstractC6905wMo12598d2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return true;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        int i11;
        if (this.f11314b == null) {
            InterfaceC6752f[] interfaceC6752fArr = (InterfaceC6752f[]) this.f11313a.clone();
            this.f11314b = interfaceC6752fArr;
            int length = interfaceC6752fArr.length;
            if (length >= 2) {
                InterfaceC6752f interfaceC6752f = interfaceC6752fArr[0];
                InterfaceC6752f interfaceC6752f2 = interfaceC6752fArr[1];
                byte[] bArrM12609a = m12609a(interfaceC6752f);
                byte[] bArrM12609a2 = m12609a(interfaceC6752f2);
                if (m12608a(bArrM12609a2, bArrM12609a)) {
                    interfaceC6752f2 = interfaceC6752f;
                    interfaceC6752f = interfaceC6752f2;
                    bArrM12609a2 = bArrM12609a;
                    bArrM12609a = bArrM12609a2;
                }
                for (int i12 = 2; i12 < length; i12++) {
                    InterfaceC6752f interfaceC6752f3 = interfaceC6752fArr[i12];
                    byte[] bArrM12609a3 = m12609a(interfaceC6752f3);
                    if (m12608a(bArrM12609a2, bArrM12609a3)) {
                        interfaceC6752fArr[i12 - 2] = interfaceC6752f;
                        interfaceC6752f = interfaceC6752f2;
                        bArrM12609a = bArrM12609a2;
                        interfaceC6752f2 = interfaceC6752f3;
                        bArrM12609a2 = bArrM12609a3;
                    } else if (m12608a(bArrM12609a, bArrM12609a3)) {
                        interfaceC6752fArr[i12 - 2] = interfaceC6752f;
                        interfaceC6752f = interfaceC6752f3;
                        bArrM12609a = bArrM12609a3;
                    } else {
                        int i13 = i12 - 1;
                        while (true) {
                            i11 = i13 - 1;
                            if (i11 <= 0) {
                                break;
                            }
                            InterfaceC6752f interfaceC6752f4 = interfaceC6752fArr[i13 - 2];
                            if (m12608a(m12609a(interfaceC6752f4), bArrM12609a3)) {
                                break;
                            }
                            interfaceC6752fArr[i11] = interfaceC6752f4;
                            i13 = i11;
                        }
                        interfaceC6752fArr[i11] = interfaceC6752f3;
                    }
                }
                interfaceC6752fArr[length - 2] = interfaceC6752f;
                interfaceC6752fArr[length - 1] = interfaceC6752f2;
            }
        }
        return new C6827n2(this.f11314b);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public AbstractC6905w mo12601h() {
        return new C6720b3(this.f11313a, this.f11314b);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public final int hashCode() {
        int length = this.f11313a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.f11313a[length].mo12598d().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC6752f[] interfaceC6752fArr = this.f11313a;
        return new C6825n0(interfaceC6752fArr.length < 1 ? C6761g.f11363d : (InterfaceC6752f[]) interfaceC6752fArr.clone());
    }

    public final String toString() {
        int length = this.f11313a.length;
        if (length == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i11 = 0;
        while (true) {
            stringBuffer.append(this.f11313a[i11]);
            i11++;
            if (i11 >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC6717b0(C6761g c6761g) {
        InterfaceC6752f[] interfaceC6752fArr;
        if (c6761g != null) {
            int i11 = c6761g.f11365b;
            if (i11 == 0) {
                interfaceC6752fArr = C6761g.f11363d;
            } else {
                InterfaceC6752f[] interfaceC6752fArr2 = c6761g.f11364a;
                if (interfaceC6752fArr2.length == i11) {
                    c6761g.f11366c = true;
                    interfaceC6752fArr = interfaceC6752fArr2;
                } else {
                    interfaceC6752fArr = new InterfaceC6752f[i11];
                    System.arraycopy(interfaceC6752fArr2, 0, interfaceC6752fArr, 0, i11);
                }
            }
            this.f11313a = interfaceC6752fArr;
            this.f11314b = interfaceC6752fArr.length >= 2 ? null : interfaceC6752fArr;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12609a(InterfaceC6752f interfaceC6752f) {
        try {
            AbstractC6905w abstractC6905wMo12598d = interfaceC6752f.mo12598d();
            abstractC6905wMo12598d.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C6800k2(byteArrayOutputStream).mo12666a(abstractC6905wMo12598d);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public AbstractC6717b0(boolean z11, InterfaceC6752f[] interfaceC6752fArr) {
        this.f11313a = interfaceC6752fArr;
        if (!z11 && interfaceC6752fArr.length >= 2) {
            interfaceC6752fArr = null;
        }
        this.f11314b = interfaceC6752fArr;
    }

    public AbstractC6717b0(InterfaceC6752f[] interfaceC6752fArr, InterfaceC6752f[] interfaceC6752fArr2) {
        this.f11313a = interfaceC6752fArr;
        this.f11314b = interfaceC6752fArr2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12608a(byte[] bArr, byte[] bArr2) {
        int i11 = bArr[0] & 223;
        int i12 = bArr2[0] & 223;
        if (i11 != i12) {
            return i11 < i12;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i13 = 1; i13 < iMin; i13++) {
            byte b11 = bArr[i13];
            byte b12 = bArr2[i13];
            if (b11 != b12) {
                return (b11 & 255) < (b12 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }
}
