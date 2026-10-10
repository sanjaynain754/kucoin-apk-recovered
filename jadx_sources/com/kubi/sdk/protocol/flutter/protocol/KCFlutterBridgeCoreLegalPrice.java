package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeCoreCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreLegalPrice;", "", "legal", "", FirebaseAnalytics.Param.PRICE, "", "(Ljava/lang/String;D)V", "getLegal", "()Ljava/lang/String;", "getPrice", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeCoreLegalPrice {

    @NotNull
    private final String legal;
    private final double price;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeCoreLegalPrice)) {
            return false;
        }
        KCFlutterBridgeCoreLegalPrice kCFlutterBridgeCoreLegalPrice = (KCFlutterBridgeCoreLegalPrice) other;
        return Intrinsics.areEqual(this.legal, kCFlutterBridgeCoreLegalPrice.legal) && Double.compare(this.price, kCFlutterBridgeCoreLegalPrice.price) == 0;
    }

    public KCFlutterBridgeCoreLegalPrice(@NotNull String legal, double d11) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        this.legal = legal;
        this.price = d11;
    }

    public static /* synthetic */ KCFlutterBridgeCoreLegalPrice copy$default(KCFlutterBridgeCoreLegalPrice kCFlutterBridgeCoreLegalPrice, String str, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeCoreLegalPrice.legal;
        }
        if ((i11 & 2) != 0) {
            d11 = kCFlutterBridgeCoreLegalPrice.price;
        }
        return kCFlutterBridgeCoreLegalPrice.copy(str, d11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final KCFlutterBridgeCoreLegalPrice copy(@NotNull String legal, double price) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        return new KCFlutterBridgeCoreLegalPrice(legal, price);
    }

    @NotNull
    public final String getLegal() {
        return this.legal;
    }

    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (this.legal.hashCode() * 31) + Double.hashCode(this.price);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("legal", this.legal);
        linkedHashMap.put(FirebaseAnalytics.Param.PRICE, Double.valueOf(this.price));
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeCoreLegalPrice(legal=" + this.legal + ", price=" + this.price + ')';
    }
}
