package p595rg;

import com.kubi.kumex.data.trade.model.OrdersPageEntityWrapper;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rg.e */
/* JADX INFO: compiled from: IMultiOrderApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/common/IMultiOrderService;", "", "observeActiveOrders", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntityWrapper;", "isTrial", "", "symbol", "", "observeAdvanceOrders", "observeTwap", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44077e {
    @NotNull
    /* JADX INFO: renamed from: F0 */
    Observable<OrdersPageEntityWrapper> mo96062F0(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: a0 */
    Observable<OrdersPageEntityWrapper> mo96063a0(boolean z11, @Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: x0 */
    Observable<OrdersPageEntityWrapper> mo96065x0(boolean z11, @Nullable String str);

    /* JADX INFO: renamed from: U */
    static /* synthetic */ Observable m97139U(InterfaceC44077e interfaceC44077e, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTwap");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return interfaceC44077e.mo96062F0(str);
    }
}
