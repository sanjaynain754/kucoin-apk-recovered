package com.kubi.kumex.market.p091v2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.data.market.IMarketService;
import com.kubi.futures.dialog.QtyUnitSelectDialog;
import com.kubi.futures.trade.C14448y0;
import com.kubi.futures.trade.FuturesTradeViewModel;
import com.kubi.futures.trade.submit.FuturesSubmitViewModel;
import com.kubi.futures.trade.submit.panel.footer.BaseFooterPanel;
import com.kubi.futures.trade.submit.panel.footer.kline.hedge.KLineHedgeFooterPanel;
import com.kubi.futures.trade.submit.panel.footer.kline.oneway.KLineOneWayFooterPanel;
import com.kubi.futures.trade.submit.panel.header.BaseHeaderPanel;
import com.kubi.futures.trade.submit.panel.header.FuturesHeaderStreamViewModel;
import com.kubi.futures.trade.submit.panel.header.kline.hedge.KLineHedgeHeaderPanel;
import com.kubi.futures.trade.submit.panel.header.kline.oneway.KLineOneWayHeaderPanel;
import com.kubi.futures.trade.submit.panel.header.p1;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.futures.trade.submit.panel.tradeType.a3;
import com.kubi.futures.trade.submit.panel.tradeType.kline.KLineLimitInputPanel;
import com.kubi.futures.trade.submit.panel.tradeType.kline.KLineMarketInputPanel;
import com.kubi.futures.trade.submit.panel.tradeType.y2;
import com.kubi.futures.trade.submit.panel.tradeType.z2;
import com.kubi.futures.trade.vm.FuturesComposeStreamViewModel;
import com.kubi.futures.trade.vm.g1;
import com.kubi.kumex.R$id;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.flutter.KCFlutterBridgeKLineCallImpl;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.Log;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27050g0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36820p2;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import jm.C40446k;
import jm.OrderTypeWrapper;
import ki.C41050b;
import ki.InterfaceC41049a;
import li.C42226a;
import li.C42230e;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38219g;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38218f;
import p343ii.C38649e;
import p801yl.C46527h0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexSubmitBottomSheetFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00107\u001a\u0004\u0018\u000106J$\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010E\u001a\u00020CH\u0016J\b\u0010F\u001a\u00020CH\u0002J\b\u0010G\u001a\u00020CH\u0002J\b\u0010H\u001a\u00020CH\u0002J\b\u0010I\u001a\u00020CH\u0002J\b\u0010J\u001a\u00020CH\u0002J\u0018\u0010K\u001a\u00020L*\u0004\u0018\u00010M2\b\b\u0002\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020CH\u0002J\u0012\u0010Q\u001a\u00020C2\b\b\u0001\u0010R\u001a\u000200H\u0002J\u0010\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020CH\u0016J\b\u0010W\u001a\u00020CH\u0016J\b\u0010X\u001a\u00020CH\u0002J\u0010\u0010Y\u001a\u00020C2\u0006\u0010Z\u001a\u00020[H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b!\u0010\"*\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b'\u0010(*\u0004\b&\u0010 R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b-\u0010.*\u0004\b,\u0010 R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006]"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentKumexSubmitBottomSheetBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentKumexSubmitBottomSheetBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/submit/FuturesSubmitViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/submit/FuturesSubmitViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "tradeViewModel", "Lcom/kubi/futures/trade/FuturesTradeViewModel;", "getTradeViewModel", "()Lcom/kubi/futures/trade/FuturesTradeViewModel;", "tradeViewModel$delegate", "headerStreamViewModelLazy", "Lkotlin/Lazy;", "Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "headerStreamViewModel", "getHeaderStreamViewModel$delegate", "(Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment;)Ljava/lang/Object;", "getHeaderStreamViewModel", "()Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "panelStreamViewModelLazy", "Lcom/kubi/futures/trade/submit/panel/tradeType/FuturesPanelStreamViewModel;", "panelStreamViewModel", "getPanelStreamViewModel$delegate", "getPanelStreamViewModel", "()Lcom/kubi/futures/trade/submit/panel/tradeType/FuturesPanelStreamViewModel;", "futuresComposeStreamViewModelLazy", "Lcom/kubi/futures/trade/vm/FuturesComposeStreamViewModel;", "futuresComposeStreamViewModel", "getFuturesComposeStreamViewModel$delegate", "getFuturesComposeStreamViewModel", "()Lcom/kubi/futures/trade/vm/FuturesComposeStreamViewModel;", "cachedLimitPrice", "", "kLinePriceConfigDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "kLinePriceConfigSyncActive", "lastObservedContractSymbol", "cachedBookEntity", "Lcom/kubi/kumex/logic/book/BookEntity;", "getBookEntity", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "keyboardListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onDestroyView", "registerKeyboardPlaceholder", "initPanel", "applyTrialSwitchFromCache", "initObserver", "subscribeKLineMarketPriceConfig", "safeGetBookBigDecimal", "Ljava/math/BigDecimal;", "", "index", "", "unsubscribeKLineMarketPriceConfig", "onPositionModeChanged", "positionMode", "onTradeTypeChanged", "type", "Lcom/kubi/kumex/logic/constant/OrderTypeWrapper;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "disposeVisibleSubscriptions", "autoSwitchQtyUnit", "tradeType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexSubmitBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexSubmitBottomSheetFragment.kt\ncom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,553:1\n143#2,20:554\n106#3,15:574\n76#4,7:589\n76#4,7:596\n1#5:603\n295#6,2:604\n*S KotlinDebug\n*F\n+ 1 KuMexSubmitBottomSheetFragment.kt\ncom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment\n*L\n97#1:554,20\n99#1:574,15\n259#1:589,7\n263#1:596,7\n194#1:604,2\n*E\n"})
public final class KuMexSubmitBottomSheetFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    public boolean f29674U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f29675V = C45681e.m100799e(this, new Function1<KuMexSubmitBottomSheetFragment, C36820p2>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36820p2 invoke(@NotNull KuMexSubmitBottomSheetFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36820p2.m82501a(fragment.requireView());
        }
    }, new Function1<C36820p2, Unit>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36820p2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36820p2 c36820p2) {
            invoke(c36820p2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29676W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29677X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy<FuturesHeaderStreamViewModel> f29678Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy<y2> f29679Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy<FuturesComposeStreamViewModel> f29680a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public String f29681b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final CompositeDisposable f29682c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f29683d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public String f29684e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public BookEntity f29685f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public ViewTreeObserver.OnGlobalLayoutListener f29686g0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f29673i0 = {Reflection.property1(new PropertyReference1Impl(KuMexSubmitBottomSheetFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentKumexSubmitBottomSheetBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f29672h0 = new Companion(null);

    /* JADX INFO: compiled from: KuMexSubmitBottomSheetFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_INIT_QUICK_PRICE", "KEY_CLOSE_QUICK_ORDER_BOTTOM_SHEET", "KEY_FINISH_ACTIVITY_AND_CLOSE", "newInstance", "Lcom/kubi/kumex/market/v2/KuMexSubmitBottomSheetFragment;", "initQuickPrice", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexSubmitBottomSheetFragment newInstance(@Nullable String initQuickPrice) {
            KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment = new KuMexSubmitBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_init_quick_price", initQuickPrice);
            kuMexSubmitBottomSheetFragment.setArguments(bundle);
            return kuMexSubmitBottomSheetFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$b */
    /* JADX INFO: compiled from: KuMexSubmitBottomSheetFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16346b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29687b;

        public C16346b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29687b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29687b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29687b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m34987T3() {
        this.f29683d0 = false;
        m34985Q4();
        this.f29682c0.clear();
        m34946b4().A0();
        if (this.f29680a0.isInitialized()) {
            m34942W3().z();
        }
        if (this.f29678Y.isInitialized()) {
            m34943X3().L();
        }
        if (this.f29679Z.isInitialized()) {
            m34944Y3().N();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$a */
    /* JADX INFO: compiled from: KuMexSubmitBottomSheetFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C16345a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTradeType.values().length];
            try {
                iArr[OrderTradeType.Limit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTradeType.Market.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m34910B4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, Throwable th2) {
        Log log = Log.f30813a;
        String str = kuMexSubmitBottomSheetFragment.getTAG() + "-observePrice";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final boolean m34914D4(BookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: E4 */
    public static final boolean m34916E4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m34918F4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, BookEntity bookEntity) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new Pair(TuplesKt.m90091to(m34965p4(kuMexSubmitBottomSheetFragment, (double[]) CollectionsKt.firstOrNull((List) bookEntity.getBids()), 0, 1, null), m34965p4(kuMexSubmitBottomSheetFragment, (double[]) CollectionsKt.lastOrNull((List) bookEntity.getAsks()), 0, 1, null)), TuplesKt.m90091to(m34965p4(kuMexSubmitBottomSheetFragment, (double[]) CollectionsKt.getOrNull(bookEntity.getBids(), 4), 0, 1, null), m34965p4(kuMexSubmitBottomSheetFragment, (double[]) CollectionsKt.getOrNull(CollectionsKt.reversed(bookEntity.getAsks()), 4), 0, 1, null))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            objM103844constructorimpl = new Pair(TuplesKt.m90091to(bigDecimal, bigDecimal), TuplesKt.m90091to(bigDecimal, bigDecimal));
        }
        Pair pair = (Pair) objM103844constructorimpl;
        InterfaceC38218f interfaceC38218fM26699k1 = kuMexSubmitBottomSheetFragment.m34945Z3().m26699k1();
        kuMexSubmitBottomSheetFragment.m34945Z3().m26698j1().postValue(InterfaceC38218f.m86274f(interfaceC38218fM26699k1 == null ? new C38649e(null, null, null, null, null, null, null, 127, null) : interfaceC38218fM26699k1, (BigDecimal) ((Pair) pair.getFirst()).getFirst(), (BigDecimal) ((Pair) pair.getFirst()).getSecond(), (BigDecimal) ((Pair) pair.getSecond()).getFirst(), (BigDecimal) ((Pair) pair.getSecond()).getSecond(), null, null, null, 112, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m34922H4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, Throwable th2) {
        Log log = Log.f30813a;
        String str = kuMexSubmitBottomSheetFragment.getTAG() + "-observeBook1";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final boolean m34926J4(BookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: K4 */
    public static final boolean m34928K4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m34930L4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, BookEntity bookEntity) {
        kuMexSubmitBottomSheetFragment.f29685f0 = bookEntity;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m34934N4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, Throwable th2) {
        Log log = Log.f30813a;
        String str = kuMexSubmitBottomSheetFragment.getTAG() + "-observeBook50";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    private final void m34940S3(OrderTradeType orderTradeType) {
        C41050b c41050b = C41050b.f91264a;
        InterfaceC41049a interfaceC41049aM90021d = c41050b.m90021d();
        InterfaceC41049a interfaceC41049aM90023f = c41050b.m90023f();
        if (orderTradeType == OrderTradeType.Tso || orderTradeType == OrderTradeType.Twap) {
            if (interfaceC41049aM90021d instanceof C42226a) {
                QtyUnitSelectDialog.Companion.modifyQtyUnit$default(QtyUnitSelectDialog.f22801u0, "QtyUnitOfValue", false, 2, null);
            }
        } else if ((interfaceC41049aM90021d instanceof C42230e) && (interfaceC41049aM90023f instanceof C42226a)) {
            QtyUnitSelectDialog.Companion.modifyQtyUnit$default(QtyUnitSelectDialog.f22801u0, "QtyUnitOfCost", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: W3 */
    private final FuturesComposeStreamViewModel m34942W3() {
        return this.f29680a0.getValue();
    }

    /* JADX INFO: renamed from: X3 */
    private final FuturesHeaderStreamViewModel m34943X3() {
        return this.f29678Y.getValue();
    }

    /* JADX INFO: renamed from: Y3 */
    private final y2 m34944Y3() {
        return this.f29679Z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public final FuturesTradeViewModel m34945Z3() {
        return (FuturesTradeViewModel) this.f29677X.getValue();
    }

    /* JADX INFO: renamed from: b4 */
    private final FuturesSubmitViewModel m34946b4() {
        return (FuturesSubmitViewModel) this.f29676W.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m34950f4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, InterfaceC38213a interfaceC38213a) {
        String symbol = interfaceC38213a != null ? interfaceC38213a.getSymbol() : null;
        if (!Intrinsics.areEqual(symbol, kuMexSubmitBottomSheetFragment.f29684e0)) {
            kuMexSubmitBottomSheetFragment.f29684e0 = symbol;
            if (kuMexSubmitBottomSheetFragment.f29683d0) {
                kuMexSubmitBottomSheetFragment.m34992q4();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    private final void m34955j4(String str) {
        KLineHedgeHeaderPanel kLineOneWayHeaderPanel;
        KLineHedgeFooterPanel kLineOneWayFooterPanel;
        Object obj;
        Object next;
        if (Intrinsics.areEqual(str, "HEDGE")) {
            kLineOneWayHeaderPanel = new KLineHedgeHeaderPanel();
            kLineOneWayFooterPanel = new KLineHedgeFooterPanel();
        } else {
            kLineOneWayHeaderPanel = new KLineOneWayHeaderPanel();
            kLineOneWayFooterPanel = new KLineOneWayFooterPanel();
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Fragment) next) instanceof BaseHeaderPanel));
        BaseHeaderPanel baseHeaderPanel = (Fragment) next;
        List<Fragment> fragments2 = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
        for (Object obj2 : fragments2) {
            if (((Fragment) obj2) instanceof BaseFooterPanel) {
                obj = obj2;
                break;
            }
        }
        Fragment fragment = (Fragment) obj;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        if ((baseHeaderPanel instanceof BaseHeaderPanel) && Intrinsics.areEqual(baseHeaderPanel.getTAG(), kLineOneWayHeaderPanel.getTAG())) {
            return;
        }
        if (baseHeaderPanel != null) {
            fragmentTransactionBeginTransaction.remove(baseHeaderPanel);
        }
        fragmentTransactionBeginTransaction.add(R$id.header_panel, (Fragment) kLineOneWayHeaderPanel);
        if (fragment != null) {
            fragmentTransactionBeginTransaction.remove(fragment);
        }
        fragmentTransactionBeginTransaction.add(R$id.footer_panel, (Fragment) kLineOneWayFooterPanel);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (C27032f.m66617h(childFragmentManager)) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ BigDecimal m34965p4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, double[] dArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return kuMexSubmitBottomSheetFragment.m34991o4(dArr, i11);
    }

    /* JADX INFO: renamed from: r4 */
    public static final boolean m34968r4(TickerEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: s4 */
    public static final boolean m34970s4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m34972t4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, TickerEntity ticker) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        InterfaceC38213a interfaceC38213aM26687Y0 = kuMexSubmitBottomSheetFragment.m34945Z3().m26687Y0();
        String symbol = interfaceC38213aM26687Y0 != null ? interfaceC38213aM26687Y0.getSymbol() : null;
        if (symbol != null && !Intrinsics.areEqual(symbol, C27041f.m66668h(ticker.getSymbol()))) {
            return Unit.INSTANCE;
        }
        kuMexSubmitBottomSheetFragment.m34945Z3().m26698j1().postValue(InterfaceC38218f.m86274f(C38219g.m86283a(kuMexSubmitBottomSheetFragment.m34945Z3().m26699k1()), ticker.getBestBidPrice(), ticker.getBestAskPrice(), null, null, null, ticker.getPrice(), null, 92, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m34976v4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, Throwable th2) {
        Log log = Log.f30813a;
        String str = kuMexSubmitBottomSheetFragment.getTAG() + "-observeTicker";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final boolean m34980x4(PriceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !g.a.o(C46527h0.f104291a.m102673I());
    }

    /* JADX INFO: renamed from: y4 */
    public static final boolean m34982y4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m34984z4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, PriceEntity price) {
        Intrinsics.checkNotNullParameter(price, "price");
        InterfaceC38213a interfaceC38213aM26687Y0 = kuMexSubmitBottomSheetFragment.m34945Z3().m26687Y0();
        String symbol = interfaceC38213aM26687Y0 != null ? interfaceC38213aM26687Y0.getSymbol() : null;
        if (symbol != null && !Intrinsics.areEqual(symbol, C27041f.m66668h(price.getSymbol()))) {
            return Unit.INSTANCE;
        }
        kuMexSubmitBottomSheetFragment.m34945Z3().m26698j1().postValue(InterfaceC38218f.m86274f(C38219g.m86283a(kuMexSubmitBottomSheetFragment.m34945Z3().m26699k1()), null, null, null, null, price.getMarkPrice(), null, price.getIndexPrice(), 47, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m34985Q4() {
        this.f29682c0.clear();
        this.f29685f0 = null;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m34986R3() {
        if (Intrinsics.areEqual(FuturesComposeStreamViewModel.m.lastTrialSwitch(), Boolean.TRUE)) {
            m34944Y3().l0(true);
            m34946b4().x0(true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: V3, reason: from getter */
    public final BookEntity getF29685f0() {
        return this.f29685f0;
    }

    /* JADX INFO: renamed from: a4 */
    public final C36820p2 m34989a4() {
        return (C36820p2) this.f29675V.getValue(this, f29673i0[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF29674U() {
        return this.f29674U;
    }

    /* JADX INFO: renamed from: o4 */
    public final BigDecimal m34991o4(double[] dArr, int i11) {
        return new BigDecimal(String.valueOf(C27039d.m66646f(dArr != null ? ArraysKt.getOrNull(dArr, i11) : null)));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        NestedScrollView root = C36820p2.m82502c(inflater, container, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("arg_init_quick_price")) != null) {
            m34945Z3().m26676D1(string);
        }
        m34948d4();
        m34953i4();
        m34990m4();
    }

    /* JADX INFO: renamed from: q4 */
    public final void m34992q4() {
        this.f29682c0.clear();
        InterfaceC38213a interfaceC38213aM26687Y0 = m34945Z3().m26687Y0();
        if (interfaceC38213aM26687Y0 == null) {
            return;
        }
        String symbol = interfaceC38213aM26687Y0.getSymbol();
        IMarketService iMarketServiceM20286e = RepositoryServiceLocator.f19236a.m20286e();
        m34945Z3().m26698j1().postValue(C38219g.m86283a(m34945Z3().m26699k1()).mo86275a(null, null, null, null, null, null, null));
        CompositeDisposable compositeDisposable = this.f29682c0;
        Observable<TickerEntity> observableMo24802b = iMarketServiceM20286e.mo24802b(symbol);
        FuturesFragment.Companion companion = FuturesFragment.f30411o0;
        Observable observableObserveOn = C27050g0.m66716a(observableMo24802b, companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuMexSubmitBottomSheetFragment.m34968r4((TickerEntity) obj));
            }
        };
        Observable observableFilter = observableObserveOn.filter(new Predicate() { // from class: com.kubi.kumex.market.v2.e2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34970s4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.v2.j2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34972t4(this.f29805b, (TickerEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.v2.k2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34974u4(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.v2.l2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34976v4(this.f29814b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.v2.m2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34978w4(function3, obj);
            }
        }));
        CompositeDisposable compositeDisposable2 = this.f29682c0;
        Observable<PriceEntity> observableMo24807g = iMarketServiceM20286e.mo24807g(symbol);
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.market.v2.o2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuMexSubmitBottomSheetFragment.m34980x4((PriceEntity) obj));
            }
        };
        Observable<PriceEntity> observableFilter2 = observableMo24807g.filter(new Predicate() { // from class: com.kubi.kumex.market.v2.p2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34982y4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter2, "filter(...)");
        Observable observableObserveOn2 = C27050g0.m66716a(observableFilter2, companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function5 = new Function1() { // from class: com.kubi.kumex.market.v2.q2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34984z4(this.f29832b, (PriceEntity) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.kumex.market.v2.r2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34908A4(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.kumex.market.v2.n2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34910B4(this.f29821b, (Throwable) obj);
            }
        };
        compositeDisposable2.add(observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.market.v2.y2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34912C4(function6, obj);
            }
        }));
        CompositeDisposable compositeDisposable3 = this.f29682c0;
        Observable observableObserveOn3 = C27050g0.m66716a(iMarketServiceM20286e.mo24801a(symbol, 1), companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function7 = new Function1() { // from class: com.kubi.kumex.market.v2.c3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuMexSubmitBottomSheetFragment.m34914D4((BookEntity) obj));
            }
        };
        Observable observableFilter3 = observableObserveOn3.filter(new Predicate() { // from class: com.kubi.kumex.market.v2.d3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34916E4(function7, obj);
            }
        });
        final Function1 function8 = new Function1() { // from class: com.kubi.kumex.market.v2.e3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34918F4(this.f29779b, (BookEntity) obj);
            }
        };
        Consumer consumer3 = new Consumer() { // from class: com.kubi.kumex.market.v2.f3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34920G4(function8, obj);
            }
        };
        final Function1 function9 = new Function1() { // from class: com.kubi.kumex.market.v2.g3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34922H4(this.f29790b, (Throwable) obj);
            }
        };
        compositeDisposable3.add(observableFilter3.subscribe(consumer3, new Consumer() { // from class: com.kubi.kumex.market.v2.h3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34924I4(function9, obj);
            }
        }));
        CompositeDisposable compositeDisposable4 = this.f29682c0;
        Observable observableObserveOn4 = C27050g0.m66716a(iMarketServiceM20286e.mo24801a(symbol, 0), companion.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function10 = new Function1() { // from class: com.kubi.kumex.market.v2.i3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KuMexSubmitBottomSheetFragment.m34926J4((BookEntity) obj));
            }
        };
        Observable observableFilter4 = observableObserveOn4.filter(new Predicate() { // from class: com.kubi.kumex.market.v2.d2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34928K4(function10, obj);
            }
        });
        final Function1 function11 = new Function1() { // from class: com.kubi.kumex.market.v2.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34930L4(this.f29784b, (BookEntity) obj);
            }
        };
        Consumer consumer4 = new Consumer() { // from class: com.kubi.kumex.market.v2.g2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34932M4(function11, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.kubi.kumex.market.v2.h2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34934N4(this.f29794b, (Throwable) obj);
            }
        };
        compositeDisposable4.add(observableFilter4.subscribe(consumer4, new Consumer() { // from class: com.kubi.kumex.market.v2.i2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexSubmitBottomSheetFragment.m34936O4(function12, obj);
            }
        }));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f29674U = z11;
    }

    public KuMexSubmitBottomSheetFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f29676W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.kumex.market.v2.KuMexSubmitBottomSheetFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f29677X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.x2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexSubmitBottomSheetFragment.m34938P4(this.f29871b);
            }
        });
        this.f29678Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.z2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexSubmitBottomSheetFragment.m34947c4(this.f29877b);
            }
        });
        this.f29679Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.a3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexSubmitBottomSheetFragment.m34959l4(this.f29693b);
            }
        });
        this.f29680a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.b3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexSubmitBottomSheetFragment.m34941U3(this.f29700b);
            }
        });
        this.f29682c0 = new CompositeDisposable();
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m34908A4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m34912C4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m34920G4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m34924I4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m34932M4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m34936O4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static final FuturesTradeViewModel m34938P4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment) {
        return C14448y0.m28812a(kuMexSubmitBottomSheetFragment);
    }

    /* JADX INFO: renamed from: U3 */
    public static final FuturesComposeStreamViewModel m34941U3(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment) {
        return g1.a(kuMexSubmitBottomSheetFragment);
    }

    /* JADX INFO: renamed from: c4 */
    public static final FuturesHeaderStreamViewModel m34947c4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment) {
        return p1.a(kuMexSubmitBottomSheetFragment);
    }

    /* JADX INFO: renamed from: d4 */
    private final void m34948d4() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Transformations.distinctUntilChanged(m34946b4().P()).observe(viewLifecycleOwner, new C16346b(new Function1() { // from class: com.kubi.kumex.market.v2.t2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34951g4(this.f29847b, (OrderTypeWrapper) obj);
            }
        }));
        m34946b4().H().observe(viewLifecycleOwner, new C16346b(new Function1() { // from class: com.kubi.kumex.market.v2.u2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34952h4(this.f29850b, (String) obj);
            }
        }));
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "kline_quick_order_price_update_key".length();
        }
        C12572a.m23692a(this, false, new C16347x7da17bac("kline_quick_order_price_update_key", null, this));
        if (c12573b.m23696a()) {
            "switch_market_as_twap_order".length();
        }
        C12572a.m23692a(this, false, new C16348x7da17bad("switch_market_as_twap_order", null, this));
        Transformations.distinctUntilChanged(m34946b4().O()).observe(viewLifecycleOwner, new C16346b(new Function1() { // from class: com.kubi.kumex.market.v2.v2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34949e4(this.f29854b, (Boolean) obj);
            }
        }));
        m34945Z3().m26686X0().observe(viewLifecycleOwner, new C16346b(new Function1() { // from class: com.kubi.kumex.market.v2.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexSubmitBottomSheetFragment.m34950f4(this.f29867b, (InterfaceC38213a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m34949e4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Bundle EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            kuMexSubmitBottomSheetFragment.setFragmentResult("key_close_quick_order_bottom_sheet", EMPTY);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m34951g4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, OrderTypeWrapper orderTypeWrapper) {
        Intrinsics.checkNotNull(orderTypeWrapper);
        kuMexSubmitBottomSheetFragment.m34957k4(orderTypeWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m34952h4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, String str) {
        Intrinsics.checkNotNull(str);
        kuMexSubmitBottomSheetFragment.m34955j4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    private final void m34953i4() {
        m34946b4().j0(MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89035V0(false));
        m34946b4().q0(C40446k.m89083c(OrderTradeType.Limit));
        m34986R3();
    }

    /* JADX INFO: renamed from: k4 */
    private final void m34957k4(OrderTypeWrapper orderTypeWrapper) {
        String str;
        Object next;
        KLineLimitInputPanel kLineLimitInputPanel;
        if (!isDetached() && !isRemoving() && !getChildFragmentManager().isDestroyed()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            Iterator<T> it = fragments.iterator();
            do {
                str = null;
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!(((Fragment) next) instanceof a3));
            KLineLimitInputPanel kLineLimitInputPanel2 = (Fragment) next;
            if (kLineLimitInputPanel2 instanceof KLineLimitInputPanel) {
                String strA6 = kLineLimitInputPanel2.A6();
                if (strA6 != null && !StringsKt.isBlank(strA6)) {
                    str = strA6;
                }
                this.f29681b0 = str;
            }
            int i11 = C16345a.$EnumSwitchMapping$0[orderTypeWrapper.getOrderType().ordinal()];
            if (i11 == 1 || i11 != 2) {
                kLineLimitInputPanel = new KLineLimitInputPanel();
            } else {
                kLineLimitInputPanel = new KLineMarketInputPanel();
            }
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            if (kLineLimitInputPanel2 != null) {
                fragmentTransactionBeginTransaction.remove(kLineLimitInputPanel2);
            }
            C36820p2 c36820p2M34989a4 = m34989a4();
            if (c36820p2M34989a4 != null) {
                fragmentTransactionBeginTransaction.add(c36820p2M34989a4.f80803d.getId(), (Fragment) kLineLimitInputPanel);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            if (C27032f.m66617h(childFragmentManager)) {
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            } else {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            }
            if (kLineLimitInputPanel instanceof KLineLimitInputPanel) {
                KLineLimitInputPanel kLineLimitInputPanel3 = kLineLimitInputPanel;
                String value = this.f29681b0;
                if (value == null) {
                    value = m34945Z3().m26700l1().getValue();
                }
                kLineLimitInputPanel3.J6(value);
            }
            m34946b4().b0(kLineLimitInputPanel);
            m34940S3(orderTypeWrapper.getOrderType());
            return;
        }
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        log.m36617c(tag, "onTradeTypeChanged:" + isDetached() + ',' + isRemoving() + ',' + getChildFragmentManager().isDestroyed());
    }

    /* JADX INFO: renamed from: l4 */
    public static final y2 m34959l4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment) {
        return z2.a(kuMexSubmitBottomSheetFragment);
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m34962n4(KuMexSubmitBottomSheetFragment kuMexSubmitBottomSheetFragment, View view, int i11) {
        View view2;
        View viewW6;
        Object next;
        int iMax;
        Fragment fragment;
        C36820p2 c36820p2M34989a4 = kuMexSubmitBottomSheetFragment.m34989a4();
        if (c36820p2M34989a4 != null && (view2 = c36820p2M34989a4.f80805f) != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int height = view.getHeight();
            int i12 = rect.bottom;
            int i13 = height - i12;
            if (i13 > ((double) height) * 0.15d) {
                List<Fragment> fragments = kuMexSubmitBottomSheetFragment.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                Iterator<T> it = fragments.iterator();
                do {
                    viewW6 = null;
                    if (it.hasNext()) {
                        next = it.next();
                        fragment = (Fragment) next;
                        if (fragment instanceof KLineLimitInputPanel) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                } while (!(fragment instanceof KLineMarketInputPanel));
                KLineLimitInputPanel kLineLimitInputPanel = (Fragment) next;
                if (kLineLimitInputPanel instanceof KLineLimitInputPanel) {
                    viewW6 = kLineLimitInputPanel.z6();
                } else if (kLineLimitInputPanel instanceof KLineMarketInputPanel) {
                    viewW6 = ((KLineMarketInputPanel) kLineLimitInputPanel).w6();
                }
                if (viewW6 != null) {
                    int[] iArr = new int[2];
                    viewW6.getLocationOnScreen(iArr);
                    iMax = Math.max(0, ((iArr[1] + viewW6.getHeight()) - i12) + i11);
                } else {
                    iMax = i13 + i11;
                }
                if (iMax > 0) {
                    if (view2.getVisibility() != 0 || view2.getLayoutParams().height != iMax) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        layoutParams.height = iMax;
                        view2.setLayoutParams(layoutParams);
                        view2.setVisibility(0);
                        view2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            if (view2.getVisibility() != 8) {
                view2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m34974u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m34978w4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m34990m4() {
        Window window;
        final View decorView;
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            final int i11 = (int) ((12 * getResources().getDisplayMetrics().density) + 0.5f);
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kubi.kumex.market.v2.s2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    KuMexSubmitBottomSheetFragment.m34962n4(this.f29841b, decorView, i11);
                }
            };
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f29686g0 = onGlobalLayoutListener;
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        m34987T3();
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f29686g0);
        }
        this.f29686g0 = null;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        if (isAdded() && getView() != null) {
            super.onHide();
            m34987T3();
            KCFlutterBridgeKLineCallImpl.f29025f.notifyQuickOrderDismissed();
            return;
        }
        m34987T3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        if (isAdded() && getView() != null) {
            super.onShow();
            m34942W3().w();
            m34943X3().u0();
            m34944Y3().p0();
            m34946b4().q();
            this.f29683d0 = true;
            m34992q4();
        }
    }
}
