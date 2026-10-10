package p60;

import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.unify.unify.common.history.UnifyPositionDetailEntity;
import com.kubi.unify.unify.common.history.UnifyProfitRecordEntity;
import com.kubi.unify.unify.common.history.UnifyTradeRecordEntity;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: p60.a */
/* JADX INFO: compiled from: IHistoryApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH'J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH'J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000eH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/common/history/IHistoryApi;", "", "fetchProfitRecord", "Lcom/kubi/unify/entity/UnifyPageEntity;", "Lcom/kubi/unify/unify/common/history/UnifyProfitRecordEntity;", "paramsMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "fetchProfitDetail", "Lcom/kubi/unify/unify/common/history/UnifyPositionDetailEntity;", "fetchTradeRecord", "Lcom/kubi/unify/unify/common/history/UnifyTradeRecordEntity;", "request", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43392a {
    @GET("ultra-position/unified/inner/position/history-position-list")
    @NotNull
    /* JADX INFO: renamed from: a */
    UnifyPageEntity<UnifyProfitRecordEntity> m95568a(@QueryMap @NotNull HashMap<String, String> map) throws Throwable;

    @GET("ultra-order/unified/inner/orders/fills")
    @NotNull
    /* JADX INFO: renamed from: d */
    UnifyPageEntity<UnifyTradeRecordEntity> m95569d(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @GET("ultra-position/unified/inner/position/history-pnl-detail-list")
    @NotNull
    /* JADX INFO: renamed from: e */
    UnifyPageEntity<UnifyPositionDetailEntity> m95570e(@QueryMap @NotNull HashMap<String, String> map) throws Throwable;
}
