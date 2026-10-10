package com.kubi.search.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchHistoryBean.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/search/entity/SearchHistoryBean;", "", "category", "", "symbol", "showSymbol", "beanEarnEntity", "Lcom/kubi/search/entity/ExtendEntity;", "beanWeb3Entity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/search/entity/ExtendEntity;Lcom/kubi/search/entity/ExtendEntity;)V", "getCategory", "()Ljava/lang/String;", "getSymbol", "getShowSymbol", "getBeanEarnEntity", "()Lcom/kubi/search/entity/ExtendEntity;", "getBeanWeb3Entity", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchHistoryBean {

    @Nullable
    private final ExtendEntity beanEarnEntity;

    @Nullable
    private final ExtendEntity beanWeb3Entity;

    @NotNull
    private final String category;

    @NotNull
    private final String showSymbol;

    @NotNull
    private final String symbol;

    public SearchHistoryBean(@NotNull String category, @NotNull String symbol, @NotNull String showSymbol, @Nullable ExtendEntity extendEntity, @Nullable ExtendEntity extendEntity2) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(showSymbol, "showSymbol");
        this.category = category;
        this.symbol = symbol;
        this.showSymbol = showSymbol;
        this.beanEarnEntity = extendEntity;
        this.beanWeb3Entity = extendEntity2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHistoryBean)) {
            return false;
        }
        SearchHistoryBean searchHistoryBean = (SearchHistoryBean) other;
        return Intrinsics.areEqual(this.category, searchHistoryBean.category) && Intrinsics.areEqual(this.symbol, searchHistoryBean.symbol) && Intrinsics.areEqual(this.showSymbol, searchHistoryBean.showSymbol) && Intrinsics.areEqual(this.beanEarnEntity, searchHistoryBean.beanEarnEntity) && Intrinsics.areEqual(this.beanWeb3Entity, searchHistoryBean.beanWeb3Entity);
    }

    public static /* synthetic */ SearchHistoryBean copy$default(SearchHistoryBean searchHistoryBean, String str, String str2, String str3, ExtendEntity extendEntity, ExtendEntity extendEntity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchHistoryBean.category;
        }
        if ((i11 & 2) != 0) {
            str2 = searchHistoryBean.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = searchHistoryBean.showSymbol;
        }
        if ((i11 & 8) != 0) {
            extendEntity = searchHistoryBean.beanEarnEntity;
        }
        if ((i11 & 16) != 0) {
            extendEntity2 = searchHistoryBean.beanWeb3Entity;
        }
        ExtendEntity extendEntity3 = extendEntity2;
        String str4 = str3;
        return searchHistoryBean.copy(str, str2, str4, extendEntity, extendEntity3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShowSymbol() {
        return this.showSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExtendEntity getBeanEarnEntity() {
        return this.beanEarnEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ExtendEntity getBeanWeb3Entity() {
        return this.beanWeb3Entity;
    }

    @NotNull
    public final SearchHistoryBean copy(@NotNull String category, @NotNull String symbol, @NotNull String showSymbol, @Nullable ExtendEntity beanEarnEntity, @Nullable ExtendEntity beanWeb3Entity) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(showSymbol, "showSymbol");
        return new SearchHistoryBean(category, symbol, showSymbol, beanEarnEntity, beanWeb3Entity);
    }

    @Nullable
    public final ExtendEntity getBeanEarnEntity() {
        return this.beanEarnEntity;
    }

    @Nullable
    public final ExtendEntity getBeanWeb3Entity() {
        return this.beanWeb3Entity;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getShowSymbol() {
        return this.showSymbol;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((((this.category.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.showSymbol.hashCode()) * 31;
        ExtendEntity extendEntity = this.beanEarnEntity;
        int iHashCode2 = (iHashCode + (extendEntity == null ? 0 : extendEntity.hashCode())) * 31;
        ExtendEntity extendEntity2 = this.beanWeb3Entity;
        return iHashCode2 + (extendEntity2 != null ? extendEntity2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchHistoryBean(category=" + this.category + ", symbol=" + this.symbol + ", showSymbol=" + this.showSymbol + ", beanEarnEntity=" + this.beanEarnEntity + ", beanWeb3Entity=" + this.beanWeb3Entity + ')';
    }

    public /* synthetic */ SearchHistoryBean(String str, String str2, String str3, ExtendEntity extendEntity, ExtendEntity extendEntity2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : extendEntity, (i11 & 16) != 0 ? null : extendEntity2);
    }
}
