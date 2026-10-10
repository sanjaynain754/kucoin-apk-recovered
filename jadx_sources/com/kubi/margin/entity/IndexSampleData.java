package com.kubi.margin.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IndexData.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/margin/entity/IndexSampleData;", "", "exchange", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "symbol", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getExchange", "()Ljava/lang/String;", "getPrice", "()Ljava/math/BigDecimal;", "getSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IndexSampleData {

    @Nullable
    private final String exchange;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexSampleData)) {
            return false;
        }
        IndexSampleData indexSampleData = (IndexSampleData) other;
        return Intrinsics.areEqual(this.exchange, indexSampleData.exchange) && Intrinsics.areEqual(this.price, indexSampleData.price) && Intrinsics.areEqual(this.symbol, indexSampleData.symbol);
    }

    public static /* synthetic */ IndexSampleData copy$default(IndexSampleData indexSampleData, String str, BigDecimal bigDecimal, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = indexSampleData.exchange;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = indexSampleData.price;
        }
        if ((i11 & 4) != 0) {
            str2 = indexSampleData.symbol;
        }
        return indexSampleData.copy(str, bigDecimal, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExchange() {
        return this.exchange;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final IndexSampleData copy(@Nullable String exchange, @Nullable BigDecimal price, @Nullable String symbol) {
        return new IndexSampleData(exchange, price, symbol);
    }

    @Nullable
    public final String getExchange() {
        return this.exchange;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.exchange;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.symbol;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IndexSampleData(exchange=" + this.exchange + ", price=" + this.price + ", symbol=" + this.symbol + ')';
    }

    public IndexSampleData(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2) {
        this.exchange = str;
        this.price = bigDecimal;
        this.symbol = str2;
    }
}
