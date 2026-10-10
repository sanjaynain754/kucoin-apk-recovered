package com.tencent.bugly.proguard;

import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ba */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33563ba {
    /* JADX INFO: renamed from: a */
    public static void m72493a(String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C34012x4.m75437b("post u3d fail args null", new Object[0]);
        }
        C34012x4.m75442d("post u3d crash %s %s", str, str2);
        C33810n5.m74236c(Thread.currentThread(), 4, str, str2, str3, map);
    }

    /* JADX INFO: renamed from: a */
    public static void m72492a(int i11, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C34012x4.m75437b("post cocos2d-x fail args null", new Object[0]);
        } else if (i11 != 5 && i11 != 6) {
            C34012x4.m75437b("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i11));
        } else {
            C34012x4.m75442d("post cocos2d-x crash %s %s", str, str2);
            C33810n5.m74236c(Thread.currentThread(), i11, str, str2, str3, map);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72494a(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str != null && str2 != null && str3 != null) {
            C34012x4.m75442d("post h5 crash %s %s", str, str2);
            C33810n5.m74236c(thread, 8, str, str2, str3, map);
        } else {
            C34012x4.m75437b("post h5 fail args null", new Object[0]);
        }
    }
}
