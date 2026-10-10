package com.kubi.kyc.protocol;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycBindProtocolHandler.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kyc/protocol/KycBindProtocolResult;", "", "success", "", "message", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycBindProtocolResult {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f31247c = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String message;

    /* JADX INFO: compiled from: KycBindProtocolHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kyc/protocol/KycBindProtocolResult$Companion;", "", "<init>", "()V", "success", "Lcom/kubi/kyc/protocol/KycBindProtocolResult;", "failed", "message", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KycBindProtocolResult failed(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new KycBindProtocolResult(false, message);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KycBindProtocolResult success() {
            return new KycBindProtocolResult(true, null, 2, 0 == true ? 1 : 0);
        }
    }

    public KycBindProtocolResult(boolean z11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.success = z11;
        this.message = message;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycBindProtocolResult)) {
            return false;
        }
        KycBindProtocolResult kycBindProtocolResult = (KycBindProtocolResult) other;
        return this.success == kycBindProtocolResult.success && Intrinsics.areEqual(this.message, kycBindProtocolResult.message);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "KycBindProtocolResult(success=" + this.success + ", message=" + this.message + ')';
    }

    public /* synthetic */ KycBindProtocolResult(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? "" : str);
    }
}
