package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.C35184a;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.p0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33847p0 implements InterfaceC33624e8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC33624e8 f71355a;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.p0$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C33847p0 f71356a = new C33847p0();
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC33624e8 m74492a() {
        return b.f71356a;
    }

    public C33847p0() {
        try {
            this.f71355a = (InterfaceC33624e8) C35184a.class.newInstance();
        } catch (Throwable th2) {
            try {
                Logger.INSTANCE.exception("", "init atta report fail", th2);
            } finally {
                this.f71355a = null;
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33624e8
    /* JADX INFO: renamed from: a */
    public void mo72932a(String str, int i11, int i12, long j11) {
        InterfaceC33624e8 interfaceC33624e8 = this.f71355a;
        if (interfaceC33624e8 != null) {
            interfaceC33624e8.mo72932a(str, i11, i12, j11);
        }
    }
}
