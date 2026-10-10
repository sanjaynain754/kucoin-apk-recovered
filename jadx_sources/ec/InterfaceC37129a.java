package ec;

import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.sdk.PageEntity;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: ec.a */
/* JADX INFO: compiled from: IHistoryApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032.\b\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b`\tH'J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032.\b\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b`\tH'J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0019\b\u0001\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u000fH'J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0014H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/history/IHistoryApi;", "", "fetchProfitRecord", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "paramsMap", "Ljava/util/HashMap;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/collections/HashMap;", "fetchProfitDetail", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "fetchTradeRecord", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "request", "", "fetchProfitShare", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "pnlId", "closeTime", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37129a {
    @GET("v1/copyTrading/exchange/kumex-snapshot/realised-hist")
    @NotNull
    /* JADX INFO: renamed from: a */
    PageEntity<ProfitRecordEntity> m83046a(@QueryMap @NotNull HashMap<String, Object> map) throws Throwable;

    @GET("v1/copyTrading/exchange/kumex-snapshot/position-pnl/profit-rate")
    @Nullable
    /* JADX INFO: renamed from: c */
    ProfitShareEntity m83047c(@NotNull @Query("pnlId") String str, @Query("closeTime") long j11) throws Throwable;

    @GET("v1/copyTrading/exchange/kumex-trade/fills")
    @NotNull
    /* JADX INFO: renamed from: d */
    PageEntity<TradeRecordEntity> m83048d(@QueryMap @NotNull Map<String, Object> map) throws Throwable;

    @GET("v1/copyTrading/exchange/kumex-snapshot/realised-hist-detail")
    @NotNull
    /* JADX INFO: renamed from: e */
    PageEntity<ProfitDetailItemEntity> m83049e(@QueryMap @NotNull HashMap<String, Object> map) throws Throwable;
}
