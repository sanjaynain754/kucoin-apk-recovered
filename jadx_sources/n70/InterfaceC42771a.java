package n70;

import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: n70.a */
/* JADX INFO: compiled from: OrdersWsApi.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/utaspotlib/api/OrdersWsApi;", "", "observerOrderChangedEvent", "Lkotlinx/coroutines/flow/Flow;", "", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42771a {
    @InterfaceC38291d(topic = "/unifiedAccount/innerOrderAll")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<String> m93707a(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, String> interfaceC41975c);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC41634e m93706b(InterfaceC42771a interfaceC42771a, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerOrderChangedEvent");
        }
        if ((i11 & 1) != 0) {
            interfaceC41975c = new C42772b();
        }
        return interfaceC42771a.m93707a(interfaceC41975c);
    }
}
