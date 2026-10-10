package u10;

import com.kubi.search.api.ISearchService;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.search.config.SearchHintConfig;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: u10.a */
/* JADX INFO: compiled from: SearchService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/search/service/SearchService;", "Lcom/kubi/search/api/ISearchService;", "<init>", "()V", "getSearchHintWord", "Lcom/kubi/search/api/entity/SearchHintEntity;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45094a implements ISearchService {
    @Override // com.kubi.search.api.ISearchService
    @Nullable
    /* JADX INFO: renamed from: a */
    public SearchHintEntity mo59108a() {
        return SearchHintConfig.f48860a.m59120c();
    }
}
