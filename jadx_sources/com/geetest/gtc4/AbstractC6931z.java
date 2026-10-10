package com.geetest.gtc4;

import java.util.Iterator;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: com.geetest.gtc4.z */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6931z extends AbstractC6905w implements Iterable {

    /* JADX INFO: renamed from: a */
    public InterfaceC6752f[] f11562a;

    public AbstractC6931z() {
        this.f11562a = C6761g.f11363d;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC6752f mo12672a(int i11) {
        return this.f11562a[i11];
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: f */
    public final boolean mo12610f() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract AbstractC6716b mo12636l();

    /* JADX INFO: renamed from: m */
    public abstract AbstractC6869s mo12637m();

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: a */
    public final boolean mo12606a(AbstractC6905w abstractC6905w) {
        if (!(abstractC6905w instanceof AbstractC6931z)) {
            return false;
        }
        AbstractC6931z abstractC6931z = (AbstractC6931z) abstractC6905w;
        int iMo12673k = mo12673k();
        if (abstractC6931z.mo12673k() != iMo12673k) {
            return false;
        }
        for (int i11 = 0; i11 < iMo12673k; i11++) {
            AbstractC6905w abstractC6905wMo12598d = this.f11562a[i11].mo12598d();
            AbstractC6905w abstractC6905wMo12598d2 = abstractC6931z.f11562a[i11].mo12598d();
            if (abstractC6905wMo12598d != abstractC6905wMo12598d2 && !abstractC6905wMo12598d.mo12606a(abstractC6905wMo12598d2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: g */
    public AbstractC6905w mo12600g() {
        return new C6818m2(this.f11562a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    /* JADX INFO: renamed from: h */
    public AbstractC6905w mo12601h() {
        return new C6934z2(this.f11562a);
    }

    @Override // com.geetest.gtc4.AbstractC6905w
    public int hashCode() {
        int length = this.f11562a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f11562a[length].mo12598d().hashCode();
        }
    }

    public Iterator iterator() {
        return new C6825n0(this.f11562a);
    }

    /* JADX INFO: renamed from: k */
    public int mo12673k() {
        return this.f11562a.length;
    }

    public AbstractC6931z(AbstractC6905w abstractC6905w) {
        if (abstractC6905w != null) {
            this.f11562a = new InterfaceC6752f[]{abstractC6905w};
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC6716b[] m12744i() {
        InterfaceC6752f interfaceC6752fMo12598d;
        int iMo12673k = mo12673k();
        AbstractC6716b[] abstractC6716bArr = new AbstractC6716b[iMo12673k];
        for (int i11 = 0; i11 < iMo12673k; i11++) {
            InterfaceC6752f interfaceC6752f = this.f11562a[i11];
            if (interfaceC6752f != null && !(interfaceC6752f instanceof AbstractC6716b)) {
                interfaceC6752fMo12598d = interfaceC6752f.mo12598d();
                if (!(interfaceC6752fMo12598d instanceof AbstractC6716b)) {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC6752f.getClass().getName()));
                }
            } else {
                interfaceC6752fMo12598d = interfaceC6752f;
            }
            abstractC6716bArr[i11] = (AbstractC6716b) interfaceC6752fMo12598d;
        }
        return abstractC6716bArr;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC6869s[] m12745j() {
        InterfaceC6752f interfaceC6752fMo12598d;
        int iMo12673k = mo12673k();
        AbstractC6869s[] abstractC6869sArr = new AbstractC6869s[iMo12673k];
        for (int i11 = 0; i11 < iMo12673k; i11++) {
            InterfaceC6752f interfaceC6752f = this.f11562a[i11];
            if (interfaceC6752f != null && !(interfaceC6752f instanceof AbstractC6869s)) {
                interfaceC6752fMo12598d = interfaceC6752f.mo12598d();
                if (!(interfaceC6752fMo12598d instanceof AbstractC6869s)) {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC6752f.getClass().getName()));
                }
            } else {
                interfaceC6752fMo12598d = interfaceC6752f;
            }
            abstractC6869sArr[i11] = (AbstractC6869s) interfaceC6752fMo12598d;
        }
        return abstractC6869sArr;
    }

    public final String toString() {
        int iMo12673k = mo12673k();
        if (iMo12673k == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i11 = 0;
        while (true) {
            stringBuffer.append(this.f11562a[i11]);
            i11++;
            if (i11 >= iMo12673k) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC6931z(C6761g c6761g) {
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
            this.f11562a = interfaceC6752fArr;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public AbstractC6931z(InterfaceC6752f[] interfaceC6752fArr) {
        this.f11562a = interfaceC6752fArr;
    }
}
