package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.k */
/* JADX INFO: loaded from: classes64.dex */
public class C35407k {
    /* JADX INFO: renamed from: a */
    public static InterfaceC35384a m78587a(int i11) {
        if (i11 == 0) {
            return new C35410n();
        }
        if (i11 == 1) {
            return new C35401e();
        }
        if (i11 == 2) {
            return new C35402f();
        }
        TPLogUtil.m78797e("TPReporterFactory", "Type is not match ReporterType, return null");
        return null;
    }
}
