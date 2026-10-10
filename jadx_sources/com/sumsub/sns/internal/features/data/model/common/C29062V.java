package com.sumsub.sns.internal.features.data.model.common;

import org.jetbrains.annotations.NotNull;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29062V {
    /* JADX INFO: renamed from: a */
    public static C29070X m69739a(String str) {
        if (str != null) {
            return (StringsKt.startsWith$default(str, "SELFIE", false, 2, (Object) null) || StringsKt.startsWith$default(str, "IDENTITY", false, 2, (Object) null) || StringsKt.startsWith$default(str, "APPLICANT_DATA", false, 2, (Object) null) || StringsKt.startsWith$default(str, "PROOF_OF_RESIDENCE", false, 2, (Object) null) || StringsKt.startsWith$default(str, "INVESTABILITY", false, 2, (Object) null) || StringsKt.startsWith$default(str, "EMAIL_VERIFICATION", false, 2, (Object) null) || StringsKt.startsWith$default(str, "PHONE_VERIFICATION", false, 2, (Object) null) || StringsKt.startsWith$default(str, "PAYMENT_METHODS", false, 2, (Object) null) || StringsKt.startsWith$default(str, "QUESTIONNAIRE", false, 2, (Object) null)) ? new C29070X(str) : new C29070X(str);
        }
        throw new IllegalArgumentException("Null document type");
    }

    @NotNull
    public final InterfaceC44951d<C29070X> serializer() {
        return C29058U.f59005a;
    }
}
