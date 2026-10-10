package com.kubi.p110rn.core.turbo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeFuturesTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010'\u001a\u00020(H\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0010\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006?"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/FuturesPositionPnlShareData;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "id", "", "symbol", FirebaseAnalytics.Param.CURRENCY, TypedValues.CycleType.S_WAVE_OFFSET, "", "type", "side", "closeDate", "realisedPnl", "marginMode", "leverage", "closeType", "openTime", "isTrialFunds", "", "prizeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getCurrency", "getOffset", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "getSide", "getCloseDate", "getRealisedPnl", "getMarginMode", "getLeverage", "getCloseType", "getOpenTime", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrizeType", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/FuturesPositionPnlShareData;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeFuturesTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeFuturesTurboModule.kt\ncom/kubi/rn/core/turbo/FuturesPositionPnlShareData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final /* data */ class FuturesPositionPnlShareData implements WritableMapSerializable {

    @Nullable
    private final Double closeDate;

    @Nullable
    private final String closeType;

    @Nullable
    private final String currency;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isTrialFunds;

    @Nullable
    private final String leverage;

    @Nullable
    private final String marginMode;

    @Nullable
    private final Double offset;

    @Nullable
    private final Double openTime;

    @Nullable
    private final String prizeType;

    @Nullable
    private final String realisedPnl;

    @Nullable
    private final String side;

    @Nullable
    private final String symbol;

    @Nullable
    private final String type;

    public FuturesPositionPnlShareData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @NotNull
    public final FuturesPositionPnlShareData copy(@Nullable String id2, @Nullable String symbol, @Nullable String currency, @Nullable Double offset, @Nullable String type, @Nullable String side, @Nullable Double closeDate, @Nullable String realisedPnl, @Nullable String marginMode, @Nullable String leverage, @Nullable String closeType, @Nullable Double openTime, @Nullable Boolean isTrialFunds, @Nullable String prizeType) {
        return new FuturesPositionPnlShareData(id2, symbol, currency, offset, type, side, closeDate, realisedPnl, marginMode, leverage, closeType, openTime, isTrialFunds, prizeType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesPositionPnlShareData)) {
            return false;
        }
        FuturesPositionPnlShareData futuresPositionPnlShareData = (FuturesPositionPnlShareData) other;
        return Intrinsics.areEqual(this.id, futuresPositionPnlShareData.id) && Intrinsics.areEqual(this.symbol, futuresPositionPnlShareData.symbol) && Intrinsics.areEqual(this.currency, futuresPositionPnlShareData.currency) && Intrinsics.areEqual((Object) this.offset, (Object) futuresPositionPnlShareData.offset) && Intrinsics.areEqual(this.type, futuresPositionPnlShareData.type) && Intrinsics.areEqual(this.side, futuresPositionPnlShareData.side) && Intrinsics.areEqual((Object) this.closeDate, (Object) futuresPositionPnlShareData.closeDate) && Intrinsics.areEqual(this.realisedPnl, futuresPositionPnlShareData.realisedPnl) && Intrinsics.areEqual(this.marginMode, futuresPositionPnlShareData.marginMode) && Intrinsics.areEqual(this.leverage, futuresPositionPnlShareData.leverage) && Intrinsics.areEqual(this.closeType, futuresPositionPnlShareData.closeType) && Intrinsics.areEqual((Object) this.openTime, (Object) futuresPositionPnlShareData.openTime) && Intrinsics.areEqual(this.isTrialFunds, futuresPositionPnlShareData.isTrialFunds) && Intrinsics.areEqual(this.prizeType, futuresPositionPnlShareData.prizeType);
    }

    public FuturesPositionPnlShareData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Double d11, @Nullable String str4, @Nullable String str5, @Nullable Double d12, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Double d13, @Nullable Boolean bool, @Nullable String str10) {
        this.id = str;
        this.symbol = str2;
        this.currency = str3;
        this.offset = d11;
        this.type = str4;
        this.side = str5;
        this.closeDate = d12;
        this.realisedPnl = str6;
        this.marginMode = str7;
        this.leverage = str8;
        this.closeType = str9;
        this.openTime = d13;
        this.isTrialFunds = bool;
        this.prizeType = str10;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getOpenTime() {
        return this.openTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCloseDate() {
        return this.closeDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Double getCloseDate() {
        return this.closeDate;
    }

    @Nullable
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Double getOffset() {
        return this.offset;
    }

    @Nullable
    public final Double getOpenTime() {
        return this.openTime;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d11 = this.offset;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d12 = this.closeDate;
        int iHashCode7 = (iHashCode6 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str6 = this.realisedPnl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.marginMode;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.leverage;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.closeType;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d13 = this.openTime;
        int iHashCode12 = (iHashCode11 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Boolean bool = this.isTrialFunds;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.prizeType;
        return iHashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    @NotNull
    public String toString() {
        return "FuturesPositionPnlShareData(id=" + this.id + ", symbol=" + this.symbol + ", currency=" + this.currency + ", offset=" + this.offset + ", type=" + this.type + ", side=" + this.side + ", closeDate=" + this.closeDate + ", realisedPnl=" + this.realisedPnl + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ", closeType=" + this.closeType + ", openTime=" + this.openTime + ", isTrialFunds=" + this.isTrialFunds + ", prizeType=" + this.prizeType + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.id;
        if (str != null) {
            writableMapCreateMap.putString("id", str.toString());
        }
        String str2 = this.symbol;
        if (str2 != null) {
            writableMapCreateMap.putString("symbol", str2.toString());
        }
        String str3 = this.currency;
        if (str3 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.CURRENCY, str3.toString());
        }
        Double d11 = this.offset;
        if (d11 != null) {
            writableMapCreateMap.putDouble(TypedValues.CycleType.S_WAVE_OFFSET, d11.doubleValue());
        }
        String str4 = this.type;
        if (str4 != null) {
            writableMapCreateMap.putString("type", str4.toString());
        }
        String str5 = this.side;
        if (str5 != null) {
            writableMapCreateMap.putString("side", str5.toString());
        }
        Double d12 = this.closeDate;
        if (d12 != null) {
            writableMapCreateMap.putDouble("closeDate", d12.doubleValue());
        }
        String str6 = this.realisedPnl;
        if (str6 != null) {
            writableMapCreateMap.putString("realisedPnl", str6.toString());
        }
        String str7 = this.marginMode;
        if (str7 != null) {
            writableMapCreateMap.putString("marginMode", str7.toString());
        }
        String str8 = this.leverage;
        if (str8 != null) {
            writableMapCreateMap.putString("leverage", str8.toString());
        }
        String str9 = this.closeType;
        if (str9 != null) {
            writableMapCreateMap.putString("closeType", str9.toString());
        }
        Double d13 = this.openTime;
        if (d13 != null) {
            writableMapCreateMap.putDouble("openTime", d13.doubleValue());
        }
        Boolean bool = this.isTrialFunds;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isTrialFunds", bool.booleanValue());
        }
        String str10 = this.prizeType;
        if (str10 != null) {
            writableMapCreateMap.putString("prizeType", str10.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ FuturesPositionPnlShareData(String str, String str2, String str3, Double d11, String str4, String str5, Double d12, String str6, String str7, String str8, String str9, Double d13, Boolean bool, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : d11, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : d12, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : d13, (i11 & 4096) != 0 ? null : bool, (i11 & 8192) != 0 ? null : str10);
    }
}
