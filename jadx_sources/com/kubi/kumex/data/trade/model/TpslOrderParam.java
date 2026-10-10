package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TpslOrderParam.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/TpslOrderParam;", "", "priceType", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", InterfaceC33730j9.f70350a, "size", "limitPrice", "isLimit", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getPriceType", "()Ljava/lang/String;", "getPrice", "()Ljava/math/BigDecimal;", "getStop", "getSize", "getLimitPrice", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TpslOrderParam {
    private final boolean isLimit;

    @Nullable
    private final BigDecimal limitPrice;

    @NotNull
    private final BigDecimal price;

    @NotNull
    private final String priceType;

    @Nullable
    private final BigDecimal size;

    @NotNull
    private final String stop;

    public TpslOrderParam(@NotNull String priceType, @NotNull BigDecimal price, @NotNull String stop, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop, "stop");
        this.priceType = priceType;
        this.price = price;
        this.stop = stop;
        this.size = bigDecimal;
        this.limitPrice = bigDecimal2;
        this.isLimit = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TpslOrderParam)) {
            return false;
        }
        TpslOrderParam tpslOrderParam = (TpslOrderParam) other;
        return Intrinsics.areEqual(this.priceType, tpslOrderParam.priceType) && Intrinsics.areEqual(this.price, tpslOrderParam.price) && Intrinsics.areEqual(this.stop, tpslOrderParam.stop) && Intrinsics.areEqual(this.size, tpslOrderParam.size) && Intrinsics.areEqual(this.limitPrice, tpslOrderParam.limitPrice) && this.isLimit == tpslOrderParam.isLimit;
    }

    public static /* synthetic */ TpslOrderParam copy$default(TpslOrderParam tpslOrderParam, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tpslOrderParam.priceType;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = tpslOrderParam.price;
        }
        if ((i11 & 4) != 0) {
            str2 = tpslOrderParam.stop;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = tpslOrderParam.size;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = tpslOrderParam.limitPrice;
        }
        if ((i11 & 32) != 0) {
            z11 = tpslOrderParam.isLimit;
        }
        BigDecimal bigDecimal4 = bigDecimal3;
        boolean z12 = z11;
        return tpslOrderParam.copy(str, bigDecimal, str2, bigDecimal2, bigDecimal4, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsLimit() {
        return this.isLimit;
    }

    @NotNull
    public final TpslOrderParam copy(@NotNull String priceType, @NotNull BigDecimal price, @NotNull String stop, @Nullable BigDecimal size, @Nullable BigDecimal limitPrice, boolean isLimit) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TpslOrderParam(priceType, price, stop, size, limitPrice, isLimit);
    }

    @Nullable
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    @NotNull
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPriceType() {
        return this.priceType;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @NotNull
    public final String getStop() {
        return this.stop;
    }

    public int hashCode() {
        int iHashCode = ((((this.priceType.hashCode() * 31) + this.price.hashCode()) * 31) + this.stop.hashCode()) * 31;
        BigDecimal bigDecimal = this.size;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.limitPrice;
        return ((iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLimit);
    }

    public final boolean isLimit() {
        return this.isLimit;
    }

    @NotNull
    public String toString() {
        return "TpslOrderParam(priceType=" + this.priceType + ", price=" + this.price + ", stop=" + this.stop + ", size=" + this.size + ", limitPrice=" + this.limitPrice + ", isLimit=" + this.isLimit + ')';
    }

    public /* synthetic */ TpslOrderParam(String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, str2, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? false : z11);
    }
}
