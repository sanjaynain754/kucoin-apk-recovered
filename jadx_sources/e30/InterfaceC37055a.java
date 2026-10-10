package e30;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.ITradeParentBehavior;
import com.kubi.spot.business.submit.TradeVerticalSubmitFragment;
import g10.C37787r;
import io.reactivex.disposables.CompositeDisposable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import v30.C45412y;

/* JADX INFO: renamed from: e30.a */
/* JADX INFO: compiled from: ITradeSwitchAction.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J.\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "", "clickPriceType", "", "tradeVerticalSubmitFragment", "Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;", "mParent", "Lcom/kubi/spot/business/ITradeParentBehavior;", "fragmentTradeVerticalBinding", "Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;", "checkPriceInput", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "subscriptionSocket", "fragment", "Lcom/kubi/spot/business/BaseTradeFragment;", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "auction", "Lkotlin/Function0;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37055a {
    /* JADX INFO: renamed from: a */
    boolean mo60486a(@Nullable BigDecimal bigDecimal);

    /* JADX INFO: renamed from: b */
    void mo60487b(@Nullable TradeVerticalSubmitFragment tradeVerticalSubmitFragment, @NotNull ITradeParentBehavior iTradeParentBehavior, @NotNull C45412y c45412y);

    /* JADX INFO: renamed from: c */
    void mo60488c(@NotNull BaseTradeFragment baseTradeFragment, @NotNull CompositeDisposable compositeDisposable, @NotNull C37787r c37787r, @NotNull Function0<Unit> function0);
}
