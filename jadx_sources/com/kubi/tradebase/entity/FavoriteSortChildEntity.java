package com.kubi.tradebase.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavoriteSortChildEntity.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradebase/entity/FavoriteSortChildEntity;", "", "symbol", "", "symbolName", "", "isSelect", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Z)V", "getSymbol", "()Ljava/lang/String;", "getSymbolName", "()Ljava/lang/CharSequence;", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FavoriteSortChildEntity {
    private boolean isSelect;

    @NotNull
    private final String symbol;

    @NotNull
    private final CharSequence symbolName;

    public FavoriteSortChildEntity(@NotNull String symbol, @NotNull CharSequence symbolName, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        this.symbol = symbol;
        this.symbolName = symbolName;
        this.isSelect = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteSortChildEntity)) {
            return false;
        }
        FavoriteSortChildEntity favoriteSortChildEntity = (FavoriteSortChildEntity) other;
        return Intrinsics.areEqual(this.symbol, favoriteSortChildEntity.symbol) && Intrinsics.areEqual(this.symbolName, favoriteSortChildEntity.symbolName) && this.isSelect == favoriteSortChildEntity.isSelect;
    }

    public static /* synthetic */ FavoriteSortChildEntity copy$default(FavoriteSortChildEntity favoriteSortChildEntity, String str, CharSequence charSequence, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favoriteSortChildEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            charSequence = favoriteSortChildEntity.symbolName;
        }
        if ((i11 & 4) != 0) {
            z11 = favoriteSortChildEntity.isSelect;
        }
        return favoriteSortChildEntity.copy(str, charSequence, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getSymbolName() {
        return this.symbolName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final FavoriteSortChildEntity copy(@NotNull String symbol, @NotNull CharSequence symbolName, boolean isSelect) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        return new FavoriteSortChildEntity(symbol, symbolName, isSelect);
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final CharSequence getSymbolName() {
        return this.symbolName;
    }

    public int hashCode() {
        return (((this.symbol.hashCode() * 31) + this.symbolName.hashCode()) * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z11) {
        this.isSelect = z11;
    }

    @NotNull
    public String toString() {
        return "FavoriteSortChildEntity(symbol=" + this.symbol + ", symbolName=" + ((Object) this.symbolName) + ", isSelect=" + this.isSelect + ')';
    }

    public /* synthetic */ FavoriteSortChildEntity(String str, CharSequence charSequence, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i11 & 4) != 0 ? false : z11);
    }
}
