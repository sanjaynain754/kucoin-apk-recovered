package dh0;

import org.aspectj.lang.InterfaceC43177c;

/* JADX INFO: renamed from: dh0.a */
/* JADX INFO: compiled from: CodeSignatureImpl.java */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC36685a extends AbstractC36688d implements InterfaceC43177c {

    /* JADX INFO: renamed from: k */
    public Class[] f79542k;

    /* JADX INFO: renamed from: l */
    public String[] f79543l;

    /* JADX INFO: renamed from: m */
    public Class[] f79544m;

    /* JADX INFO: renamed from: l */
    public Class[] m82119l() {
        if (this.f79544m == null) {
            this.f79544m = m82143e(5);
        }
        return this.f79544m;
    }

    /* JADX INFO: renamed from: m */
    public Class[] m82120m() {
        if (this.f79542k == null) {
            this.f79542k = m82143e(3);
        }
        return this.f79542k;
    }

    public AbstractC36685a(int i11, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i11, str, cls);
        this.f79542k = clsArr;
        this.f79543l = strArr;
        this.f79544m = clsArr2;
    }
}
