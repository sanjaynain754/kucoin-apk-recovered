package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeAssetsCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexChain;", "", "chainName", "", "feeAmount", "feeAmountUsd", "feeCoin", "executionTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getChainName", "()Ljava/lang/String;", "getExecutionTime", "()J", "getFeeAmount", "getFeeAmountUsd", "getFeeCoin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeAssetsWalletCexChain {

    @NotNull
    private final String chainName;
    private final long executionTime;

    @NotNull
    private final String feeAmount;

    @NotNull
    private final String feeAmountUsd;

    @NotNull
    private final String feeCoin;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeAssetsWalletCexChain)) {
            return false;
        }
        KCFlutterBridgeAssetsWalletCexChain kCFlutterBridgeAssetsWalletCexChain = (KCFlutterBridgeAssetsWalletCexChain) other;
        return Intrinsics.areEqual(this.chainName, kCFlutterBridgeAssetsWalletCexChain.chainName) && Intrinsics.areEqual(this.feeAmount, kCFlutterBridgeAssetsWalletCexChain.feeAmount) && Intrinsics.areEqual(this.feeAmountUsd, kCFlutterBridgeAssetsWalletCexChain.feeAmountUsd) && Intrinsics.areEqual(this.feeCoin, kCFlutterBridgeAssetsWalletCexChain.feeCoin) && this.executionTime == kCFlutterBridgeAssetsWalletCexChain.executionTime;
    }

    public KCFlutterBridgeAssetsWalletCexChain(@NotNull String chainName, @NotNull String feeAmount, @NotNull String feeAmountUsd, @NotNull String feeCoin, long j11) {
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
        Intrinsics.checkNotNullParameter(feeAmountUsd, "feeAmountUsd");
        Intrinsics.checkNotNullParameter(feeCoin, "feeCoin");
        this.chainName = chainName;
        this.feeAmount = feeAmount;
        this.feeAmountUsd = feeAmountUsd;
        this.feeCoin = feeCoin;
        this.executionTime = j11;
    }

    public static /* synthetic */ KCFlutterBridgeAssetsWalletCexChain copy$default(KCFlutterBridgeAssetsWalletCexChain kCFlutterBridgeAssetsWalletCexChain, String str, String str2, String str3, String str4, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeAssetsWalletCexChain.chainName;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgeAssetsWalletCexChain.feeAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgeAssetsWalletCexChain.feeAmountUsd;
        }
        if ((i11 & 8) != 0) {
            str4 = kCFlutterBridgeAssetsWalletCexChain.feeCoin;
        }
        if ((i11 & 16) != 0) {
            j11 = kCFlutterBridgeAssetsWalletCexChain.executionTime;
        }
        long j12 = j11;
        return kCFlutterBridgeAssetsWalletCexChain.copy(str, str2, str3, str4, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeeAmountUsd() {
        return this.feeAmountUsd;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeeCoin() {
        return this.feeCoin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExecutionTime() {
        return this.executionTime;
    }

    @NotNull
    public final KCFlutterBridgeAssetsWalletCexChain copy(@NotNull String chainName, @NotNull String feeAmount, @NotNull String feeAmountUsd, @NotNull String feeCoin, long executionTime) {
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
        Intrinsics.checkNotNullParameter(feeAmountUsd, "feeAmountUsd");
        Intrinsics.checkNotNullParameter(feeCoin, "feeCoin");
        return new KCFlutterBridgeAssetsWalletCexChain(chainName, feeAmount, feeAmountUsd, feeCoin, executionTime);
    }

    @NotNull
    public final String getChainName() {
        return this.chainName;
    }

    public final long getExecutionTime() {
        return this.executionTime;
    }

    @NotNull
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    @NotNull
    public final String getFeeAmountUsd() {
        return this.feeAmountUsd;
    }

    @NotNull
    public final String getFeeCoin() {
        return this.feeCoin;
    }

    public int hashCode() {
        return (((((((this.chainName.hashCode() * 31) + this.feeAmount.hashCode()) * 31) + this.feeAmountUsd.hashCode()) * 31) + this.feeCoin.hashCode()) * 31) + Long.hashCode(this.executionTime);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chainName", this.chainName);
        linkedHashMap.put("feeAmount", this.feeAmount);
        linkedHashMap.put("feeAmountUsd", this.feeAmountUsd);
        linkedHashMap.put("feeCoin", this.feeCoin);
        linkedHashMap.put("executionTime", Long.valueOf(this.executionTime));
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeAssetsWalletCexChain(chainName=" + this.chainName + ", feeAmount=" + this.feeAmount + ", feeAmountUsd=" + this.feeAmountUsd + ", feeCoin=" + this.feeCoin + ", executionTime=" + this.executionTime + ')';
    }
}
