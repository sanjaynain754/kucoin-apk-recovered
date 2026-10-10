package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSApplicantNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "applicantId", "", "<init>", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSApplicantNotFoundException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public SNSApplicantNotFoundException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SNSApplicantNotFoundException(@Nullable String str) {
        super("Applicant(" + str + ") is not found");
    }

    public /* synthetic */ SNSApplicantNotFoundException(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
