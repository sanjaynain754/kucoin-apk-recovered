package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiMarketModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketVisitorFavoriteEntity;", "", "currencyType", "", "symbol", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getCurrencyType", "()Ljava/lang/String;", "getSymbol", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketVisitorFavoriteEntity;", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiMarketVisitorFavoriteEntity {

    @NotNull
    private final String currencyType;

    @NotNull
    private final String symbol;

    @Nullable
    private final Long timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiMarketVisitorFavoriteEntity)) {
            return false;
        }
        KCJSApiMarketVisitorFavoriteEntity kCJSApiMarketVisitorFavoriteEntity = (KCJSApiMarketVisitorFavoriteEntity) other;
        return Intrinsics.areEqual(this.currencyType, kCJSApiMarketVisitorFavoriteEntity.currencyType) && Intrinsics.areEqual(this.symbol, kCJSApiMarketVisitorFavoriteEntity.symbol) && Intrinsics.areEqual(this.timestamp, kCJSApiMarketVisitorFavoriteEntity.timestamp);
    }

    public KCJSApiMarketVisitorFavoriteEntity(@NotNull String currencyType, @NotNull String symbol, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(currencyType, "currencyType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.currencyType = currencyType;
        this.symbol = symbol;
        this.timestamp = l11;
    }

    public static /* synthetic */ KCJSApiMarketVisitorFavoriteEntity copy$default(KCJSApiMarketVisitorFavoriteEntity kCJSApiMarketVisitorFavoriteEntity, String str, String str2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiMarketVisitorFavoriteEntity.currencyType;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiMarketVisitorFavoriteEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            l11 = kCJSApiMarketVisitorFavoriteEntity.timestamp;
        }
        return kCJSApiMarketVisitorFavoriteEntity.copy(str, str2, l11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyType() {
        return this.currencyType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final KCJSApiMarketVisitorFavoriteEntity copy(@NotNull String currencyType, @NotNull String symbol, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(currencyType, "currencyType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new KCJSApiMarketVisitorFavoriteEntity(currencyType, symbol, timestamp);
    }

    @NotNull
    public final String getCurrencyType() {
        return this.currencyType;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((this.currencyType.hashCode() * 31) + this.symbol.hashCode()) * 31;
        Long l11 = this.timestamp;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "KCJSApiMarketVisitorFavoriteEntity(currencyType=" + this.currencyType + ", symbol=" + this.symbol + ", timestamp=" + this.timestamp + ')';
    }
}
