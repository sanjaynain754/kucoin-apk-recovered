package com.kubi.futures.trade.order.modify.twap;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import bi.FlutterModifyTwapEvent;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.event.api.C12572a;
import com.kubi.futures.dialog.twap.IntervalTimeSettingDialog;
import com.kubi.futures.dialog.twap.OrderPriceType;
import com.kubi.futures.dialog.twap.OrderTypeSettingDialog;
import com.kubi.futures.dialog.twap.TimeBreakdown;
import com.kubi.futures.dialog.twap.TotalTimeSettingDialog;
import com.kubi.futures.settings.C13396j3;
import com.kubi.futures.trade.order.modify.BaseModifyOrderDialog;
import com.kubi.futures.trade.submit.panel.footer.w;
import com.kubi.futures.trade.submit.panel.view.InputPanelTimeInputView;
import com.kubi.futures.trade.submit.panel.view.twap.TwapAdvanceSettingView;
import com.kubi.futures.view.MaxHeightConstraintLayout;
import com.kubi.kucoin.utils.NetworkToastHandler;
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
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36800m0;
import fm.C37567b;
import fm.C37568c;
import fm.C37569d;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import ki.InterfaceC41049a;
import li.C42226a;
import li.C42227b;
import li.C42230e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p801yl.C46527h0;
import p832zh.C46849a0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
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
import t30.C44685e;
import w00.C45681e;

