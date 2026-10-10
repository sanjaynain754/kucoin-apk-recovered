package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jâ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010IJ\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001d¨\u0006K"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineActiveOrderItem;", "", "id", "", "symbol", "side", "type", InterfaceC33730j9.f70350a, "stopPrice", "stopPriceType", "triggerStopUpPrice", "triggerStopDownPrice", FirebaseAnalytics.Param.PRICE, "size", "", "dealSize", "", "displayType", "time", "createdAt", "marginMode", "positionSide", "unit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDealSize", "getDisplayType", "()Ljava/lang/String;", "getId", "getMarginMode", "getPositionSide", "getPrice", "getSide", "getSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStop", "getStopPrice", "getStopPriceType", "getSymbol", "getTime", "getTriggerStopDownPrice", "getTriggerStopUpPrice", "getType", "getUnit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineActiveOrderItem;", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeKLineKlineActiveOrderItem {

    @Nullable
    private final Long createdAt;

    @Nullable
    private final Long dealSize;

    @Nullable
    private final String displayType;

    @NotNull
    private final String id;

    @Nullable
    private final String marginMode;

    @Nullable
    private final String positionSide;

    @Nullable
    private final String price;

    @Nullable
    private final String side;

    @Nullable
    private final Double size;

    @Nullable
    private final String stop;

    @Nullable
    private final String stopPrice;

    @Nullable
    private final String stopPriceType;

    @NotNull
    private final String symbol;

    @Nullable
    private final Long time;

    @Nullable
    private final String triggerStopDownPrice;

    @Nullable
    private final String triggerStopUpPrice;

    @Nullable
    private final String type;

    @Nullable
    private final String unit;

    public static /* synthetic */ KCFlutterBridgeKLineKlineActiveOrderItem copy$default(KCFlutterBridgeKLineKlineActiveOrderItem kCFlutterBridgeKLineKlineActiveOrderItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d11, Long l11, String str11, Long l12, Long l13, String str12, String str13, String str14, int i11, Object obj) {
        String str15;
        String str16;
        String str17 = (i11 & 1) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.id : str;
        String str18 = (i11 & 2) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.symbol : str2;
        String str19 = (i11 & 4) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.side : str3;
        String str20 = (i11 & 8) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.type : str4;
        String str21 = (i11 & 16) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.stop : str5;
        String str22 = (i11 & 32) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.stopPrice : str6;
        String str23 = (i11 & 64) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.stopPriceType : str7;
        String str24 = (i11 & 128) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.triggerStopUpPrice : str8;
        String str25 = (i11 & 256) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.triggerStopDownPrice : str9;
        String str26 = (i11 & 512) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.price : str10;
        Double d12 = (i11 & 1024) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.size : d11;
        Long l14 = (i11 & 2048) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.dealSize : l11;
        String str27 = (i11 & 4096) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.displayType : str11;
        Long l15 = (i11 & 8192) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.time : l12;
        String str28 = str17;
        Long l16 = (i11 & 16384) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.createdAt : l13;
        String str29 = (i11 & 32768) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.marginMode : str12;
        String str30 = (i11 & 65536) != 0 ? kCFlutterBridgeKLineKlineActiveOrderItem.positionSide : str13;
        if ((i11 & 131072) != 0) {
            str16 = str30;
            str15 = kCFlutterBridgeKLineKlineActiveOrderItem.unit;
        } else {
            str15 = str14;
            str16 = str30;
        }
        return kCFlutterBridgeKLineKlineActiveOrderItem.copy(str28, str18, str19, str20, str21, str22, str23, str24, str25, str26, d12, l14, str27, l15, l16, str29, str16, str15);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeKLineKlineActiveOrderItem)) {
            return false;
        }
        KCFlutterBridgeKLineKlineActiveOrderItem kCFlutterBridgeKLineKlineActiveOrderItem = (KCFlutterBridgeKLineKlineActiveOrderItem) other;
        return Intrinsics.areEqual(this.id, kCFlutterBridgeKLineKlineActiveOrderItem.id) && Intrinsics.areEqual(this.symbol, kCFlutterBridgeKLineKlineActiveOrderItem.symbol) && Intrinsics.areEqual(this.side, kCFlutterBridgeKLineKlineActiveOrderItem.side) && Intrinsics.areEqual(this.type, kCFlutterBridgeKLineKlineActiveOrderItem.type) && Intrinsics.areEqual(this.stop, kCFlutterBridgeKLineKlineActiveOrderItem.stop) && Intrinsics.areEqual(this.stopPrice, kCFlutterBridgeKLineKlineActiveOrderItem.stopPrice) && Intrinsics.areEqual(this.stopPriceType, kCFlutterBridgeKLineKlineActiveOrderItem.stopPriceType) && Intrinsics.areEqual(this.triggerStopUpPrice, kCFlutterBridgeKLineKlineActiveOrderItem.triggerStopUpPrice) && Intrinsics.areEqual(this.triggerStopDownPrice, kCFlutterBridgeKLineKlineActiveOrderItem.triggerStopDownPrice) && Intrinsics.areEqual(this.price, kCFlutterBridgeKLineKlineActiveOrderItem.price) && Intrinsics.areEqual((Object) this.size, (Object) kCFlutterBridgeKLineKlineActiveOrderItem.size) && Intrinsics.areEqual(this.dealSize, kCFlutterBridgeKLineKlineActiveOrderItem.dealSize) && Intrinsics.areEqual(this.displayType, kCFlutterBridgeKLineKlineActiveOrderItem.displayType) && Intrinsics.areEqual(this.time, kCFlutterBridgeKLineKlineActiveOrderItem.time) && Intrinsics.areEqual(this.createdAt, kCFlutterBridgeKLineKlineActiveOrderItem.createdAt) && Intrinsics.areEqual(this.marginMode, kCFlutterBridgeKLineKlineActiveOrderItem.marginMode) && Intrinsics.areEqual(this.positionSide, kCFlutterBridgeKLineKlineActiveOrderItem.positionSide) && Intrinsics.areEqual(this.unit, kCFlutterBridgeKLineKlineActiveOrderItem.unit);
    }

    public KCFlutterBridgeKLineKlineActiveOrderItem(@NotNull String id2, @NotNull String symbol, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Double d11, @Nullable Long l11, @Nullable String str9, @Nullable Long l12, @Nullable Long l13, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.id = id2;
        this.symbol = symbol;
        this.side = str;
        this.type = str2;
        this.stop = str3;
        this.stopPrice = str4;
        this.stopPriceType = str5;
        this.triggerStopUpPrice = str6;
        this.triggerStopDownPrice = str7;
        this.price = str8;
        this.size = d11;
        this.dealSize = l11;
        this.displayType = str9;
        this.time = l12;
        this.createdAt = l13;
        this.marginMode = str10;
        this.positionSide = str11;
        this.unit = str12;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getDealSize() {
        return this.dealSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    @NotNull
    public final KCFlutterBridgeKLineKlineActiveOrderItem copy(@NotNull String id2, @NotNull String symbol, @Nullable String side, @Nullable String type, @Nullable String stop, @Nullable String stopPrice, @Nullable String stopPriceType, @Nullable String triggerStopUpPrice, @Nullable String triggerStopDownPrice, @Nullable String price, @Nullable Double size, @Nullable Long dealSize, @Nullable String displayType, @Nullable Long time, @Nullable Long createdAt, @Nullable String marginMode, @Nullable String positionSide, @Nullable String unit) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new KCFlutterBridgeKLineKlineActiveOrderItem(id2, symbol, side, type, stop, stopPrice, stopPriceType, triggerStopUpPrice, triggerStopDownPrice, price, size, dealSize, displayType, time, createdAt, marginMode, positionSide, unit);
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Long getDealSize() {
        return this.dealSize;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final Double getSize() {
        return this.size;
    }

    @Nullable
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    public final String getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    @Nullable
    public final String getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31;
        String str = this.side;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stop;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stopPrice;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stopPriceType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.triggerStopUpPrice;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.triggerStopDownPrice;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.price;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d11 = this.size;
        int iHashCode10 = (iHashCode9 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Long l11 = this.dealSize;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str9 = this.displayType;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l12 = this.time;
        int iHashCode13 = (iHashCode12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.createdAt;
        int iHashCode14 = (iHashCode13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str10 = this.marginMode;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.positionSide;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.unit;
        return iHashCode16 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", this.id);
        linkedHashMap.put("symbol", this.symbol);
        linkedHashMap.put("side", this.side);
        linkedHashMap.put("type", this.type);
        linkedHashMap.put(InterfaceC33730j9.f70350a, this.stop);
        linkedHashMap.put("stopPrice", this.stopPrice);
        linkedHashMap.put("stopPriceType", this.stopPriceType);
        linkedHashMap.put("triggerStopUpPrice", this.triggerStopUpPrice);
        linkedHashMap.put("triggerStopDownPrice", this.triggerStopDownPrice);
        linkedHashMap.put(FirebaseAnalytics.Param.PRICE, this.price);
        linkedHashMap.put("size", this.size);
        linkedHashMap.put("dealSize", this.dealSize);
        linkedHashMap.put("displayType", this.displayType);
        linkedHashMap.put("time", this.time);
        linkedHashMap.put("createdAt", this.createdAt);
        linkedHashMap.put("marginMode", this.marginMode);
        linkedHashMap.put("positionSide", this.positionSide);
        linkedHashMap.put("unit", this.unit);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeKLineKlineActiveOrderItem(id=" + this.id + ", symbol=" + this.symbol + ", side=" + this.side + ", type=" + this.type + ", stop=" + this.stop + ", stopPrice=" + this.stopPrice + ", stopPriceType=" + this.stopPriceType + ", triggerStopUpPrice=" + this.triggerStopUpPrice + ", triggerStopDownPrice=" + this.triggerStopDownPrice + ", price=" + this.price + ", size=" + this.size + ", dealSize=" + this.dealSize + ", displayType=" + this.displayType + ", time=" + this.time + ", createdAt=" + this.createdAt + ", marginMode=" + this.marginMode + ", positionSide=" + this.positionSide + ", unit=" + this.unit + ')';
    }
}
