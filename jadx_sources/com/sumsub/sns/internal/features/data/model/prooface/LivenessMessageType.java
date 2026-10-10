package com.sumsub.sns.internal.features.data.model.prooface;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/prooface/LivenessMessageType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "com/sumsub/sns/internal/features/data/model/prooface/B", "startLivenessSession", "livenessClientError", "livenessFragment", "livenessSessionStarted", "livenessSessionInProgress", "livenessSessionCompleted", "livenessSessionTerminated", "bye", "unknown", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum LivenessMessageType {
    startLivenessSession("startLivenessSession"),
    livenessClientError("livenessClientError"),
    livenessFragment("livenessFragment"),
    livenessSessionStarted("livenessSessionStarted"),
    livenessSessionInProgress("livenessSessionInProgress"),
    livenessSessionCompleted("livenessSessionCompleted"),
    livenessSessionTerminated("livenessSessionTerminated"),
    bye("bye"),
    unknown("unknown");


    @NotNull
    private final String type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C29799B Companion = new C29799B();

    @NotNull
    public static EnumEntries<LivenessMessageType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    LivenessMessageType(String str) {
        this.type = str;
    }
}
