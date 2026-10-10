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
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsWalletCexAddress;", "", "address", "", "accountType", "", "minSize", "(Ljava/lang/String;JLjava/lang/String;)V", "getAccountType", "()J", "getAddress", "()Ljava/lang/String;", "getMinSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeAssetsWalletCexAddress {
    private final long accountType;

    @NotNull
    private final String address;

    @NotNull
    private final String minSize;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeAssetsWalletCexAddress)) {
            return false;
        }
        KCFlutterBridgeAssetsWalletCexAddress kCFlutterBridgeAssetsWalletCexAddress = (KCFlutterBridgeAssetsWalletCexAddress) other;
        return Intrinsics.areEqual(this.address, kCFlutterBridgeAssetsWalletCexAddress.address) && this.accountType == kCFlutterBridgeAssetsWalletCexAddress.accountType && Intrinsics.areEqual(this.minSize, kCFlutterBridgeAssetsWalletCexAddress.minSize);
    }

    public KCFlutterBridgeAssetsWalletCexAddress(@NotNull String address, long j11, @NotNull String minSize) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(minSize, "minSize");
        this.address = address;
        this.accountType = j11;
        this.minSize = minSize;
    }

    public static /* synthetic */ KCFlutterBridgeAssetsWalletCexAddress copy$default(KCFlutterBridgeAssetsWalletCexAddress kCFlutterBridgeAssetsWalletCexAddress, String str, long j11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeAssetsWalletCexAddress.address;
        }
        if ((i11 & 2) != 0) {
            j11 = kCFlutterBridgeAssetsWalletCexAddress.accountType;
        }
        if ((i11 & 4) != 0) {
            str2 = kCFlutterBridgeAssetsWalletCexAddress.minSize;
        }
        return kCFlutterBridgeAssetsWalletCexAddress.copy(str, j11, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAccountType() {
        return this.accountType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinSize() {
        return this.minSize;
    }

    @NotNull
    public final KCFlutterBridgeAssetsWalletCexAddress copy(@NotNull String address, long accountType, @NotNull String minSize) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(minSize, "minSize");
        return new KCFlutterBridgeAssetsWalletCexAddress(address, accountType, minSize);
    }

    public final long getAccountType() {
        return this.accountType;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getMinSize() {
        return this.minSize;
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + Long.hashCode(this.accountType)) * 31) + this.minSize.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("address", this.address);
        linkedHashMap.put("accountType", Long.valueOf(this.accountType));
        linkedHashMap.put("minSize", this.minSize);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeAssetsWalletCexAddress(address=" + this.address + ", accountType=" + this.accountType + ", minSize=" + this.minSize + ')';
    }
}
