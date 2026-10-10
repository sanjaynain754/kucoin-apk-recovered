package com.kubi.search.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchLoginFavorEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/search/entity/SearchLoginFavorEntity;", "", "symbol", "", "favor", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "getFavor", "()Ljava/lang/Boolean;", "setFavor", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/search/entity/SearchLoginFavorEntity;", "equals", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchLoginFavorEntity {

    @Nullable
    private Boolean favor;

    @Nullable
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchLoginFavorEntity)) {
            return false;
        }
        SearchLoginFavorEntity searchLoginFavorEntity = (SearchLoginFavorEntity) other;
        return Intrinsics.areEqual(this.symbol, searchLoginFavorEntity.symbol) && Intrinsics.areEqual(this.favor, searchLoginFavorEntity.favor);
    }

    public static /* synthetic */ SearchLoginFavorEntity copy$default(SearchLoginFavorEntity searchLoginFavorEntity, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchLoginFavorEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bool = searchLoginFavorEntity.favor;
        }
        return searchLoginFavorEntity.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getFavor() {
        return this.favor;
    }

    @NotNull
    public final SearchLoginFavorEntity copy(@Nullable String symbol, @Nullable Boolean favor) {
        return new SearchLoginFavorEntity(symbol, favor);
    }

    @Nullable
    public final Boolean getFavor() {
        return this.favor;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.favor;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final void setFavor(@Nullable Boolean bool) {
        this.favor = bool;
    }

    @NotNull
    public String toString() {
        return "SearchLoginFavorEntity(symbol=" + this.symbol + ", favor=" + this.favor + ')';
    }

    public SearchLoginFavorEntity(@Nullable String str, @Nullable Boolean bool) {
        this.symbol = str;
        this.favor = bool;
    }
}
