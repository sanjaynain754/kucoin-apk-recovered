package p844zu;

import com.kubi.data.DataInitManager;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.entity.AlertAddEntity;
import com.kubi.quotefacade.entity.AlertEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: zu.a */
/* JADX INFO: compiled from: AlertApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J.\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bH'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000bH'J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H'J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u0013H'J\u001a\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/api/AlertApi;", "", "addPriceAlert", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/quotefacade/entity/AlertAddEntity;", "getTradeDataBySymbols", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "", "from", "addPriceNotify", "symbol", "threshold", "deleteNotify", "primaryKey", "type", "", "changeNotifyStatus", "status", "", "getAllNotifies", "Lcom/kubi/quotefacade/entity/AlertEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46924a {
    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m103335a(@NotNull @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @FormUrlEncoded
    @POST("v1/priceNotify/add")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<Object>> m103336b(@Field("symbol") @NotNull String str, @Field("threshold") @NotNull String str2);

    @FormUrlEncoded
    @POST("v1/priceNotify/delete")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<Object>> m103337c(@Field("primaryKey") @NotNull String str, @Field("type") int i11);

    @FormUrlEncoded
    @POST("v1/priceNotify/changeStatus")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<Object>> m103338d(@Field("primaryKey") @NotNull String str, @Field("status") boolean z11, @Field("type") int i11);

    @GET("v1/priceNotify/list")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<ArrayList<AlertEntity>>> m103339f();

    @POST("v1/warn/create")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<Object>> m103340g(@Body @NotNull AlertAddEntity alertAddEntity);

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Observable m103334e(InterfaceC46924a interfaceC46924a, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeDataBySymbols");
        }
        if ((i11 & 2) != 0) {
            str2 = "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_alert";
        }
        return interfaceC46924a.m103335a(str, str2);
    }
}
