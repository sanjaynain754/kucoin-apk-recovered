package com.kubi.search.api;

import com.kubi.router.core.Router;
import com.kubi.search.api.entity.SearchHintEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ISearchService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/search/api/ISearchService;", "", "getSearchHintWord", "Lcom/kubi/search/api/entity/SearchHintEntity;", "Companion", "SearchApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISearchService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f48774a = Companion.f48775a;

    /* JADX INFO: compiled from: ISearchService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/search/api/ISearchService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/search/api/ISearchService;", "SearchApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f48775a = new Companion();

        @NotNull
        public final ISearchService get() {
            return (ISearchService) Router.f46192a.m56192n(ISearchService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    SearchHintEntity mo59108a();
}
