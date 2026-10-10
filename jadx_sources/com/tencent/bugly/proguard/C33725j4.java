package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33725j4 implements InterfaceC33687h8 {
    @Override // com.tencent.bugly.proguard.InterfaceC33687h8
    /* JADX INFO: renamed from: a */
    public Boolean mo73255a(int i11, int i12, int i13, int i14) {
        boolean z11;
        float fM74494a = C33848p1.m74494a();
        if (i11 <= i13 * fM74494a && i12 <= i14 * fM74494a) {
            z11 = false;
        } else {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