/* JADX INFO: compiled from: TwapModifyOrderDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001GB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\f\u0010$\u001a\u00020\u001d*\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020\u0018H\u0016J\u001a\u00102\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000206H\u0002J\u000f\u00107\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0002\u00109J\u000f\u0010:\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0002\u00109J\n\u00103\u001a\u0004\u0018\u000104H\u0016J\n\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020\rH\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020\rH\u0016J\b\u0010@\u001a\u00020\u0018H\u0016J\u0012\u0010A\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020\rH\u0016J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020\u001dH\u0016J\b\u0010E\u001a\u00020\u0018H\u0016J\b\u0010F\u001a\u00020\u001dH\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020 8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b!\u0010\"¨\u0006H"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/twap/TwapModifyOrderDialog;", "Lcom/kubi/futures/trade/order/modify/BaseModifyOrderDialog;", "Lcom/kubi/futures/trade/order/modify/twap/TwapModifyOrderViewModel;", "Lcom/kubi/futures/trade/submit/panel/tradeType/twap/ITwapInputPanel;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogModifyOrderTwapBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogModifyOrderTwapBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "blockId", "", "viewModel", "getViewModel", "()Lcom/kubi/futures/trade/order/modify/twap/TwapModifyOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "getLayoutId", "", "isAlreadySendFlutterCallback", "", "()Z", "setAlreadySendFlutterCallback", "(Z)V", "initView", "", "tradeInputInitialized", "qtyFactory", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "getQtyFactory", "()Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "qtyFactory$delegate", "initQty", "Lcom/kubi/resources/widget/KcTradeNumAbInputView;", "toggleAdvanceSettingStatus", ViewProps.VISIBLE, "setScrollContainerMaxHeight", "initObserver", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "handleApiException", "e", "", "handleAvailableBalanceException", "handleRiskLimitException", "isModifyOfOrder", "priceStrategyChanged", "priceStrategyType", "Lcom/kubi/futures/dialog/twap/OrderPriceType;", "order", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "totalDuration", "", "()Ljava/lang/Long;", JPushConstants.Geofence.KEY_INTERVAL, "priceLimited", "Ljava/math/BigDecimal;", "delegationPrice", "side", "qty", "isFullPercent", "inputQty", "createValidate", "Lcom/kubi/futures/trade/submit/validate/factory/OrderValidate$Factory;", "ensureInputPrecision", "isReduce", "onDestroyView", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTwapModifyOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapModifyOrderDialog.kt\ncom/kubi/futures/trade/order/modify/twap/TwapModifyOrderDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,479:1\n143#2,20:480\n106#3,15:500\n55#4:515\n254#5:516\n*S KotlinDebug\n*F\n+ 1 TwapModifyOrderDialog.kt\ncom/kubi/futures/trade/order/modify/twap/TwapModifyOrderDialog\n*L\n91#1:480,20\n95#1:500,15\n110#1:515\n144#1:516\n*E\n"})
public final class TwapModifyOrderDialog extends BaseModifyOrderDialog<TwapModifyOrderViewModel> implements com.kubi.futures.trade.submit.panel.tradeType.twap.b {

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public final Lazy f24003A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f24004B0;

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public final Lazy f24005C0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final InterfaceC24293a f24006y0 = C45681e.m100799e(this, new Function1<TwapModifyOrderDialog, C36800m0>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36800m0 invoke(@NotNull TwapModifyOrderDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36800m0.m82461a(fragment.requireView());
        }
    }, new Function1<C36800m0, Unit>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36800m0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36800m0 c36800m0) {
            invoke(c36800m0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final String f24007z0 = "editTwapOrder";

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ KProperty<Object>[] f24002E0 = {Reflection.property1(new PropertyReference1Impl(TwapModifyOrderDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogModifyOrderTwapBinding;", 0))};

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public static final Companion f24001D0 = new Companion(null);

    /* JADX INFO: compiled from: TwapModifyOrderDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/twap/TwapModifyOrderDialog$Companion;", "", "<init>", "()V", "MODIFY_TWAP_TOTAL_TIME_SETTING", "", "MODIFY_TWAP_INTERVAL_SETTING", "MODIFY_TWAP_ORDER_TYPE_SETTING", "MODIFY_TWAP_ORDER_FLUTTER_CALLBACK", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$a */
    /* JADX INFO: compiled from: TwapModifyOrderDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13855a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24008b;

        public C13855a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24008b = function;
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
            return this.f24008b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24008b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: V1 */
    public boolean m27430V1() {
        return false;
    }

    /* JADX INFO: renamed from: A5 */
    public static final void m27379A5(C36800m0 c36800m0, DialogInterface dialogInterface) {
        c36800m0.f80532w.getChangeOrderTypeTv().m28819j();
    }

    /* JADX INFO: renamed from: j5 */
    private final void m27405j5(Throwable th2) {
        if (th2 == null) {
            return;
        }
        boolean z11 = th2 instanceof ApiException;
        if (z11 && Intrinsics.areEqual(((ApiException) th2).code, "300005")) {
            m27408m5();
            return;
        }
        if (z11) {
            ApiException apiException = (ApiException) th2;
            if (Intrinsics.areEqual(apiException.code, "300003") || Intrinsics.areEqual(apiException.code, "330008")) {
                m27406k5();
                return;
            }
        }
        String strM33206f = NetworkToastHandler.m33206f(new NetworkToastHandler(), th2, null, 2, null);
        if (strM33206f != null) {
            C17058m0.m36549d(this, strM33206f);
        }
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m27409n5(TwapModifyOrderDialog twapModifyOrderDialog, com.kubi.futures.trade.submit.panel.tradeType.twap.a aVar) {
        if (aVar != null) {
            TotalTimeSettingDialog totalTimeSettingDialogNewInstance = TotalTimeSettingDialog.f22922G0.newInstance("modify_twap_total_time_setting", C46849a0.m103196d(aVar.a()), aVar.c(), aVar.b());
            FragmentManager childFragmentManager = twapModifyOrderDialog.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            totalTimeSettingDialogNewInstance.show(childFragmentManager, "ModifyTotalTimeSettingDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: o5 */
    public static final Unit m27410o5(C36800m0 c36800m0, TwapModifyOrderDialog twapModifyOrderDialog, TickerEntity tickerEntity) {
        String strM84684y;
        BaseTextView baseTextView = c36800m0.f80521l;
        BigDecimal price = tickerEntity.getPrice();
        if (price == null) {
            strM84684y = C37569d.m84684y();
        } else {
            ContractEntity contractEntityM27174u4 = twapModifyOrderDialog.m27174u4();
            strM84684y = C42180b.m92640e(price, null, C27039d.m66651k(contractEntityM27174u4 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM27174u4)) : null, 2), true, true, false, 0, null, 113, null);
            if (strM84684y == null) {
                strM84684y = C37569d.m84684y();
            }
        }
        baseTextView.setText(strM84684y);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: p5 */
    public static final Unit m27411p5(C36800m0 c36800m0, TwapModifyOrderDialog twapModifyOrderDialog, PriceEntity priceEntity) {
        String strM84684y;
        BaseTextView baseTextView = c36800m0.f80525p;
        BigDecimal markPrice = priceEntity.getMarkPrice();
        if (markPrice == null) {
            strM84684y = C37569d.m84684y();
        } else {
            ContractEntity contractEntityM27174u4 = twapModifyOrderDialog.m27174u4();
            strM84684y = C42180b.m92640e(markPrice, null, C27039d.m66651k(contractEntityM27174u4 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM27174u4)) : null, 2), true, true, false, 0, null, 113, null);
            if (strM84684y == null) {
                strM84684y = C37569d.m84684y();
            }
        }
        baseTextView.setText(strM84684y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m27412q5(C36800m0 c36800m0, TwapModifyOrderDialog twapModifyOrderDialog, Pair pair) {
        c36800m0.f80515f.mo28851l();
        String str = (String) pair.getFirst();
        if (str == null || str.length() == 0) {
            twapModifyOrderDialog.m27405j5((Throwable) pair.getSecond());
        } else {
            C17058m0.m36549d(twapModifyOrderDialog, twapModifyOrderDialog.getString(R$string.kc_trade_modify_order_success));
            twapModifyOrderDialog.f24004B0 = true;
            C12572a.m23695d("modify_twap_order_flutter_callback", new FlutterModifyTwapEvent(str), 0L, 4, null);
            twapModifyOrderDialog.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m27413s5(C36800m0 c36800m0, TwapModifyOrderDialog twapModifyOrderDialog) {
        if (c36800m0.f80515f.getF44406k()) {
            return Unit.INSTANCE;
        }
        if (!twapModifyOrderDialog.m27422E5()) {
            C17058m0.m36549d(twapModifyOrderDialog, twapModifyOrderDialog.getString(R$string.kc_trade_order_not_modify));
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), twapModifyOrderDialog.f24007z0, "1", null, 8, null);
        twapModifyOrderDialog.m27435o1();
        c36800m0.f80515f.m55043o();
        twapModifyOrderDialog.mo27181z4().m27229V(twapModifyOrderDialog, twapModifyOrderDialog);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final void m27414t5(C36800m0 c36800m0, String requestKey, Bundle result) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        TimeBreakdown timeBreakdown = (TimeBreakdown) BundleCompat.getParcelable(result, "totalTime", TimeBreakdown.class);
        if (timeBreakdown != null) {
            c36800m0.f80531v.setTime(timeBreakdown);
        }
    }

    /* JADX INFO: renamed from: u5 */
    public static final void m27415u5(C36800m0 c36800m0, String requestKey, Bundle result) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        c36800m0.f80532w.setInterval(result.getLong(JPushConstants.Geofence.KEY_INTERVAL));
    }

    /* JADX INFO: renamed from: v5 */
    public static final void m27416v5(C36800m0 c36800m0, OrderEntity orderEntity, String requestKey, Bundle result) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        OrderPriceType orderPriceType = (OrderPriceType) BundleCompat.getParcelable(result, "order_price_type", OrderPriceType.class);
        if (orderPriceType != null) {
            TwapAdvanceSettingView twapAdvanceSettingView = c36800m0.f80532w;
            String side = orderEntity.getSide();
            if (side == null) {
                side = "buy";
            }
            twapAdvanceSettingView.n(orderPriceType, side);
        }
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m27417w5(C36800m0 c36800m0, TwapModifyOrderDialog twapModifyOrderDialog) {
        TwapAdvanceSettingView twapAdvanceSettingView = c36800m0.f80532w;
        Intrinsics.checkNotNullExpressionValue(twapAdvanceSettingView, "twapAdvanceSettingView");
        if (twapAdvanceSettingView.getVisibility() == 0) {
            twapModifyOrderDialog.m27427J5(false);
        } else {
            twapModifyOrderDialog.m27427J5(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m27419y5(final C36800m0 c36800m0, TwapModifyOrderDialog twapModifyOrderDialog, OrderEntity orderEntity, View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i11 = R$id.changeIntervalTv;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            BaseDialogFragment baseDialogFragmentM54192r3 = IntervalTimeSettingDialog.f22898B0.newInstance("modify_twap_interval_setting", c36800m0.f80532w.getInterval()).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.trade.order.modify.twap.f
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TwapModifyOrderDialog.m27420z5(c36800m0, dialogInterface);
                }
            });
            FragmentManager childFragmentManager = twapModifyOrderDialog.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM54192r3.show(childFragmentManager, "IntervalTimeSettingDialog");
            c36800m0.f80532w.getChangeIntervalTv().m28819j();
        } else {
            int i12 = R$id.changeOrderTypeTv;
            if (numValueOf != null && numValueOf.intValue() == i12) {
                BaseDialogFragment baseDialogFragmentM54192r4 = OrderTypeSettingDialog.f22912z0.newInstance("modify_twap_order_type_setting", twapModifyOrderDialog.m27438v2(C27041f.m66668h(orderEntity.getSide())), C46527h0.f104291a.m102677L(), c36800m0.f80532w.getOrderPriceType()).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.trade.order.modify.twap.g
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TwapModifyOrderDialog.m27379A5(c36800m0, dialogInterface);
                    }
                });
                FragmentManager childFragmentManager2 = twapModifyOrderDialog.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                baseDialogFragmentM54192r4.show(childFragmentManager2, "OrderTypeSettingDialog");
                c36800m0.f80532w.getChangeOrderTypeTv().m28819j();
            } else {
                int i13 = R$id.priceStrategyLabelTv;
                if (numValueOf != null && numValueOf.intValue() == i13) {
                    AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(twapModifyOrderDialog.getString(R$string.bkumex_twap_price_limit_title)).m54156M4(twapModifyOrderDialog.getString(R$string.bkumex_twap_price_limit_desc)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.order.modify.twap.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            TwapModifyOrderDialog.m27380B5(dialogInterface, i14);
                        }
                    });
                    FragmentManager childFragmentManager3 = twapModifyOrderDialog.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                    alertDialogFragmentHelperM54162S4.show(childFragmentManager3, "PriceStrategyDialog");
                } else {
                    int i14 = R$id.intervalLabelTv;
                    if (numValueOf != null && numValueOf.intValue() == i14) {
                        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S5 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(twapModifyOrderDialog.getString(R$string.bkumex_trade_date_pick_interval)).m54156M4(twapModifyOrderDialog.getString(R$string.bkumex_twap_advance_interval_desc)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.order.modify.twap.i
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                TwapModifyOrderDialog.m27381C5(dialogInterface, i15);
                            }
                        });
                        FragmentManager childFragmentManager4 = twapModifyOrderDialog.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                        alertDialogFragmentHelperM54162S5.show(childFragmentManager4, "IntervalLabelTvDialog");
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z5 */
    public static final void m27420z5(C36800m0 c36800m0, DialogInterface dialogInterface) {
        c36800m0.f80532w.getChangeIntervalTv().m28819j();
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    /* JADX INFO: renamed from: A4 */
    public void mo27141A4(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 == null) {
            return;
        }
        mo27181z4().m27440m0().observe(getViewLifecycleOwner(), new C13855a(new Function1() { // from class: com.kubi.futures.trade.order.modify.twap.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapModifyOrderDialog.m27409n5(this.f24036b, (com.kubi.futures.trade.submit.panel.tradeType.twap.a) obj);
            }
        }));
        mo27181z4().m27226S().observe(owner, new C13855a(new Function1() { // from class: com.kubi.futures.trade.order.modify.twap.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapModifyOrderDialog.m27410o5(c36800m0M27433h5, this, (TickerEntity) obj);
            }
        }));
        mo27181z4().m27225R().observe(owner, new C13855a(new Function1() { // from class: com.kubi.futures.trade.order.modify.twap.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapModifyOrderDialog.m27411p5(c36800m0M27433h5, this, (PriceEntity) obj);
            }
        }));
        mo27181z4().m27227T().observe(owner, new C13855a(new Function1() { // from class: com.kubi.futures.trade.order.modify.twap.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapModifyOrderDialog.m27412q5(c36800m0M27433h5, this, (Pair) obj);
            }
        }));
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public OrderTradeType mo27147E4() {
        return OrderTradeType.Twap;
    }

    /* JADX INFO: renamed from: F5 */
    public final boolean m27423F5(OrderPriceType orderPriceType, OrderEntity orderEntity) {
        if (orderPriceType instanceof OrderPriceType.CustomPriceWithPercent) {
            return !Intrinsics.areEqual(((OrderPriceType.CustomPriceWithPercent) orderPriceType).getPercent(), orderEntity.getTwapDistanceValue());
        }
        return (orderPriceType instanceof OrderPriceType.CustomPriceWithValueDelta) && !Intrinsics.areEqual(((OrderPriceType.CustomPriceWithValueDelta) orderPriceType).getValueDelta(), orderEntity.getTwapDistanceValue());
    }

    @Nullable
    /* JADX INFO: renamed from: I2 */
    public BigDecimal m27424I2(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        InterfaceC38213a interfaceC38213aM27158Q2 = m27158Q2();
        if (interfaceC38213aM27158Q2 == null) {
            return null;
        }
        InterfaceC41049a interfaceC41049aMo27179x4 = mo27179x4();
        OrderEntity orderEntityM27178w4 = m27178w4();
        return interfaceC41049aMo27179x4.mo90015i(interfaceC38213aM27158Q2, m27438v2(C27041f.m66668h(orderEntityM27178w4 != null ? orderEntityM27178w4.getSide() : null)), m27437s1(side), null);
    }

    @NotNull
    /* JADX INFO: renamed from: J1 */
    public com.kubi.futures.trade.submit.validate.factory.f.a m27425J1() {
        return new com.kubi.futures.trade.submit.validate.factory.j();
    }

    /* JADX INFO: renamed from: J5 */
    public final void m27427J5(boolean z11) {
        AppCompatImageView appCompatImageView;
        TwapAdvanceSettingView twapAdvanceSettingView;
        AppCompatImageView appCompatImageView2;
        TwapAdvanceSettingView twapAdvanceSettingView2;
        if (z11) {
            C36800m0 c36800m0M27433h5 = m27433h5();
            if (c36800m0M27433h5 != null && (twapAdvanceSettingView2 = c36800m0M27433h5.f80532w) != null) {
                C27046k.m66685H(twapAdvanceSettingView2);
            }
            C36800m0 c36800m0M27433h6 = m27433h5();
            if (c36800m0M27433h6 == null || (appCompatImageView2 = c36800m0M27433h6.f80513d) == null) {
                return;
            }
            appCompatImageView2.setRotation(180.0f);
            return;
        }
        C36800m0 c36800m0M27433h7 = m27433h5();
        if (c36800m0M27433h7 != null && (twapAdvanceSettingView = c36800m0M27433h7.f80532w) != null) {
            C27046k.m66700o(twapAdvanceSettingView);
        }
        C36800m0 c36800m0M27433h8 = m27433h5();
        if (c36800m0M27433h8 == null || (appCompatImageView = c36800m0M27433h8.f80513d) == null) {
            return;
        }
        appCompatImageView.setRotation(0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: h5 */
    public final C36800m0 m27433h5() {
        return (C36800m0) this.f24006y0.getValue(this, f24002E0[0]);
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: i5, reason: merged with bridge method [inline-methods] */
    public TwapModifyOrderViewModel mo27181z4() {
        return (TwapModifyOrderViewModel) this.f24003A0.getValue();
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    public void initView() {
        final OrderEntity orderEntityM27178w4;
        final InterfaceC38213a interfaceC38213aM27158Q2;
        FragmentManager supportFragmentManager;
        Long twapIntervalSec;
        final C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 == null || (orderEntityM27178w4 = m27178w4()) == null || (interfaceC38213aM27158Q2 = m27158Q2()) == null) {
            return;
        }
        Context context = c36800m0M27433h5.getRoot().getContext();
        MaxHeightConstraintLayout maxHeightConstraintLayoutM82462b = c36800m0M27433h5.getRoot();
        Intrinsics.checkNotNullExpressionValue(maxHeightConstraintLayoutM82462b, "getRoot(...)");
        m27155M4(maxHeightConstraintLayoutM82462b);
        c36800m0M27433h5.f80529t.setText(interfaceC38213aM27158Q2.mo86233d());
        KcTradeRateView kcTradeRateView = c36800m0M27433h5.f80528s;
        Intrinsics.checkNotNull(context);
        kcTradeRateView.setTextColor(C22890g.m54281f(context, C27025c.m66566d(Boolean.valueOf(Intrinsics.areEqual(orderEntityM27178w4.getSide(), "buy")))));
        c36800m0M27433h5.f80528s.setText(C16700e0.m35734n(orderEntityM27178w4, context));
        c36800m0M27433h5.f80523n.setText(C17054k0.m36530d(orderEntityM27178w4.getLeverage(), false, 1, null));
        c36800m0M27433h5.f80524o.setText(C37568c.m84634e(orderEntityM27178w4) ? getString(R$string.kumex_cross_position) : getString(R$string.kumex_isolate_position));
        m27384H5();
        KcTradeNumAbInputView delegationAmount = c36800m0M27433h5.f80516g;
        Intrinsics.checkNotNullExpressionValue(delegationAmount, "delegationAmount");
        m27436r5(delegationAmount);
        Long twapIntervalSec2 = orderEntityM27178w4.getTwapIntervalSec();
        if (twapIntervalSec2 != null) {
            c36800m0M27433h5.f80532w.setInterval(twapIntervalSec2.longValue());
        }
        BigDecimal twapPriceLimit = orderEntityM27178w4.getTwapPriceLimit();
        if (twapPriceLimit != null) {
            c36800m0M27433h5.f80532w.getPriceLimitEt().setBigDecimal(twapPriceLimit);
        }
        c36800m0M27433h5.f80532w.setInputHeight(C27040e.m66658b(40));
        c36800m0M27433h5.f80532w.getPriceLimitEt().setMaxDecimalPlaces(C38214b.m86254c(interfaceC38213aM27158Q2));
        TwapAdvanceSettingView twapAdvanceSettingView = c36800m0M27433h5.f80532w;
        String twapDistanceType = orderEntityM27178w4.getTwapDistanceType();
        BigDecimal twapDistanceValue = orderEntityM27178w4.getTwapDistanceValue();
        String side = orderEntityM27178w4.getSide();
        twapAdvanceSettingView.m(twapDistanceType, twapDistanceValue, side != null ? side : "buy", interfaceC38213aM27158Q2.mo86239j());
        c36800m0M27433h5.f80531v.setTime(C46849a0.m103196d(C27039d.m66652l(orderEntityM27178w4.getTwapDurationSec())));
        if (orderEntityM27178w4.getTwapDistanceValue() == null && (twapIntervalSec = orderEntityM27178w4.getTwapIntervalSec()) != null && twapIntervalSec.longValue() == 30 && orderEntityM27178w4.getTwapPriceLimit() == null) {
            m27427J5(false);
        } else {
            m27427J5(true);
        }
        ConstraintLayout advanceSettingCl = c36800m0M27433h5.f80512c;
        Intrinsics.checkNotNullExpressionValue(advanceSettingCl, "advanceSettingCl");
        C27046k.m66711z(advanceSettingCl, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.twap.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapModifyOrderDialog.m27417w5(c36800m0M27433h5, this);
            }
        }, 1, null);
        InputPanelTimeInputView totalTimeInputView = c36800m0M27433h5.f80531v;
        Intrinsics.checkNotNullExpressionValue(totalTimeInputView, "totalTimeInputView");
        C44685e.m98845d(totalTimeInputView, new Action() { // from class: com.kubi.futures.trade.order.modify.twap.l
            @Override // io.reactivex.functions.Action
            public final void run() {
                TwapModifyOrderDialog.m27418x5(this.f24022b, orderEntityM27178w4, c36800m0M27433h5, interfaceC38213aM27158Q2);
            }
        });
        c36800m0M27433h5.f80532w.setClickListener(new Function1() { // from class: com.kubi.futures.trade.order.modify.twap.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwapModifyOrderDialog.m27419y5(c36800m0M27433h5, this, orderEntityM27178w4, (View) obj);
            }
        });
        AppCompatImageView close = c36800m0M27433h5.f80514e;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.twap.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapModifyOrderDialog.m27382D5(this.f24029b);
            }
        }, 1, null);
        KcPrimaryButton confirm = c36800m0M27433h5.f80515f;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.trade.order.modify.twap.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapModifyOrderDialog.m27413s5(c36800m0M27433h5, this);
            }
        }, 1, null);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResultListener("modify_twap_total_time_setting", getViewLifecycleOwner(), new FragmentResultListener() { // from class: com.kubi.futures.trade.order.modify.twap.p
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                TwapModifyOrderDialog.m27414t5(c36800m0M27433h5, str, bundle);
            }
        });
        supportFragmentManager.setFragmentResultListener("modify_twap_interval_setting", getViewLifecycleOwner(), new FragmentResultListener() { // from class: com.kubi.futures.trade.order.modify.twap.q
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                TwapModifyOrderDialog.m27415u5(c36800m0M27433h5, str, bundle);
            }
        });
        supportFragmentManager.setFragmentResultListener("modify_twap_order_type_setting", getViewLifecycleOwner(), new FragmentResultListener() { // from class: com.kubi.futures.trade.order.modify.twap.r
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                TwapModifyOrderDialog.m27416v5(c36800m0M27433h5, orderEntityM27178w4, str, bundle);
            }
        });
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog, com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (!this.f24004B0) {
            C12572a.m23695d("modify_twap_order_flutter_callback", new FlutterModifyTwapEvent(null), 0L, 4, null);
        }
        super.onDestroyView();
    }

    @Nullable
    /* JADX INFO: renamed from: s1 */
    public BigDecimal m27437s1(@NotNull String side) {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        Intrinsics.checkNotNullParameter(side, "side");
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 == null || (kcTradeNumAbInputView = c36800m0M27433h5.f80516g) == null) {
            return null;
        }
        return kcTradeNumAbInputView.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: v2 */
    public BigDecimal m27438v2(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        BigDecimal bigDecimalM27144D2 = m27144D2();
        if (C41014a.m89917B(bigDecimalM27144D2)) {
            return Intrinsics.areEqual(side, "buy") ? m27150H0() : m27160U0();
        }
        return bigDecimalM27144D2;
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    /* JADX INFO: renamed from: v4 */
    public int mo27176v4() {
        return R$layout.bkumex_dialog_modify_order_twap;
    }

    @Override // com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: x4 */
    public InterfaceC41049a mo27179x4() {
        return (InterfaceC41049a) this.f24005C0.getValue();
    }

    public TwapModifyOrderDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewModels$default$2
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
        this.f24003A0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TwapModifyOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.order.modify.twap.TwapModifyOrderDialog$special$$inlined$viewModels$default$5
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
        this.f24005C0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.order.modify.twap.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapModifyOrderDialog.m27383G5(this.f24009b);
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public static final void m27380B5(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: C5 */
    public static final void m27381C5(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: D5 */
    public static final Unit m27382D5(TwapModifyOrderDialog twapModifyOrderDialog) {
        C43852m.m96591c(C17060n0.m36552b(), twapModifyOrderDialog.f24007z0, "2", null, 8, null);
        twapModifyOrderDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G5 */
    public static final InterfaceC41049a m27383G5(TwapModifyOrderDialog twapModifyOrderDialog) {
        InterfaceC41049a interfaceC41049aMo27179x4 = super.mo27179x4();
        if (!(interfaceC41049aMo27179x4 instanceof C42230e) && !(interfaceC41049aMo27179x4 instanceof C42226a)) {
            return interfaceC41049aMo27179x4;
        }
        return new C42227b();
    }

    /* JADX INFO: renamed from: H5 */
    private final void m27384H5() {
        MaxHeightConstraintLayout maxHeightConstraintLayoutM82462b;
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 != null && (maxHeightConstraintLayoutM82462b = c36800m0M27433h5.getRoot()) != null) {
            maxHeightConstraintLayoutM82462b.post(new Runnable() { // from class: com.kubi.futures.trade.order.modify.twap.e
                @Override // java.lang.Runnable
                public final void run() {
                    TwapModifyOrderDialog.m27385I5(this.f24016b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I5 */
    public static final void m27385I5(TwapModifyOrderDialog twapModifyOrderDialog) {
        C36800m0 c36800m0M27433h5 = twapModifyOrderDialog.m27433h5();
        if (c36800m0M27433h5 == null) {
            return;
        }
        c36800m0M27433h5.f80520k.setMaxHeightPx(c36800m0M27433h5.getRoot().getF25003n() - (c36800m0M27433h5.getRoot().getHeight() - c36800m0M27433h5.f80520k.getHeight()));
    }

    /* JADX INFO: renamed from: k5 */
    private final void m27406k5() {
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            if (orderEntityM27178w4.isTrialFunds()) {
                BaseDialogFragment baseDialogFragmentM33668K = C15943u.m33668K(R$string.kumex_welfare_trade_funds_balance_alert, null, 2, null);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogFragmentM33668K.show(childFragmentManager, "trial_balance_notice_dialog");
                return;
            }
            BaseDialogFragment baseDialogFragmentM33676S = C15943u.m33676S(new Function0() { // from class: com.kubi.futures.trade.order.modify.twap.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TwapModifyOrderDialog.m27407l5(this.f24019b);
                }
            });
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            baseDialogFragmentM33676S.show(childFragmentManager2, "transfer_dialog");
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m27407l5(TwapModifyOrderDialog twapModifyOrderDialog) {
        String strMo86250u;
        InterfaceC38213a interfaceC38213aM27158Q2 = twapModifyOrderDialog.m27158Q2();
        if (interfaceC38213aM27158Q2 != null) {
            strMo86250u = interfaceC38213aM27158Q2.mo86250u();
        } else {
            strMo86250u = null;
        }
        w.a(C27041f.m66668h(C27041f.m66677q(strMo86250u)), "TransferButton");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    private final void m27408m5() {
        OrderEntity orderEntityM27178w4;
        String marginMode;
        Context context = getContext();
        if (context != null && (orderEntityM27178w4 = m27178w4()) != null && (marginMode = orderEntityM27178w4.getMarginMode()) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C13396j3.m26331c(context, marginMode, childFragmentManager);
        }
    }

    /* JADX INFO: renamed from: x5 */
    public static final void m27418x5(TwapModifyOrderDialog twapModifyOrderDialog, OrderEntity orderEntity, C36800m0 c36800m0, InterfaceC38213a interfaceC38213a) {
        Long l11;
        BigDecimal bigDecimalOrNull;
        Long lValueOf;
        BigDecimal bigDecimalM27438v2 = twapModifyOrderDialog.m27438v2(C27041f.m66668h(orderEntity.getSide()));
        if (bigDecimalM27438v2 == null) {
            return;
        }
        String inputNumberStr = c36800m0.f80516g.getInputNumberStr();
        if (inputNumberStr != null) {
            bigDecimalOrNull = StringsKt.toBigDecimalOrNull(inputNumberStr);
            l11 = null;
        } else {
            l11 = null;
            bigDecimalOrNull = null;
        }
        TwapModifyOrderViewModel twapModifyOrderViewModelMo27181z4 = twapModifyOrderDialog.mo27181z4();
        InterfaceC41049a interfaceC41049aMo27179x4 = twapModifyOrderDialog.mo27179x4();
        TimeBreakdown time = c36800m0.f80531v.getTime();
        if (time != null) {
            lValueOf = Long.valueOf(time.toSeconds());
        } else {
            lValueOf = l11;
        }
        twapModifyOrderViewModelMo27181z4.m27439l0(interfaceC38213a, interfaceC41049aMo27179x4, lValueOf, bigDecimalOrNull, bigDecimalM27438v2, c36800m0.f80532w.getInterval(), null);
    }

    @Nullable
    /* JADX INFO: renamed from: C1 */
    public Long m27421C1() {
        TwapAdvanceSettingView twapAdvanceSettingView;
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 != null && (twapAdvanceSettingView = c36800m0M27433h5.f80532w) != null) {
            return Long.valueOf(twapAdvanceSettingView.getInterval());
        }
        return null;
    }

    /* JADX INFO: renamed from: E5 */
    public boolean m27422E5() {
        BigDecimal bigDecimalAbs;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null) {
            return false;
        }
        Long lM27428L0 = m27428L0();
        Long lM27421C1 = m27421C1();
        BigDecimal bigDecimalM27429O1 = m27429O1();
        OrderPriceType orderPriceTypeM27426J2 = m27426J2();
        BigDecimal bigDecimalM27424I2 = m27424I2(C27041f.m66669i(orderEntityM27178w4.getSide(), "buy"));
        if (Intrinsics.areEqual(lM27428L0, orderEntityM27178w4.getTwapDurationSec())) {
            BigDecimal size = orderEntityM27178w4.getSize();
            String type = null;
            if (size != null) {
                bigDecimalAbs = size.abs();
            } else {
                bigDecimalAbs = null;
            }
            if (C17054k0.m36528b(bigDecimalM27424I2, bigDecimalAbs) && Intrinsics.areEqual(lM27421C1, orderEntityM27178w4.getTwapIntervalSec()) && C17054k0.m36528b(bigDecimalM27429O1, orderEntityM27178w4.getTwapPriceLimit())) {
                if (orderPriceTypeM27426J2 != null) {
                    type = orderPriceTypeM27426J2.getType();
                }
                if (Intrinsics.areEqual(C27041f.m66668h(type), C27041f.m66668h(orderEntityM27178w4.getTwapDistanceType())) && !m27423F5(orderPriceTypeM27426J2, orderEntityM27178w4)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: J2 */
    public OrderPriceType m27426J2() {
        TwapAdvanceSettingView twapAdvanceSettingView;
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 != null && (twapAdvanceSettingView = c36800m0M27433h5.f80532w) != null) {
            return twapAdvanceSettingView.getOrderPriceType();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: L0 */
    public Long m27428L0() {
        InputPanelTimeInputView inputPanelTimeInputView;
        TimeBreakdown time;
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 != null && (inputPanelTimeInputView = c36800m0M27433h5.f80531v) != null && (time = inputPanelTimeInputView.getTime()) != null) {
            return Long.valueOf(time.toSeconds());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: O1 */
    public BigDecimal m27429O1() {
        TwapAdvanceSettingView twapAdvanceSettingView;
        FinancialInputEditText priceLimitEt;
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 != null && (twapAdvanceSettingView = c36800m0M27433h5.f80532w) != null && (priceLimitEt = twapAdvanceSettingView.getPriceLimitEt()) != null) {
            return priceLimitEt.getBigDecimalValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m27431a2() {
        return getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m27432g1() {
        Boolean fromReduce;
        Boolean closeOrder;
        OrderEntity orderEntityM27178w4 = m27178w4();
        Boolean closeOnly = null;
        if (orderEntityM27178w4 != null) {
            fromReduce = orderEntityM27178w4.getFromReduce();
        } else {
            fromReduce = null;
        }
        if (!C27025c.m66566d(fromReduce)) {
            OrderEntity orderEntityM27178w5 = m27178w4();
            if (orderEntityM27178w5 != null) {
                closeOrder = orderEntityM27178w5.getCloseOrder();
            } else {
                closeOrder = null;
            }
            if (!C27025c.m66566d(closeOrder)) {
                OrderEntity orderEntityM27178w6 = m27178w4();
                if (orderEntityM27178w6 != null) {
                    closeOnly = orderEntityM27178w6.getCloseOnly();
                }
                if (!C27025c.m66566d(closeOnly)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public void m27435o1() {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        C36800m0 c36800m0M27433h5 = m27433h5();
        if (c36800m0M27433h5 != null && (kcTradeNumAbInputView = c36800m0M27433h5.f80516g) != null) {
            kcTradeNumAbInputView.mo54630g(false);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final void m27436r5(KcTradeNumAbInputView kcTradeNumAbInputView) {
        InterfaceC38213a interfaceC38213aM27158Q2;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null || (interfaceC38213aM27158Q2 = m27158Q2()) == null) {
            return;
        }
        kcTradeNumAbInputView.setHint(getString(R$string.qty_stub, C6447a.m11724a(mo27179x4().mo90013g(interfaceC38213aM27158Q2)).toPlainString()));
        kcTradeNumAbInputView.setSupportFloatInputFilter(true);
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView, mo27179x4().mo90016j(interfaceC38213aM27158Q2, orderEntityM27178w4.getPrice(), null), mo27179x4().mo90017k(interfaceC38213aM27158Q2), false, 4, null);
        kcTradeNumAbInputView.setEnsureIncrement(mo27179x4().mo90013g(interfaceC38213aM27158Q2));
        InterfaceC41049a interfaceC41049aMo27179x4 = mo27179x4();
        BigDecimal bigDecimalM27438v2 = m27438v2(C27041f.m66668h(orderEntityM27178w4.getSide()));
        BigDecimal bigDecimalAbs = C27039d.m66656p(orderEntityM27178w4.getSize()).abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(interfaceC41049aMo27179x4.mo90009c(interfaceC38213aM27158Q2, bigDecimalM27438v2, bigDecimalAbs, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        ITradeInputLayoutOperations.m55171a(kcTradeNumAbInputView, bigDecimalM11724a, false, 2, null);
    }
}
