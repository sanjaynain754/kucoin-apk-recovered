package cm;

import com.appsflyer.AppsFlyerProperties;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.p, reason: from toString */
/* JADX INFO: compiled from: OrderParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jµ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006<"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SubmitStopOrderParams;", "", "symbol", "", "side", "size", "positionSide", "marginMode", "upType", "upPrice", "Ljava/math/BigDecimal;", "downType", "downPrice", "upTriggerDirection", "downTriggerDirection", "validationToken", "orderId", AppsFlyerProperties.CHANNEL, InterfaceC33730j9.f70350a, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getSide", "getSize", "getPositionSide", "getMarginMode", "getUpType", "getUpPrice", "()Ljava/math/BigDecimal;", "getDownType", "getDownPrice", "getUpTriggerDirection", "getDownTriggerDirection", "getValidationToken", "getOrderId", "getChannel", "getStop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitStopOrderParams {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String side;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String size;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String positionSide;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String marginMode;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final String upType;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final BigDecimal upPrice;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final String downType;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final BigDecimal downPrice;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final String upTriggerDirection;

    /* JADX INFO: renamed from: k, reason: from toString */
    @Nullable
    public final String downTriggerDirection;

    /* JADX INFO: renamed from: l, reason: from toString */
    @Nullable
    public final String validationToken;

    /* JADX INFO: renamed from: m, reason: from toString */
    @Nullable
    public final String orderId;

    /* JADX INFO: renamed from: n, reason: from toString */
    @Nullable
    public final String channel;

    /* JADX INFO: renamed from: o, reason: from toString */
    @Nullable
    public final String stop;

    public SubmitStopOrderParams(@NotNull String symbol, @NotNull String side, @Nullable String str, @NotNull String positionSide, @NotNull String marginMode, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionSide, "positionSide");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        this.symbol = symbol;
        this.side = side;
        this.size = str;
        this.positionSide = positionSide;
        this.marginMode = marginMode;
        this.upType = str2;
        this.upPrice = bigDecimal;
        this.downType = str3;
        this.downPrice = bigDecimal2;
        this.upTriggerDirection = str4;
        this.downTriggerDirection = str5;
        this.validationToken = str6;
        this.orderId = str7;
        this.channel = str8;
        this.stop = str9;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitStopOrderParams)) {
            return false;
        }
        SubmitStopOrderParams submitStopOrderParams = (SubmitStopOrderParams) other;
        return Intrinsics.areEqual(this.symbol, submitStopOrderParams.symbol) && Intrinsics.areEqual(this.side, submitStopOrderParams.side) && Intrinsics.areEqual(this.size, submitStopOrderParams.size) && Intrinsics.areEqual(this.positionSide, submitStopOrderParams.positionSide) && Intrinsics.areEqual(this.marginMode, submitStopOrderParams.marginMode) && Intrinsics.areEqual(this.upType, submitStopOrderParams.upType) && Intrinsics.areEqual(this.upPrice, submitStopOrderParams.upPrice) && Intrinsics.areEqual(this.downType, submitStopOrderParams.downType) && Intrinsics.areEqual(this.downPrice, submitStopOrderParams.downPrice) && Intrinsics.areEqual(this.upTriggerDirection, submitStopOrderParams.upTriggerDirection) && Intrinsics.areEqual(this.downTriggerDirection, submitStopOrderParams.downTriggerDirection) && Intrinsics.areEqual(this.validationToken, submitStopOrderParams.validationToken) && Intrinsics.areEqual(this.orderId, submitStopOrderParams.orderId) && Intrinsics.areEqual(this.channel, submitStopOrderParams.channel) && Intrinsics.areEqual(this.stop, submitStopOrderParams.stop);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getDownPrice() {
        return this.downPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDownTriggerDirection() {
        return this.downTriggerDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDownType() {
        return this.downType;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + this.side.hashCode()) * 31;
        String str = this.size;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.positionSide.hashCode()) * 31) + this.marginMode.hashCode()) * 31;
        String str2 = this.upType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.upPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.downType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.downPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str4 = this.upTriggerDirection;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.downTriggerDirection;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validationToken;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orderId;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.channel;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.stop;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStop() {
        return this.stop;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final BigDecimal getUpPrice() {
        return this.upPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getUpTriggerDirection() {
        return this.upTriggerDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getUpType() {
        return this.upType;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @NotNull
    public String toString() {
        return "SubmitStopOrderParams(symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", positionSide=" + this.positionSide + ", marginMode=" + this.marginMode + ", upType=" + this.upType + ", upPrice=" + this.upPrice + ", downType=" + this.downType + ", downPrice=" + this.downPrice + ", upTriggerDirection=" + this.upTriggerDirection + ", downTriggerDirection=" + this.downTriggerDirection + ", validationToken=" + this.validationToken + ", orderId=" + this.orderId + ", channel=" + this.channel + ", stop=" + this.stop + ')';
    }

    public /* synthetic */ SubmitStopOrderParams(String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, String str7, BigDecimal bigDecimal2, String str8, String str9, String str10, String str11, String str12, String str13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : bigDecimal, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : bigDecimal2, str8, str9, (i11 & 2048) != 0 ? null : str10, (i11 & 4096) != 0 ? null : str11, (i11 & 8192) != 0 ? null : str12, (i11 & 16384) != 0 ? null : str13);
    }
}
