package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33621e5 extends AbstractC33554b1 {

    /* JADX INFO: renamed from: b */
    public final String[] f69695b;

    @Override // com.tencent.bugly.proguard.InterfaceC34056z8
    /* JADX INFO: renamed from: a */
    public boolean mo72925a(String str) {
        for (String str2 : this.f69695b) {
            if (C33839od.m74441a(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public C33621e5(int i11, String... strArr) {
        super(i11);
        this.f69695b = strArr;
    }
}
