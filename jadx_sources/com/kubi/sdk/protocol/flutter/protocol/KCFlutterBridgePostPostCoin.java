package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgePostCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePostPostCoin;", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "coin", "coinDisplayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoin", "()Ljava/lang/String;", "getCoinDisplayName", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgePostPostCoin {

    @NotNull
    private final String coin;

    @NotNull
    private final String coinDisplayName;

    @NotNull
    private final String icon;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgePostPostCoin)) {
            return false;
        }
        KCFlutterBridgePostPostCoin kCFlutterBridgePostPostCoin = (KCFlutterBridgePostPostCoin) other;
        return Intrinsics.areEqual(this.icon, kCFlutterBridgePostPostCoin.icon) && Intrinsics.areEqual(this.coin, kCFlutterBridgePostPostCoin.coin) && Intrinsics.areEqual(this.coinDisplayName, kCFlutterBridgePostPostCoin.coinDisplayName);
    }

    public KCFlutterBridgePostPostCoin(@NotNull String icon, @NotNull String coin, @NotNull String coinDisplayName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(coin, "coin");
        Intrinsics.checkNotNullParameter(coinDisplayName, "coinDisplayName");
        this.icon = icon;
        this.coin = coin;
        this.coinDisplayName = coinDisplayName;
    }

    public static /* synthetic */ KCFlutterBridgePostPostCoin copy$default(KCFlutterBridgePostPostCoin kCFlutterBridgePostPostCoin, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgePostPostCoin.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgePostPostCoin.coin;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgePostPostCoin.coinDisplayName;
        }
        return kCFlutterBridgePostPostCoin.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoin() {
        return this.coin;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoinDisplayName() {
        return this.coinDisplayName;
    }

    @NotNull
    public final KCFlutterBridgePostPostCoin copy(@NotNull String icon, @NotNull String coin, @NotNull String coinDisplayName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(coin, "coin");
        Intrinsics.checkNotNullParameter(coinDisplayName, "coinDisplayName");
        return new KCFlutterBridgePostPostCoin(icon, coin, coinDisplayName);
    }

    @NotNull
    public final String getCoin() {
        return this.coin;
    }

    @NotNull
    public final String getCoinDisplayName() {
        return this.coinDisplayName;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.coin.hashCode()) * 31) + this.coinDisplayName.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(TUIConstants.TUIChat.INPUT_MORE_ICON, this.icon);
        linkedHashMap.put("coin", this.coin);
        linkedHashMap.put("coinDisplayName", this.coinDisplayName);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgePostPostCoin(icon=" + this.icon + ", coin=" + this.coin + ", coinDisplayName=" + this.coinDisplayName + ')';
    }
}
