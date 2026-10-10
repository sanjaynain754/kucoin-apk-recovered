package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.rmonitor.base.meta.BaseInfo;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33601d6 extends AbstractC34048z0 implements InterfaceC33604d9 {

    /* JADX INFO: renamed from: i */
    public static final String f69508i = "RMonitor_FdLeak_FdHeapDumper";

    /* JADX INFO: renamed from: j */
    public static boolean f69509j;

    /* JADX INFO: renamed from: h */
    public final InterfaceC33625e9 f69510h = C33915s7.m74925a();

    @Override // com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: a */
    public int mo72778a() {
        return 3;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34048z0
    /* JADX INFO: renamed from: c */
    public C33706i6 mo72780c(String str) {
        InterfaceC33625e9 interfaceC33625e9 = this.f69510h;
        if (interfaceC33625e9 == null) {
            return m75568a(109);
        }
        if (f69509j && !(interfaceC33625e9 instanceof ForkJvmHeapDumper)) {
            return m75568a(102);
        }
        C33895r7 c33895r7 = new C33895r7(C33664g6.m73158h(), C33664g6.m73154d().f70931o, "");
        c33895r7.f71618d = this;
        int iMo72144a = this.f69510h.mo72144a(str, c33895r7);
        if (iMo72144a != 0) {
            return m75568a(iMo72144a);
        }
        m72781c();
        return m75570a(str, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m72777a(boolean z11) {
        f69509j = z11;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33604d9
    /* JADX INFO: renamed from: a */
    public void mo72779a(Exception exc) {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        if (sharedPreferences != null) {
            int i11 = sharedPreferences.getInt(InterfaceC33953u5.f72200G, 0) + 1;
            sharedPreferences.edit().putInt(InterfaceC33953u5.f72200G, i11).apply();
            C33648fb.m73045d(f69508i, "onHeapDumpException count=" + i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m72781c() {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(InterfaceC33953u5.f72200G, 0).apply();
        }
    }
}
