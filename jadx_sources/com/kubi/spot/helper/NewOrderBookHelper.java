package com.kubi.spot.helper;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.AuthenticationTokenClaims;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.business.callAuction.TradeSubmitCallAuctionVM;
import g10.C37787r;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NewOrderBookHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010(\u001a\u00020)H\u0002J\u0016\u0010*\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010,\u001a\u00020+J\u000e\u0010-\u001a\u00020+2\u0006\u0010\b\u001a\u00020\tJ\b\u0010.\u001a\u0004\u0018\u00010/J\u0016\u00100\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020)J\u0006\u00103\u001a\u00020+J\u0006\u00104\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010&¨\u00065"}, m90084d2 = {"Lcom/kubi/spot/helper/NewOrderBookHelper;", "", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "symbol", "", "precision", "", "dataCallBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/OrderBookEntity;", "<init>", "(Lcom/kubi/sdk/websocket/WsDataHelper;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;ILio/reactivex/functions/Consumer;)V", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getPrecision", "()I", "setPrecision", "(I)V", "getDataCallBack", "()Lio/reactivex/functions/Consumer;", "mOrderBookHelper", "Lcom/kubi/spot/helper/OrderBookHelper;", "getMOrderBookHelper", "()Lcom/kubi/spot/helper/OrderBookHelper;", "mOrderBookHelper$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM;", "getViewModel", "()Lcom/kubi/spot/business/callAuction/TradeSubmitCallAuctionVM;", "viewModel$delegate", "shouldUseOrderBookHelper", "", "release", "", "getRestfulOrderBookData", "changePrecision", "registerOrderBookData", "Lio/reactivex/disposables/Disposable;", "reload", "toggleSubscribe", AuthenticationTokenClaims.JSON_KEY_SUB, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nNewOrderBookHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewOrderBookHelper.kt\ncom/kubi/spot/helper/NewOrderBookHelper\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,148:1\n106#2,15:149\n*S KotlinDebug\n*F\n+ 1 NewOrderBookHelper.kt\ncom/kubi/spot/helper/NewOrderBookHelper\n*L\n39#1:149,15\n*E\n"})
public final class NewOrderBookHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37787r f50543a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BaseFragment f50544b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f50545c;

    /* JADX INFO: renamed from: d */
    public int f50546d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Consumer<OrderBookEntity> f50547e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f50548f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f50549g;

    public NewOrderBookHelper(@NotNull C37787r wsDataHelper, @NotNull final BaseFragment fragment, @NotNull String symbol, int i11, @NotNull Consumer<OrderBookEntity> dataCallBack) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(dataCallBack, "dataCallBack");
        this.f50543a = wsDataHelper;
        this.f50544b = fragment;
        this.f50545c = symbol;
        this.f50546d = i11;
        this.f50547e = dataCallBack;
        this.f50548f = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.helper.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewOrderBookHelper.m61746i(this.f50592b);
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return fragment;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$2
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
        this.f50549g = FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(TradeSubmitCallAuctionVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$5
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
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        m61751h().m60465E0().observe(fragment.getViewLifecycleOwner(), new C25337p.a(new Function1() { // from class: com.kubi.spot.helper.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewOrderBookHelper.m61745d(this.f50602b, (OrderBookEntity) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m61745d(NewOrderBookHelper newOrderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        newOrderBookHelper.f50547e.accept(orderBookEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final OrderBookHelper m61746i(final NewOrderBookHelper newOrderBookHelper) {
        return new OrderBookHelper(newOrderBookHelper.f50543a, newOrderBookHelper.f50545c, newOrderBookHelper.f50546d, new Consumer() { // from class: com.kubi.spot.helper.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                NewOrderBookHelper.m61747j(this.f50603b, (OrderBookEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m61747j(NewOrderBookHelper newOrderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        newOrderBookHelper.f50547e.accept(orderBookEntity);
    }

    /* JADX INFO: renamed from: e */
    public final void m61748e(int i11) {
        this.f50546d = i11;
        if (m61757p()) {
            m61749f().m61789n(i11);
        } else {
            m61751h().m60472y0(i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public final OrderBookHelper m61749f() {
        return (OrderBookHelper) this.f50548f.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final TradeSubmitCallAuctionVM m61751h() {
        return (TradeSubmitCallAuctionVM) this.f50549g.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m61755n(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m61751h().m60469L0(symbol, i11);
        m61749f().m61788H(symbol, i11);
        this.f50545c = symbol;
        this.f50546d = i11;
        if (m61757p()) {
            m61749f().m61787G(symbol);
        } else {
            m61751h().m60467J0(symbol);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m61756o(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f50545c = symbol;
        this.f50546d = i11;
        if (!m61757p()) {
            m61751h().m60468K0(symbol, i11);
            return;
        }
        m61751h().m60469L0(symbol, i11);
        m61749f().m61788H(symbol, i11);
        m61749f().m61793r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m61757p() {
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        return C25337p.m61844a(callAuctionSwitch.m21637c(), CallAuctionSwitch.m21636i(callAuctionSwitch, false, 1, null), SpotMarketSocketAdapter.f28144a.m32667v());
    }

    /* JADX INFO: renamed from: g */
    public final void m61750g() {
        if (m61757p()) {
            m61749f().m61793r();
        } else {
            m61751h().m60468K0(this.f50545c, this.f50546d);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m61752k() {
        if (m61757p()) {
            m61749f().m61790o();
        } else {
            m61751h().onHide();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m61753l() throws Throwable {
        if (!m61757p()) {
            m61751h().onShow();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Disposable m61754m() {
        if (m61757p()) {
            return m61749f().m61786A();
        }
        m61751h().m60466I0(this.f50545c, this.f50546d);
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m61758q(boolean z11) {
        if (m61757p()) {
            if (!z11) {
                m61749f().m61790o();
            }
        } else if (CallAuctionSwitch.f20317a.m21637c()) {
            if (z11) {
                m61751h().m60466I0(this.f50545c, this.f50546d);
            } else {
                m61751h().m60471P0();
            }
        }
    }
}
