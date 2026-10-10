package p768xo;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.EtfRebalanceRecord;
import com.kubi.data.entity.EtfRecord;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.HashMap;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: xo.b */
/* JADX INFO: compiled from: EtfApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032$\b\u0001\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH'J@\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032$\b\u0001\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH'J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH'J \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/EtfApi;", "", "fetchEtfSubOrders", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/data/entity/EtfRecord;", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "fetchEtfRedeemOrders", "fetchEtfCoin", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/data/entity/EtfCoinEntity;", FirebaseAnalytics.Param.CURRENCY, "fetchRebalanceHistory", "Lcom/kubi/data/entity/EtfRebalanceRecord;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46301b {
    @GET("v1/margin-fund/redeem/order/list")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<BasePageEntity<EtfRecord>>> m102056a(@QueryMap @NotNull HashMap<String, String> map);

    @GET("v1/margin-fund/subscribe/order/list")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<BasePageEntity<EtfRecord>>> m102057b(@QueryMap @NotNull HashMap<String, String> map);

    @GET("v1/margin-fund/rebalance/record-list")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<BasePageEntity<EtfRebalanceRecord>> m102058c(@Nullable @Query("baseCurrencyCode") String str);

    @GET("v1/margin-fund/fund/currency/info")
    @NotNull
    /* JADX INFO: renamed from: m */
    InterfaceC41634e<EtfCoinEntity> m102059m(@Nullable @Query(AppsFlyerProperties.CURRENCY_CODE) String str);
}
