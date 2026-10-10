package dh0;

import ch0.InterfaceC4978a;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;

/* JADX INFO: renamed from: dh0.e */
/* JADX INFO: compiled from: MethodSignatureImpl.java */
/* JADX INFO: loaded from: classes23.dex */
public class C36689e extends AbstractC36685a implements InterfaceC4978a {

    /* JADX INFO: renamed from: n */
    public Class f79563n;

    @Override // dh0.AbstractC36690f
    /* JADX INFO: renamed from: a */
    public String mo82138a(C36692h c36692h) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c36692h.m82159e(m82147i()));
        if (c36692h.f79582b) {
            stringBuffer.append(c36692h.m82161g(m82139n()));
        }
        if (c36692h.f79582b) {
            stringBuffer.append(C33627eb.f69716f);
        }
        stringBuffer.append(c36692h.m82160f(m82144f(), m82145g()));
        stringBuffer.append(C33978va.f72339h);
        stringBuffer.append(m82148j());
        c36692h.m82155a(stringBuffer, m82120m());
        c36692h.m82156b(stringBuffer, m82119l());
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: n */
    public Class m82139n() {
        if (this.f79563n == null) {
            this.f79563n = m82142d(6);
        }
        return this.f79563n;
    }

    public C36689e(int i11, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i11, str, cls, clsArr, strArr, clsArr2);
        this.f79563n = cls2;
    }
}
