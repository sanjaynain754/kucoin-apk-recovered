package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PREPARING", "CONNECTING", "CONNECTION_FAILED", "WAITING_FOR_OPERATOR", "IN_PROGRESS", "RECONNECTING", "CONNECTION_LOST", "COMPLETED", "UNKNOWN", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum AnalyticsCallState {
    PREPARING("preparing"),
    CONNECTING("connecting"),
    CONNECTION_FAILED("connectionFailed"),
    WAITING_FOR_OPERATOR("waitingForOperator"),
    IN_PROGRESS("inProgress"),
    RECONNECTING("reconnecting"),
    CONNECTION_LOST("сonnectionLost"),
    COMPLETED("completed"),
    UNKNOWN("unknown");


    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState$Companion;", "", "<init>", "()V", "fromString", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState;", "value", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnalyticsCallState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsCallState.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/AnalyticsCallState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final AnalyticsCallState fromString(@NotNull String value) {
            for (AnalyticsCallState analyticsCallState : AnalyticsCallState.values()) {
                if (Intrinsics.areEqual(analyticsCallState.getValue(), value)) {
                    return analyticsCallState;
                }
            }
            return null;
        }
    }

    @NotNull
    public static EnumEntries<AnalyticsCallState> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    AnalyticsCallState(String str) {
        this.value = str;
    }
}
