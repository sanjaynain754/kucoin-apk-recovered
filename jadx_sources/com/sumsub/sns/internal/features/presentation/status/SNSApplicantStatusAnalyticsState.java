package com.sumsub.sns.internal.features.presentation.status;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/status/SNSApplicantStatusAnalyticsState;", "", "state", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getState", "()Ljava/lang/String;", "Loading", "Initial", "Incomplete", "Pending", "TemporarilyDeclined", "FinallyRejected", "Approved", "VideoIdent", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum SNSApplicantStatusAnalyticsState {
    Loading("loading"),
    Initial("initial"),
    Incomplete("incomplete"),
    Pending("pending"),
    TemporarilyDeclined("temporarilyDeclined"),
    FinallyRejected("finallyRejected"),
    Approved("approved"),
    VideoIdent("videoIdent");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String state;

    @NotNull
    public static EnumEntries<SNSApplicantStatusAnalyticsState> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    SNSApplicantStatusAnalyticsState(String str) {
        this.state = str;
    }
}
