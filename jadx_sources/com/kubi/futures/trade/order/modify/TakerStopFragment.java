package com.kubi.futures.trade.order.modify;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$array;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.C17071w;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.kumex.view.FocusEditText;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.FloatInputFilter;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36791k3;
import fm.C37567b;
import fm.C37568c;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: TakerStopFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003EFGB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0006\u0010;\u001a\u000209J\b\u0010<\u001a\u0004\u0018\u00010=J\b\u0010>\u001a\u0004\u0018\u00010=J\b\u0010?\u001a\u0004\u0018\u00010=J\u0006\u0010@\u001a\u00020\u001cJ\u0012\u0010A\u001a\u0004\u0018\u00010=2\u0006\u0010B\u001a\u00020\u0011H\u0002J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0DH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010!\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b#\u0010$R!\u0010&\u001a\b\u0018\u00010'R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b(\u0010)R!\u0010+\u001a\b\u0018\u00010,R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b-\u0010.¨\u0006H"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/TakerStopFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/order/modify/TakerStopViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/order/modify/TakerStopViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getOrder", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "order$delegate", "blockId", "", "getBlockId", "()Ljava/lang/String;", "blockId$delegate", "triggerType", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "takerHandler", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment$TakerHandler;", "getTakerHandler", "()Lcom/kubi/futures/trade/order/modify/TakerStopFragment$TakerHandler;", "takerHandler$delegate", "stopHandler", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment$StopHandler;", "getStopHandler", "()Lcom/kubi/futures/trade/order/modify/TakerStopFragment$StopHandler;", "stopHandler$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "clearInput", "getTakerPrice", "Ljava/math/BigDecimal;", "getStopPrice", "getStopRate", "getTriggerType", "findDelegationPrice", "isBuy", "getTriggerTypeList", "", "TakerHandler", "StopHandler", "BaseHandler", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTakerStopFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakerStopFragment.kt\ncom/kubi/futures/trade/order/modify/TakerStopFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n*L\n1#1,413:1\n143#2,20:414\n106#3,15:434\n55#4:449\n55#4:450\n*S KotlinDebug\n*F\n+ 1 TakerStopFragment.kt\ncom/kubi/futures/trade/order/modify/TakerStopFragment\n*L\n55#1:414,20\n57#1:434,15\n104#1:449\n110#1:450\n*E\n"})
public final class TakerStopFragment extends BaseFragment {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f23895d0 = {Reflection.property1(new PropertyReference1Impl(TakerStopFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f23896U = C45681e.m100799e(this, new Function1<TakerStopFragment, C36791k3>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36791k3 invoke(@NotNull TakerStopFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36791k3.m82442a(fragment.requireView());
        }
    }, new Function1<C36791k3, Unit>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36791k3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36791k3 c36791k3) {
            invoke(c36791k3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23897V;

    /* JADX INFO: renamed from: W */
    public boolean f23898W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f23899X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f23900Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f23901Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f23902a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f23903b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f23904c0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.TakerStopFragment$a */
    /* JADX INFO: compiled from: TakerStopFragment.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010 \u001a\u00020\u0015H\u0004J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00020\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/TakerStopFragment$BaseHandler;", "", "typeView", "Lcom/kubi/futures/view/AnimateDrawableEndView;", "priceEdit", "Lcom/kubi/kumex/view/FocusEditText;", "rateEdit", "<init>", "(Lcom/kubi/futures/trade/order/modify/TakerStopFragment;Lcom/kubi/futures/view/AnimateDrawableEndView;Lcom/kubi/kumex/view/FocusEditText;Lcom/kubi/kumex/view/FocusEditText;)V", "getTypeView", "()Lcom/kubi/futures/view/AnimateDrawableEndView;", "getPriceEdit", "()Lcom/kubi/kumex/view/FocusEditText;", "getRateEdit", "selectPriceTypeIndex", "", "getSelectPriceTypeIndex", "()I", "setSelectPriceTypeIndex", "(I)V", "initData", "", "initPrice", "Ljava/math/BigDecimal;", "onPriceChanged", "text", "", "onRateChanged", "onTriggerTypeChanged", "index", "clearInput", "", "setPriceInputTypeAndFilters", "showPriceTypeDialog", "getTriggerPrecision", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public abstract class AbstractC13789a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final AnimateDrawableEndView f23905a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final FocusEditText f23906b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final FocusEditText f23907c;

        /* JADX INFO: renamed from: d */
        public int f23908d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TakerStopFragment f23909e;

        /* JADX INFO: renamed from: B */
        public abstract void mo27289B(@NotNull String str);

        /* JADX INFO: renamed from: C */
        public abstract void mo27290C(@NotNull String str);

        /* JADX INFO: renamed from: q */
        public void mo27298q(@Nullable BigDecimal bigDecimal) {
            Observable<CharSequence> observableSkip = C0206f.m784d(this.f23906b).skip(1L);
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.order.modify.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TakerStopFragment.AbstractC13789a.m27280r(this.f23924b, (CharSequence) obj));
                }
            };
            Observable<CharSequence> observableFilter = observableSkip.filter(new Predicate() { // from class: com.kubi.futures.trade.order.modify.h0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return TakerStopFragment.AbstractC13789a.m27281s(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.order.modify.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.AbstractC13789a.m27282t(this.f23933b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = observableFilter.subscribe(new Consumer() { // from class: com.kubi.futures.trade.order.modify.j0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TakerStopFragment.AbstractC13789a.m27283u(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, this.f23909e.getDestroyDisposable());
            Observable<CharSequence> observableSkip2 = C0206f.m784d(this.f23907c).skip(1L);
            final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.order.modify.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TakerStopFragment.AbstractC13789a.m27284v(this.f23940b, (CharSequence) obj));
                }
            };
            Observable<CharSequence> observableFilter2 = observableSkip2.filter(new Predicate() { // from class: com.kubi.futures.trade.order.modify.l0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return TakerStopFragment.AbstractC13789a.m27285w(function3, obj);
                }
            });
            final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.order.modify.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.AbstractC13789a.m27286x(this.f23983b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe2 = observableFilter2.subscribe(new Consumer() { // from class: com.kubi.futures.trade.order.modify.n0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TakerStopFragment.AbstractC13789a.m27287y(function4, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe2, this.f23909e.getDestroyDisposable());
            this.f23909e.m27262L3().m27449x().observe(this.f23909e.getViewLifecycleOwner(), new C13792d(new Function1() { // from class: com.kubi.futures.trade.order.modify.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.AbstractC13789a.m27288z(this.f23990b, (Pair) obj);
                }
            }));
            C27046k.m66711z(this.f23905a, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TakerStopFragment.AbstractC13789a.m27265A(this.f23992b);
                }
            }, 1, null);
            FocusEditText focusEditText = this.f23906b;
            ContractEntity contractEntityM27233B3 = this.f23909e.m27233B3();
            focusEditText.setUnit(C27041f.m66669i(contractEntityM27233B3 != null ? contractEntityM27233B3.getQuoteCurrency() : null, "USDT"));
            this.f23907c.setUnit("%");
            this.f23907c.setInputType(2);
            this.f23907c.setFilters(new InputFilter[]{new C27056j0(0), new FloatInputFilter()});
        }

        public AbstractC13789a(@NotNull TakerStopFragment takerStopFragment, @NotNull AnimateDrawableEndView typeView, @NotNull FocusEditText priceEdit, FocusEditText rateEdit) {
            Intrinsics.checkNotNullParameter(typeView, "typeView");
            Intrinsics.checkNotNullParameter(priceEdit, "priceEdit");
            Intrinsics.checkNotNullParameter(rateEdit, "rateEdit");
            this.f23909e = takerStopFragment;
            this.f23905a = typeView;
            this.f23906b = priceEdit;
            this.f23907c = rateEdit;
        }

        /* JADX INFO: renamed from: G */
        public static final Unit m27266G(TakerStopFragment takerStopFragment, int i11, CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
            takerStopFragment.m27262L3().m27449x().setValue(new Pair<>(Integer.valueOf(i11), Boolean.TRUE));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: H */
        public static final void m27267H(AbstractC13789a abstractC13789a, DialogInterface dialogInterface) {
            abstractC13789a.f23905a.m28819j();
        }

        /* JADX INFO: renamed from: r */
        public static final boolean m27280r(AbstractC13789a abstractC13789a, CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return abstractC13789a.f23906b.isFocused();
        }

        /* JADX INFO: renamed from: s */
        public static final boolean m27281s(Function1 function1, Object p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return ((Boolean) function1.invoke(p11)).booleanValue();
        }

        /* JADX INFO: renamed from: v */
        public static final boolean m27284v(AbstractC13789a abstractC13789a, CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return abstractC13789a.f23907c.isFocused();
        }

        /* JADX INFO: renamed from: w */
        public static final boolean m27285w(Function1 function1, Object p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return ((Boolean) function1.invoke(p11)).booleanValue();
        }

        /* JADX INFO: renamed from: D */
        public final void m27291D(int i11, boolean z11) {
            this.f23908d = i11;
            this.f23909e.f23901Z = i11 == 0 ? "TP" : "MP";
            this.f23905a.setText((CharSequence) this.f23909e.m27260J3().get(this.f23908d));
            m27292E();
            if (z11) {
                m27294m();
            }
        }

        /* JADX INFO: renamed from: E */
        public final void m27292E() {
            FocusEditText focusEditText = this.f23906b;
            focusEditText.setInputType(8194);
            focusEditText.setFilters(new InputFilter[]{new C27056j0(m27297p()), new FloatInputFilter()});
        }

        /* JADX INFO: renamed from: F */
        public final void m27293F() {
            String strM27253A3 = this.f23909e.m27253A3();
            if (strM27253A3 != null) {
                C43852m.m96591c(C17060n0.m36552b(), strM27253A3, this instanceof C13791c ? "4" : "5", null, 8, null);
            }
            List listM27260J3 = this.f23909e.m27260J3();
            int i11 = this.f23908d;
            if (i11 < 0) {
                i11 = 0;
            }
            this.f23905a.m28819j();
            final TakerStopFragment takerStopFragment = this.f23909e;
            BaseDialogFragment baseDialogFragmentM54192r3 = C15943u.m33705x(i11, listM27260J3, new Function2() { // from class: com.kubi.futures.trade.order.modify.f0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TakerStopFragment.AbstractC13789a.m27266G(takerStopFragment, ((Integer) obj).intValue(), (CharSequence) obj2);
                }
            }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.trade.order.modify.g0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TakerStopFragment.AbstractC13789a.m27267H(this.f23929b, dialogInterface);
                }
            });
            FragmentManager childFragmentManager = this.f23909e.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM54192r3.show(childFragmentManager, "showPriceTypePop");
        }

        /* JADX INFO: renamed from: m */
        public final void m27294m() {
            ViewExKt.m36489o(this.f23906b, "");
            ViewExKt.m36489o(this.f23907c, "");
        }

        @NotNull
        /* JADX INFO: renamed from: n, reason: from getter */
        public final FocusEditText getF23906b() {
            return this.f23906b;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final FocusEditText getF23907c() {
            return this.f23907c;
        }

        /* JADX INFO: renamed from: p */
        public final int m27297p() {
            if (this.f23908d == 0) {
                ContractEntity contractEntityM27233B3 = this.f23909e.m27233B3();
                return C27039d.m66650j(contractEntityM27233B3 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM27233B3)) : null);
            }
            ContractEntity contractEntityM27233B4 = this.f23909e.m27233B3();
            return C27039d.m66650j(contractEntityM27233B4 != null ? Integer.valueOf(C37567b.m84612b(contractEntityM27233B4)) : null);
        }

        /* JADX INFO: renamed from: A */
        public static final Unit m27265A(AbstractC13789a abstractC13789a) {
            abstractC13789a.m27293F();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: t */
        public static final Unit m27282t(AbstractC13789a abstractC13789a, CharSequence charSequence) {
            abstractC13789a.mo27289B(charSequence.toString());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: u */
        public static final void m27283u(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: x */
        public static final Unit m27286x(AbstractC13789a abstractC13789a, CharSequence charSequence) {
            abstractC13789a.mo27290C(charSequence.toString());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: y */
        public static final void m27287y(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: z */
        public static final Unit m27288z(AbstractC13789a abstractC13789a, Pair pair) {
            abstractC13789a.m27291D(((Number) pair.getFirst()).intValue(), ((Boolean) pair.getSecond()).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.TakerStopFragment$b */
    /* JADX INFO: compiled from: TakerStopFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/TakerStopFragment$StopHandler;", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment$BaseHandler;", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment;", "viewbinding", "Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", "<init>", "(Lcom/kubi/futures/trade/order/modify/TakerStopFragment;Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;)V", "getViewbinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", "initData", "", "initPrice", "Ljava/math/BigDecimal;", "onPriceChanged", "text", "", "onRateChanged", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTakerStopFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakerStopFragment.kt\ncom/kubi/futures/trade/order/modify/TakerStopFragment$StopHandler\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n*L\n1#1,413:1\n55#2:414\n55#2:415\n55#2:416\n55#2:417\n*S KotlinDebug\n*F\n+ 1 TakerStopFragment.kt\ncom/kubi/futures/trade/order/modify/TakerStopFragment$StopHandler\n*L\n264#1:414\n266#1:415\n281#1:416\n285#1:417\n*E\n"})
    public final class C13790b extends AbstractC13789a {

        /* JADX INFO: renamed from: f */
        @NotNull
        public final C36791k3 f23910f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ TakerStopFragment f23911g;

        /* JADX WARN: Illegal instructions before constructor call */
        public C13790b(@NotNull TakerStopFragment takerStopFragment, C36791k3 viewbinding) {
            Intrinsics.checkNotNullParameter(viewbinding, "viewbinding");
            this.f23911g = takerStopFragment;
            AnimateDrawableEndView lossType = viewbinding.f80401e;
            Intrinsics.checkNotNullExpressionValue(lossType, "lossType");
            FocusEditText lossPrice = viewbinding.f80398b;
            Intrinsics.checkNotNullExpressionValue(lossPrice, "lossPrice");
            FocusEditText lossRate = viewbinding.f80399c;
            Intrinsics.checkNotNullExpressionValue(lossRate, "lossRate");
            super(takerStopFragment, lossType, lossPrice, lossRate);
            this.f23910f = viewbinding;
        }

        @Override // com.kubi.futures.trade.order.modify.TakerStopFragment.AbstractC13789a
        /* JADX INFO: renamed from: B */
        public void mo27289B(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            BigDecimal bigDecimalM66656p = C27039d.m66656p(C17071w.m36622d(text));
            if (C41014a.m89917B(bigDecimalM66656p)) {
                return;
            }
            ContractEntity contractEntityM27233B3 = this.f23911g.m27233B3();
            BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntityM27233B3 != null ? contractEntityM27233B3.getMaxPrice() : null, "1000000");
            if (bigDecimalM66656p.compareTo(bigDecimalM89921F) > 0) {
                ViewExKt.m36489o(getF23906b(), C6447a.m11724a(bigDecimalM89921F).toPlainString());
                C27046k.m66707v(getF23906b());
                return;
            }
            TakerStopViewModel takerStopViewModelM27262L3 = this.f23911g.m27262L3();
            ContractEntity contractEntityM27233B4 = this.f23911g.m27233B3();
            TakerStopFragment takerStopFragment = this.f23911g;
            OrderEntity orderEntityM27234C3 = takerStopFragment.m27234C3();
            BigDecimal bigDecimalM27264z3 = takerStopFragment.m27264z3(C27025c.m66566d(orderEntityM27234C3 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C3.getSide(), "buy")) : null));
            OrderEntity orderEntityM27234C4 = this.f23911g.m27234C3();
            BigDecimal leverage = orderEntityM27234C4 != null ? orderEntityM27234C4.getLeverage() : null;
            OrderEntity orderEntityM27234C5 = this.f23911g.m27234C3();
            takerStopViewModelM27262L3.m27442q(this.f23911g, contractEntityM27233B4, bigDecimalM27264z3, text, C27025c.m66566d(orderEntityM27234C5 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C5.getSide(), "buy")) : null), leverage);
        }

        @Override // com.kubi.futures.trade.order.modify.TakerStopFragment.AbstractC13789a
        /* JADX INFO: renamed from: C */
        public void mo27290C(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            BigDecimal bigDecimalM66656p = C27039d.m66656p(C17071w.m36622d(text));
            OrderEntity orderEntityM27234C3 = this.f23911g.m27234C3();
            if (!C27025c.m66566d(orderEntityM27234C3 != null ? Boolean.valueOf(C37568c.m84634e(orderEntityM27234C3)) : null) && bigDecimalM66656p.compareTo(BigDecimal.valueOf(100L)) > 0) {
                ViewExKt.m36489o(getF23907c(), C33556b3.f68995S);
                C27046k.m66707v(getF23907c());
                return;
            }
            TakerStopViewModel takerStopViewModelM27262L3 = this.f23911g.m27262L3();
            ContractEntity contractEntityM27233B3 = this.f23911g.m27233B3();
            TakerStopFragment takerStopFragment = this.f23911g;
            OrderEntity orderEntityM27234C4 = takerStopFragment.m27234C3();
            BigDecimal bigDecimalM27264z3 = takerStopFragment.m27264z3(C27025c.m66566d(orderEntityM27234C4 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C4.getSide(), "buy")) : null));
            OrderEntity orderEntityM27234C5 = this.f23911g.m27234C3();
            BigDecimal leverage = orderEntityM27234C5 != null ? orderEntityM27234C5.getLeverage() : null;
            String str = this.f23911g.f23901Z;
            OrderEntity orderEntityM27234C6 = this.f23911g.m27234C3();
            takerStopViewModelM27262L3.m27441p(this.f23911g, contractEntityM27233B3, bigDecimalM27264z3, text, C27025c.m66566d(orderEntityM27234C6 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C6.getSide(), "buy")) : null), leverage, str);
        }

        /* JADX INFO: renamed from: K */
        public static final Unit m27301K(C13790b c13790b, String str) {
            ViewExKt.m36489o(c13790b.getF23906b(), str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: L */
        public static final Unit m27302L(C13790b c13790b, String str) {
            ViewExKt.m36489o(c13790b.getF23907c(), str);
            return Unit.INSTANCE;
        }

        @Override // com.kubi.futures.trade.order.modify.TakerStopFragment.AbstractC13789a
        /* JADX INFO: renamed from: q */
        public void mo27298q(@Nullable BigDecimal bigDecimal) {
            String stopPriceType;
            BigDecimal bigDecimalM11724a;
            super.mo27298q(bigDecimal);
            this.f23911g.m27262L3().m27445t().observe(this.f23911g.getViewLifecycleOwner(), new C13792d(new Function1() { // from class: com.kubi.futures.trade.order.modify.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.C13790b.m27301K(this.f23994b, (String) obj);
                }
            }));
            this.f23911g.m27262L3().m27446u().observe(this.f23911g.getViewLifecycleOwner(), new C13792d(new Function1() { // from class: com.kubi.futures.trade.order.modify.r0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.C13790b.m27302L(this.f23996b, (String) obj);
                }
            }));
            OrderEntity orderEntityM27234C3 = this.f23911g.m27234C3();
            String plainString = null;
            if (orderEntityM27234C3 != null) {
                stopPriceType = orderEntityM27234C3.getStopPriceType();
            } else {
                stopPriceType = null;
            }
            int i11 = 0;
            if (!Intrinsics.areEqual(stopPriceType, "TP") && Intrinsics.areEqual(stopPriceType, "MP")) {
                i11 = 1;
            }
            this.f23911g.m27262L3().m27449x().setValue(new Pair<>(Integer.valueOf(i11), Boolean.FALSE));
            FocusEditText f23906b = getF23906b();
            if (bigDecimal != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal)) != null) {
                plainString = bigDecimalM11724a.toPlainString();
            }
            ViewExKt.m36489o(f23906b, plainString);
            mo27289B(String.valueOf(getF23906b().getText()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.TakerStopFragment$c */
    /* JADX INFO: compiled from: TakerStopFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/TakerStopFragment$TakerHandler;", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment$BaseHandler;", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment;", "viewbinding", "Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", "<init>", "(Lcom/kubi/futures/trade/order/modify/TakerStopFragment;Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;)V", "getViewbinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentTakerStopBinding;", "initData", "", "initPrice", "Ljava/math/BigDecimal;", "onPriceChanged", "text", "", "onRateChanged", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTakerStopFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakerStopFragment.kt\ncom/kubi/futures/trade/order/modify/TakerStopFragment$TakerHandler\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n*L\n1#1,413:1\n55#2:414\n55#2:415\n55#2:416\n55#2:417\n*S KotlinDebug\n*F\n+ 1 TakerStopFragment.kt\ncom/kubi/futures/trade/order/modify/TakerStopFragment$TakerHandler\n*L\n203#1:414\n205#1:415\n214#1:416\n218#1:417\n*E\n"})
    public final class C13791c extends AbstractC13789a {

        /* JADX INFO: renamed from: f */
        @NotNull
        public final C36791k3 f23912f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ TakerStopFragment f23913g;

        /* JADX WARN: Illegal instructions before constructor call */
        public C13791c(@NotNull TakerStopFragment takerStopFragment, C36791k3 viewbinding) {
            Intrinsics.checkNotNullParameter(viewbinding, "viewbinding");
            this.f23913g = takerStopFragment;
            AnimateDrawableEndView profitType = viewbinding.f80405i;
            Intrinsics.checkNotNullExpressionValue(profitType, "profitType");
            FocusEditText profitPrice = viewbinding.f80402f;
            Intrinsics.checkNotNullExpressionValue(profitPrice, "profitPrice");
            FocusEditText profitRate = viewbinding.f80403g;
            Intrinsics.checkNotNullExpressionValue(profitRate, "profitRate");
            super(takerStopFragment, profitType, profitPrice, profitRate);
            this.f23912f = viewbinding;
        }

        @Override // com.kubi.futures.trade.order.modify.TakerStopFragment.AbstractC13789a
        /* JADX INFO: renamed from: B */
        public void mo27289B(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            BigDecimal bigDecimalM66656p = C27039d.m66656p(C17071w.m36622d(text));
            if (C41014a.m89917B(bigDecimalM66656p)) {
                return;
            }
            ContractEntity contractEntityM27233B3 = this.f23913g.m27233B3();
            BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntityM27233B3 != null ? contractEntityM27233B3.getMaxPrice() : null, "1000000");
            if (bigDecimalM66656p.compareTo(bigDecimalM89921F) > 0) {
                ViewExKt.m36489o(getF23906b(), C6447a.m11724a(bigDecimalM89921F).toPlainString());
                C27046k.m66707v(getF23906b());
                return;
            }
            TakerStopViewModel takerStopViewModelM27262L3 = this.f23913g.m27262L3();
            ContractEntity contractEntityM27233B4 = this.f23913g.m27233B3();
            TakerStopFragment takerStopFragment = this.f23913g;
            OrderEntity orderEntityM27234C3 = takerStopFragment.m27234C3();
            BigDecimal bigDecimalM27264z3 = takerStopFragment.m27264z3(C27025c.m66566d(orderEntityM27234C3 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C3.getSide(), "buy")) : null));
            OrderEntity orderEntityM27234C4 = this.f23913g.m27234C3();
            BigDecimal leverage = orderEntityM27234C4 != null ? orderEntityM27234C4.getLeverage() : null;
            OrderEntity orderEntityM27234C5 = this.f23913g.m27234C3();
            takerStopViewModelM27262L3.m27444s(this.f23913g, contractEntityM27233B4, bigDecimalM27264z3, text, C27025c.m66566d(orderEntityM27234C5 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C5.getSide(), "buy")) : null), leverage);
        }

        @Override // com.kubi.futures.trade.order.modify.TakerStopFragment.AbstractC13789a
        /* JADX INFO: renamed from: C */
        public void mo27290C(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            TakerStopViewModel takerStopViewModelM27262L3 = this.f23913g.m27262L3();
            ContractEntity contractEntityM27233B3 = this.f23913g.m27233B3();
            TakerStopFragment takerStopFragment = this.f23913g;
            OrderEntity orderEntityM27234C3 = takerStopFragment.m27234C3();
            BigDecimal bigDecimalM27264z3 = takerStopFragment.m27264z3(C27025c.m66566d(orderEntityM27234C3 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C3.getSide(), "buy")) : null));
            OrderEntity orderEntityM27234C4 = this.f23913g.m27234C3();
            BigDecimal leverage = orderEntityM27234C4 != null ? orderEntityM27234C4.getLeverage() : null;
            String str = this.f23913g.f23901Z;
            OrderEntity orderEntityM27234C5 = this.f23913g.m27234C3();
            takerStopViewModelM27262L3.m27443r(this.f23913g, contractEntityM27233B3, bigDecimalM27264z3, text, C27025c.m66566d(orderEntityM27234C5 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C5.getSide(), "buy")) : null), leverage, str);
        }

        /* JADX INFO: renamed from: K */
        public static final Unit m27305K(C13791c c13791c, String str) {
            ViewExKt.m36489o(c13791c.getF23906b(), str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: L */
        public static final Unit m27306L(C13791c c13791c, String str) {
            ViewExKt.m36489o(c13791c.getF23907c(), str);
            return Unit.INSTANCE;
        }

        @Override // com.kubi.futures.trade.order.modify.TakerStopFragment.AbstractC13789a
        /* JADX INFO: renamed from: q */
        public void mo27298q(@Nullable BigDecimal bigDecimal) {
            String stopPriceType;
            BigDecimal bigDecimalM11724a;
            super.mo27298q(bigDecimal);
            this.f23913g.m27262L3().m27447v().observe(this.f23913g.getViewLifecycleOwner(), new C13792d(new Function1() { // from class: com.kubi.futures.trade.order.modify.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.C13791c.m27305K(this.f23998b, (String) obj);
                }
            }));
            this.f23913g.m27262L3().m27448w().observe(this.f23913g.getViewLifecycleOwner(), new C13792d(new Function1() { // from class: com.kubi.futures.trade.order.modify.t0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TakerStopFragment.C13791c.m27306L(this.f24000b, (String) obj);
                }
            }));
            OrderEntity orderEntityM27234C3 = this.f23913g.m27234C3();
            String plainString = null;
            if (orderEntityM27234C3 != null) {
                stopPriceType = orderEntityM27234C3.getStopPriceType();
            } else {
                stopPriceType = null;
            }
            int i11 = 0;
            if (!Intrinsics.areEqual(stopPriceType, "TP") && Intrinsics.areEqual(stopPriceType, "MP")) {
                i11 = 1;
            }
            this.f23913g.m27262L3().m27449x().setValue(new Pair<>(Integer.valueOf(i11), Boolean.FALSE));
            FocusEditText f23906b = getF23906b();
            if (bigDecimal != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal)) != null) {
                plainString = bigDecimalM11724a.toPlainString();
            }
            ViewExKt.m36489o(f23906b, plainString);
            mo27289B(String.valueOf(getF23906b().getText()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.TakerStopFragment$d */
    /* JADX INFO: compiled from: TakerStopFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13792d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23914b;

        public C13792d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23914b = function;
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
            return this.f23914b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23914b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public final ContractEntity m27233B3() {
        return (ContractEntity) this.f23902a0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public final OrderEntity m27234C3() {
        return (OrderEntity) this.f23899X.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public static final ContractEntity m27252y3(TakerStopFragment takerStopFragment) {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        OrderEntity orderEntityM27234C3 = takerStopFragment.m27234C3();
        return InterfaceC44980d.m99529O(interfaceC44980dM20288g, C27041f.m66668h(orderEntityM27234C3 != null ? orderEntityM27234C3.getSymbol() : null), false, 2, null);
    }

    /* JADX INFO: renamed from: A3 */
    public final String m27253A3() {
        return (String) this.f23900Y.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final C13790b m27254D3() {
        return (C13790b) this.f23904c0.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final C13791c m27257G3() {
        return (C13791c) this.f23903b0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I3, reason: from getter */
    public final String getF23901Z() {
        return this.f23901Z;
    }

    /* JADX INFO: renamed from: J3 */
    public final List<String> m27260J3() {
        return ArraysKt.toMutableList(getStringArrayRes(R$array.bkumex_stop_price_type));
    }

    /* JADX INFO: renamed from: K3 */
    public final C36791k3 m27261K3() {
        return (C36791k3) this.f23896U.getValue(this, f23895d0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final TakerStopViewModel m27262L3() {
        return (TakerStopViewModel) this.f23897V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f23898W;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_taker_stop, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String stopPriceType;
        BigDecimal triggerStopDownPrice;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OrderEntity orderEntityM27234C3 = m27234C3();
        if (orderEntityM27234C3 == null || (stopPriceType = orderEntityM27234C3.getStopPriceType()) == null) {
            stopPriceType = "TP";
        }
        this.f23901Z = stopPriceType;
        OrderEntity orderEntityM27234C4 = m27234C3();
        BigDecimal triggerStopUpPrice = null;
        if (C27025c.m66566d(orderEntityM27234C4 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C4.getSide(), "buy")) : null)) {
            OrderEntity orderEntityM27234C5 = m27234C3();
            if (orderEntityM27234C5 != null) {
                triggerStopDownPrice = orderEntityM27234C5.getTriggerStopUpPrice();
            } else {
                triggerStopDownPrice = null;
            }
        } else {
            OrderEntity orderEntityM27234C6 = m27234C3();
            if (orderEntityM27234C6 != null) {
                triggerStopDownPrice = orderEntityM27234C6.getTriggerStopDownPrice();
            } else {
                triggerStopDownPrice = null;
            }
        }
        C13791c c13791cM27257G3 = m27257G3();
        if (c13791cM27257G3 != null) {
            c13791cM27257G3.mo27298q(triggerStopDownPrice);
        }
        OrderEntity orderEntityM27234C7 = m27234C3();
        if (C27025c.m66566d(orderEntityM27234C7 != null ? Boolean.valueOf(Intrinsics.areEqual(orderEntityM27234C7.getSide(), "buy")) : null)) {
            OrderEntity orderEntityM27234C8 = m27234C3();
            if (orderEntityM27234C8 != null) {
                triggerStopUpPrice = orderEntityM27234C8.getTriggerStopDownPrice();
            }
        } else {
            OrderEntity orderEntityM27234C9 = m27234C3();
            if (orderEntityM27234C9 != null) {
                triggerStopUpPrice = orderEntityM27234C9.getTriggerStopUpPrice();
            }
        }
        C13790b c13790bM27254D3 = m27254D3();
        if (c13790bM27254D3 != null) {
            c13790bM27254D3.mo27298q(triggerStopUpPrice);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f23898W = z11;
    }

    public TakerStopFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewModels$default$2
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
        this.f23897V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TakerStopViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.order.modify.TakerStopFragment$special$$inlined$viewModels$default$5
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
        this.f23899X = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TakerStopFragment.m27235M3(this.f24049b);
            }
        });
        this.f23900Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TakerStopFragment.m27251w3(this.f23916b);
            }
        });
        this.f23901Z = "TP";
        this.f23902a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TakerStopFragment.m27252y3(this.f23918b);
            }
        });
        this.f23903b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TakerStopFragment.m27237O3(this.f23920b);
            }
        });
        this.f23904c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TakerStopFragment.m27236N3(this.f23922b);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public static final OrderEntity m27235M3(TakerStopFragment takerStopFragment) {
        Bundle arguments = takerStopFragment.getArguments();
        if (arguments != null) {
            return (OrderEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: N3 */
    public static final C13790b m27236N3(TakerStopFragment takerStopFragment) {
        C36791k3 c36791k3M27261K3 = takerStopFragment.m27261K3();
        if (c36791k3M27261K3 != null) {
            return new C13790b(takerStopFragment, c36791k3M27261K3);
        }
        return null;
    }

    /* JADX INFO: renamed from: O3 */
    public static final C13791c m27237O3(TakerStopFragment takerStopFragment) {
        C36791k3 c36791k3M27261K3 = takerStopFragment.m27261K3();
        if (c36791k3M27261K3 != null) {
            return new C13791c(takerStopFragment, c36791k3M27261K3);
        }
        return null;
    }

    /* JADX INFO: renamed from: w3 */
    public static final String m27251w3(TakerStopFragment takerStopFragment) {
        Bundle arguments = takerStopFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("data_1");
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: E3 */
    public final BigDecimal m27255E3() {
        FocusEditText focusEditText;
        C36791k3 c36791k3M27261K3 = m27261K3();
        if (c36791k3M27261K3 != null && (focusEditText = c36791k3M27261K3.f80398b) != null) {
            return C17071w.m36621c(focusEditText);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: F3 */
    public final BigDecimal m27256F3() {
        FocusEditText focusEditText;
        C36791k3 c36791k3M27261K3 = m27261K3();
        if (c36791k3M27261K3 != null && (focusEditText = c36791k3M27261K3.f80399c) != null) {
            return C17071w.m36621c(focusEditText);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: H3 */
    public final BigDecimal m27258H3() {
        FocusEditText focusEditText;
        C36791k3 c36791k3M27261K3 = m27261K3();
        if (c36791k3M27261K3 != null && (focusEditText = c36791k3M27261K3.f80402f) != null) {
            return C17071w.m36621c(focusEditText);
        }
        return null;
    }

    /* JADX INFO: renamed from: x3 */
    public final void m27263x3() {
        if (m27261K3() != null) {
            C13791c c13791cM27257G3 = m27257G3();
            if (c13791cM27257G3 != null) {
                c13791cM27257G3.m27294m();
            }
            C13790b c13790bM27254D3 = m27254D3();
            if (c13790bM27254D3 != null) {
                c13790bM27254D3.m27294m();
            }
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final BigDecimal m27264z3(boolean z11) {
        String str;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof LimitModifyOrderDialog) {
            LimitModifyOrderDialog limitModifyOrderDialog = (LimitModifyOrderDialog) parentFragment;
            if (z11) {
                str = "buy";
            } else {
                str = "sell";
            }
            return limitModifyOrderDialog.m27360v2(str);
        }
        return null;
    }
}
