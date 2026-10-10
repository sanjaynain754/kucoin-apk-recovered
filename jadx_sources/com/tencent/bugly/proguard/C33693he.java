package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.he */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33693he extends AbstractC33554b1 {

    /* JADX INFO: renamed from: b */
    public final String[] f70119b;

    @Override // com.tencent.bugly.proguard.InterfaceC34056z8
    /* JADX INFO: renamed from: a */
    public boolean mo72925a(String str) {
        for (String str2 : this.f70119b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public C33693he(int i11, String... strArr) {
        super(i11);
        this.f70119b = strArr;
    }
}
