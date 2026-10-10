package com.sumsub.sns.internal.features.presentation.result;

import java.util.Arrays;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32379s {
    /* JADX INFO: renamed from: a */
    public static final String m71106a(C32363c c32363c) {
        int i11 = AbstractC32378r.f65962a[c32363c.f65938a.ordinal()];
        if (i11 == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("sns_confirmation_result_%s_submitted_title", Arrays.copyOf(new Object[]{c32363c.f65940c}, 1));
        }
        if (i11 != 2) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return String.format("sns_confirmation_result_%s_success_title", Arrays.copyOf(new Object[]{c32363c.f65940c}, 1));
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        return String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{c32363c.f65940c}, 1));
    }
}
