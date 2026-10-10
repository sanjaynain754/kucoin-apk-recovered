package com.kubi.search.utils;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchInitialBiz.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/search/utils/SearchInitialResult;", "", Constants.BIZ, "Lcom/kubi/search/utils/SearchInitialBiz;", "hasData", "", "<init>", "(Lcom/kubi/search/utils/SearchInitialBiz;Z)V", "getBiz", "()Lcom/kubi/search/utils/SearchInitialBiz;", "getHasData", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchInitialResult {

    @NotNull
    private final SearchInitialBiz biz;
    private final boolean hasData;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchInitialResult)) {
            return false;
        }
        SearchInitialResult searchInitialResult = (SearchInitialResult) other;
        return this.biz == searchInitialResult.biz && this.hasData == searchInitialResult.hasData;
    }

    public SearchInitialResult(@NotNull SearchInitialBiz biz, boolean z11) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.biz = biz;
        this.hasData = z11;
    }

    public static /* synthetic */ SearchInitialResult copy$default(SearchInitialResult searchInitialResult, SearchInitialBiz searchInitialBiz, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            searchInitialBiz = searchInitialResult.biz;
        }
        if ((i11 & 2) != 0) {
            z11 = searchInitialResult.hasData;
        }
        return searchInitialResult.copy(searchInitialBiz, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SearchInitialBiz getBiz() {
        return this.biz;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    @NotNull
    public final SearchInitialResult copy(@NotNull SearchInitialBiz biz, boolean hasData) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        return new SearchInitialResult(biz, hasData);
    }

    @NotNull
    public final SearchInitialBiz getBiz() {
        return this.biz;
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public int hashCode() {
        return (this.biz.hashCode() * 31) + Boolean.hashCode(this.hasData);
    }

    @NotNull
    public String toString() {
        return "SearchInitialResult(biz=" + this.biz + ", hasData=" + this.hasData + ')';
    }
}
