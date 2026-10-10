package com.kubi.p110rn.core.pageopen;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KrnPageOpenBridgePayload.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenPayloadParseResult;", "", "payload", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "errorCode", "", "<init>", "(Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;Ljava/lang/String;)V", "getPayload", "()Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "getErrorCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KrnPageOpenPayloadParseResult {

    @Nullable
    private final String errorCode;

    @Nullable
    private final KrnPageOpenBridgePayload payload;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KrnPageOpenPayloadParseResult)) {
            return false;
        }
        KrnPageOpenPayloadParseResult krnPageOpenPayloadParseResult = (KrnPageOpenPayloadParseResult) other;
        return Intrinsics.areEqual(this.payload, krnPageOpenPayloadParseResult.payload) && Intrinsics.areEqual(this.errorCode, krnPageOpenPayloadParseResult.errorCode);
    }

    public static /* synthetic */ KrnPageOpenPayloadParseResult copy$default(KrnPageOpenPayloadParseResult krnPageOpenPayloadParseResult, KrnPageOpenBridgePayload krnPageOpenBridgePayload, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            krnPageOpenBridgePayload = krnPageOpenPayloadParseResult.payload;
        }
        if ((i11 & 2) != 0) {
            str = krnPageOpenPayloadParseResult.errorCode;
        }
        return krnPageOpenPayloadParseResult.copy(krnPageOpenBridgePayload, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KrnPageOpenBridgePayload getPayload() {
        return this.payload;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final KrnPageOpenPayloadParseResult copy(@Nullable KrnPageOpenBridgePayload payload, @Nullable String errorCode) {
        return new KrnPageOpenPayloadParseResult(payload, errorCode);
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final KrnPageOpenBridgePayload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        KrnPageOpenBridgePayload krnPageOpenBridgePayload = this.payload;
        int iHashCode = (krnPageOpenBridgePayload == null ? 0 : krnPageOpenBridgePayload.hashCode()) * 31;
        String str = this.errorCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KrnPageOpenPayloadParseResult(payload=" + this.payload + ", errorCode=" + this.errorCode + ')';
    }

    public KrnPageOpenPayloadParseResult(@Nullable KrnPageOpenBridgePayload krnPageOpenBridgePayload, @Nullable String str) {
        this.payload = krnPageOpenBridgePayload;
        this.errorCode = str;
    }
}
