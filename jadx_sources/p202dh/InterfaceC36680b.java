package p202dh;

import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.C38293f;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import io.reactivex.Observable;
import java.util.List;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: dh.b */
/* JADX INFO: compiled from: ISelfPositionSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H'J<\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0001\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00050\fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/positon/api/ISelfPositionSocketApi;", "", "getPositionList", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "includeTrialFund", "", "observePositions", "Lio/reactivex/Observable;", "periodFlow", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC36680b {
    @InterfaceC38291d(topic = "/contract/positionAll")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<Object> m82109a(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<PositionEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, PositionEntity> interfaceC41975c);

    @GET("v1/kumex-position/positions")
    @NotNull
    /* JADX INFO: renamed from: b */
    C38293f<List<PositionEntity>> m82110b(@Query("includeTrialFund") boolean z11) throws Throwable;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    static /* synthetic */ Observable m82107c(InterfaceC36680b interfaceC36680b, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observePositions");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C36683e();
        }
        return interfaceC36680b.m82109a(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ C38293f m82108d(InterfaceC36680b interfaceC36680b, boolean z11, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPositionList");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return interfaceC36680b.m82110b(z11);
    }
}
