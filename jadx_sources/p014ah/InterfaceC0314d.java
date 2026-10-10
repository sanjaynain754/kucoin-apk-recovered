package p014ah;

import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.C38293f;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import io.reactivex.Observable;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ah.d */
/* JADX INFO: compiled from: ITrialOrderSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H'J8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H'J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/api/ITrialOrderSocketApi;", "", "getActiveOrdersPeriod", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "fundsType", "", "symbol", "status", "pageSize", "currentPage", "getAdvancedOrdersPeriod", "observeActiveOrderByPage", "Lio/reactivex/Observable;", "periodFlow", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "observeAdvanceOrderByPage", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC0314d {
    @InterfaceC38291d(topic = "/futuresTrial/stopOrder")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<Object> m1111a(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<OrdersPageEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, Object> interfaceC41975c);

    @InterfaceC38291d(topic = "/futuresTrial/userActiveOrder")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<Object> m1112b(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<OrdersPageEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, OrderEntity> interfaceC41975c);

    @GET("v1/kumex-trade/stopOrders")
    @NotNull
    /* JADX INFO: renamed from: c */
    C38293f<OrdersPageEntity> m1113c(@NotNull @Query("fundsType") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("pageSize") String str3, @NotNull @Query("currentPage") String str4) throws Throwable;

    @GET("v1/kumex-trade/orders")
    @NotNull
    /* JADX INFO: renamed from: d */
    C38293f<OrdersPageEntity> m1114d(@NotNull @Query("fundsType") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("status") String str3, @NotNull @Query("pageSize") String str4, @NotNull @Query("currentPage") String str5) throws Throwable;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    static /* synthetic */ Observable m1107e(InterfaceC0314d interfaceC0314d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeActiveOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C0317g();
        }
        return interfaceC0314d.m1112b(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ C38293f m1108f(InterfaceC0314d interfaceC0314d, String str, String str2, String str3, String str4, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAdvancedOrdersPeriod");
        }
        if ((i11 & 1) != 0) {
            str = OrderAssetType.TrialFund.getTypeName();
        }
        if ((i11 & 4) != 0) {
            str3 = "50";
        }
        if ((i11 & 8) != 0) {
            str4 = "1";
        }
        return interfaceC0314d.m1113c(str, str2, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    static /* synthetic */ Observable m1109g(InterfaceC0314d interfaceC0314d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeAdvanceOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C0318h();
        }
        return interfaceC0314d.m1111a(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ C38293f m1110h(InterfaceC0314d interfaceC0314d, String str, String str2, String str3, String str4, String str5, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActiveOrdersPeriod");
        }
        if ((i11 & 1) != 0) {
            str = OrderAssetType.TrialFund.getTypeName();
        }
        if ((i11 & 4) != 0) {
            str3 = "active";
        }
        if ((i11 & 8) != 0) {
            str4 = "50";
        }
        if ((i11 & 16) != 0) {
            str5 = "1";
        }
        String str6 = str5;
        String str7 = str3;
        return interfaceC0314d.m1114d(str, str2, str7, str4, str6);
    }
}
