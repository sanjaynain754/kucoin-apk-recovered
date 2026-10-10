package com.kubi.payment.fasttrade;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fasttrade.buy.FastBuyFragment;
import com.kubi.payment.fasttrade.sell.FastSellFragment;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37668p1;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: FastTradeFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeFragment;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "Lcom/kubi/payment/fasttrade/FastTradeVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastTradeBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "", "cryptoCurrency", "buyFragment", "Lcom/kubi/payment/fasttrade/buy/FastBuyFragment;", "sellFragment", "Lcom/kubi/payment/fasttrade/sell/FastSellFragment;", "tradeSide", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "refreshTab", "onTabChanged", "showFragment", "observeData", "onResume", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nFastTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeFragment.kt\ncom/kubi/payment/fasttrade/FastTradeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,233:1\n147#2,16:234\n*S KotlinDebug\n*F\n+ 1 FastTradeFragment.kt\ncom/kubi/payment/fasttrade/FastTradeFragment\n*L\n37#1:234,16\n*E\n"})
public final class FastTradeFragment extends BaseFastFragment<FastTradeVM> {

    /* JADX INFO: renamed from: Z */
    public FastBuyFragment f38719Z;

    /* JADX INFO: renamed from: a0 */
    public FastSellFragment f38720a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f38715d0 = {Reflection.property1(new PropertyReference1Impl(FastTradeFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastTradeBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f38714c0 = new Companion(null);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38716W = C45681e.m100799e(this, new Function1<FastTradeFragment, C37668p1>() { // from class: com.kubi.payment.fasttrade.FastTradeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37668p1 invoke(@NotNull FastTradeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37668p1.m84921a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37668p1, Unit>() { // from class: com.kubi.payment.fasttrade.FastTradeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37668p1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37668p1 c37668p1) {
            invoke(c37668p1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f38717X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f38718Y = "";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f38721b0 = "BUY";

    /* JADX INFO: compiled from: FastTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/fasttrade/FastTradeFragment;", "fiatCurrency", "", "cryptoCurrency", "tradeSide", "preSpmId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ FastTradeFragment newInstance$default(Companion companion, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                str3 = "BUY";
            }
            if ((i11 & 8) != 0) {
                str4 = null;
            }
            return companion.newInstance(str, str2, str3, str4);
        }

        @NotNull
        public final FastTradeFragment newInstance(@NotNull String fiatCurrency, @NotNull String cryptoCurrency, @NotNull String tradeSide, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            FastTradeFragment fastTradeFragment = new FastTradeFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_fiat_currency", fiatCurrency);
            bundle.putString("key_crypto_currency", cryptoCurrency);
            bundle.putString("key_trade_side", tradeSide);
            bundle.putString("spm", preSpmId);
            fastTradeFragment.setArguments(bundle);
            return fastTradeFragment;
        }
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m46703H3(FastTradeFragment fastTradeFragment) {
        if (Intrinsics.areEqual(fastTradeFragment.f38721b0, "BUY")) {
            return Unit.INSTANCE;
        }
        fastTradeFragment.f38721b0 = "BUY";
        fastTradeFragment.m46708M3();
        C43852m.m96591c("B7FastTrade", "buyAndSell", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m46704I3(FastTradeFragment fastTradeFragment) {
        if (Intrinsics.areEqual(fastTradeFragment.f38721b0, "SELL")) {
            return Unit.INSTANCE;
        }
        fastTradeFragment.f38721b0 = "SELL";
        fastTradeFragment.m46708M3();
        C43852m.m96591c("B7FastTrade", "buyAndSell", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    private final void m46709N3() {
        TextView textView;
        AppCompatTextView appCompatTextView;
        TextView textView2;
        AppCompatTextView appCompatTextView2;
        String str = this.f38721b0;
        if (Intrinsics.areEqual(str, "BUY")) {
            C37668p1 c37668p1M46711G3 = m46711G3();
            if (c37668p1M46711G3 != null && (appCompatTextView2 = c37668p1M46711G3.f84393c) != null) {
                appCompatTextView2.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text));
            }
            C37668p1 c37668p1M46711G4 = m46711G3();
            if (c37668p1M46711G4 == null || (textView2 = c37668p1M46711G4.f84394d) == null) {
                return;
            }
            textView2.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text40));
            return;
        }
        if (Intrinsics.areEqual(str, "SELL")) {
            C37668p1 c37668p1M46711G5 = m46711G3();
            if (c37668p1M46711G5 != null && (appCompatTextView = c37668p1M46711G5.f84393c) != null) {
                appCompatTextView.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text40));
            }
            C37668p1 c37668p1M46711G6 = m46711G3();
            if (c37668p1M46711G6 == null || (textView = c37668p1M46711G6.f84394d) == null) {
                return;
            }
            textView.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text));
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final C37668p1 m46711G3() {
        return (C37668p1) this.f38716W.getValue(this, f38715d0[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((FastTradeVM) m45647o3()).m46721C();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_trade;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<FastTradeVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(FastTradeVM.class);
    }

    public FastTradeFragment() {
        setPageId("B7FastTrade");
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m46705J3(FastTradeFragment fastTradeFragment, String str) {
        Intrinsics.checkNotNull(str);
        fastTradeFragment.f38717X = str;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m46706K3(final FastTradeFragment fastTradeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            C43841b.m96557d("B7fast_trade_load", "page_load_end", null, 4, null);
            C43841b.m96557d("event_click_home_grid_fast_trade", "page_load_end", null, 4, null);
            fastTradeFragment.m46710O3();
        } else {
            BaseFragment.showFailView$default(fastTradeFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.payment.fasttrade.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FastTradeFragment.m46707L3(this.f38778b, view);
                }
            }, 3, (Object) null);
            C43841b.m96555b("B7fast_trade_load", null, 2, null);
            C43841b.m96555b("event_click_home_grid_fast_trade", null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public static final void m46707L3(FastTradeFragment fastTradeFragment, View view) {
        ((FastTradeVM) fastTradeFragment.m45647o3()).m46721C();
    }

    /* JADX INFO: renamed from: M3 */
    private final void m46708M3() {
        m46709N3();
        m46710O3();
    }

    /* JADX INFO: renamed from: O3 */
    private final void m46710O3() {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        String str = this.f38721b0;
        Fragment fragment = null;
        if (Intrinsics.areEqual(str, "BUY")) {
            FastSellFragment fastSellFragment = this.f38720a0;
            if (fastSellFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
                fastSellFragment = null;
            }
            if (fastSellFragment.isAdded()) {
                FastSellFragment fastSellFragment2 = this.f38720a0;
                if (fastSellFragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
                    fastSellFragment2 = null;
                }
                fragmentTransactionBeginTransaction.hide(fastSellFragment2);
                FastSellFragment fastSellFragment3 = this.f38720a0;
                if (fastSellFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
                    fastSellFragment3 = null;
                }
                fragmentTransactionBeginTransaction.setMaxLifecycle(fastSellFragment3, Lifecycle.State.STARTED);
            }
            FastBuyFragment fastBuyFragment = this.f38719Z;
            if (fastBuyFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
                fastBuyFragment = null;
            }
            if (!fastBuyFragment.isAdded()) {
                int i11 = R$id.container;
                FastBuyFragment fastBuyFragment2 = this.f38719Z;
                if (fastBuyFragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
                    fastBuyFragment2 = null;
                }
                fragmentTransactionBeginTransaction.add(i11, fastBuyFragment2);
            } else {
                FastBuyFragment fastBuyFragment3 = this.f38719Z;
                if (fastBuyFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
                    fastBuyFragment3 = null;
                }
                fragmentTransactionBeginTransaction.show(fastBuyFragment3);
            }
            FastBuyFragment fastBuyFragment4 = this.f38719Z;
            if (fastBuyFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
            } else {
                fragment = fastBuyFragment4;
            }
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
        } else if (Intrinsics.areEqual(str, "SELL")) {
            FastBuyFragment fastBuyFragment5 = this.f38719Z;
            if (fastBuyFragment5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
                fastBuyFragment5 = null;
            }
            if (fastBuyFragment5.isAdded()) {
                FastBuyFragment fastBuyFragment6 = this.f38719Z;
                if (fastBuyFragment6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
                    fastBuyFragment6 = null;
                }
                fragmentTransactionBeginTransaction.hide(fastBuyFragment6);
                FastBuyFragment fastBuyFragment7 = this.f38719Z;
                if (fastBuyFragment7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyFragment");
                    fastBuyFragment7 = null;
                }
                fragmentTransactionBeginTransaction.setMaxLifecycle(fastBuyFragment7, Lifecycle.State.STARTED);
            }
            FastSellFragment fastSellFragment4 = this.f38720a0;
            if (fastSellFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
                fastSellFragment4 = null;
            }
            if (!fastSellFragment4.isAdded()) {
                int i12 = R$id.container;
                FastSellFragment fastSellFragment5 = this.f38720a0;
                if (fastSellFragment5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
                    fastSellFragment5 = null;
                }
                fragmentTransactionBeginTransaction.add(i12, fastSellFragment5);
            } else {
                FastSellFragment fastSellFragment6 = this.f38720a0;
                if (fastSellFragment6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
                    fastSellFragment6 = null;
                }
                fragmentTransactionBeginTransaction.show(fastSellFragment6);
            }
            FastSellFragment fastSellFragment7 = this.f38720a0;
            if (fastSellFragment7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sellFragment");
            } else {
                fragment = fastSellFragment7;
            }
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragment, Lifecycle.State.RESUMED);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C43841b.m96557d("B7fast_trade_load", "page_load_start", null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String strM56285z = RouteExKt.m56285z(arguments, "key_trade_side", "BUY");
            Intrinsics.checkNotNullExpressionValue(strM56285z, "compatString(...)");
            this.f38721b0 = strM56285z;
            String strM56285z2 = RouteExKt.m56285z(arguments, "key_fiat_currency", "");
            Intrinsics.checkNotNullExpressionValue(strM56285z2, "compatString(...)");
            this.f38717X = strM56285z2;
            String strM56285z3 = RouteExKt.m56285z(arguments, "key_crypto_currency", "");
            Intrinsics.checkNotNullExpressionValue(strM56285z3, "compatString(...)");
            this.f38718Y = strM56285z3;
        }
        FastTradeVM.m46712E((FastTradeVM) m45647o3(), this.f38717X, false, 2, null);
        this.f38719Z = FastBuyFragment.f38739f0.newInstance(this.f38717X, this.f38718Y);
        this.f38720a0 = FastSellFragment.f38797f0.newInstance(this.f38717X, this.f38718Y);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C44128b.m97259c("payment", "FastTradeFragment onResume");
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        C37668p1 c37668p1M46711G3 = m46711G3();
        if (c37668p1M46711G3 == null) {
            return;
        }
        m46709N3();
        AppCompatTextView tvBuy = c37668p1M46711G3.f84393c;
        Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
        C27046k.m66711z(tvBuy, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeFragment.m46703H3(this.f38776b);
            }
        }, 1, null);
        TextView tvSell = c37668p1M46711G3.f84394d;
        Intrinsics.checkNotNullExpressionValue(tvSell, "tvSell");
        C27046k.m66711z(tvSell, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeFragment.m46704I3(this.f38777b);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((FastTradeVM) m45647o3()).m46723z().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.payment.fasttrade.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FastTradeFragment.m46705J3(this.f38727b, (String) obj);
            }
        });
        ((FastTradeVM) m45647o3()).m46719A().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.payment.fasttrade.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FastTradeFragment.m46706K3(this.f38775b, (Boolean) obj);
            }
        });
    }
}
