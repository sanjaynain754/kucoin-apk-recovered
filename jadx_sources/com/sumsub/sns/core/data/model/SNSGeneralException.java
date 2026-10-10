package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSGeneralException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "reason", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getReason", "()Ljava/lang/String;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class SNSGeneralException extends Exception {

    @Nullable
    private final String reason;

    public SNSGeneralException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ SNSGeneralException(String str, String str2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : th2);
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public SNSGeneralException(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        super(str, th2);
        this.reason = str2;
    }
}
