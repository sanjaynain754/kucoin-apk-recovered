package i30;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.spot.entity.DelegationEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: i30.a */
/* JADX INFO: compiled from: FavoriteApi.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'JT\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2$\b\u0001\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u0013H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/api/FavoriteApi;", "", "getSpotFavoriteList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "topFavoriteList", "param", "Lcom/kubi/tradebase/entity/TopFavoriteParam;", "getTradeOrdersV2", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/spot/entity/DelegationEntity;", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "checkAllowCancelAll", "", "forceTypeLimit", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38436a {
    @GET("v2/kc/trade/orders")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<BasePageEntity<DelegationEntity>>> m86696e(@QueryMap @NotNull HashMap<String, String> map, @Query("checkAllowCancelAll") boolean z11, @Query("forceTypeLimit") boolean z12);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Observable m86695a(InterfaceC38436a interfaceC38436a, HashMap map, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeOrdersV2");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return interfaceC38436a.m86696e(map, z11, z12);
    }
}
