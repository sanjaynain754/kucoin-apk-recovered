package i30;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.tradebase.business.klineSettings.KlineConfig;
import io.reactivex.Observable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: i30.b */
/* JADX INFO: compiled from: KlineApi.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00040\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\fH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/api/KlineApi;", "", "queryConfig", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/tradebase/business/klineSettings/KlineConfig;", "Lkotlin/collections/ArrayList;", "dict", "", "symbol", "type", "", "updateConfig", "param", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38437b {
    @POST("v1/kc/user/config/update")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<Object>> m86698a(@Body @NotNull KlineConfig klineConfig);

    @GET("v1/kc/user/config/query")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<ArrayList<KlineConfig>>> m86699b(@NotNull @Query("priDictValue") String str, @NotNull @Query("symbol") String str2, @Query("type") int i11);

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Observable m86697c(InterfaceC38437b interfaceC38437b, String str, String str2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryConfig");
        }
        if ((i12 & 1) != 0) {
            str = "order_config";
        }
        if ((i12 & 2) != 0) {
            str2 = "ALL-ALL";
        }
        if ((i12 & 4) != 0) {
            i11 = 3;
        }
        return interfaceC38437b.m86699b(str, str2, i11);
    }
}
