package ye;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p310he.InterfaceC38175b;
import p852kotlin.Metadata;
import v30.C45409v;

/* JADX INFO: renamed from: ye.a */
/* JADX INFO: compiled from: ITradeSwitchAction.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "", "clickPriceType", "", "supportTradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "tradeVerticalSubmitFragment", "Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;", "mParent", "Lcom/kubi/core/spot/business/ITradeParentBehavior;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;", "checkPriceInput", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "subscriptionSocket", "fragment", "Lcom/kubi/sdk/BaseFragment;", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "auction", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46470a {
    /* JADX INFO: renamed from: a */
    boolean mo21624a(@Nullable BigDecimal bigDecimal);

    /* JADX INFO: renamed from: b */
    void mo21625b(@NotNull List<? extends TradeTypeUiData> list, @Nullable TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, @NotNull InterfaceC38175b interfaceC38175b, @NotNull C45409v c45409v);
}
