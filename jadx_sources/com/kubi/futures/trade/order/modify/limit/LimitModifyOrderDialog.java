package com.kubi.futures.trade.order.modify.limit;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kubi.futures.settings.C13396j3;
import com.kubi.futures.trade.order.modify.BaseModifyOrderDialog;
import com.kubi.futures.trade.order.modify.TakerStopFragment;
import com.kubi.futures.trade.submit.panel.footer.w;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.futures.view.MaxHeightConstraintLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.record.C16700e0;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36794l0;
import fm.C37567b;
import fm.C37568c;
import fm.C37569d;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p236em.C37214b;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: LimitModifyOrderDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\bH\u0014J\b\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020\nH\u0002J\b\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\"H\u0002J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\n\u00104\u001a\u0004\u0018\u000103H\u0016J\n\u00105\u001a\u0004\u0018\u000103H\u0016J\n\u00106\u001a\u0004\u0018\u00010\"H\u0016J\u000f\u00107\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\bH\u0016J\u0012\u0010:\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u00020\"H\u0016J\u0012\u0010<\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u00020\"H\u0016J\b\u0010=\u001a\u00020\bH\u0016J\u0012\u0010>\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u00020\"H\u0016J\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\nH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\n\u0010C\u001a\u0004\u0018\u00010DH\u0002R2\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006E"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;", "Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;", "Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderViewModel;", "Lcom/kubi/futures/trade/submit/panel/tradeType/limit/ILimitInputPanel;", "<init>", "()V", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "getCallback", "()Lkotlin/jvm/functions/Function2;", "setCallback", "(Lkotlin/jvm/functions/Function2;)V", "viewModel", "getViewModel", "()Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getLayoutId", "", "isModifyOfOrder", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogModifyOrderLimitBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogModifyOrderLimitBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "tradeInputInitialized", "blockId", "", "shouldShowTakerStop", "hideTakerStop", "setScrollContainerMaxHeight", "showTakerStopFragment", "isShow", "initObserver", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "handleApiException", "e", "", "handleAvailableBalanceException", "handleRiskLimitException", "onDelegationPriceChanged", "text", "takerPrice", "Ljava/math/BigDecimal;", "stopPrice", "stopRate", "takerStopType", "isPassive", "()Ljava/lang/Boolean;", "isTakerStop", "delegationPrice", "side", "qty", "isFullPercent", "inputQty", "createValidate", "Lcom/kubi/futures/trade/submit/validate/factory/OrderValidate$Factory;", "ensureInputPrecision", "isReduce", "takerStopFragment", "Lcom/kubi/futures/trade/order/modify/TakerStopFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLimitModifyOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitModifyOrderDialog.kt\ncom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n106#2,15:371\n143#3,20:386\n55#4:406\n295#5,2:407\n*S KotlinDebug\n*F\n+ 1 LimitModifyOrderDialog.kt\ncom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog\n*L\n62#1:371,15\n84#1:386,20\n116#1:406\n366#1:407,2\n*E\n"})
public class LimitModifyOrderDialog extends BaseModifyOrderDialog<LimitModifyOrderViewModel> implements com.kubi.futures.trade.submit.panel.tradeType.limit.g {

