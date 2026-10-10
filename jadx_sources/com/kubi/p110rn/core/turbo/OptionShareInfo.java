package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCopyTradingTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/OptionShareInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "tradeDisplaySymbol", "", "tradePnlValue", "tradeAveragePrice", "tradeExitPrice", "tradeSettleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeDisplaySymbol", "()Ljava/lang/String;", "getTradePnlValue", "getTradeAveragePrice", "getTradeExitPrice", "getTradeSettleCurrency", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCopyTradingTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCopyTradingTurboModule.kt\ncom/kubi/rn/core/turbo/OptionShareInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final /* data */ class OptionShareInfo implements WritableMapSerializable {

    @Nullable
    private final String tradeAveragePrice;

    @Nullable
    private final String tradeDisplaySymbol;

    @Nullable
    private final String tradeExitPrice;

    @Nullable
    private final String tradePnlValue;

    @Nullable
    private final String tradeSettleCurrency;

    public OptionShareInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionShareInfo)) {
            return false;
        }
        OptionShareInfo optionShareInfo = (OptionShareInfo) other;
        return Intrinsics.areEqual(this.tradeDisplaySymbol, optionShareInfo.tradeDisplaySymbol) && Intrinsics.areEqual(this.tradePnlValue, optionShareInfo.tradePnlValue) && Intrinsics.areEqual(this.tradeAveragePrice, optionShareInfo.tradeAveragePrice) && Intrinsics.areEqual(this.tradeExitPrice, optionShareInfo.tradeExitPrice) && Intrinsics.areEqual(this.tradeSettleCurrency, optionShareInfo.tradeSettleCurrency);
    }

    public OptionShareInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.tradeDisplaySymbol = str;
        this.tradePnlValue = str2;
        this.tradeAveragePrice = str3;
        this.tradeExitPrice = str4;
        this.tradeSettleCurrency = str5;
    }

    public static /* synthetic */ OptionShareInfo copy$default(OptionShareInfo optionShareInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = optionShareInfo.tradeDisplaySymbol;
        }
        if ((i11 & 2) != 0) {
            str2 = optionShareInfo.tradePnlValue;
        }
        if ((i11 & 4) != 0) {
            str3 = optionShareInfo.tradeAveragePrice;
        }
        if ((i11 & 8) != 0) {
            str4 = optionShareInfo.tradeExitPrice;
        }
        if ((i11 & 16) != 0) {
            str5 = optionShareInfo.tradeSettleCurrency;
        }
        String str6 = str5;
        String str7 = str3;
        return optionShareInfo.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeDisplaySymbol() {
        return this.tradeDisplaySymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTradeAveragePrice() {
        return this.tradeAveragePrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTradeExitPrice() {
        return this.tradeExitPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    @NotNull
    public final OptionShareInfo copy(@Nullable String tradeDisplaySymbol, @Nullable String tradePnlValue, @Nullable String tradeAveragePrice, @Nullable String tradeExitPrice, @Nullable String tradeSettleCurrency) {
        return new OptionShareInfo(tradeDisplaySymbol, tradePnlValue, tradeAveragePrice, tradeExitPrice, tradeSettleCurrency);
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
    public final String getTradePnlValue() {
        return this.tradePnlValue;
    }

    @Nullable
    public final String getTradeSettleCurrency() {
        return this.tradeSettleCurrency;
    }

    public int hashCode() {
        String str = this.tradeDisplaySymbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tradePnlValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tradeAveragePrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tradeExitPrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tradeSettleCurrency;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OptionShareInfo(tradeDisplaySymbol=" + this.tradeDisplaySymbol + ", tradePnlValue=" + this.tradePnlValue + ", tradeAveragePrice=" + this.tradeAveragePrice + ", tradeExitPrice=" + this.tradeExitPrice + ", tradeSettleCurrency=" + this.tradeSettleCurrency + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.tradeDisplaySymbol;
        if (str != null) {
            writableMapCreateMap.putString("tradeDisplaySymbol", str.toString());
        }
        String str2 = this.tradePnlValue;
        if (str2 != null) {
            writableMapCreateMap.putString("tradePnlValue", str2.toString());
        }
        String str3 = this.tradeAveragePrice;
        if (str3 != null) {
            writableMapCreateMap.putString("tradeAveragePrice", str3.toString());
        }
        String str4 = this.tradeExitPrice;
        if (str4 != null) {
            writableMapCreateMap.putString("tradeExitPrice", str4.toString());
        }
        String str5 = this.tradeSettleCurrency;
        if (str5 != null) {
            writableMapCreateMap.putString("tradeSettleCurrency", str5.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ OptionShareInfo(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
