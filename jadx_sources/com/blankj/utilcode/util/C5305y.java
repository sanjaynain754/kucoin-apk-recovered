package com.blankj.utilcode.util;

import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;

/* JADX INFO: renamed from: com.blankj.utilcode.util.y */
/* JADX INFO: compiled from: PhoneUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5305y {
    /* JADX INFO: renamed from: a */
    public static String m6515a() {
        return m6516b().getSimOperatorName();
    }

    /* JADX INFO: renamed from: b */
    public static TelephonyManager m6516b() {
        return (TelephonyManager) C5287o0.m6331a().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }
}