    /* JADX INFO: renamed from: B0 */
    public static final /* synthetic */ KProperty<Object>[] f23945B0 = {Reflection.property1(new PropertyReference1Impl(LimitModifyOrderDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogModifyOrderLimitBinding;", 0))};

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public final InterfaceC24293a f23946A0;

    /* JADX INFO: renamed from: y0 */
    @Nullable
    public Function2<? super Boolean, ? super ProtocolException, Unit> f23947y0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f23948z0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$a */
    /* JADX INFO: compiled from: LimitModifyOrderDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13817a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23949b;

        public C13817a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23949b = function;
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
            return this.f23949b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23949b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public boolean mo27310V1() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: j5 */
    public static final Unit m27334j5(C36794l0 c36794l0, LimitModifyOrderDialog limitModifyOrderDialog, TickerEntity tickerEntity) {
        String strM84684y;
        BaseTextView baseTextView = c36794l0.f80460i;
        BigDecimal price = tickerEntity.getPrice();
        if (price == null) {
            strM84684y = C37569d.m84684y();
        } else {
            ContractEntity contractEntityM27174u4 = limitModifyOrderDialog.m27174u4();
            strM84684y = C42180b.m92640e(price, null, C27039d.m66651k(contractEntityM27174u4 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM27174u4)) : null, 2), true, true, false, 0, null, 113, null);
            if (strM84684y == null) {
                strM84684y = C37569d.m84684y();
            }
        }
        baseTextView.setText(strM84684y);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: k5 */
    public static final Unit m27335k5(C36794l0 c36794l0, LimitModifyOrderDialog limitModifyOrderDialog, PriceEntity priceEntity) {
        String strM84684y;
        BaseTextView baseTextView = c36794l0.f80465n;
        BigDecimal markPrice = priceEntity.getMarkPrice();
        if (markPrice == null) {
            strM84684y = C37569d.m84684y();
        } else {
            ContractEntity contractEntityM27174u4 = limitModifyOrderDialog.m27174u4();
            strM84684y = C42180b.m92640e(markPrice, null, C27039d.m66651k(contractEntityM27174u4 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM27174u4)) : null, 2), true, true, false, 0, null, 113, null);
            if (strM84684y == null) {
                strM84684y = C37569d.m84684y();
            }
        }
        baseTextView.setText(strM84684y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m27336l5(C36794l0 c36794l0, LimitModifyOrderDialog limitModifyOrderDialog, Pair pair) {
        c36794l0.f80454c.mo28851l();
        CharSequence charSequence = (CharSequence) pair.getFirst();
        if (charSequence == null || charSequence.length() == 0) {
            limitModifyOrderDialog.m27353e5((Throwable) pair.getSecond());
        } else {
            C17058m0.m36549d(limitModifyOrderDialog, limitModifyOrderDialog.getString(R$string.kc_trade_modify_order_success));
            limitModifyOrderDialog.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m27343s5(C36794l0 c36794l0, LimitModifyOrderDialog limitModifyOrderDialog) {
        if (c36794l0.f80454c.getF44406k()) {
            return Unit.INSTANCE;
        }
        if (!limitModifyOrderDialog.mo27319u5()) {
            C17058m0.m36549d(limitModifyOrderDialog, limitModifyOrderDialog.getString(R$string.kc_trade_order_not_modify));
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), limitModifyOrderDialog.mo27312b5(), "1", null, 8, null);
        limitModifyOrderDialog.mo27317o1();
        c36794l0.f80454c.m55043o();
        limitModifyOrderDialog.mo27181z4().m27229V(limitModifyOrderDialog, limitModifyOrderDialog);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final void m27344t5(LimitModifyOrderDialog limitModifyOrderDialog, DialogInterface dialogInterface) {
        Function2<? super Boolean, ? super ProtocolException, Unit> function2 = limitModifyOrderDialog.f23947y0;
        if (function2 != null) {
            Pair<String, Throwable> value = limitModifyOrderDialog.mo27181z4().m27227T().getValue();
            String first = value != null ? value.getFirst() : null;
            function2.invoke(Boolean.valueOf(!(first == null || first.length() == 0)), null);
        }
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    /* JADX INFO: renamed from: A4 */
    public void mo27141A4(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null) {
            return;
        }
        Observable<CharSequence> observableSkip = C0206f.m784d(c36794l0M27350c5.f80456e.getEditText()).skip(1L);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.order.modify.limit.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitModifyOrderDialog.m27337m5(this.f23961b, (CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.futures.trade.order.modify.limit.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitModifyOrderDialog.m27338n5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.order.modify.limit.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitModifyOrderDialog.m27339o5((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSkip.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.order.modify.limit.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitModifyOrderDialog.m27340p5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
        mo27181z4().m27226S().observe(owner, new C13817a(new Function1() { // from class: com.kubi.futures.trade.order.modify.limit.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitModifyOrderDialog.m27334j5(c36794l0M27350c5, this, (TickerEntity) obj);
            }
        }));
        mo27181z4().m27225R().observe(owner, new C13817a(new Function1() { // from class: com.kubi.futures.trade.order.modify.limit.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitModifyOrderDialog.m27335k5(c36794l0M27350c5, this, (PriceEntity) obj);
            }
        }));
        mo27181z4().m27227T().observe(owner, new C13817a(new Function1() { // from class: com.kubi.futures.trade.order.modify.limit.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitModifyOrderDialog.m27336l5(c36794l0M27350c5, this, (Pair) obj);
            }
        }));
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public OrderTradeType mo27147E4() {
        return OrderTradeType.Limit;
    }

    @Nullable
    /* JADX INFO: renamed from: I2 */
    public BigDecimal m27348I2(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        InterfaceC38213a interfaceC38213aM27158Q2 = m27158Q2();
        if (interfaceC38213aM27158Q2 == null) {
            return null;
        }
        return mo27179x4().mo90015i(interfaceC38213aM27158Q2, m27360v2(side), m27359s1(side), null);
    }

    @NotNull
    /* JADX INFO: renamed from: J1 */
    public com.kubi.futures.trade.submit.validate.factory.f.a mo27309J1() {
        return new com.kubi.futures.trade.submit.validate.factory.d();
    }

    @NotNull
    /* JADX INFO: renamed from: b5 */
    public String mo27312b5() {
        return "ModifyLimitOrder";
    }

    @Nullable
    /* JADX INFO: renamed from: c5 */
    public final C36794l0 m27350c5() {
        return (C36794l0) this.f23946A0.getValue(this, f23945B0[0]);
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: d5, reason: merged with bridge method [inline-methods] */
    public LimitModifyOrderViewModel mo27181z4() {
        return (LimitModifyOrderViewModel) this.f23948z0.getValue();
    }

    /* JADX INFO: renamed from: e5 */
    public final void m27353e5(Throwable th2) {
        if (th2 == null) {
            return;
        }
        boolean z11 = th2 instanceof ApiException;
        if (z11 && Intrinsics.areEqual(((ApiException) th2).code, "300005")) {
            m27357h5();
            return;
        }
        if (z11) {
            ApiException apiException = (ApiException) th2;
            if (Intrinsics.areEqual(apiException.code, "300003") || Intrinsics.areEqual(apiException.code, "330008")) {
                m27354f5();
                return;
            }
        }
        C17058m0.m36550e(this, th2);
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    public void initView() {
        InterfaceC38213a interfaceC38213aM27158Q2;
        final C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null) {
            return;
        }
        MaxHeightConstraintLayout root = c36794l0M27350c5.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        m27155M4(root);
        AppCompatImageView close = c36794l0M27350c5.f80453b;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.limit.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitModifyOrderDialog.m27341q5(this.f23950b);
            }
        }, 1, null);
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null || (interfaceC38213aM27158Q2 = m27158Q2()) == null) {
            return;
        }
        Context context = c36794l0M27350c5.getRoot().getContext();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        AnimateDrawableEndView takerStop = c36794l0M27350c5.f80471t;
        Intrinsics.checkNotNullExpressionValue(takerStop, "takerStop");
        C27046k.m66711z(takerStop, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.limit.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitModifyOrderDialog.m27342r5(this.f23955b, c36794l0M27350c5, booleanRef);
            }
        }, 1, null);
        KcPrimaryButton confirm = c36794l0M27350c5.f80454c;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.limit.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitModifyOrderDialog.m27343s5(c36794l0M27350c5, this);
            }
        }, 1, null);
        c36794l0M27350c5.f80470s.setText(interfaceC38213aM27158Q2.mo86233d());
        KcTradeRateView kcTradeRateView = c36794l0M27350c5.f80469r;
        Intrinsics.checkNotNull(context);
        kcTradeRateView.setTextColor(C22890g.m54281f(context, C27025c.m66566d(Boolean.valueOf(Intrinsics.areEqual(orderEntityM27178w4.getSide(), "buy")))));
        c36794l0M27350c5.f80469r.setText(C16700e0.m35734n(orderEntityM27178w4, context));
        c36794l0M27350c5.f80467p.setText(orderEntityM27178w4.getAdvancedDisplayType());
        BaseTextView orderType = c36794l0M27350c5.f80467p;
        Intrinsics.checkNotNullExpressionValue(orderType, "orderType");
        C27046k.m66684G(orderType, C27041f.m66668h(orderEntityM27178w4.getAdvancedDisplayType()).length() > 0);
        c36794l0M27350c5.f80462k.setText(C17054k0.m36530d(orderEntityM27178w4.getLeverage(), false, 1, null));
        c36794l0M27350c5.f80464m.setText(C37568c.m84634e(orderEntityM27178w4) ? getString(R$string.kumex_cross_position) : getString(R$string.kumex_isolate_position));
        KcTradeNumAbInputView delegationPrice = c36794l0M27350c5.f80456e;
        Intrinsics.checkNotNullExpressionValue(delegationPrice, "delegationPrice");
        m27142B4(delegationPrice);
        KcTradeNumAbInputView delegationQty = c36794l0M27350c5.f80457f;
        Intrinsics.checkNotNullExpressionValue(delegationQty, "delegationQty");
        m27143C4(delegationQty);
        m27364x5();
        if (!m27365z5()) {
            m27358i5();
        } else if (!C41014a.m89917B(m27363x0()) || !C41014a.m89917B(m27355g0())) {
            c36794l0M27350c5.f80471t.performClick();
        }
        m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.trade.order.modify.limit.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LimitModifyOrderDialog.m27344t5(this.f23960b, dialogInterface);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: s1 */
    public BigDecimal m27359s1(@NotNull String side) {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        Intrinsics.checkNotNullParameter(side, "side");
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null || (kcTradeNumAbInputView = c36794l0M27350c5.f80457f) == null) {
            return null;
        }
        return kcTradeNumAbInputView.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: v2 */
    public BigDecimal m27360v2(@NotNull String side) {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        Intrinsics.checkNotNullParameter(side, "side");
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null || (kcTradeNumAbInputView = c36794l0M27350c5.f80456e) == null) {
            return null;
        }
        return kcTradeNumAbInputView.getValue();
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    /* JADX INFO: renamed from: v4 */
    public int mo27176v4() {
        return R$layout.bkumex_dialog_modify_order_limit;
    }

    /* JADX INFO: renamed from: w5 */
    public final void m27362w5(@Nullable Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        this.f23947y0 = function2;
    }

    public LimitModifyOrderDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewModels$default$2
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
        this.f23948z0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LimitModifyOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewModels$default$5
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
        this.f23946A0 = C45681e.m100799e(this, new Function1<LimitModifyOrderDialog, C36794l0>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36794l0 invoke(@NotNull LimitModifyOrderDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36794l0.m82448a(fragment.requireView());
            }
        }, new Function1<C36794l0, Unit>() { // from class: com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36794l0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36794l0 c36794l0) {
                invoke(c36794l0);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m27333g5(LimitModifyOrderDialog limitModifyOrderDialog) {
        String strMo86250u;
        InterfaceC38213a interfaceC38213aM27158Q2 = limitModifyOrderDialog.m27158Q2();
        if (interfaceC38213aM27158Q2 != null) {
            strMo86250u = interfaceC38213aM27158Q2.mo86250u();
        } else {
            strMo86250u = null;
        }
        w.a(C27041f.m66668h(C27041f.m66677q(strMo86250u)), "TransferButton");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m27337m5(LimitModifyOrderDialog limitModifyOrderDialog, CharSequence charSequence) {
        limitModifyOrderDialog.m27361v5(charSequence.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final void m27338n5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m27339o5(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "LimitModifyOrderDialog-delegationPrice");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public static final void m27340p5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m27341q5(LimitModifyOrderDialog limitModifyOrderDialog) {
        C43852m.m96591c(C17060n0.m36552b(), limitModifyOrderDialog.mo27312b5(), "2", null, 8, null);
        limitModifyOrderDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final Unit m27342r5(LimitModifyOrderDialog limitModifyOrderDialog, C36794l0 c36794l0, Ref.BooleanRef booleanRef) {
        C43852m.m96591c(C17060n0.m36552b(), limitModifyOrderDialog.mo27312b5(), "3", null, 8, null);
        c36794l0.f80471t.m28819j();
        limitModifyOrderDialog.m27346A5(booleanRef.element);
        booleanRef.element = !booleanRef.element;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final void m27345y5(LimitModifyOrderDialog limitModifyOrderDialog) {
        C36794l0 c36794l0M27350c5 = limitModifyOrderDialog.m27350c5();
        if (c36794l0M27350c5 == null) {
            return;
        }
        c36794l0M27350c5.f80459h.setMaxHeightPx(c36794l0M27350c5.getRoot().getF25003n() - (c36794l0M27350c5.getRoot().getHeight() - c36794l0M27350c5.f80459h.getHeight()));
    }

    /* JADX INFO: renamed from: A5 */
    public final void m27346A5(boolean z11) {
        OrderEntity orderEntityM27178w4;
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null || (orderEntityM27178w4 = m27178w4()) == null) {
            return;
        }
        TakerStopFragment takerStopFragmentM27347B5 = m27347B5();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        if (takerStopFragmentM27347B5 == null) {
            TakerStopFragment takerStopFragment = new TakerStopFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", orderEntityM27178w4);
            bundle.putString("data_1", mo27312b5());
            takerStopFragment.setArguments(bundle);
            fragmentTransactionBeginTransaction.add(R$id.container, takerStopFragment).commitNowAllowingStateLoss();
        } else if (z11) {
            fragmentTransactionBeginTransaction.show(takerStopFragmentM27347B5).commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.hide(takerStopFragmentM27347B5).commitNowAllowingStateLoss();
        }
        FrameLayout container = c36794l0M27350c5.f80455d;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        C27046k.m66684G(container, z11);
    }

    /* JADX INFO: renamed from: B5 */
    public final TakerStopFragment m27347B5() {
        Object next;
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof TakerStopFragment));
        if (!(next instanceof TakerStopFragment)) {
            return null;
        }
        return (TakerStopFragment) next;
    }

    @Nullable
    /* JADX INFO: renamed from: U2 */
    public BigDecimal m27349U2() {
        TakerStopFragment takerStopFragmentM27347B5 = m27347B5();
        if (takerStopFragmentM27347B5 != null) {
            return takerStopFragmentM27347B5.m27256F3();
        }
        return null;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean mo27311a2() {
        return getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Nullable
    /* JADX INFO: renamed from: e0 */
    public String m27352e0() {
        String strM27259I3;
        TakerStopFragment takerStopFragmentM27347B5 = m27347B5();
        if (takerStopFragmentM27347B5 != null && (strM27259I3 = takerStopFragmentM27347B5.getF23901Z()) != null) {
            return strM27259I3;
        }
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            return orderEntityM27178w4.getStopPriceType();
        }
        return null;
    }

    /* JADX INFO: renamed from: f5 */
    public final void m27354f5() {
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            if (orderEntityM27178w4.isTrialFunds()) {
                BaseDialogFragment baseDialogFragmentM33668K = C15943u.m33668K(R$string.kumex_welfare_trade_funds_balance_alert, null, 2, null);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogFragmentM33668K.show(childFragmentManager, "trial_balance_notice_dialog");
                return;
            }
            BaseDialogFragment baseDialogFragmentM33676S = C15943u.m33676S(new Function0() { // from class: com.kubi.futures.trade.order.modify.limit.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LimitModifyOrderDialog.m27333g5(this.f23954b);
                }
            });
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            baseDialogFragmentM33676S.show(childFragmentManager2, "transfer_dialog");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public BigDecimal m27355g0() {
        if (!m27365z5()) {
            return null;
        }
        TakerStopFragment takerStopFragmentM27347B5 = m27347B5();
        if (takerStopFragmentM27347B5 == null) {
            OrderEntity orderEntityM27178w4 = m27178w4();
            if (orderEntityM27178w4 == null) {
                return null;
            }
            return orderEntityM27178w4.getTriggerStopDownPrice();
        }
        return takerStopFragmentM27347B5.m27255E3();
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m27356g1() {
        Boolean fromReduce;
        OrderEntity orderEntityM27178w4 = m27178w4();
        Boolean closeOrder = null;
        if (orderEntityM27178w4 != null) {
            fromReduce = orderEntityM27178w4.getFromReduce();
        } else {
            fromReduce = null;
        }
        if (!C27025c.m66566d(fromReduce)) {
            OrderEntity orderEntityM27178w5 = m27178w4();
            if (orderEntityM27178w5 != null) {
                closeOrder = orderEntityM27178w5.getCloseOrder();
            }
            if (!C27025c.m66566d(closeOrder)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: h5 */
    public final void m27357h5() {
        OrderEntity orderEntityM27178w4;
        String marginMode;
        Context context = getContext();
        if (context != null && (orderEntityM27178w4 = m27178w4()) != null && (marginMode = orderEntityM27178w4.getMarginMode()) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C13396j3.m26331c(context, marginMode, childFragmentManager);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public final void m27358i5() {
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null) {
            return;
        }
        AnimateDrawableEndView takerStop = c36794l0M27350c5.f80471t;
        Intrinsics.checkNotNullExpressionValue(takerStop, "takerStop");
        ViewExtKt.m66577h(takerStop);
        FrameLayout container = c36794l0M27350c5.f80455d;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewExtKt.m66577h(container);
        View line = c36794l0M27350c5.f80463l;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        ViewExtKt.m66577h(line);
    }

    /* JADX INFO: renamed from: o1 */
    public void mo27317o1() {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 != null && (kcTradeNumAbInputView = c36794l0M27350c5.f80457f) != null) {
            kcTradeNumAbInputView.mo54630g(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX INFO: renamed from: u5 */
    public boolean mo27319u5() {
        boolean z11;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalAbs;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null) {
            return false;
        }
        BigDecimal bigDecimalM27360v2 = m27360v2(C27041f.m66669i(orderEntityM27178w4.getSide(), "buy"));
        BigDecimal bigDecimalM27348I2 = m27348I2(C27041f.m66669i(orderEntityM27178w4.getSide(), "buy"));
        if (C17054k0.m36528b(bigDecimalM27360v2, orderEntityM27178w4.getPrice())) {
            BigDecimal size = orderEntityM27178w4.getSize();
            if (size != null && (bigDecimalAbs = size.abs()) != null) {
                bigDecimalSubtract = bigDecimalAbs.subtract(C27039d.m66656p(orderEntityM27178w4.getDealSize()));
            } else {
                bigDecimalSubtract = null;
            }
            if (C17054k0.m36528b(bigDecimalM27348I2, bigDecimalSubtract)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (!m27365z5()) {
            return z11;
        }
        BigDecimal bigDecimalM27363x0 = m27363x0();
        BigDecimal bigDecimalM27355g0 = m27355g0();
        if (!z11 && C17054k0.m36528b(bigDecimalM27363x0, orderEntityM27178w4.getTriggerStopUpPrice()) && C17054k0.m36528b(bigDecimalM27355g0, orderEntityM27178w4.getTriggerStopDownPrice())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: v5 */
    public final void m27361v5(String str) {
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 != null && m27365z5()) {
            if (!C41014a.m89917B(m27363x0()) || !C41014a.m89917B(m27355g0())) {
                FrameLayout container = c36794l0M27350c5.f80455d;
                Intrinsics.checkNotNullExpressionValue(container, "container");
                if (!C27046k.m66704s(container)) {
                    c36794l0M27350c5.f80471t.performClick();
                }
            }
            TakerStopFragment takerStopFragmentM27347B5 = m27347B5();
            if (takerStopFragmentM27347B5 != null) {
                takerStopFragmentM27347B5.m27263x3();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public BigDecimal m27363x0() {
        if (!m27365z5()) {
            return null;
        }
        TakerStopFragment takerStopFragmentM27347B5 = m27347B5();
        if (takerStopFragmentM27347B5 == null) {
            OrderEntity orderEntityM27178w4 = m27178w4();
            if (orderEntityM27178w4 == null) {
                return null;
            }
            return orderEntityM27178w4.getTriggerStopUpPrice();
        }
        return takerStopFragmentM27347B5.m27258H3();
    }

    /* JADX INFO: renamed from: x5 */
    public final void m27364x5() {
        MaxHeightConstraintLayout root;
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 != null && (root = c36794l0M27350c5.getRoot()) != null) {
            root.post(new Runnable() { // from class: com.kubi.futures.trade.order.modify.limit.c
                @Override // java.lang.Runnable
                public final void run() {
                    LimitModifyOrderDialog.m27345y5(this.f23953b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z5 */
    public boolean m27365z5() {
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null) {
            return true;
        }
        return !C37568c.m84639j(orderEntityM27178w4);
    }
}
