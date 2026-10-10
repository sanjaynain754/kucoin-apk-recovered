package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33721j0 extends AbstractC33596d1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC33793m9[] f70310c;

    public C33721j0(C33565bc c33565bc) {
        this(c33565bc, new InterfaceC33793m9[]{new C33762l(c33565bc), new C33636f(c33565bc), new C33623e7(c33565bc)});
    }

    public C33721j0(C33565bc c33565bc, InterfaceC33793m9[] interfaceC33793m9Arr) {
        super(c33565bc);
        this.f70310c = interfaceC33793m9Arr;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: b */
    public boolean mo72930b() {
        for (InterfaceC33793m9 interfaceC33793m9 : this.f70310c) {
            if (interfaceC33793m9.mo72765a()) {
                interfaceC33793m9.mo72930b();
            }
        }
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33793m9
    /* JADX INFO: renamed from: c */
    public void mo72931c() {
        for (InterfaceC33793m9 interfaceC33793m9 : this.f70310c) {
            interfaceC33793m9.mo72931c();
        }
    }
}
