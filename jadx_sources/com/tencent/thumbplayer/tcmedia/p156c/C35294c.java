package com.tencent.thumbplayer.tcmedia.p156c;

import android.os.Looper;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.tplayer.C35383a;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35294c {
    /* JADX INFO: renamed from: a */
    public static InterfaceC35288a m77965a(Looper looper, C35383a c35383a) {
        if (TPPlayerConfig.getNewReportEnable()) {
            return (InterfaceC35288a) new C35295d(new C35296e(c35383a.m78352a(), looper), c35383a).m77972a();
        }
        return new C35296e(c35383a.m78352a(), looper);
    }
}
