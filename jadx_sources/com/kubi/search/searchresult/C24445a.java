package com.kubi.search.searchresult;

import com.kubi.search.entity.SearchResultViewData;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.search.searchresult.a */
/* JADX INFO: compiled from: SearchIS.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchIS$SearchResultViewDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "viewData", "Lcom/kubi/search/entity/SearchResultViewData;", "<init>", "(Lcom/kubi/search/entity/SearchResultViewData;)V", "getViewData", "()Lcom/kubi/search/entity/SearchResultViewData;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24445a implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SearchResultViewData f49044a;

    public C24445a(@NotNull SearchResultViewData viewData) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        this.f49044a = viewData;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SearchResultViewData getF49044a() {
        return this.f49044a;
    }
}
