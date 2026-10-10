package p339ic;

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

/* JADX INFO: renamed from: ic.c */
/* JADX INFO: compiled from: ITrialPositionSocketApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/position/api/ITrialPositionSocketApi;", "", "observePositions", "Lio/reactivex/Observable;", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38513c {
    @InterfaceC38291d(topic = "/futuresTrial/positionAll")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<Object> m87123a(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<PositionEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, PositionEntity> interfaceC41975c);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Observable m87122b(InterfaceC38513c interfaceC38513c, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observePositions");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C38515e();
        }
        return interfaceC38513c.m87123a(c38293f, interfaceC41975c);
    }
}
