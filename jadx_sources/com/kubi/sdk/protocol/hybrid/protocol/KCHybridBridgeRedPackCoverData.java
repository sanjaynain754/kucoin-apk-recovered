package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeRedPackCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeRedPackCoverData;", "", "extendId", "", "extendName", "(Ljava/lang/String;Ljava/lang/String;)V", "getExtendId", "()Ljava/lang/String;", "getExtendName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeRedPackCoverData {

    @NotNull
    private final String extendId;

    @NotNull
    private final String extendName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeRedPackCoverData)) {
            return false;
        }
        KCHybridBridgeRedPackCoverData kCHybridBridgeRedPackCoverData = (KCHybridBridgeRedPackCoverData) other;
        return Intrinsics.areEqual(this.extendId, kCHybridBridgeRedPackCoverData.extendId) && Intrinsics.areEqual(this.extendName, kCHybridBridgeRedPackCoverData.extendName);
    }

    public KCHybridBridgeRedPackCoverData(@NotNull String extendId, @NotNull String extendName) {
        Intrinsics.checkNotNullParameter(extendId, "extendId");
        Intrinsics.checkNotNullParameter(extendName, "extendName");
        this.extendId = extendId;
        this.extendName = extendName;
    }

    public static /* synthetic */ KCHybridBridgeRedPackCoverData copy$default(KCHybridBridgeRedPackCoverData kCHybridBridgeRedPackCoverData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCHybridBridgeRedPackCoverData.extendId;
        }
        if ((i11 & 2) != 0) {
            str2 = kCHybridBridgeRedPackCoverData.extendName;
        }
        return kCHybridBridgeRedPackCoverData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExtendId() {
        return this.extendId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExtendName() {
        return this.extendName;
    }

    @NotNull
    public final KCHybridBridgeRedPackCoverData copy(@NotNull String extendId, @NotNull String extendName) {
        Intrinsics.checkNotNullParameter(extendId, "extendId");
        Intrinsics.checkNotNullParameter(extendName, "extendName");
        return new KCHybridBridgeRedPackCoverData(extendId, extendName);
    }

    @NotNull
    public final String getExtendId() {
        return this.extendId;
    }

    @NotNull
    public final String getExtendName() {
        return this.extendName;
    }

    public int hashCode() {
        return (this.extendId.hashCode() * 31) + this.extendName.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeRedPackCoverData(extendId=" + this.extendId + ", extendName=" + this.extendName + ')';
    }
}
