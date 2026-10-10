package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavSimpleParam.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FavEditChildEntity;", "", "symbol", "", "symbolName", "", "isSelect", "", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;ZI)V", "getSymbol", "()Ljava/lang/String;", "getSymbolName", "()Ljava/lang/CharSequence;", "()Z", "setSelect", "(Z)V", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FavEditChildEntity {
    private boolean isSelect;

    @NotNull
    private final String symbol;

    @NotNull
    private final CharSequence symbolName;
    private int type;

    public FavEditChildEntity(@NotNull String symbol, @NotNull CharSequence symbolName, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        this.symbol = symbol;
        this.symbolName = symbolName;
        this.isSelect = z11;
        this.type = i11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavEditChildEntity)) {
            return false;
        }
        FavEditChildEntity favEditChildEntity = (FavEditChildEntity) other;
        return Intrinsics.areEqual(this.symbol, favEditChildEntity.symbol) && Intrinsics.areEqual(this.symbolName, favEditChildEntity.symbolName) && this.isSelect == favEditChildEntity.isSelect && this.type == favEditChildEntity.type;
    }

    public static /* synthetic */ FavEditChildEntity copy$default(FavEditChildEntity favEditChildEntity, String str, CharSequence charSequence, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = favEditChildEntity.symbol;
        }
        if ((i12 & 2) != 0) {
            charSequence = favEditChildEntity.symbolName;
        }
        if ((i12 & 4) != 0) {
            z11 = favEditChildEntity.isSelect;
        }
        if ((i12 & 8) != 0) {
            i11 = favEditChildEntity.type;
        }
        return favEditChildEntity.copy(str, charSequence, z11, i11);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final FavEditChildEntity copy(@NotNull String symbol, @NotNull CharSequence symbolName, boolean isSelect, int type) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(symbolName, "symbolName");
        return new FavEditChildEntity(symbol, symbolName, isSelect, type);
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final CharSequence getSymbolName() {
        return this.symbolName;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.symbol.hashCode() * 31) + this.symbolName.hashCode()) * 31) + Boolean.hashCode(this.isSelect)) * 31) + Integer.hashCode(this.type);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z11) {
        this.isSelect = z11;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    @NotNull
    public String toString() {
        return "FavEditChildEntity(symbol=" + this.symbol + ", symbolName=" + ((Object) this.symbolName) + ", isSelect=" + this.isSelect + ", type=" + this.type + ')';
    }

    public /* synthetic */ FavEditChildEntity(String str, CharSequence charSequence, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? 1 : i11);
    }
}
