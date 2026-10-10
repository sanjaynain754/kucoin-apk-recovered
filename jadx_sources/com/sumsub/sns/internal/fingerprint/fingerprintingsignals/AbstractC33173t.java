package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.tencent.bugly.proguard.C33627eb;
import java.util.Locale;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33173t {
    /* JADX INFO: renamed from: a */
    public static final String m71465a(String str) {
        return StringsKt.replace$default(str, C33627eb.f69716f, "_", false, 4, (Object) null).toLowerCase(Locale.ROOT);
    }
}
