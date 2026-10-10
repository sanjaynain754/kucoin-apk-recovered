package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010$\u001a\u00020%H\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006:"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/CopyTradingEntity;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "userAvatarUrl", "", TUIConstantDefine.USER_NAME, "userDesc", "tradeDisplaySymbol", "tradeIsLong", "", "tradeLeverage", "tradePnlValue", "tradePnlAmountValue", "tradePnlSide", "", "tradeAveragePrice", "tradeExitPrice", "tradeSettleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserAvatarUrl", "()Ljava/lang/String;", "getUserName", "getUserDesc", "getTradeDisplaySymbol", "getTradeIsLong", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTradeLeverage", "getTradePnlValue", "getTradePnlAmountValue", "getTradePnlSide", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTradeAveragePrice", "getTradeExitPrice", "getTradeSettleCurrency", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/CopyTradingEntity;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/CopyTradingEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final /* data */ class CopyTradingEntity implements WritableMapSerializable {

    @Nullable
    private final String tradeAveragePrice;

    @Nullable
    private final String tradeDisplaySymbol;

    @Nullable
    private final String tradeExitPrice;

    @Nullable
    private final Boolean tradeIsLong;

    @Nullable
    private final String tradeLeverage;

    @Nullable
    private final String tradePnlAmountValue;

    @Nullable
    private final Double tradePnlSide;

    @Nullable
    private final String tradePnlValue;

    @Nullable
    private final String tradeSettleCurrency;

    @Nullable
    private final String userAvatarUrl;

    @Nullable
    private final String userDesc;

    @Nullable
    private final String userName;

    public CopyTradingEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ CopyTradingEntity copy$default(CopyTradingEntity copyTradingEntity, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Double d11, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyTradingEntity.userAvatarUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = copyTradingEntity.userName;
        }
        if ((i11 & 4) != 0) {
            str3 = copyTradingEntity.userDesc;
        }
        if ((i11 & 8) != 0) {
            str4 = copyTradingEntity.tradeDisplaySymbol;
        }
        if ((i11 & 16) != 0) {
            bool = copyTradingEntity.tradeIsLong;
        }
        if ((i11 & 32) != 0) {
            str5 = copyTradingEntity.tradeLeverage;
        }
        if ((i11 & 64) != 0) {
            str6 = copyTradingEntity.tradePnlValue;
        }
        if ((i11 & 128) != 0) {
            str7 = copyTradingEntity.tradePnlAmountValue;
        }
        if ((i11 & 256) != 0) {
            d11 = copyTradingEntity.tradePnlSide;
        }
        if ((i11 & 512) != 0) {
            str8 = copyTradingEntity.tradeAveragePrice;
        }
        if ((i11 & 1024) != 0) {
            str9 = copyTradingEntity.tradeExitPrice;
        }
        if ((i11 & 2048) != 0) {
            str10 = copyTradingEntity.tradeSettleCurrency;
        }
        String str11 = str9;
        String str12 = str10;
        Double d12 = d11;
        String str13 = str8;
        String str14 = str6;
        String str15 = str7;
        Boolean bool2 = bool;
        String str16 = str5;
        return copyTradingEntity.copy(str, str2, str3, str4, bool2, str16, str14, str15, d12, str13, str11, str12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingEntity)) {
            return false;
        }
        CopyTradingEntity copyTradingEntity = (CopyTradingEntity) other;
        return Intrinsics.areEqual(this.userAvatarUrl, copyTradingEntity.userAvatarUrl) && Intrinsics.areEqual(this.userName, copyTradingEntity.userName) && Intrinsics.areEqual(this.userDesc, copyTradingEntity.userDesc) && Intrinsics.areEqual(this.tradeDisplaySymbol, copyTradingEntity.tradeDisplaySymbol) && Intrinsics.areEqual(this.tradeIsLong, copyTradingEntity.tradeIsLong) && Intrinsics.areEqual(this.tradeLeverage, copyTradingEntity.tradeLeverage) && Intrinsics.areEqual(this.tradePnlValue, copyTradingEntity.tradePnlValue) && Intrinsics.areEqual(this.tradePnlAmountValue, copyTradingEntity.tradePnlAmountValue) && Intrinsics.areEqual((Object) this.tradePnlSide, (Object) copyTradingEntity.tradePnlSide) && Intrinsics.areEqual(this.tradeAveragePrice, copyTradingEntity.tradeAveragePrice) && Intrinsics.areEqual(this.tradeExitPrice, copyTradingEntity.tradeExitPrice) && Intrinsics.areEqual(this.tradeSettleCurrency, copyTradingEntity.tradeSettleCurrency);
    }

    public CopyTradingEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Double d11, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.userAvatarUrl = str;
        this.userName = str2;
        this.userDesc = str3;
        this.tradeDisplaySymbol = str4;
        this.tradeIsLong = bool;
        this.tradeLeverage = str5;
        this.tradePnlValue = str6;
        this.tradePnlAmountValue = str7;
        this.tradePnlSide = d11;
        this.tradeAveragePrice = str8;
        this.tradeExitPrice = str9;
        this.tradeSettleCurrency = str10;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTradeAveragePrice() {
        return this.tradeAveragePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTradeExitPrice() {
        return this.tradeExitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserDesc() {
        return this.userDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTradeDisplaySymbol() {
        return this.tradeDisplaySymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getTradeIsLong() {
        return this.tradeIsLong;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTradeLeverage() {
        return this.tradeLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTradePnlAmountValue() {
        return this.tradePnlAmountValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @NotNull
    public final CopyTradingEntity copy(@Nullable String userAvatarUrl, @Nullable String userName, @Nullable String userDesc, @Nullable String tradeDisplaySymbol, @Nullable Boolean tradeIsLong, @Nullable String tradeLeverage, @Nullable String tradePnlValue, @Nullable String tradePnlAmountValue, @Nullable Double tradePnlSide, @Nullable String tradeAveragePrice, @Nullable String tradeExitPrice, @Nullable String tradeSettleCurrency) {
        return new CopyTradingEntity(userAvatarUrl, userName, userDesc, tradeDisplaySymbol, tradeIsLong, tradeLeverage, tradePnlValue, tradePnlAmountValue, tradePnlSide, tradeAveragePrice, tradeExitPrice, tradeSettleCurrency);
    }

    @Nullable
    public final String getTradeAveragePrice() {
        return this.tradeAveragePrice;
    }

    @Nullable
    public final String getTradeDisplaySymbol() {
        return this.tradeDisplaySymbol;
    }

    @Nullable
    public final String getTradeExitPrice() {
        return this.tradeExitPrice;
    }

    @Nullable
    public final Boolean getTradeIsLong() {
        return this.tradeIsLong;
    }

    @Nullable
    public final String getTradeLeverage() {
        return this.tradeLeverage;
    }

    @Nullable
    public final String getTradePnlAmountValue() {
        return this.tradePnlAmountValue;
    }

    @Nullable
    public final Double getTradePnlSide() {
        return this.tradePnlSide;
    }

    @Nullable
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @Nullable
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @Nullable
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    public final String getUserDesc() {
        return this.userDesc;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.userAvatarUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userDesc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tradeDisplaySymbol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.tradeIsLong;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.tradeLeverage;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tradePnlValue;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tradePnlAmountValue;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d11 = this.tradePnlSide;
        int iHashCode9 = (iHashCode8 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str8 = this.tradeAveragePrice;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tradeExitPrice;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tradeSettleCurrency;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTradingEntity(userAvatarUrl=" + this.userAvatarUrl + ", userName=" + this.userName + ", userDesc=" + this.userDesc + ", tradeDisplaySymbol=" + this.tradeDisplaySymbol + ", tradeIsLong=" + this.tradeIsLong + ", tradeLeverage=" + this.tradeLeverage + ", tradePnlValue=" + this.tradePnlValue + ", tradePnlAmountValue=" + this.tradePnlAmountValue + ", tradePnlSide=" + this.tradePnlSide + ", tradeAveragePrice=" + this.tradeAveragePrice + ", tradeExitPrice=" + this.tradeExitPrice + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.userAvatarUrl;
        if (str != null) {
            writableMapCreateMap.putString("userAvatarUrl", str.toString());
        }
        String str2 = this.userName;
        if (str2 != null) {
            writableMapCreateMap.putString(TUIConstantDefine.USER_NAME, str2.toString());
        }
        String str3 = this.userDesc;
        if (str3 != null) {
            writableMapCreateMap.putString("userDesc", str3.toString());
        }
        String str4 = this.tradeDisplaySymbol;
        if (str4 != null) {
            writableMapCreateMap.putString("tradeDisplaySymbol", str4.toString());
        }
        Boolean bool = this.tradeIsLong;
        if (bool != null) {
            writableMapCreateMap.putBoolean("tradeIsLong", bool.booleanValue());
        }
        String str5 = this.tradeLeverage;
        if (str5 != null) {
            writableMapCreateMap.putString("tradeLeverage", str5.toString());
        }
        String str6 = this.tradePnlValue;
        if (str6 != null) {
            writableMapCreateMap.putString("tradePnlValue", str6.toString());
        }
        String str7 = this.tradePnlAmountValue;
        if (str7 != null) {
            writableMapCreateMap.putString("tradePnlAmountValue", str7.toString());
        }
        Double d11 = this.tradePnlSide;
        if (d11 != null) {
            writableMapCreateMap.putDouble("tradePnlSide", d11.doubleValue());
        }
        String str8 = this.tradeAveragePrice;
        if (str8 != null) {
            writableMapCreateMap.putString("tradeAveragePrice", str8.toString());
        }
        String str9 = this.tradeExitPrice;
        if (str9 != null) {
            writableMapCreateMap.putString("tradeExitPrice", str9.toString());
        }
        String str10 = this.tradeSettleCurrency;
        if (str10 != null) {
            writableMapCreateMap.putString("tradeSettleCurrency", str10.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ CopyTradingEntity(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, Double d11, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : d11, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : str10);
    }
}
