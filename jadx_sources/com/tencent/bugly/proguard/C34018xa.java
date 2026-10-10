package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.rmonitor.manager.LinkDataDBCacheMngImpl;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34018xa {
    /* JADX INFO: renamed from: a */
    public static void m75452a(Context context, String str) {
        if (C33598d3.m72772c() == null) {
            C33598d3.m72770a(context);
        }
        C33588ce c33588ceM72684b = C33588ce.m72684b();
        if (c33588ceM72684b.mo72362a() == null) {
            c33588ceM72684b.mo72363a(new LinkDataDBCacheMngImpl(str));
        }
    }
}
