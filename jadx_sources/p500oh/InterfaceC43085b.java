package p500oh;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.entity.BalanceEntity;
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

/* JADX INFO: renamed from: oh.b */
/* JADX INFO: compiled from: IIsolatedSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH'J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH'J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/isolated/api/IIsolatedSocketApi;", "", "getSelfFreezeBalancePeriodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/kumex/entity/BalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "", "observeSelfFreezeBalance", "Lio/reactivex/Observable;", "periodFlow", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "getTrialFreezeBalancePeriodFlow", "observeTrialFreezeBalance", "observeTrialRiskLimit", "observeSelfRiskLimit", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43085b {
    @InterfaceC38291d(topic = "/futuresTrial/wallet")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BalanceEntity> m94660a(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<BalanceEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, BalanceEntity> interfaceC41975c);

    @GET("v1/kumex-trial/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: b */
    C38293f<BalanceEntity> m94661b(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    @GET("v1/kumex-account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: c */
    C38293f<BalanceEntity> m94662c(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    @InterfaceC38291d(topic = "/contractAccount/wallet")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BalanceEntity> m94663d(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<BalanceEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, BalanceEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/futuresTrial/positionAll")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<Object> m94664h(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, Object> interfaceC41975c);

    @InterfaceC38291d(topic = "/contract/positionAll")
    @NotNull
    /* JADX INFO: renamed from: j */
    Observable<Object> m94665j(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, Object> interfaceC41975c);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    static /* synthetic */ Observable m94656e(InterfaceC43085b interfaceC43085b, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeSelfRiskLimit");
        }
        if ((i11 & 1) != 0) {
            interfaceC41975c = new C43088e();
        }
        return interfaceC43085b.m94665j(interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    static /* synthetic */ Observable m94657f(InterfaceC43085b interfaceC43085b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeSelfFreezeBalance");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C43087d();
        }
        return interfaceC43085b.m94663d(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    static /* synthetic */ Observable m94658g(InterfaceC43085b interfaceC43085b, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialRiskLimit");
        }
        if ((i11 & 1) != 0) {
            interfaceC41975c = new C43090g();
        }
        return interfaceC43085b.m94664h(interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    static /* synthetic */ Observable m94659i(InterfaceC43085b interfaceC43085b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialFreezeBalance");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C43089f();
        }
        return interfaceC43085b.m94660a(c38293f, interfaceC41975c);
    }
}
