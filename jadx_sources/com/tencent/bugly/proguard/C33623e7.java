package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33623e7 extends AbstractC33596d1 implements InterfaceC33562b9 {

    /* JADX INFO: renamed from: c */
    public static final String f69699c = "RMonitor_memory_FragmentWatcher";

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: b */
    public boolean mo72930b() {
        C33602d7.c.f69516a.m72784a(this);
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: c */
    public void mo72931c() {
        C33602d7.c.f69516a.m72786b(this);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentDestroyed(Object obj) {
        if (obj != null) {
            this.f69484b.m72507c(obj, "");
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentViewDestroyed(Object obj) {
        if (obj != null) {
            this.f69484b.m72507c(obj, "");
        }
    }

    public C33623e7(C33565bc c33565bc) {
        super(c33565bc);
    }

    @Override // com.tencent.bugly.proguard.AbstractC33596d1, com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: a */
    public boolean mo72765a() {
        return C34019xb.m75457e().m72828f();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentPreAttached(Object obj) {
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33562b9
    public void onFragmentResumed(Object obj) {
    }
}
