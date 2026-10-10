package com.kubi.quotefacade.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.g1, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: FavCacheManager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/FavItem;", "", "symbol", "", "timestamp", "", "<init>", "(Ljava/lang/String;J)V", "getSymbol", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FavItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final long timestamp;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavItem)) {
            return false;
        }
        FavItem favItem = (FavItem) other;
        return Intrinsics.areEqual(this.symbol, favItem.symbol) && this.timestamp == favItem.timestamp;
    }

    public FavItem(@NotNull String symbol, long j11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.timestamp = j11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (this.symbol.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "FavItem(symbol=" + this.symbol + ", timestamp=" + this.timestamp + ')';
    }
}
