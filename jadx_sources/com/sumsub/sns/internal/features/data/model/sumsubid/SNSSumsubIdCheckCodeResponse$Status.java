package com.sumsub.sns.internal.features.data.model.sumsubid;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"com/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdCheckCodeResponse$Status", "", "Lcom/sumsub/sns/internal/features/data/model/sumsubid/SNSSumsubIdCheckCodeResponse$Status;", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "VERIFIED", "RETRY", "REJECTED", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum SNSSumsubIdCheckCodeResponse$Status {
    VERIFIED("verified"),
    RETRY("retry"),
    REJECTED("rejected");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String status;

    @NotNull
    public static EnumEntries<SNSSumsubIdCheckCodeResponse$Status> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    SNSSumsubIdCheckCodeResponse$Status(String str) {
        this.status = str;
    }
}
