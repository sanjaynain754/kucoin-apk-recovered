package vc;

import com.kubi.core.biz.offline.SymbolOfflineData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: vc.a */
/* JADX INFO: compiled from: SpotApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/api/SpotApi;", "", "getSymbolsOffline", "", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "symbols", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45491a {
    @GET("v1/kc/symbol/offline_info")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m100453a(@Nullable @Query("symbols") List<String> list, @NotNull Continuation<? super List<SymbolOfflineData>> continuation) throws Exception;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m100452b(InterfaceC45491a interfaceC45491a, List list, Continuation continuation, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSymbolsOffline");
        }
        if ((i11 & 1) != 0) {
            list = null;
        }
        return interfaceC45491a.m100453a(list, continuation);
    }
}
