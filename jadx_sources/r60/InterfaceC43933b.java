package r60;

import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.otc.entity.OtcAd;
import com.kubi.unify.api.entity.UnifySupportService;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import hr.C38293f;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: r60.b */
/* JADX INFO: compiled from: IOrderSocketApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bH'JH\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bH'J<\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H'J<\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/api/IOrderSocketApi;", "", "getActiveOrdersPeriod", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/unify/entity/UnifyPageEntity;", "Lcom/kubi/unify/entity/UnifyOrderEntity;", "tradeType", "", "orderFilter", "symbol", "currentPage", "", "pageSize", "getAdvancedOrdersPeriod", "observeActiveOrderByPage", "Lkotlinx/coroutines/flow/Flow;", "periodFlow", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "observeAdvanceOrderByPage", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43933b {
    @InterfaceC38291d(topic = "/unifiedAccount/innerOrderAll")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<UnifyOrderEntity> m96876a(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<UnifyPageEntity<UnifyOrderEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyOrderEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerOrderAll")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<UnifyOrderEntity> m96877b(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<UnifyPageEntity<UnifyOrderEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyOrderEntity> interfaceC41975c);

    @GET("ultra-order/unified/inner/orders/query-orders")
    @NotNull
    /* JADX INFO: renamed from: f */
    C38293f<UnifyPageEntity<UnifyOrderEntity>> m96878f(@NotNull @Query("tradeType") String str, @NotNull @Query("orderFilter") String str2, @Nullable @Query("symbol") String str3, @Query("currentPage") int i11, @Query("pageSize") int i12) throws Throwable;

    @GET("ultra-order/unified/inner/orders/query-orders")
    @NotNull
    /* JADX INFO: renamed from: g */
    C38293f<UnifyPageEntity<UnifyOrderEntity>> m96879g(@NotNull @Query("tradeType") String str, @NotNull @Query("orderFilter") String str2, @Nullable @Query("symbol") String str3, @Query("currentPage") int i11, @Query("pageSize") int i12) throws Throwable;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC41634e m96872c(InterfaceC43933b interfaceC43933b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeActiveOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C43934c(Boolean.TRUE);
        }
        return interfaceC43933b.m96877b(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ InterfaceC41634e m96873d(InterfaceC43933b interfaceC43933b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeAdvanceOrderByPage");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C43934c(Boolean.FALSE);
        }
        return interfaceC43933b.m96876a(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ C38293f m96874e(InterfaceC43933b interfaceC43933b, String str, String str2, String str3, int i11, int i12, int i13, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAdvancedOrdersPeriod");
        }
        if ((i13 & 1) != 0) {
            str = UnifySupportService.FUTURES.getValue();
        }
        if ((i13 & 2) != 0) {
            str2 = "ADVANCED";
        }
        if ((i13 & 8) != 0) {
            i11 = 1;
        }
        if ((i13 & 16) != 0) {
            i12 = 50;
        }
        return interfaceC43933b.m96878f(str, str2, str3, i11, i12);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ C38293f m96875h(InterfaceC43933b interfaceC43933b, String str, String str2, String str3, int i11, int i12, int i13, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActiveOrdersPeriod");
        }
        if ((i13 & 1) != 0) {
            str = UnifySupportService.FUTURES.getValue();
        }
        if ((i13 & 2) != 0) {
            str2 = OtcAd.STATUS_NORMAL;
        }
        if ((i13 & 8) != 0) {
            i11 = 1;
        }
        if ((i13 & 16) != 0) {
            i12 = 50;
        }
        return interfaceC43933b.m96879g(str, str2, str3, i11, i12);
    }
}
