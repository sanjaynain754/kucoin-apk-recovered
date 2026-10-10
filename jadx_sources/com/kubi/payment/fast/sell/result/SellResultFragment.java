package com.kubi.payment.fast.sell.result;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.common.OldBaseFastFragment;
import com.kubi.payment.fast.common.result.ResultVM;
import com.kubi.payment.fast.data.entities.BalanceOrder;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37592a0;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SellResultFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0006H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/result/SellResultFragment;", "Lcom/kubi/payment/fast/common/OldBaseFastFragment;", "Lcom/kubi/payment/fast/common/result/ResultVM;", "<init>", "()V", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/otc/databinding/BotcFragmentPayBuyStatusBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentPayBuyStatusBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "viewModelClass", "Lkotlin/reflect/KClass;", "initViews", "", "observeData", "showOrderDetail", "orderDetail", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "trackClick", "locationId", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nSellResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellResultFragment.kt\ncom/kubi/payment/fast/sell/result/SellResultFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,174:1\n147#2,16:175\n*S KotlinDebug\n*F\n+ 1 SellResultFragment.kt\ncom/kubi/payment/fast/sell/result/SellResultFragment\n*L\n35#1:175,16\n*E\n"})
public final class SellResultFragment extends OldBaseFastFragment<ResultVM> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f38702V = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fast.sell.result.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SellResultFragment.m46683K3(this.f38705b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38703W = C45681e.m100799e(this, new Function1<SellResultFragment, C37592a0>() { // from class: com.kubi.payment.fast.sell.result.SellResultFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37592a0 invoke(@NotNull SellResultFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37592a0.m84768a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37592a0, Unit>() { // from class: com.kubi.payment.fast.sell.result.SellResultFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37592a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37592a0 c37592a0) {
            invoke(c37592a0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f38701Y = {Reflection.property1(new PropertyReference1Impl(SellResultFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentPayBuyStatusBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f38700X = new Companion(null);

    /* JADX INFO: compiled from: SellResultFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/result/SellResultFragment$Companion;", "", "<init>", "()V", "startPayStatusSellFragment", "", "context", "Landroid/content/Context;", "orderId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startPayStatusSellFragment(@NotNull Context context, @Nullable String orderId) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56574n0(context, "", SellResultFragment.class.getName(), new C27051h().m66724h("data", C27041f.m66668h(orderId)).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fast.sell.result.SellResultFragment$a */
    /* JADX INFO: compiled from: SellResultFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20538a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38704b;

        public C20538a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38704b = function;
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
            return this.f38704b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38704b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: F3 */
    private final C37592a0 m46678F3() {
        return (C37592a0) this.f38703W.getValue(this, f38701Y[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final Unit m46686N3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m46687O3(BalanceOrder.OrderDetail orderDetail, SellResultFragment sellResultFragment) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(orderDetail.getCryptoCurrency()), 1L, null, null, null, 28, null);
        sellResultFragment.preformBackPressed();
        sellResultFragment.m46691S3("1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final Unit m46688P3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m46689Q3(SellResultFragment sellResultFragment) {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, 2L, null, null, null, null, null, null, 126, null);
        sellResultFragment.preformBackPressed();
        sellResultFragment.m46691S3("2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final Unit m46690R3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    private final void m46691S3(String str) {
        C43852m.m96591c("B7FastSellBalanceResult", "button", str, null, 8, null);
    }

    private final String getOrderId() {
        return (String) this.f38702V.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_pay_buy_status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ResultVM.m46382J((ResultVM) m45631m3(), getOrderId(), false, 2, null);
        ((ResultVM) m45631m3()).m46397K();
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<ResultVM> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(ResultVM.class);
    }

    public SellResultFragment() {
        setPageId("B7FastSellBalanceResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G3 */
    public static final Unit m46679G3(SellResultFragment sellResultFragment, String str) {
        BaseTextView baseTextView;
        C37592a0 c37592a0M46678F3 = sellResultFragment.m46678F3();
        if (c37592a0M46678F3 != null && (baseTextView = c37592a0M46678F3.f83596g) != null) {
            baseTextView.setText(str);
        }
        ResultVM.m46382J((ResultVM) sellResultFragment.m45631m3(), sellResultFragment.getOrderId(), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m46680H3(SellResultFragment sellResultFragment, Integer num) {
        CircularProgressIndicator circularProgressIndicator;
        C37592a0 c37592a0M46678F3 = sellResultFragment.m46678F3();
        if (c37592a0M46678F3 != null && (circularProgressIndicator = c37592a0M46678F3.f83592c) != null) {
            Intrinsics.checkNotNull(num);
            circularProgressIndicator.setProgressCompat(num.intValue(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m46681I3(SellResultFragment sellResultFragment, BalanceOrder.OrderDetail orderDetail) {
        CircularProgressIndicator circularProgressIndicator;
        BaseTextView baseTextView;
        Intrinsics.checkNotNull(orderDetail);
        sellResultFragment.m46684L3(orderDetail);
        C37592a0 c37592a0M46678F3 = sellResultFragment.m46678F3();
        if (c37592a0M46678F3 != null && (baseTextView = c37592a0M46678F3.f83596g) != null) {
            C27046k.m66700o(baseTextView);
        }
        C37592a0 c37592a0M46678F4 = sellResultFragment.m46678F3();
        if (c37592a0M46678F4 != null && (circularProgressIndicator = c37592a0M46678F4.f83592c) != null) {
            circularProgressIndicator.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m46682J3(SellResultFragment sellResultFragment, Boolean bool) {
        CircularProgressIndicator circularProgressIndicator;
        BaseTextView baseTextView;
        sellResultFragment.showNetWorkError();
        C37592a0 c37592a0M46678F3 = sellResultFragment.m46678F3();
        if (c37592a0M46678F3 != null && (baseTextView = c37592a0M46678F3.f83596g) != null) {
            C27046k.m66700o(baseTextView);
        }
        C37592a0 c37592a0M46678F4 = sellResultFragment.m46678F3();
        if (c37592a0M46678F4 != null && (circularProgressIndicator = c37592a0M46678F4.f83592c) != null) {
            circularProgressIndicator.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final String m46683K3(SellResultFragment sellResultFragment) {
        String string;
        Bundle arguments = sellResultFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: L3 */
    private final void m46684L3(final BalanceOrder.OrderDetail orderDetail) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        String string;
        BaseTextView baseTextView6;
        ImageView imageView;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        BaseTextView baseTextView14;
        BaseTextView baseTextView15;
        ImageView imageView2;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        BaseTextView baseTextView18;
        String str;
        BaseTextView baseTextView19;
        BaseTextView baseTextView20;
        BaseTextView baseTextView21;
        BaseTextView baseTextView22;
        BaseTextView baseTextView23;
        BaseTextView baseTextView24;
        BaseTextView baseTextView25;
        ImageView imageView3;
        BaseTextView baseTextView26;
        BaseTextView baseTextView27;
        BaseTextView baseTextView28;
        Integer orderStatus = orderDetail.getOrderStatus();
        if (orderStatus != null && orderStatus.intValue() == 1) {
            C37592a0 c37592a0M46678F3 = m46678F3();
            if (c37592a0M46678F3 != null && (baseTextView28 = c37592a0M46678F3.f83595f) != null) {
                C27046k.m66685H(baseTextView28);
            }
            C37592a0 c37592a0M46678F4 = m46678F3();
            if (c37592a0M46678F4 != null && (baseTextView27 = c37592a0M46678F4.f83593d) != null) {
                C27046k.m66685H(baseTextView27);
            }
            C37592a0 c37592a0M46678F5 = m46678F3();
            if (c37592a0M46678F5 != null && (baseTextView26 = c37592a0M46678F5.f83594e) != null) {
                C27046k.m66685H(baseTextView26);
            }
            C37592a0 c37592a0M46678F6 = m46678F3();
            if (c37592a0M46678F6 != null && (imageView3 = c37592a0M46678F6.f83591b) != null) {
                imageView3.setImageResource(R$mipmap.botc_ic_fiat_withdraw_success);
            }
            C37592a0 c37592a0M46678F7 = m46678F3();
            if (c37592a0M46678F7 != null && (baseTextView25 = c37592a0M46678F7.f83597h) != null) {
                baseTextView25.setText(getString(R$string.pay_fast_sell_you_sold));
            }
            C37592a0 c37592a0M46678F8 = m46678F3();
            if (c37592a0M46678F8 != null && (baseTextView24 = c37592a0M46678F8.f83595f) != null) {
                baseTextView24.setText(C27041f.m66669i(orderDetail.getCryptoAmount(), "--") + ' ' + C27041f.m66668h(orderDetail.getCryptoCurrency()));
            }
            C37592a0 c37592a0M46678F9 = m46678F3();
            if (c37592a0M46678F9 != null && (baseTextView23 = c37592a0M46678F9.f83598i) != null) {
                baseTextView23.setText(getString(R$string.fast_result_success));
            }
            C37592a0 c37592a0M46678F10 = m46678F3();
            if (c37592a0M46678F10 != null && (baseTextView22 = c37592a0M46678F10.f83593d) != null) {
                baseTextView22.setText(getString(R$string.pay_fast_view_detail));
            }
            C37592a0 c37592a0M46678F11 = m46678F3();
            if (c37592a0M46678F11 != null && (baseTextView21 = c37592a0M46678F11.f83594e) != null) {
                baseTextView21.setText(getString(R$string.fast_result_back_home));
            }
            C37592a0 c37592a0M46678F12 = m46678F3();
            if (c37592a0M46678F12 != null && (baseTextView20 = c37592a0M46678F12.f83593d) != null) {
                C27046k.m66711z(baseTextView20, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.result.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellResultFragment.m46687O3(orderDetail, this);
                    }
                }, 1, null);
            }
            C37592a0 c37592a0M46678F13 = m46678F3();
            if (c37592a0M46678F13 != null && (baseTextView19 = c37592a0M46678F13.f83594e) != null) {
                C27046k.m66711z(baseTextView19, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.result.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellResultFragment.m46688P3();
                    }
                }, 1, null);
            }
        } else if (orderStatus != null && orderStatus.intValue() == 2) {
            C37592a0 c37592a0M46678F14 = m46678F3();
            if (c37592a0M46678F14 != null && (baseTextView18 = c37592a0M46678F14.f83595f) != null) {
                C27046k.m66700o(baseTextView18);
            }
            C37592a0 c37592a0M46678F15 = m46678F3();
            if (c37592a0M46678F15 != null && (baseTextView17 = c37592a0M46678F15.f83593d) != null) {
                C27046k.m66685H(baseTextView17);
            }
            C37592a0 c37592a0M46678F16 = m46678F3();
            if (c37592a0M46678F16 != null && (baseTextView16 = c37592a0M46678F16.f83594e) != null) {
                C27046k.m66685H(baseTextView16);
            }
            C37592a0 c37592a0M46678F17 = m46678F3();
            if (c37592a0M46678F17 != null && (imageView2 = c37592a0M46678F17.f83591b) != null) {
                imageView2.setImageResource(R$mipmap.botc_ic_fiat_withdraw_fail);
            }
            C37592a0 c37592a0M46678F18 = m46678F3();
            if (c37592a0M46678F18 != null && (baseTextView15 = c37592a0M46678F18.f83597h) != null) {
                baseTextView15.setText(getString(R$string.fast_result_failure));
            }
            C37592a0 c37592a0M46678F19 = m46678F3();
            if (c37592a0M46678F19 != null && (baseTextView14 = c37592a0M46678F19.f83598i) != null) {
                baseTextView14.setText(C27041f.m66668h(orderDetail.getErrorMessage()));
            }
            C37592a0 c37592a0M46678F20 = m46678F3();
            if (c37592a0M46678F20 != null && (baseTextView13 = c37592a0M46678F20.f83593d) != null) {
                baseTextView13.setText(getString(R$string.fast_result_buy_again));
            }
            C37592a0 c37592a0M46678F21 = m46678F3();
            if (c37592a0M46678F21 != null && (baseTextView12 = c37592a0M46678F21.f83594e) != null) {
                baseTextView12.setText(getString(R$string.fast_result_back_home));
            }
            C37592a0 c37592a0M46678F22 = m46678F3();
            if (c37592a0M46678F22 != null && (baseTextView11 = c37592a0M46678F22.f83593d) != null) {
                C27046k.m66711z(baseTextView11, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.result.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellResultFragment.m46689Q3(this.f38712b);
                    }
                }, 1, null);
            }
            C37592a0 c37592a0M46678F23 = m46678F3();
            if (c37592a0M46678F23 != null && (baseTextView10 = c37592a0M46678F23.f83594e) != null) {
                C27046k.m66711z(baseTextView10, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.result.j
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellResultFragment.m46690R3();
                    }
                }, 1, null);
            }
        } else {
            C37592a0 c37592a0M46678F24 = m46678F3();
            if (c37592a0M46678F24 != null && (baseTextView9 = c37592a0M46678F24.f83595f) != null) {
                C27046k.m66700o(baseTextView9);
            }
            C37592a0 c37592a0M46678F25 = m46678F3();
            if (c37592a0M46678F25 != null && (baseTextView8 = c37592a0M46678F25.f83593d) != null) {
                C27046k.m66685H(baseTextView8);
            }
            C37592a0 c37592a0M46678F26 = m46678F3();
            if (c37592a0M46678F26 != null && (baseTextView7 = c37592a0M46678F26.f83594e) != null) {
                C27046k.m66685H(baseTextView7);
            }
            C37592a0 c37592a0M46678F27 = m46678F3();
            if (c37592a0M46678F27 != null && (imageView = c37592a0M46678F27.f83591b) != null) {
                imageView.setImageResource(R$mipmap.botc_ic_fiat_withdraw_process);
            }
            C37592a0 c37592a0M46678F28 = m46678F3();
            if (c37592a0M46678F28 != null && (baseTextView6 = c37592a0M46678F28.f83597h) != null) {
                baseTextView6.setText(getString(R$string.fast_result_pending));
            }
            C37592a0 c37592a0M46678F29 = m46678F3();
            if (c37592a0M46678F29 != null && (baseTextView5 = c37592a0M46678F29.f83598i) != null) {
                Integer orderStatus2 = orderDetail.getOrderStatus();
                if (orderStatus2 != null && orderStatus2.intValue() == 3) {
                    string = C27041f.m66668h(orderDetail.getErrorMessage());
                } else {
                    string = getString(R$string.fast_order_refresh_tip);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                baseTextView5.setText(string);
            }
            C37592a0 c37592a0M46678F30 = m46678F3();
            if (c37592a0M46678F30 != null && (baseTextView4 = c37592a0M46678F30.f83593d) != null) {
                baseTextView4.setText(getString(R$string.fast_result_refresh));
            }
            C37592a0 c37592a0M46678F31 = m46678F3();
            if (c37592a0M46678F31 != null && (baseTextView3 = c37592a0M46678F31.f83594e) != null) {
                baseTextView3.setText(getString(R$string.fast_result_back_home));
            }
            C37592a0 c37592a0M46678F32 = m46678F3();
            if (c37592a0M46678F32 != null && (baseTextView2 = c37592a0M46678F32.f83593d) != null) {
                C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.result.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellResultFragment.m46685M3(this.f38713b);
                    }
                }, 1, null);
            }
            C37592a0 c37592a0M46678F33 = m46678F3();
            if (c37592a0M46678F33 != null && (baseTextView = c37592a0M46678F33.f83594e) != null) {
                C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.result.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellResultFragment.m46686N3();
                    }
                }, 1, null);
            }
        }
        Integer orderStatus3 = orderDetail.getOrderStatus();
        if (orderStatus3 != null && orderStatus3.intValue() == 1) {
            str = "1";
        } else if (orderStatus3 != null && orderStatus3.intValue() == 2) {
            str = "2";
        } else {
            str = "3";
        }
        C43852m.m96595g("B7FastSellBalanceResult", "orderStatus", str, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public static final Unit m46685M3(SellResultFragment sellResultFragment) {
        ((ResultVM) sellResultFragment.m45631m3()).m46396I(sellResultFragment.getOrderId(), true);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((ResultVM) m45631m3()).m46392E().observe(getViewLifecycleOwner(), new C20538a(new Function1() { // from class: com.kubi.payment.fast.sell.result.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellResultFragment.m46679G3(this.f38706b, (String) obj);
            }
        }));
        ((ResultVM) m45631m3()).m46394G().observe(getViewLifecycleOwner(), new C20538a(new Function1() { // from class: com.kubi.payment.fast.sell.result.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellResultFragment.m46680H3(this.f38707b, (Integer) obj);
            }
        }));
        ((ResultVM) m45631m3()).m46393F().observe(getViewLifecycleOwner(), new C20538a(new Function1() { // from class: com.kubi.payment.fast.sell.result.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellResultFragment.m46681I3(this.f38708b, (BalanceOrder.OrderDetail) obj);
            }
        }));
        ((ResultVM) m45631m3()).m46395H().observe(getViewLifecycleOwner(), new C20538a(new Function1() { // from class: com.kubi.payment.fast.sell.result.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellResultFragment.m46682J3(this.f38709b, (Boolean) obj);
            }
        }));
    }
}
