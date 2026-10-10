package com.kubi.payment.fasttradev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.chat.service.ChatClient;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.data.entities.FiatCouponInfo;
import com.kubi.payment.fasttradev2.buy.BuyFragment;
import com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog;
import com.kubi.payment.fasttradev2.sell.SellFragment;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import f00.C37304a;
import g00.InterfaceC37758j;
import java.util.List;
import java.util.Map;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p270ft.C37662o0;
import p477nt.C42876i;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
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
import tt.C45070a;
import tt.C45071b;
import w00.C45678b;

/* JADX INFO: compiled from: FastTradeActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u0012H\u0016J\b\u0010'\u001a\u00020\u001cH\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentActivityFastTradeBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentActivityFastTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "fiatCurrency", "", "cryptoCurrency", "tradeSide", "viewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "buyFragment", "Lcom/kubi/payment/fasttradev2/buy/BuyFragment;", "sellFragment", "Lcom/kubi/payment/fasttradev2/sell/SellFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initViewModel", "initViews", "observeData", "refreshTab", "onTabChanged", "showFragment", "updateDataFromIntent", "url", "onDestroy", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeActivity.kt\ncom/kubi/payment/fasttradev2/FastTradeActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,308:1\n45#2,19:309\n1869#3,2:328\n44#4,2:330\n*S KotlinDebug\n*F\n+ 1 FastTradeActivity.kt\ncom/kubi/payment/fasttradev2/FastTradeActivity\n*L\n56#1:309,19\n101#1:328,2\n283#1:330,2\n*E\n"})
public final class FastTradeActivity extends BaseActivity implements KCMiniAppBaseProtocol {

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f38971k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f38972l;

    /* JADX INFO: renamed from: n */
    public FastTradeViewModel f38974n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public BuyFragment f38975o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public SellFragment f38976p;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ KProperty<Object>[] f38968r = {Reflection.property1(new PropertyReference1Impl(FastTradeActivity.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentActivityFastTradeBinding;", 0))};

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f38967q = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f38969i = C45678b.m100788b(this, new Function1<C37662o0, Unit>() { // from class: com.kubi.payment.fasttradev2.FastTradeActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C37662o0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37662o0 c37662o0) {
            invoke(c37662o0);
            return Unit.INSTANCE;
        }
    }, new Function1<FastTradeActivity, C37662o0>() { // from class: com.kubi.payment.fasttradev2.FastTradeActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37662o0 invoke(@NotNull FastTradeActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C37662o0.m84908a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f38970j = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FastTradeActivity.m47185n0(this.f39376b);
        }
    });

    /* JADX INFO: renamed from: m */
    @NotNull
    public String f38973m = "BUY";

    /* JADX INFO: compiled from: FastTradeActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/FastTradeActivity$Companion;", "", "<init>", "()V", "BUY_FRAGMENT_KEY", "", "SELL_FRAGMENT_KEY", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeActivity$a */
    /* JADX INFO: compiled from: FastTradeActivity.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20682a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38977b;

        public C20682a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38977b = function;
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
            return this.f38977b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38977b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final InterfaceC40863a getLoadingView() {
        Object value = this.f38970j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC40863a) value;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m47181j0(FastTradeActivity fastTradeActivity) {
        Map<String, String> mapM48038c4 = null;
        C4400a c4400aM4038a = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/coupon/list", false, 2, null)).m4038a("side", fastTradeActivity.f38973m);
        if (Intrinsics.areEqual(fastTradeActivity.f38973m, "BUY")) {
            BuyFragment buyFragment = fastTradeActivity.f38975o;
            if (buyFragment != null) {
                mapM48038c4 = buyFragment.m47413g4();
            }
        } else {
            SellFragment sellFragment = fastTradeActivity.f38976p;
            if (sellFragment != null) {
                mapM48038c4 = sellFragment.m48038c4();
            }
        }
        c4400aM4038a.m4039b(mapM48038c4).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m47182k0(FastTradeActivity fastTradeActivity) {
        InterfaceC37758j.a.m85165n(C37304a.f82764a, 0L, null, C43852m.m96602n("B7FastTrade", "orderButton", null, 4, null), null, null, 26, null);
        C43852m.m96590b(C27041f.m66668h(fastTradeActivity.getF16845V()), "clickHistory", "1", TuplesKt.m90091to("businessType", "FastTrade"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m47183l0(FastTradeActivity fastTradeActivity) {
        if (Intrinsics.areEqual(fastTradeActivity.f38973m, "BUY")) {
            return Unit.INSTANCE;
        }
        fastTradeActivity.f38973m = "BUY";
        fastTradeActivity.m47192u0();
        C43852m.m96591c(C27041f.m66668h(fastTradeActivity.getF16845V()), "buyAndSell", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m47184m0(FastTradeActivity fastTradeActivity) {
        if (Intrinsics.areEqual(fastTradeActivity.f38973m, "SELL")) {
            return Unit.INSTANCE;
        }
        fastTradeActivity.f38973m = "SELL";
        fastTradeActivity.m47192u0();
        C43852m.m96591c(C27041f.m66668h(fastTradeActivity.getF16845V()), "buyAndSell", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    private final void m47186o0() {
        FastTradeViewModel fastTradeViewModel = this.f38974n;
        FastTradeViewModel fastTradeViewModel2 = null;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47278B0().observe(this, new C42876i(new Function1() { // from class: com.kubi.payment.fasttradev2.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeActivity.m47188q0(this.f39378b, ((Boolean) obj).booleanValue());
            }
        }));
        FastTradeViewModel fastTradeViewModel3 = this.f38974n;
        if (fastTradeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fastTradeViewModel3 = null;
        }
        fastTradeViewModel3.m45656o().observe(this, new C20682a(new Function1() { // from class: com.kubi.payment.fasttradev2.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeActivity.m47190s0((Throwable) obj);
            }
        }));
        FastTradeViewModel fastTradeViewModel4 = this.f38974n;
        if (fastTradeViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fastTradeViewModel2 = fastTradeViewModel4;
        }
        fastTradeViewModel2.m47314o0().observe(this, new C20682a(new Function1() { // from class: com.kubi.payment.fasttradev2.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastTradeActivity.m47187p0(this.f39383b, (FiatCouponInfo.Response) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m47188q0(final FastTradeActivity fastTradeActivity, boolean z11) {
        FastTradeViewModel fastTradeViewModel = null;
        if (z11) {
            fastTradeActivity.getLoadingView().showContent();
            fastTradeActivity.m47192u0();
            C43841b.m96557d("B7fast_trade_load", "page_load_end", null, 4, null);
            C43841b.m96557d("event_click_home_grid_fast_trade", "page_load_end", null, 4, null);
            FastTradeViewModel fastTradeViewModel2 = fastTradeActivity.f38974n;
            if (fastTradeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                fastTradeViewModel = fastTradeViewModel2;
            }
            fastTradeViewModel.m47284I0();
        } else {
            fastTradeActivity.getLoadingView().showEmpty(fastTradeActivity.getString(R$string.load_failed_click_retry), R$drawable.ic2_common_system_busy, new View.OnClickListener() { // from class: com.kubi.payment.fasttradev2.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FastTradeActivity.m47189r0(this.f39323b, view);
                }
            });
            C43841b.m96555b("B7fast_trade_load", null, 2, null);
            C43841b.m96555b("event_click_home_grid_fast_trade", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m47189r0(FastTradeActivity fastTradeActivity, View view) {
        FastTradeViewModel fastTradeViewModel = fastTradeActivity.f38974n;
        if (fastTradeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fastTradeViewModel = null;
        }
        fastTradeViewModel.m47290Q0();
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m47191t0() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20392g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m47194w0() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        String str = this.f38973m;
        if (Intrinsics.areEqual(str, "BUY")) {
            C37662o0 c37662o0M47196f0 = m47196f0();
            if (c37662o0M47196f0 != null && (textView8 = c37662o0M47196f0.f84353h) != null) {
                textView8.setBackgroundResource(R$drawable.payment_shape_c_button_normal_99r);
            }
            C37662o0 c37662o0M47196f1 = m47196f0();
            if (c37662o0M47196f1 != null && (textView7 = c37662o0M47196f1.f84353h) != null) {
                textView7.setTextColor(ContextCompat.getColor(this, R$color.c_textEmphasis));
            }
            C37662o0 c37662o0M47196f2 = m47196f0();
            if (c37662o0M47196f2 != null && (textView6 = c37662o0M47196f2.f84354i) != null) {
                textView6.setBackground(null);
            }
            C37662o0 c37662o0M47196f3 = m47196f0();
            if (c37662o0M47196f3 == null || (textView5 = c37662o0M47196f3.f84354i) == null) {
                return;
            }
            textView5.setTextColor(ContextCompat.getColor(this, R$color.c_text));
            return;
        }
        if (Intrinsics.areEqual(str, "SELL")) {
            C37662o0 c37662o0M47196f4 = m47196f0();
            if (c37662o0M47196f4 != null && (textView4 = c37662o0M47196f4.f84353h) != null) {
                textView4.setBackground(null);
            }
            C37662o0 c37662o0M47196f5 = m47196f0();
            if (c37662o0M47196f5 != null && (textView3 = c37662o0M47196f5.f84353h) != null) {
                textView3.setTextColor(ContextCompat.getColor(this, R$color.c_text));
            }
            C37662o0 c37662o0M47196f6 = m47196f0();
            if (c37662o0M47196f6 != null && (textView2 = c37662o0M47196f6.f84354i) != null) {
                textView2.setBackgroundResource(R$drawable.payment_shape_c_button_normal_99r);
            }
            C37662o0 c37662o0M47196f7 = m47196f0();
            if (c37662o0M47196f7 == null || (textView = c37662o0M47196f7.f84354i) == null) {
                return;
            }
            textView.setTextColor(ContextCompat.getColor(this, R$color.c_textEmphasis));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final C37662o0 m47196f0() {
        return (C37662o0) this.f38969i.getValue(this, f38968r[0]);
    }

    @Override // com.kubi.sdk.applet.KCBaseProtocol
    @NotNull
    public String url() {
        return "otc?type=2";
    }

    public FastTradeActivity() {
        setPageId("B7FastTrade");
    }

    /* JADX INFO: renamed from: h0 */
    private final void m47179h0() {
        C37662o0 c37662o0M47196f0 = m47196f0();
        if (c37662o0M47196f0 == null) {
            return;
        }
        getLoadingView().showLoading();
        ImageView ivBack = c37662o0M47196f0.f84348c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        C27046k.m66711z(ivBack, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47180i0(this.f39369b);
            }
        }, 1, null);
        AppCompatImageView ivCoupons = c37662o0M47196f0.f84349d;
        Intrinsics.checkNotNullExpressionValue(ivCoupons, "ivCoupons");
        C27046k.m66711z(ivCoupons, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47181j0(this.f39371b);
            }
        }, 1, null);
        ImageView ivHistory = c37662o0M47196f0.f84350e;
        Intrinsics.checkNotNullExpressionValue(ivHistory, "ivHistory");
        C27046k.m66711z(ivHistory, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47182k0(this.f39372b);
            }
        }, 1, null);
        TextView tvBuy = c37662o0M47196f0.f84353h;
        Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
        C27046k.m66711z(tvBuy, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47183l0(this.f39373b);
            }
        }, 1, null);
        TextView tvSell = c37662o0M47196f0.f84354i;
        Intrinsics.checkNotNullExpressionValue(tvSell, "tvSell");
        C27046k.m66711z(tvSell, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47184m0(this.f39374b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m47180i0(FastTradeActivity fastTradeActivity) {
        fastTradeActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final WrapperLoadingView m47185n0(FastTradeActivity fastTradeActivity) {
        ConstraintLayout constraintLayout;
        C37662o0 c37662o0M47196f0 = fastTradeActivity.m47196f0();
        if (c37662o0M47196f0 != null) {
            constraintLayout = c37662o0M47196f0.f84351f;
        } else {
            constraintLayout = null;
        }
        return WrapperLoadingView.injectView(constraintLayout);
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m47187p0(FastTradeActivity fastTradeActivity, FiatCouponInfo.Response response) {
        if (Intrinsics.areEqual(response.getNeedShow(), Boolean.TRUE)) {
            new MarketingCouponDisplayDialog().m54194t3(fastTradeActivity, "FastTradeMarketingCouponDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m47190s0(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    private final void m47192u0() {
        m47194w0();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.fasttradev2.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47193v0(this.f39012b);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m47193v0(FastTradeActivity fastTradeActivity) {
        fastTradeActivity.m47195x0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m47195x0() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        String str = this.f38973m;
        if (Intrinsics.areEqual(str, "BUY")) {
            SellFragment sellFragment = this.f38976p;
            if (sellFragment != null && sellFragment.isAdded()) {
                fragmentTransactionBeginTransaction.hide(sellFragment);
                fragmentTransactionBeginTransaction.setMaxLifecycle(sellFragment, Lifecycle.State.STARTED);
            }
            if (this.f38975o == null) {
                this.f38975o = BuyFragment.f39023h0.newInstance();
            }
            BuyFragment buyFragment = this.f38975o;
            if (buyFragment != null) {
                if (!buyFragment.isAdded() && getSupportFragmentManager().findFragmentByTag("BuyFragment") == null) {
                    fragmentTransactionBeginTransaction.add(R$id.fragmentContainer, buyFragment, "BuyFragment");
                } else {
                    fragmentTransactionBeginTransaction.show(buyFragment);
                }
                fragmentTransactionBeginTransaction.setMaxLifecycle(buyFragment, Lifecycle.State.RESUMED);
            }
        } else if (Intrinsics.areEqual(str, "SELL")) {
            BuyFragment buyFragment2 = this.f38975o;
            if (buyFragment2 != null && buyFragment2.isAdded()) {
                fragmentTransactionBeginTransaction.hide(buyFragment2);
                fragmentTransactionBeginTransaction.setMaxLifecycle(buyFragment2, Lifecycle.State.STARTED);
            }
            if (this.f38976p == null) {
                this.f38976p = SellFragment.f39407h0.newInstance();
            }
            SellFragment sellFragment2 = this.f38976p;
            if (sellFragment2 != null) {
                if (!sellFragment2.isAdded() && getSupportFragmentManager().findFragmentByTag("SellFragment") == null) {
                    fragmentTransactionBeginTransaction.add(R$id.fragmentContainer, sellFragment2, "SellFragment");
                } else {
                    fragmentTransactionBeginTransaction.show(sellFragment2);
                }
                fragmentTransactionBeginTransaction.setMaxLifecycle(sellFragment2, Lifecycle.State.RESUMED);
            }
        }
        try {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastTradeActivity", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m47197g0() {
        this.f38974n = (FastTradeViewModel) new ViewModelProvider(this, new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get())).get(FastTradeViewModel.class);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            Intrinsics.checkNotNull(fragment);
            C27032f.m66621l(this, fragment);
        }
        FastTradeViewModel fastTradeViewModel = null;
        C43841b.m96557d("B7fast_trade_load", "page_load_start", null, 4, null);
        setContentView(R$layout.payment_activity_fast_trade);
        getTitleBar().m58934f();
        m47197g0();
        m47179h0();
        m47186o0();
        m47198y0();
        FastTradeViewModel fastTradeViewModel2 = this.f38974n;
        if (fastTradeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fastTradeViewModel = fastTradeViewModel2;
        }
        fastTradeViewModel.m47290Q0();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.fasttradev2.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeActivity.m47191t0();
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m47198y0() {
        String strM56280w;
        String strM56280w2;
        String strM56280w3;
        Intent intent = getIntent();
        FastTradeViewModel fastTradeViewModel = null;
        if (intent != null) {
            strM56280w = RouteExKt.m56280w(intent, "fiatCurrency");
        } else {
            strM56280w = null;
        }
        this.f38971k = strM56280w;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            strM56280w2 = RouteExKt.m56280w(intent2, "cryptoCurrency");
        } else {
            strM56280w2 = null;
        }
        this.f38972l = strM56280w2;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            strM56280w3 = RouteExKt.m56280w(intent3, "side");
        } else {
            strM56280w3 = null;
        }
        this.f38973m = C27041f.m66669i(strM56280w3, "BUY");
        FastTradeViewModel fastTradeViewModel2 = this.f38974n;
        if (fastTradeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fastTradeViewModel = fastTradeViewModel2;
        }
        fastTradeViewModel.m47298W0(this.f38971k, this.f38972l);
    }
}
