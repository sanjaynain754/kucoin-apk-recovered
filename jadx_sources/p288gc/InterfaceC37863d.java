package p288gc;

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

/* JADX INFO: renamed from: gc.d */
/* JADX INFO: compiled from: IOrderSocketApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H'JB\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H'J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H'J8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H'J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H'J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H'J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H'J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/order/api/IOrderSocketApi;", "", "getActiveOrdersPeriod", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "fundsType", "", "symbol", "status", "pageSize", "currentPage", "getTrialActiveOrdersPeriod", "getAdvancedOrdersPeriod", "getTrialAdvancedOrdersPeriod", "observeActiveOrderByPage", "Lio/reactivex/Observable;", "periodFlow", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "observeTrialActiveOrderByPage", "observeAdvanceOrderByPage", "observeTrialAdvanceOrderByPage", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37863d {
    @InterfaceC38291d(topic = "/contractMarket/stopOrder")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<Object> m85471a(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<OrdersPageEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, Object> interfaceC41975c);

    @InterfaceC38291d(topic = "/contractMarket/userActiveOrder")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<Object> m85472b(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<OrdersPageEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, OrderEntity> interfaceC41975c);

    @GET("v1/copyTrading/exchange/futures/stopOrders")
    @NotNull
    /* JADX INFO: renamed from: c */
    C38293f<OrdersPageEntity> m85473c(@NotNull @Query("fundsType") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("pageSize") String str3, @NotNull @Query("currentPage") String str4) throws Throwable;

    @GET("v1/copyTrading/exchange/futures/orders")
    @NotNull
    /* JADX INFO: renamed from: d */
    C38293f<OrdersPageEntity> m85474d(@NotNull @Query("fundsType") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("status") String str3, @NotNull @Query("pageSize") String str4, @NotNull @Query("currentPage") String str5) throws Throwable;

    @GET("v1/copyTrading/exchange/futures/trialOrders")
    @NotNull
    /* JADX INFO: renamed from: e */
    C38293f<OrdersPageEntity> m85475e(@NotNull @Query("fundsType") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("status") String str3, @NotNull @Query("pageSize") String str4, @NotNull @Query("currentPage") String str5) throws Throwable;

    @InterfaceC38291d(topic = "/futuresTrial/userActiveOrder")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<Object> m85476h(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<OrdersPageEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, OrderEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/futuresTrial/stopOrder")
    @NotNull
    /* JADX INFO: renamed from: j */
    Observable<Object> m85477j(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<OrdersPageEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, Object> interfaceC41975c);

    @GET("v1/copyTrading/exchange/futures/stopTrialOrders")
    @NotNull
    /* JADX INFO: renamed from: p */
    C38293f<OrdersPageEntity> m85478p(@NotNull @Query("fundsType") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("pageSize") String str3, @NotNull @Query("currentPage") String str4) throws Throwable;

    /* JADX INFO: renamed from: f */
    static /* synthetic */ C38293f m85463f(InterfaceC37863d interfaceC37863d, String str, String str2, String str3, String str4, String str5, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActiveOrdersPeriod");
        }
        if ((i11 & 1) != 0) {
            str = "selfFunds";
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
        return interfaceC37863d.m85474d(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ C38293f m85464g(InterfaceC37863d interfaceC37863d, String str, String str2, String str3, String str4, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrialAdvancedOrdersPeriod");
        }
        if ((i11 & 1) != 0) {
            str = "trialFunds";
        }
        if ((i11 & 4) != 0) {
            str3 = "50";
        }
        if ((i11 & 8) != 0) {
            str4 = "1";
        }
        return interfaceC37863d.m85478p(str, str2, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    static /* synthetic */ Observable m85465i(InterfaceC37863d interfaceC37863d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialActiveOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37864e();
        }
        return interfaceC37863d.m85476h(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    static /* synthetic */ Observable m85466k(InterfaceC37863d interfaceC37863d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeActiveOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37860a();
        }
        return interfaceC37863d.m85472b(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    static /* synthetic */ Observable m85467l(InterfaceC37863d interfaceC37863d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialAdvanceOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37865f();
        }
        return interfaceC37863d.m85477j(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    static /* synthetic */ Observable m85468m(InterfaceC37863d interfaceC37863d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeAdvanceOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37861b();
        }
        return interfaceC37863d.m85471a(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ C38293f m85469n(InterfaceC37863d interfaceC37863d, String str, String str2, String str3, String str4, String str5, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrialActiveOrdersPeriod");
        }
        if ((i11 & 1) != 0) {
            str = "trialFunds";
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
        return interfaceC37863d.m85475e(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ C38293f m85470o(InterfaceC37863d interfaceC37863d, String str, String str2, String str3, String str4, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAdvancedOrdersPeriod");
        }
        if ((i11 & 1) != 0) {
            str = "selfFunds";
        }
        if ((i11 & 4) != 0) {
            str3 = "50";
        }
        if ((i11 & 8) != 0) {
            str4 = "1";
        }
        return interfaceC37863d.m85473c(str, str2, str3, str4);
    }
}
