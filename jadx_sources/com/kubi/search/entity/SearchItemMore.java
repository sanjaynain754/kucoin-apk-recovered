package com.kubi.search.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ISearchResultData.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/search/entity/SearchItemMore;", "Lcom/kubi/search/entity/ISearchResultData;", "category", "", "totalCount", "", "<init>", "(Ljava/lang/String;I)V", "getCategory", "()Ljava/lang/String;", "getTotalCount", "()I", "getItemType", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchItemMore implements ISearchResultData {

    @NotNull
    private final String category;
    private final int totalCount;

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF17248b() {
        return 4;
    }

    public SearchItemMore(@NotNull String category, int i11) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
        this.totalCount = i11;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }
}
