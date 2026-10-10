package com.sumsub.sns.internal.features.data.model.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.tencent.bugly.proguard.C33612dh;
import com.tencent.bugly.proguard.C33812n7;
import java.util.LinkedHashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.y2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29722y2 {
    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m69913a(LogParams logParams) {
        return AbstractC28458h.m69336a(MapsKt.mapOf(TuplesKt.m90091to("errorType", logParams.getErrorType()), TuplesKt.m90091to(FirebaseAnalytics.Param.LOCATION, logParams.getLocation()), TuplesKt.m90091to("externalUserId", logParams.getExternalUserId()), TuplesKt.m90091to("fileName", logParams.getFileName()), TuplesKt.m90091to("applicantId", logParams.getApplicantId()), TuplesKt.m90091to("message", logParams.getMessage()), TuplesKt.m90091to(C33612dh.f69618m, logParams.getKind()), TuplesKt.m90091to(C33812n7.f71061t, logParams.getStacktrace())));
    }
}
