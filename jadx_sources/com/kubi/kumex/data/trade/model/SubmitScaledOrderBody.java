package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitScaledOrderBody.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001f¨\u00060"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "", "symbol", "", "tradeType", "side", AppsFlyerProperties.CHANNEL, "sizeUnit", "marginMode", "reduceOnly", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/kumex/data/trade/model/ScaledOrderItem;", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getTradeType", "getSide", "getChannel", "getSizeUnit", "getMarginMode", "getReduceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItems", "()Ljava/util/List;", "getValidationToken", "setValidationToken", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitScaledOrderBody {

    @NotNull
    private final String channel;

    @NotNull
    private final List<ScaledOrderItem> items;

    @Nullable
    private final String marginMode;

    @Nullable
    private final Boolean reduceOnly;

    @NotNull
    private final String side;

    @NotNull
    private final String sizeUnit;

    @NotNull
    private final String symbol;

    @NotNull
    private final String tradeType;

    @Nullable
    private transient String validationToken;

    public SubmitScaledOrderBody(@NotNull String symbol, @NotNull String tradeType, @NotNull String side, @NotNull String channel, @NotNull String sizeUnit, @Nullable String str, @Nullable Boolean bool, @NotNull List<ScaledOrderItem> items, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
        Intrinsics.checkNotNullParameter(items, "items");
        this.symbol = symbol;
        this.tradeType = tradeType;
        this.side = side;
        this.channel = channel;
        this.sizeUnit = sizeUnit;
        this.marginMode = str;
        this.reduceOnly = bool;
        this.items = items;
        this.validationToken = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitScaledOrderBody)) {
            return false;
        }
        SubmitScaledOrderBody submitScaledOrderBody = (SubmitScaledOrderBody) other;
        return Intrinsics.areEqual(this.symbol, submitScaledOrderBody.symbol) && Intrinsics.areEqual(this.tradeType, submitScaledOrderBody.tradeType) && Intrinsics.areEqual(this.side, submitScaledOrderBody.side) && Intrinsics.areEqual(this.channel, submitScaledOrderBody.channel) && Intrinsics.areEqual(this.sizeUnit, submitScaledOrderBody.sizeUnit) && Intrinsics.areEqual(this.marginMode, submitScaledOrderBody.marginMode) && Intrinsics.areEqual(this.reduceOnly, submitScaledOrderBody.reduceOnly) && Intrinsics.areEqual(this.items, submitScaledOrderBody.items) && Intrinsics.areEqual(this.validationToken, submitScaledOrderBody.validationToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitScaledOrderBody copy$default(SubmitScaledOrderBody submitScaledOrderBody, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, List list, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitScaledOrderBody.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = submitScaledOrderBody.tradeType;
        }
        if ((i11 & 4) != 0) {
            str3 = submitScaledOrderBody.side;
        }
        if ((i11 & 8) != 0) {
            str4 = submitScaledOrderBody.channel;
        }
        if ((i11 & 16) != 0) {
            str5 = submitScaledOrderBody.sizeUnit;
        }
        if ((i11 & 32) != 0) {
            str6 = submitScaledOrderBody.marginMode;
        }
        if ((i11 & 64) != 0) {
            bool = submitScaledOrderBody.reduceOnly;
        }
        if ((i11 & 128) != 0) {
            list = submitScaledOrderBody.items;
        }
        if ((i11 & 256) != 0) {
            str7 = submitScaledOrderBody.validationToken;
        }
        List list2 = list;
        String str8 = str7;
        String str9 = str6;
        Boolean bool2 = bool;
        String str10 = str5;
        String str11 = str3;
        return submitScaledOrderBody.copy(str, str2, str11, str4, str10, str9, bool2, list2, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    @NotNull
    public final List<ScaledOrderItem> component8() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @NotNull
    public final SubmitScaledOrderBody copy(@NotNull String symbol, @NotNull String tradeType, @NotNull String side, @NotNull String channel, @NotNull String sizeUnit, @Nullable String marginMode, @Nullable Boolean reduceOnly, @NotNull List<ScaledOrderItem> items, @Nullable String validationToken) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
        Intrinsics.checkNotNullParameter(items, "items");
        return new SubmitScaledOrderBody(symbol, tradeType, side, channel, sizeUnit, marginMode, reduceOnly, items, validationToken);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final List<ScaledOrderItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    public final String getValidationToken() {
        return this.validationToken;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.symbol.hashCode() * 31) + this.tradeType.hashCode()) * 31) + this.side.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.sizeUnit.hashCode()) * 31;
        String str = this.marginMode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reduceOnly;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.items.hashCode()) * 31;
        String str2 = this.validationToken;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setValidationToken(@Nullable String str) {
        this.validationToken = str;
    }

    @NotNull
    public String toString() {
        return "SubmitScaledOrderBody(symbol=" + this.symbol + ", tradeType=" + this.tradeType + ", side=" + this.side + ", channel=" + this.channel + ", sizeUnit=" + this.sizeUnit + ", marginMode=" + this.marginMode + ", reduceOnly=" + this.reduceOnly + ", items=" + this.items + ", validationToken=" + this.validationToken + ')';
    }

    public /* synthetic */ SubmitScaledOrderBody(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, List list, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, bool, list, (i11 & 256) != 0 ? null : str7);
    }
}
