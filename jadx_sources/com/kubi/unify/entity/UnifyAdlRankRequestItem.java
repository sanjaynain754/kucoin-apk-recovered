package com.kubi.unify.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyAdlRankRequestItem;", "", "symbol", "", "isLong", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/unify/entity/UnifyAdlRankRequestItem;", "equals", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyAdlRankRequestItem {

    @Nullable
    private final Boolean isLong;

    @Nullable
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyAdlRankRequestItem)) {
            return false;
        }
        UnifyAdlRankRequestItem unifyAdlRankRequestItem = (UnifyAdlRankRequestItem) other;
        return Intrinsics.areEqual(this.symbol, unifyAdlRankRequestItem.symbol) && Intrinsics.areEqual(this.isLong, unifyAdlRankRequestItem.isLong);
    }

    public static /* synthetic */ UnifyAdlRankRequestItem copy$default(UnifyAdlRankRequestItem unifyAdlRankRequestItem, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyAdlRankRequestItem.symbol;
        }
        if ((i11 & 2) != 0) {
            bool = unifyAdlRankRequestItem.isLong;
        }
        return unifyAdlRankRequestItem.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsLong() {
        return this.isLong;
    }

    @NotNull
    public final UnifyAdlRankRequestItem copy(@Nullable String symbol, @Nullable Boolean isLong) {
        return new UnifyAdlRankRequestItem(symbol, isLong);
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLong;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLong() {
        return this.isLong;
    }

    @NotNull
    public String toString() {
        return "UnifyAdlRankRequestItem(symbol=" + this.symbol + ", isLong=" + this.isLong + ')';
    }

    public UnifyAdlRankRequestItem(@Nullable String str, @Nullable Boolean bool) {
        this.symbol = str;
        this.isLong = bool;
    }
}
