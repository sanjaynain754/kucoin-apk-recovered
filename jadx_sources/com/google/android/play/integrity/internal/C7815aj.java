package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.aj */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7815aj implements InterfaceC7819an {

    /* JADX INFO: renamed from: a */
    private static final Object f12108a = new Object();

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC7819an f12109b;

    /* JADX INFO: renamed from: c */
    private volatile Object f12110c = f12108a;

    /* JADX INFO: renamed from: b */
    public static InterfaceC7819an m13303b(InterfaceC7819an interfaceC7819an) {
        return interfaceC7819an instanceof C7815aj ? interfaceC7819an : new C7815aj(interfaceC7819an);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7819an
    /* JADX INFO: renamed from: a */
    public final Object mo13217a() {
        Object objMo13217a;
        Object obj = this.f12110c;
        Object obj2 = f12108a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo13217a = this.f12110c;
                if (objMo13217a == obj2) {
                    objMo13217a = this.f12109b.mo13217a();
                    Object obj3 = this.f12110c;
                    if (obj3 != obj2 && obj3 != objMo13217a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo13217a + ". This is likely due to a circular dependency.");
                    }
                    this.f12110c = objMo13217a;
                    this.f12109b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objMo13217a;
    }

    private C7815aj(InterfaceC7819an interfaceC7819an) {
        this.f12109b = interfaceC7819an;
    }
}
