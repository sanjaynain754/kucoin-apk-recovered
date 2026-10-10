package com.sumsub.sns.internal.features.presentation.utils;

import com.google.android.material.timepicker.TimeModel;
import com.tencent.bugly.proguard.C33844oi;
import java.util.Arrays;
import java.util.Locale;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32660k {
    /* JADX INFO: renamed from: a */
    public static String m71282a(long j11) {
        long j12 = j11 / 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return j12 + C33844oi.f71346o + String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11 % 60)}, 1));
    }
}
