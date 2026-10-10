package s10;

import com.kubi.search.SearchApi;
import com.kubi.search.entity.ContractEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: s10.a */
/* JADX INFO: compiled from: ISearchDataSourceFlavor.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/search/flavor/ISearchDataSourceFlavor;", "", "flavorFetchFuturesData", "", "Lcom/kubi/search/entity/ContractEntity;", "api", "Lcom/kubi/search/SearchApi;", "(Lcom/kubi/search/SearchApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44267a {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m97686a(@NotNull SearchApi searchApi, @NotNull Continuation<? super List<ContractEntity>> continuation);
}
