package p760xg;

import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: xg.a */
/* JADX INFO: compiled from: IHistoryApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032.\b\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b`\tH'J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032.\b\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b`\tH'J>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2.\b\u0001\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006j\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b`\tH'J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0019\b\u0001\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0012H'J\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/history/IHistoryApi;", "", "fetchProfitRecord", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "paramsMap", "Ljava/util/HashMap;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/collections/HashMap;", "fetchProfitDetail", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "fetchFundsRecord", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "fetchTradeRecord", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "request", "", "fetchProfitShare", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "pnlId", "closeTime", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46159a {
    @GET("v2/kumex-snapshot/realised-hist")
    @NotNull
    /* JADX INFO: renamed from: a */
    PageEntity<ProfitRecordEntity> m101755a(@QueryMap @NotNull HashMap<String, Object> map) throws Throwable;

    @GET("v1/kumex-account/funds-tx")
    @NotNull
    /* JADX INFO: renamed from: b */
    BasePageEntity<FundsRecordEntity> m101756b(@QueryMap @NotNull HashMap<String, Object> map) throws Throwable;

    @GET("v1/kumex-snapshot/position-pnl/profit-rate")
    @Nullable
    /* JADX INFO: renamed from: c */
    ProfitShareEntity m101757c(@NotNull @Query("pnlId") String str, @Query("closeTime") long j11) throws Throwable;

    @GET("v1/kumex-trade/fills")
    @NotNull
    /* JADX INFO: renamed from: d */
    PageEntity<TradeRecordEntity> m101758d(@QueryMap @NotNull Map<String, Object> map) throws Throwable;

    @GET("v1/kumex-snapshot/realised-hist-detail")
    @NotNull
    /* JADX INFO: renamed from: e */
    PageEntity<ProfitDetailItemEntity> m101759e(@QueryMap @NotNull HashMap<String, Object> map) throws Throwable;
}
