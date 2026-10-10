package com.kubi.core.spot.helper;

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
import com.kubi.core.biz.callauction.TradeSubmitCallAuctionVM;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010+\u001a\u00020\u000eH\u0002J\u0016\u0010,\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010.\u001a\u00020-J\u000e\u0010/\u001a\u00020-2\u0006\u0010\b\u001a\u00020\tJ\b\u00100\u001a\u0004\u0018\u000101J\u0016\u00102\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u000eJ\u0006\u00105\u001a\u00020-J\u0006\u00106\u001a\u00020-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010)¨\u00067"}, m90084d2 = {"Lcom/kubi/core/spot/helper/NewOrderBookHelper;", "", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "symbol", "", "precision", "", "dataCallBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/OrderBookEntity;", "isMargin", "", "<init>", "(Lcom/kubi/sdk/websocket/WsDataHelper;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;ILio/reactivex/functions/Consumer;Z)V", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getPrecision", "()I", "setPrecision", "(I)V", "getDataCallBack", "()Lio/reactivex/functions/Consumer;", "()Z", "mOrderBookHelper", "Lcom/kubi/core/spot/helper/OrderBookHelper;", "getMOrderBookHelper", "()Lcom/kubi/core/spot/helper/OrderBookHelper;", "mOrderBookHelper$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM;", "getViewModel", "()Lcom/kubi/core/biz/callauction/TradeSubmitCallAuctionVM;", "viewModel$delegate", "shouldUseOrderBookHelper", "release", "", "getRestfulOrderBookData", "changePrecision", "registerOrderBookData", "Lio/reactivex/disposables/Disposable;", "reload", "toggleSubscribe", AuthenticationTokenClaims.JSON_KEY_SUB, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nNewOrderBookHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewOrderBookHelper.kt\ncom/kubi/core/spot/helper/NewOrderBookHelper\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,150:1\n106#2,15:151\n*S KotlinDebug\n*F\n+ 1 NewOrderBookHelper.kt\ncom/kubi/core/spot/helper/NewOrderBookHelper\n*L\n40#1:151,15\n*E\n"})
public final class NewOrderBookHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37787r f21225a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BaseFragment f21226b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f21227c;

    /* JADX INFO: renamed from: d */
    public int f21228d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Consumer<OrderBookEntity> f21229e;

    /* JADX INFO: renamed from: f */
    public final boolean f21230f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f21231g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f21232h;

    public NewOrderBookHelper(@NotNull C37787r wsDataHelper, @NotNull final BaseFragment fragment, @NotNull String symbol, int i11, @NotNull Consumer<OrderBookEntity> dataCallBack, boolean z11) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(dataCallBack, "dataCallBack");
        this.f21225a = wsDataHelper;
        this.f21226b = fragment;
        this.f21227c = symbol;
        this.f21228d = i11;
        this.f21229e = dataCallBack;
        this.f21230f = z11;
        this.f21231g = LazyKt.lazy(new Function0() { // from class: com.kubi.core.spot.helper.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewOrderBookHelper.m23301i(this.f21242b);
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.core.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$2
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
        this.f21232h = FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(TradeSubmitCallAuctionVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.spot.helper.NewOrderBookHelper$special$$inlined$viewModels$default$5
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
        m23306h().m21620z0().observe(fragment.getViewLifecycleOwner(), new C12442i.a(new Function1() { // from class: com.kubi.core.spot.helper.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewOrderBookHelper.m23300d(this.f21243b, (OrderBookEntity) obj);
            }
        }));
        m23306h().m21608H0(z11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m23300d(NewOrderBookHelper newOrderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        newOrderBookHelper.f21229e.accept(orderBookEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final OrderBookHelper m23301i(final NewOrderBookHelper newOrderBookHelper) {
        return new OrderBookHelper(newOrderBookHelper.f21225a, newOrderBookHelper.f21227c, newOrderBookHelper.f21228d, new Consumer() { // from class: com.kubi.core.spot.helper.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                NewOrderBookHelper.m23302j(this.f21244b, (OrderBookEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m23302j(NewOrderBookHelper newOrderBookHelper, OrderBookEntity orderBookEntity) throws Exception {
        newOrderBookHelper.f21229e.accept(orderBookEntity);
    }

    /* JADX INFO: renamed from: e */
    public final void m23303e(int i11) {
        this.f21228d = i11;
        if (m23312p()) {
            m23304f().m23353n(i11);
        } else {
            m23306h().m21614n0(i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public final OrderBookHelper m23304f() {
        return (OrderBookHelper) this.f21231g.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final TradeSubmitCallAuctionVM m23306h() {
        return (TradeSubmitCallAuctionVM) this.f21232h.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m23310n(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f21227c = symbol;
        this.f21228d = i11;
        m23306h().m21607G0(symbol, i11);
        m23304f().m23352H(symbol, i11);
        if (m23312p()) {
            m23304f().m23351G(symbol);
        } else {
            m23306h().m21605E0(symbol);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m23311o(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f21227c = symbol;
        this.f21228d = i11;
        if (!m23312p()) {
            m23306h().m21606F0(symbol, i11);
            return;
        }
        m23306h().m21607G0(symbol, i11);
        m23304f().m23352H(symbol, i11);
        m23304f().m23357r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m23312p() {
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        return C12442i.m23323a(callAuctionSwitch.m21637c(), callAuctionSwitch.m21642h(this.f21230f), SpotMarketSocketAdapter.f28144a.m32667v());
    }

    /* JADX INFO: renamed from: g */
    public final void m23305g() {
        if (m23312p()) {
            m23304f().m23357r();
        } else {
            m23306h().m21606F0(this.f21227c, this.f21228d);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m23307k() {
        if (m23312p()) {
            m23304f().m23354o();
        } else {
            m23306h().onHide();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m23308l() {
        if (!m23312p()) {
            m23306h().onShow();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Disposable m23309m() {
        if (m23312p()) {
            return m23304f().m23350A();
        }
        m23306h().m21604D0(this.f21227c, this.f21228d);
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m23313q(boolean z11) {
        if (m23312p()) {
            if (!z11) {
                m23304f().m23354o();
            }
        } else if (CallAuctionSwitch.f20317a.m21637c()) {
            if (z11) {
                m23306h().m21604D0(this.f21227c, this.f21228d);
            } else {
                m23306h().m21611L0();
            }
        }
    }
}
