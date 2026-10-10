package kh;

import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.C38293f;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import io.reactivex.Observable;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: kh.b */
/* JADX INFO: compiled from: IHedgeSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/hedge/api/IHedgeSocketApi;", "", "observePositionMode", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "fetchPositionMode", "observeTrialPositionMode", "fetchTrialPositionMode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC41037b {
    @GET("v2/km/trial/position/queryPositionMode")
    @NotNull
    /* JADX INFO: renamed from: a */
    C38293f<PositionModeEntity> m89990a() throws Throwable;

    @GET("v2/km/position/queryPositionMode")
    @NotNull
    /* JADX INFO: renamed from: b */
    C38293f<PositionModeEntity> m89991b() throws Throwable;

    @InterfaceC38291d(topic = "/contract/positionMode")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<PositionModeEntity> m89992c(@InterfaceC38289b(waitPeriodResult = true) @NotNull C38293f<PositionModeEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, PositionModeEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/futuresTrial/positionMode")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<PositionModeEntity> m89993e(@InterfaceC38289b(waitPeriodResult = true) @NotNull C38293f<PositionModeEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, PositionModeEntity> interfaceC41975c);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Observable m89988d(InterfaceC41037b interfaceC41037b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialPositionMode");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C41040e();
        }
        return interfaceC41037b.m89993e(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    static /* synthetic */ Observable m89989f(InterfaceC41037b interfaceC41037b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observePositionMode");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C41039d();
        }
        return interfaceC41037b.m89992c(c38293f, interfaceC41975c);
    }
}
