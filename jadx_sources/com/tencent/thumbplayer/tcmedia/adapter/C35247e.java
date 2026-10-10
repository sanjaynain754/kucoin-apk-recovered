package com.tencent.thumbplayer.tcmedia.adapter;

import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import com.tencent.thumbplayer.tcmedia.tplayer.C35383a;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.e */
/* JADX INFO: loaded from: classes62.dex */
public class C35247e {
    /* JADX INFO: renamed from: a */
    public static InterfaceC35230a m77761a(C35352b c35352b, C35383a c35383a) {
        if (TPPlayerConfig.getNewReportEnable()) {
            return (InterfaceC35230a) new C35248f(new C35246d(c35383a.m78352a(), c35352b), c35383a).m77777a();
        }
        return new C35246d(c35383a.m78352a(), c35352b);
    }
}
