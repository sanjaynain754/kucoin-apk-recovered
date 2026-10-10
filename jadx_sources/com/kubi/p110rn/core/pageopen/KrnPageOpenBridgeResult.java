package com.kubi.p110rn.core.pageopen;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnPageOpenBridgeHandler.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;", "", "accepted", "", "code", "", "pageTraceId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getAccepted", "()Z", "getCode", "()Ljava/lang/String;", "getPageTraceId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KrnPageOpenBridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean accepted;

    @NotNull
    private final String code;

    @Nullable
    private final String pageTraceId;

    /* JADX INFO: compiled from: KrnPageOpenBridgeHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult$Companion;", "", "<init>", "()V", "accepted", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgeResult;", "pageTraceId", "", "rejected", "code", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ KrnPageOpenBridgeResult accepted$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return companion.accepted(str);
        }

        @NotNull
        public final KrnPageOpenBridgeResult accepted(@Nullable String pageTraceId) {
            return new KrnPageOpenBridgeResult(true, "ok", pageTraceId);
        }

        @NotNull
        public final KrnPageOpenBridgeResult rejected(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new KrnPageOpenBridgeResult(false, code, null, 4, null);
        }
    }

    public KrnPageOpenBridgeResult(boolean z11, @NotNull String code, @Nullable String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.accepted = z11;
        this.code = code;
        this.pageTraceId = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KrnPageOpenBridgeResult)) {
            return false;
        }
        KrnPageOpenBridgeResult krnPageOpenBridgeResult = (KrnPageOpenBridgeResult) other;
        return this.accepted == krnPageOpenBridgeResult.accepted && Intrinsics.areEqual(this.code, krnPageOpenBridgeResult.code) && Intrinsics.areEqual(this.pageTraceId, krnPageOpenBridgeResult.pageTraceId);
    }

    public static /* synthetic */ KrnPageOpenBridgeResult copy$default(KrnPageOpenBridgeResult krnPageOpenBridgeResult, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = krnPageOpenBridgeResult.accepted;
        }
        if ((i11 & 2) != 0) {
            str = krnPageOpenBridgeResult.code;
        }
        if ((i11 & 4) != 0) {
            str2 = krnPageOpenBridgeResult.pageTraceId;
        }
        return krnPageOpenBridgeResult.copy(z11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAccepted() {
        return this.accepted;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    @NotNull
    public final KrnPageOpenBridgeResult copy(boolean accepted, @NotNull String code, @Nullable String pageTraceId) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new KrnPageOpenBridgeResult(accepted, code, pageTraceId);
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getPageTraceId() {
        return this.pageTraceId;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.accepted) * 31) + this.code.hashCode()) * 31;
        String str = this.pageTraceId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KrnPageOpenBridgeResult(accepted=" + this.accepted + ", code=" + this.code + ", pageTraceId=" + this.pageTraceId + ')';
    }

    public /* synthetic */ KrnPageOpenBridgeResult(boolean z11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, (i11 & 4) != 0 ? null : str2);
    }
}
