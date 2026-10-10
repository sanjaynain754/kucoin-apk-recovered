package com.kubi.payment.fasttrade.sell;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.view.SelectLabelDialogView;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fasttrade.FastTradeVM;
import com.kubi.payment.fasttrade.sell.paymentmethod.SellPaymentMethodDialog;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.payment.fasttrade.widget.FastTradeTextView;
import com.kubi.payment.helper.H5Helper;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.math.BigDecimal;
import mt.SelectLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37658n1;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import tt.C45070a;
import tt.C45071b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: FastSellFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0012\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\fH\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\fH\u0002J\b\u00103\u001a\u00020\u0018H\u0002J\b\u00104\u001a\u00020\u0018H\u0002J\b\u00105\u001a\u00020\fH\u0002J\b\u00106\u001a\u00020\u0018H\u0002J\b\u00107\u001a\u00020\u0018H\u0014J\b\u00108\u001a\u00020\u0018H\u0002J\u0012\u00109\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u00020\u0018H\u0016J\b\u0010=\u001a\u00020\u0018H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020?H\u0016J\b\u0010@\u001a\u00020AH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellFragment;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "Lcom/kubi/payment/fasttrade/sell/FastSellVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "", "cryptoCurrency", "quoteType", "isAddNewCard", "", "showBalanceError", "showLimit", "selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "fastTradeViewModel", "Lcom/kubi/payment/fasttrade/FastTradeVM;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initParentVM", "initTradingPair", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindEvent", "initViews", "paymentMethodJsonObject", "Lorg/json/JSONObject;", "loadPaymentMethodList", "isSelectedPaymentMethod", "preCheck", "showAvailableBalanceExplainDialog", "refreshConfirm", "canPreviewOrder", "checkAmount", "refreshEstimated", "refreshBalance", "refreshLimit", "refreshLimitContent", "onFiatCurrencyChanged", "newFiatCurrency", "onCryptoCurrencyChanged", "newCryptoCurrency", "onTradingPairChanged", "refreshPrecision", "amount", "updateCryptoCurrencyUI", "observeData", "refreshAvailableBalance", "onSelectedPaymentMethodChanged", "newPaymentMethod", "showFiatCurrencySelectedDialog", "onResume", "onDestroyView", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nFastSellFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellFragment.kt\ncom/kubi/payment/fasttrade/sell/FastSellFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,702:1\n147#2,16:703\n44#3,2:719\n76#4,7:721\n*S KotlinDebug\n*F\n+ 1 FastSellFragment.kt\ncom/kubi/payment/fasttrade/sell/FastSellFragment\n*L\n55#1:703,16\n114#1:719,2\n143#1:721,7\n*E\n"})
public final class FastSellFragment extends BaseFastFragment<FastSellVM> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38799W = C45681e.m100799e(this, new Function1<FastSellFragment, C37658n1>() { // from class: com.kubi.payment.fasttrade.sell.FastSellFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37658n1 invoke(@NotNull FastSellFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37658n1.m84899a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37658n1, Unit>() { // from class: com.kubi.payment.fasttrade.sell.FastSellFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37658n1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37658n1 c37658n1) {
            invoke(c37658n1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f38800X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f38801Y = "";

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f38802Z = "CRYPTO";

    /* JADX INFO: renamed from: a0 */
    public boolean f38803a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f38804b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f38805c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public SellPaymentMethod.Response.PaymentMethod f38806d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public FastTradeVM f38807e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f38798g0 = {Reflection.property1(new PropertyReference1Impl(FastSellFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f38797f0 = new Companion(null);

    /* JADX INFO: compiled from: FastSellFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/fasttrade/sell/FastSellFragment;", "fiatCurrency", "", "cryptoCurrency", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FastSellFragment newInstance(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            FastSellFragment fastSellFragment = new FastSellFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_fiat_currency", fiatCurrency);
            bundle.putString("key_crypto_currency", cryptoCurrency);
            fastSellFragment.setArguments(bundle);
            return fastSellFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellFragment$a */
    /* JADX INFO: compiled from: FastSellFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/FastSellFragment$initViews$2$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$OnFastInputListener;", "onQuoteTypeChanged", "", "quoteType", "", "onSelectFiatCurrencyClicked", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20590a implements FastTradeInputView.InterfaceC20679a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FastTradeInputView f38809b;

        public C20590a(FastTradeInputView fastTradeInputView) {
            this.f38809b = fastTradeInputView;
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: a */
        public void mo46795a() {
            FastSellFragment.this.m46837B4();
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: b */
        public void mo46796b(String quoteType) {
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            C44128b.m97266j("payment", "FastSellFragment onQuoteTypeChanged quoteType:" + quoteType);
            FastSellFragment.this.f38802Z = quoteType;
            this.f38809b.m47154i(FastSellFragment.this.f38800X, FastSellFragment.this.f38801Y);
            FastSellFragment.this.m46877z4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellFragment$b */
    /* JADX INFO: compiled from: FastSellFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/FastSellFragment$initViews$3$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$OnTextChangeListener;", "onTextChange", "", "text", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20591b implements FastTradeTextView.InterfaceC20680a {
        public C20591b() {
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeTextView.InterfaceC20680a
        /* JADX INFO: renamed from: a */
        public void mo46797a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            FastSellFragment.this.m46860X3();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.FastSellFragment$c */
    /* JADX INFO: compiled from: FastSellFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20592c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38811b;

        public C20592c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38811b = function;
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
            return this.f38811b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38811b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m46866e4(FastSellFragment fastSellFragment) {
        fastSellFragment.m46881g4(true);
        C43852m.m96591c("B7FastSell", "paymentMethod", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public final void m46837B4() {
        FastSymbol f38723a0;
        SelectLabelDialogView.Companion companion = SelectLabelDialogView.f38176v0;
        FastTradeVM fastTradeVM = this.f38807e0;
        DialogFragmentHelper dialogFragmentHelperNewInstance$default = SelectLabelDialogView.Companion.newInstance$default(companion, C27024b.m66560c((fastTradeVM == null || (f38723a0 = fastTradeVM.getF38723a0()) == null) ? null : f38723a0.selectLegals(this.f38800X)), new BiConsumer() { // from class: com.kubi.payment.fasttrade.sell.h
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                FastSellFragment.m46839C4(this.f38926b, (BaseViewHolder) obj, (SelectLabel) obj2);
            }
        }, null, 4, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance$default.show(childFragmentManager, "payment_fast_sell_select_fiat_currency");
    }

    /* JADX INFO: renamed from: V3 */
    private final void m46859V3() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.payment.event.PaymentEvent:fastSellRefreshPaymentMethod".length();
        }
        C12572a.m23692a(this, false, new FastSellFragment$bindEvent$$inlined$bindFlowEvent$default$1("com.kubi.payment.event.PaymentEvent:fastSellRefreshPaymentMethod", null, this));
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m46861Z3() {
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            this.f38807e0 = (FastTradeVM) new ViewModelProvider(fragmentRequireParentFragment, c45071b).get(FastTradeVM.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastSellFragment init FastTradeViewModel", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public static final Unit m46863b4() {
        H5Helper.f39544a.m48245a();
        C43852m.m96590b("B7FastTrade", "otcLarge", "1", TuplesKt.m90091to("type", "sell"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m46864c4(FastSellFragment fastSellFragment) {
        FastSellCryptoCurrencyDialog.Companion companion = FastSellCryptoCurrencyDialog.f38786v0;
        FragmentManager childFragmentManager = fastSellFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, fastSellFragment.f38801Y);
        C43852m.m96591c("B7FastSell", "cryptoCurrency", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    private final void m46874n4(String str) {
        if (Intrinsics.areEqual(this.f38801Y, str)) {
            return;
        }
        this.f38801Y = str;
        m46841D4();
        ((FastSellVM) m45647o3()).m46927d0(this.f38801Y);
        m46876q4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    private final void m46875o4(String str) {
        C44128b.m97259c("payment", "FastSellFragment onFiatCurrencyChanged newFiatCurrency:" + str + ",fiatCurrency:" + this.f38800X);
        if (Intrinsics.areEqual(this.f38800X, str)) {
            return;
        }
        this.f38800X = str;
        FastSellVM fastSellVM = (FastSellVM) m45647o3();
        FastTradeVM fastTradeVM = this.f38807e0;
        fastSellVM.m46934l0(fastTradeVM != null ? fastTradeVM.getF38723a0() : null, this.f38800X);
        m46876q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m46877z4() {
        FastTradeInputView fastTradeInputView;
        FastTradeTextView fastTradeTextViewM47155j;
        FastTradeInputView fastTradeInputView2;
        FastTradeTextView fastTradeTextViewM47155j2;
        if (Intrinsics.areEqual(this.f38802Z, "FIAT")) {
            int iM46913P = ((FastSellVM) m45647o3()).m46913P(this.f38800X);
            C37658n1 c37658n1M46880Y3 = m46880Y3();
            if (c37658n1M46880Y3 == null || (fastTradeInputView2 = c37658n1M46880Y3.f84310j) == null || (fastTradeTextViewM47155j2 = fastTradeInputView2.m47155j()) == null) {
                return;
            }
            fastTradeTextViewM47155j2.setPrecision(iM46913P);
            return;
        }
        int iM46909L = ((FastSellVM) m45647o3()).m46909L(this.f38801Y);
        C37658n1 c37658n1M46880Y4 = m46880Y3();
        if (c37658n1M46880Y4 == null || (fastTradeInputView = c37658n1M46880Y4.f84310j) == null || (fastTradeTextViewM47155j = fastTradeInputView.m47155j()) == null) {
            return;
        }
        fastTradeTextViewM47155j.setPrecision(iM46909L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final boolean m46879W3() {
        return this.f38806d0 != null && ((FastSellVM) m45647o3()).m46926c0(m46858U3(), this.f38802Z) && ((FastSellVM) m45647o3()).m46925b0(m46858U3(), this.f38802Z);
    }

    /* JADX INFO: renamed from: Y3 */
    public final C37658n1 m46880Y3() {
        return (C37658n1) this.f38799W.getValue(this, f38798g0[0]);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m46859V3();
        m46881g4(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m46882p4(SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        AppCompatImageView appCompatImageView2;
        this.f38806d0 = paymentMethod;
        if (paymentMethod == null) {
            this.f38803a0 = false;
            C37658n1 c37658n1M46880Y3 = m46880Y3();
            if (c37658n1M46880Y3 != null && (appCompatImageView2 = c37658n1M46880Y3.f84306f) != null) {
                appCompatImageView2.setImageResource(R$drawable.ic2_fund_account_24);
                appCompatImageView2.setImageTintList(ContextCompat.getColorStateList(m45646n3(), R$color.c_text40));
            }
            C37658n1 c37658n1M46880Y4 = m46880Y3();
            if (c37658n1M46880Y4 != null && (baseTextView7 = c37658n1M46880Y4.f84321u) != null) {
                baseTextView7.setText(getStringRes(R$string.payment_fast_sell_seect_method, new Object[0]));
            }
            C37658n1 c37658n1M46880Y5 = m46880Y3();
            if (c37658n1M46880Y5 != null && (baseTextView6 = c37658n1M46880Y5.f84321u) != null) {
                baseTextView6.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text40));
            }
        } else {
            this.f38803a0 = ((FastSellVM) m45647o3()).m46922Y(this.f38806d0);
            C37658n1 c37658n1M46880Y6 = m46880Y3();
            if (c37658n1M46880Y6 != null && (appCompatImageView = c37658n1M46880Y6.f84306f) != null) {
                Context contextM45646n3 = m45646n3();
                SellPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f38806d0;
                C24277v.m58540e(contextM45646n3, paymentMethod2 != null ? paymentMethod2.getIconUrl() : null, appCompatImageView);
                appCompatImageView.setImageTintList(null);
            }
            C37658n1 c37658n1M46880Y7 = m46880Y3();
            if (c37658n1M46880Y7 != null && (baseTextView5 = c37658n1M46880Y7.f84321u) != null) {
                SellPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f38806d0;
                baseTextView5.setText(paymentMethod3 != null ? paymentMethod3.getPaymentMethodName() : null);
            }
            C37658n1 c37658n1M46880Y8 = m46880Y3();
            if (c37658n1M46880Y8 != null && (baseTextView4 = c37658n1M46880Y8.f84321u) != null) {
                baseTextView4.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text));
            }
            SellPaymentMethod.Response.PaymentMethod paymentMethod4 = this.f38806d0;
            String strM66668h = C27041f.m66668h(paymentMethod4 != null ? paymentMethod4.getTag() : null);
            if (strM66668h.length() == 0) {
                C37658n1 c37658n1M46880Y9 = m46880Y3();
                if (c37658n1M46880Y9 != null && (baseTextView3 = c37658n1M46880Y9.f84322v) != null) {
                    C27046k.m66700o(baseTextView3);
                }
            } else {
                C37658n1 c37658n1M46880Y10 = m46880Y3();
                if (c37658n1M46880Y10 != null && (baseTextView2 = c37658n1M46880Y10.f84322v) != null) {
                    baseTextView2.setText(strM66668h);
                }
                C37658n1 c37658n1M46880Y11 = m46880Y3();
                if (c37658n1M46880Y11 != null && (baseTextView = c37658n1M46880Y11.f84322v) != null) {
                    C27046k.m66685H(baseTextView);
                }
            }
        }
        m46885t4();
        m46860X3();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_sell;
    }

    /* JADX INFO: renamed from: r4 */
    public final JSONObject m46883r4() throws JSONException {
        SellPaymentMethod.Response.PaymentMethod paymentMethod = this.f38806d0;
        if (paymentMethod == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paymentMethodCode", paymentMethod.getPaymentMethodCode());
        jSONObject.put("channelId", paymentMethod.getChannelId());
        jSONObject.put("pay_fiat_currency", paymentMethod.getFiatCurrency());
        jSONObject.put("pay_crypto_currency", paymentMethod.getCryptoCurrency());
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m46884s4() {
        if (this.f38806d0 == null) {
            m46881g4(false);
            return;
        }
        FastSellVM fastSellVM = (FastSellVM) m45647o3();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        fastSellVM.m46930g0(childFragmentManager);
        C43852m.m96589a("B7FastSell", "button", ((FastSellVM) m45647o3()).m46922Y(this.f38806d0) ? "newCard" : "preview", m46883r4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m46888w4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (this.f38806d0 == null) {
            C37658n1 c37658n1M46880Y3 = m46880Y3();
            if (c37658n1M46880Y3 == null || (baseTextView6 = c37658n1M46880Y3.f84318r) == null) {
                return;
            }
            C27046k.m66700o(baseTextView6);
            return;
        }
        String strM46858U3 = m46858U3();
        if (((FastSellVM) m45647o3()).m46923Z(strM46858U3)) {
            C37658n1 c37658n1M46880Y4 = m46880Y3();
            if (c37658n1M46880Y4 == null || (baseTextView5 = c37658n1M46880Y4.f84318r) == null) {
                return;
            }
            C27046k.m66700o(baseTextView5);
            return;
        }
        if (this.f38805c0 || this.f38804b0) {
            C37658n1 c37658n1M46880Y5 = m46880Y3();
            if (c37658n1M46880Y5 == null || (baseTextView = c37658n1M46880Y5.f84318r) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
            return;
        }
        BigDecimal bigDecimalM46912O = ((FastSellVM) m45647o3()).m46912O(strM46858U3, this.f38802Z);
        C44128b.m97259c("payment", "refreshEstimated estimatedAmount:" + bigDecimalM46912O);
        if (Intrinsics.areEqual(this.f38802Z, "FIAT")) {
            C37658n1 c37658n1M46880Y6 = m46880Y3();
            if (c37658n1M46880Y6 != null && (baseTextView4 = c37658n1M46880Y6.f84318r) != null) {
                baseTextView4.setText(getStringRes(R$string.payment_fast_sell_about, C42180b.m92647l(bigDecimalM46912O != null ? C42180b.m92640e(bigDecimalM46912O, null, ((FastSellVM) m45647o3()).m46909L(this.f38801Y), false, false, false, 0, null, 125, null) : null), this.f38801Y));
            }
        } else {
            C37658n1 c37658n1M46880Y7 = m46880Y3();
            if (c37658n1M46880Y7 != null && (baseTextView2 = c37658n1M46880Y7.f84318r) != null) {
                baseTextView2.setText(getStringRes(R$string.payment_fast_sell_about, C42180b.m92647l(bigDecimalM46912O != null ? C42180b.m92640e(bigDecimalM46912O, null, ((FastSellVM) m45647o3()).m46913P(this.f38800X), false, false, false, 0, null, 125, null) : null), this.f38800X));
            }
        }
        C37658n1 c37658n1M46880Y8 = m46880Y3();
        if (c37658n1M46880Y8 == null || (baseTextView3 = c37658n1M46880Y8.f84318r) == null) {
            return;
        }
        C27046k.m66685H(baseTextView3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m46889x4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        BaseTextView baseTextView14;
        if (this.f38806d0 == null) {
            C37658n1 c37658n1M46880Y3 = m46880Y3();
            if (c37658n1M46880Y3 != null && (baseTextView14 = c37658n1M46880Y3.f84319s) != null) {
                C27046k.m66700o(baseTextView14);
            }
            C37658n1 c37658n1M46880Y4 = m46880Y3();
            if (c37658n1M46880Y4 == null || (baseTextView13 = c37658n1M46880Y4.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView13);
            return;
        }
        if (this.f38804b0) {
            C37658n1 c37658n1M46880Y5 = m46880Y3();
            if (c37658n1M46880Y5 != null && (baseTextView12 = c37658n1M46880Y5.f84319s) != null) {
                C27046k.m66700o(baseTextView12);
            }
            C37658n1 c37658n1M46880Y6 = m46880Y3();
            if (c37658n1M46880Y6 == null || (baseTextView11 = c37658n1M46880Y6.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView11);
            return;
        }
        if (((FastSellVM) m45647o3()).m46923Z(m46858U3())) {
            this.f38805c0 = true;
            C37658n1 c37658n1M46880Y7 = m46880Y3();
            if (c37658n1M46880Y7 != null && (baseTextView10 = c37658n1M46880Y7.f84319s) != null) {
                baseTextView10.setTextColor(getColorRes(R$color.c_text40));
            }
            C37658n1 c37658n1M46880Y8 = m46880Y3();
            if (c37658n1M46880Y8 != null && (baseTextView9 = c37658n1M46880Y8.f84320t) != null) {
                baseTextView9.setTextColor(getColorRes(R$color.c_text40));
            }
            C37658n1 c37658n1M46880Y9 = m46880Y3();
            if (c37658n1M46880Y9 != null && (baseTextView8 = c37658n1M46880Y9.f84319s) != null) {
                C27046k.m66685H(baseTextView8);
            }
            C37658n1 c37658n1M46880Y10 = m46880Y3();
            if (c37658n1M46880Y10 != null && (baseTextView7 = c37658n1M46880Y10.f84320t) != null) {
                C27046k.m66685H(baseTextView7);
            }
            m46890y4();
            return;
        }
        if (((FastSellVM) m45647o3()).m46925b0(m46858U3(), this.f38802Z)) {
            this.f38805c0 = false;
            C37658n1 c37658n1M46880Y11 = m46880Y3();
            if (c37658n1M46880Y11 != null && (baseTextView6 = c37658n1M46880Y11.f84319s) != null) {
                C27046k.m66700o(baseTextView6);
            }
            C37658n1 c37658n1M46880Y12 = m46880Y3();
            if (c37658n1M46880Y12 == null || (baseTextView5 = c37658n1M46880Y12.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView5);
            return;
        }
        this.f38805c0 = true;
        C37658n1 c37658n1M46880Y13 = m46880Y3();
        if (c37658n1M46880Y13 != null && (baseTextView4 = c37658n1M46880Y13.f84319s) != null) {
            baseTextView4.setTextColor(getColorRes(R$color.brandRed));
        }
        C37658n1 c37658n1M46880Y14 = m46880Y3();
        if (c37658n1M46880Y14 != null && (baseTextView3 = c37658n1M46880Y14.f84320t) != null) {
            baseTextView3.setTextColor(getColorRes(R$color.brandRed));
        }
        C37658n1 c37658n1M46880Y15 = m46880Y3();
        if (c37658n1M46880Y15 != null && (baseTextView2 = c37658n1M46880Y15.f84319s) != null) {
            C27046k.m66685H(baseTextView2);
        }
        C37658n1 c37658n1M46880Y16 = m46880Y3();
        if (c37658n1M46880Y16 != null && (baseTextView = c37658n1M46880Y16.f84320t) != null) {
            C27046k.m66685H(baseTextView);
        }
        m46890y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m46890y4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (Intrinsics.areEqual(this.f38802Z, "FIAT")) {
            SellPaymentMethod.Response.PaymentMethod paymentMethod = this.f38806d0;
            String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatMinAmount() : null);
            SellPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f38806d0;
            String strM66668h2 = C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getFiatMaxAmount() : null);
            C37658n1 c37658n1M46880Y3 = m46880Y3();
            if (c37658n1M46880Y3 != null && (baseTextView6 = c37658n1M46880Y3.f84319s) != null) {
                baseTextView6.setText(getStringRes(R$string.payment_limit_tip, C42180b.m92647l(C42180b.m92640e(DowngradeExKt.m66535e(strM66668h, null, 1, null), null, ((FastSellVM) m45647o3()).m46913P(this.f38800X), false, false, false, 0, null, 125, null)), C42180b.m92647l(C42180b.m92640e(DowngradeExKt.m66535e(strM66668h2, null, 1, null), null, ((FastSellVM) m45647o3()).m46913P(this.f38800X), false, false, false, 0, null, 125, null)), this.f38800X));
            }
            if (strM66668h.length() == 0 || strM66668h2.length() == 0) {
                C37658n1 c37658n1M46880Y4 = m46880Y3();
                if (c37658n1M46880Y4 != null && (baseTextView5 = c37658n1M46880Y4.f84319s) != null) {
                    C27046k.m66700o(baseTextView5);
                }
                C37658n1 c37658n1M46880Y5 = m46880Y3();
                if (c37658n1M46880Y5 == null || (baseTextView4 = c37658n1M46880Y5.f84320t) == null) {
                    return;
                }
                C27046k.m66700o(baseTextView4);
                return;
            }
            return;
        }
        SellPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f38806d0;
        String strM66668h3 = C27041f.m66668h(paymentMethod3 != null ? paymentMethod3.getCryptoMinAmount() : null);
        SellPaymentMethod.Response.PaymentMethod paymentMethod4 = this.f38806d0;
        String strM66668h4 = C27041f.m66668h(paymentMethod4 != null ? paymentMethod4.getCryptoMaxAmount() : null);
        C37658n1 c37658n1M46880Y6 = m46880Y3();
        if (c37658n1M46880Y6 != null && (baseTextView3 = c37658n1M46880Y6.f84319s) != null) {
            baseTextView3.setText(getStringRes(R$string.payment_limit_tip, C42180b.m92647l(C42180b.m92640e(DowngradeExKt.m66535e(strM66668h3, null, 1, null), null, ((FastSellVM) m45647o3()).m46909L(this.f38801Y), false, false, false, 0, null, 125, null)), C42180b.m92647l(C42180b.m92640e(DowngradeExKt.m66535e(strM66668h4, null, 1, null), null, ((FastSellVM) m45647o3()).m46909L(this.f38801Y), false, false, false, 0, null, 125, null)), this.f38801Y));
        }
        if (strM66668h3.length() == 0 || strM66668h4.length() == 0) {
            C37658n1 c37658n1M46880Y7 = m46880Y3();
            if (c37658n1M46880Y7 != null && (baseTextView2 = c37658n1M46880Y7.f84319s) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C37658n1 c37658n1M46880Y8 = m46880Y3();
            if (c37658n1M46880Y8 == null || (baseTextView = c37658n1M46880Y8.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<FastSellVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(FastSellVM.class);
    }

    public FastSellFragment() {
        setPageId("B7FastSell");
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m46839C4(FastSellFragment fastSellFragment, BaseViewHolder baseViewHolder, SelectLabel selectLabel) throws JSONException {
        String strM66668h = C27041f.m66668h(selectLabel.getValue());
        if (strM66668h.length() == 0) {
            return;
        }
        FastTradeVM fastTradeVM = fastSellFragment.f38807e0;
        if (fastTradeVM != null) {
            fastTradeVM.m46722D(strM66668h, true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fiat", strM66668h);
        jSONObject.put("type", "sell");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7FastTrade", "fiatSelector", "1", jSONObject);
    }

    /* JADX INFO: renamed from: D4 */
    private final void m46841D4() {
        AppCompatImageView appCompatImageView;
        String strCoinIcon;
        FastSymbol f38723a0;
        BaseTextView baseTextView;
        C37658n1 c37658n1M46880Y3 = m46880Y3();
        if (c37658n1M46880Y3 != null && (baseTextView = c37658n1M46880Y3.f84317q) != null) {
            baseTextView.setText(this.f38801Y);
        }
        C37658n1 c37658n1M46880Y4 = m46880Y3();
        if (c37658n1M46880Y4 != null && (appCompatImageView = c37658n1M46880Y4.f84304d) != null) {
            Context contextM45646n3 = m45646n3();
            FastTradeVM fastTradeVM = this.f38807e0;
            if (fastTradeVM != null && (f38723a0 = fastTradeVM.getF38723a0()) != null) {
                strCoinIcon = f38723a0.coinIcon(this.f38801Y);
            } else {
                strCoinIcon = null;
            }
            C24277v.m58540e(contextM45646n3, strCoinIcon, appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: U3 */
    private final String m46858U3() {
        String strM47153f;
        FastTradeInputView fastTradeInputView;
        C37658n1 c37658n1M46880Y3 = m46880Y3();
        if (c37658n1M46880Y3 != null && (fastTradeInputView = c37658n1M46880Y3.f84310j) != null) {
            strM47153f = fastTradeInputView.m47153f();
        } else {
            strM47153f = null;
        }
        return C27041f.m66669i(strM47153f, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public final void m46860X3() {
        C44128b.m97259c("payment", "SellFragment onAmountChanged amount:" + m46858U3());
        m46886u4();
        m46889x4();
        m46888w4();
        m46887v4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    private final void m46862a4() {
        String strM56285z;
        String value;
        FastSymbol f38723a0;
        LiveData<String> liveDataM46723z;
        Bundle arguments = getArguments();
        String strFirstCoin = null;
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "key_crypto_currency", "");
        } else {
            strM56285z = null;
        }
        String strM66668h = C27041f.m66668h(strM56285z);
        if (strM66668h.length() == 0) {
            strM66668h = C46392a.m102326h(PaymentStorageId.f40364a.m49833k(), "");
        }
        if (strM66668h.length() == 0) {
            FastTradeVM fastTradeVM = this.f38807e0;
            if (fastTradeVM != null && (liveDataM46723z = fastTradeVM.m46723z()) != null) {
                value = liveDataM46723z.getValue();
            } else {
                value = null;
            }
            String strM66668h2 = C27041f.m66668h(value);
            FastTradeVM fastTradeVM2 = this.f38807e0;
            if (fastTradeVM2 != null && (f38723a0 = fastTradeVM2.getF38723a0()) != null) {
                strFirstCoin = f38723a0.firstCoin(strM66668h2);
            }
            strM66668h = C27041f.m66668h(strFirstCoin);
        }
        ((FastSellVM) m45647o3()).m46932i0(strM66668h);
        C44128b.m97259c("payment", "FastSellFragment initViews tempCryptoCurrency " + strM66668h);
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m46865d4(FastSellFragment fastSellFragment) {
        fastSellFragment.m46878A4();
        C43852m.m96591c("B7FastSell", "balanceDescription", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public static final Unit m46867f4(FastSellFragment fastSellFragment, C37658n1 c37658n1) {
        if (((FastSellVM) fastSellFragment.m45647o3()).m46923Z(fastSellFragment.m46858U3())) {
            fastSellFragment.f38802Z = "CRYPTO";
            c37658n1.f84310j.setQuoteType("CRYPTO");
            fastSellFragment.m46877z4();
            c37658n1.f84310j.m47154i(fastSellFragment.f38800X, fastSellFragment.f38801Y);
            FastTradeTextView fastTradeTextViewM47155j = c37658n1.f84310j.m47155j();
            if (fastTradeTextViewM47155j != null) {
                fastTradeTextViewM47155j.setAmount(((FastSellVM) fastSellFragment.m45647o3()).m46907J());
            }
            C43852m.m96589a("B7FastSell", "button", "sellAll", fastSellFragment.m46883r4());
        } else {
            fastSellFragment.m46884s4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m46868h4(FastSellFragment fastSellFragment, String str) {
        Intrinsics.checkNotNull(str);
        fastSellFragment.m46875o4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m46869i4(FastSellFragment fastSellFragment, String str) {
        Intrinsics.checkNotNull(str);
        fastSellFragment.m46874n4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m46870j4(FastSellFragment fastSellFragment, Balance.Response response) {
        fastSellFragment.m46885t4();
        fastSellFragment.m46860X3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m46871k4(FastSellFragment fastSellFragment, SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        fastSellFragment.m46882p4(paymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m46872l4(FastSellFragment fastSellFragment, Boolean bool) {
        if (bool.booleanValue()) {
            SellPaymentMethodDialog.Companion companion = SellPaymentMethodDialog.f38935u0;
            FragmentManager childFragmentManager = fastSellFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public static final Unit m46873m4(FastSellFragment fastSellFragment, Boolean bool) {
        if (bool.booleanValue()) {
            String strM46906I = ((FastSellVM) fastSellFragment.m45647o3()).m46906I(fastSellFragment.m46858U3(), fastSellFragment.f38802Z);
            C44128b.m97259c("payment", "preCheckPassed cryptoAmount:" + strM46906I);
            FastSellHelper fastSellHelper = FastSellHelper.f38946a;
            Context contextM45646n3 = fastSellFragment.m45646n3();
            FragmentManager childFragmentManager = fastSellFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            fastSellHelper.m47141c(contextM45646n3, childFragmentManager, fastSellFragment.f38806d0, strM46906I);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    private final void m46876q4() {
        FastTradeInputView fastTradeInputView;
        C37658n1 c37658n1M46880Y3 = m46880Y3();
        if (c37658n1M46880Y3 != null && (fastTradeInputView = c37658n1M46880Y3.f84310j) != null) {
            fastTradeInputView.setQuoteType(this.f38802Z);
            fastTradeInputView.m47154i(this.f38800X, this.f38801Y);
        }
        m46877z4();
        m46881g4(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public final void m46878A4() {
        Balance.Response value = ((FastSellVM) m45647o3()).m46915R().getValue();
        if (value == null) {
            return;
        }
        FastSellBalanceExplainDialog.Companion companion = FastSellBalanceExplainDialog.f38779t0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(value, childFragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m46881g4(boolean z11) {
        ((FastSellVM) m45647o3()).m46928e0(this.f38800X, this.f38801Y, m46858U3(), this.f38802Z, z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m46861Z3();
        m46862a4();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C46392a.m102333p(PaymentStorageId.f40364a.m49833k(), this.f38801Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C44128b.m97259c("payment", "FastSellFragment onResume");
        ((FastSellVM) m45647o3()).m46927d0(this.f38801Y);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        final C37658n1 c37658n1M46880Y3 = m46880Y3();
        if (c37658n1M46880Y3 == null) {
            return;
        }
        c37658n1M46880Y3.f84320t.getPaint().setFlags(8);
        c37658n1M46880Y3.f84320t.getPaint().setAntiAlias(true);
        BaseTextView tvNeedHigherLimits = c37658n1M46880Y3.f84320t;
        Intrinsics.checkNotNullExpressionValue(tvNeedHigherLimits, "tvNeedHigherLimits");
        C27046k.m66711z(tvNeedHigherLimits, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellFragment.m46863b4();
            }
        }, 1, null);
        FastTradeInputView fastTradeInputView = c37658n1M46880Y3.f84310j;
        fastTradeInputView.setTradeType("SELL");
        fastTradeInputView.setQuoteType(this.f38802Z);
        fastTradeInputView.setFastInputListener(new C20590a(fastTradeInputView));
        FastTradeTextView fastTradeTextViewM47155j = c37658n1M46880Y3.f84310j.m47155j();
        if (fastTradeTextViewM47155j != null) {
            c37658n1M46880Y3.f84308h.addListener(fastTradeTextViewM47155j);
            fastTradeTextViewM47155j.registerListener(new C20591b());
        }
        ConstraintLayout layoutCryptoCurrency = c37658n1M46880Y3.f84309i;
        Intrinsics.checkNotNullExpressionValue(layoutCryptoCurrency, "layoutCryptoCurrency");
        C27046k.m66711z(layoutCryptoCurrency, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellFragment.m46864c4(this.f38932b);
            }
        }, 1, null);
        DashTextView tvAvailable = c37658n1M46880Y3.f84312l;
        Intrinsics.checkNotNullExpressionValue(tvAvailable, "tvAvailable");
        C27046k.m66711z(tvAvailable, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellFragment.m46865d4(this.f38933b);
            }
        }, 1, null);
        ConstraintLayout layoutPaymentMethod = c37658n1M46880Y3.f84311k;
        Intrinsics.checkNotNullExpressionValue(layoutPaymentMethod, "layoutPaymentMethod");
        C27046k.m66711z(layoutPaymentMethod, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellFragment.m46866e4(this.f38943b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c37658n1M46880Y3.f84316p;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastSellFragment.m46867f4(this.f38924b, c37658n1M46880Y3);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        LiveData<String> liveDataM46723z;
        super.mo45650r3();
        FastTradeVM fastTradeVM = this.f38807e0;
        if (fastTradeVM != null && (liveDataM46723z = fastTradeVM.m46723z()) != null) {
            liveDataM46723z.observe(getViewLifecycleOwner(), new C20592c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FastSellFragment.m46868h4(this.f38923b, (String) obj);
                }
            }));
        }
        ((FastSellVM) m45647o3()).m46919V().observe(getViewLifecycleOwner(), new C20592c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastSellFragment.m46869i4(this.f38927b, (String) obj);
            }
        }));
        ((FastSellVM) m45647o3()).m46915R().observe(getViewLifecycleOwner(), new C20592c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastSellFragment.m46870j4(this.f38928b, (Balance.Response) obj);
            }
        }));
        ((FastSellVM) m45647o3()).m46920W().observe(getViewLifecycleOwner(), new C20592c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastSellFragment.m46871k4(this.f38929b, (SellPaymentMethod.Response.PaymentMethod) obj);
            }
        }));
        ((FastSellVM) m45647o3()).m46921X().observe(getViewLifecycleOwner(), new C20592c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastSellFragment.m46872l4(this.f38930b, (Boolean) obj);
            }
        }));
        ((FastSellVM) m45647o3()).m46918U().observe(getViewLifecycleOwner(), new C20592c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastSellFragment.m46873m4(this.f38931b, (Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m46885t4() {
        BaseTextView baseTextView;
        String currency;
        C37658n1 c37658n1M46880Y3 = m46880Y3();
        if (c37658n1M46880Y3 != null && (baseTextView = c37658n1M46880Y3.f84313m) != null) {
            int i11 = R$string.payment_price;
            String strM46911N = ((FastSellVM) m45647o3()).m46911N();
            Balance.Response value = ((FastSellVM) m45647o3()).m46915R().getValue();
            if (value != null) {
                currency = value.getCurrency();
            } else {
                currency = null;
            }
            baseTextView.setText(getStringRes(i11, strM46911N, C27041f.m66668h(currency)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public final void m46886u4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        String currency;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        if (((FastSellVM) m45647o3()).m46923Z(m46858U3())) {
            C37658n1 c37658n1M46880Y3 = m46880Y3();
            if (c37658n1M46880Y3 != null && (baseTextView8 = c37658n1M46880Y3.f84314n) != null) {
                C27046k.m66700o(baseTextView8);
                return;
            }
            return;
        }
        if (((FastSellVM) m45647o3()).m46926c0(m46858U3(), this.f38802Z)) {
            this.f38804b0 = false;
            C37658n1 c37658n1M46880Y4 = m46880Y3();
            if (c37658n1M46880Y4 != null && (baseTextView7 = c37658n1M46880Y4.f84314n) != null) {
                C27046k.m66700o(baseTextView7);
                return;
            }
            return;
        }
        this.f38804b0 = true;
        C37658n1 c37658n1M46880Y5 = m46880Y3();
        if (c37658n1M46880Y5 != null && (baseTextView6 = c37658n1M46880Y5.f84314n) != null) {
            int i11 = R$string.payment_available_balance_tip;
            String strM46911N = ((FastSellVM) m45647o3()).m46911N();
            Balance.Response value = ((FastSellVM) m45647o3()).m46915R().getValue();
            if (value != null) {
                currency = value.getCurrency();
            } else {
                currency = null;
            }
            baseTextView6.setText(getStringRes(i11, strM46911N, C27041f.m66668h(currency)));
        }
        C37658n1 c37658n1M46880Y6 = m46880Y3();
        if (c37658n1M46880Y6 != null && (baseTextView5 = c37658n1M46880Y6.f84314n) != null) {
            baseTextView5.setTextColor(getColorRes(R$color.brandRed));
        }
        C37658n1 c37658n1M46880Y7 = m46880Y3();
        if (c37658n1M46880Y7 != null && (baseTextView4 = c37658n1M46880Y7.f84314n) != null) {
            C27046k.m66685H(baseTextView4);
        }
        C37658n1 c37658n1M46880Y8 = m46880Y3();
        if (c37658n1M46880Y8 != null && (baseTextView3 = c37658n1M46880Y8.f84318r) != null) {
            C27046k.m66700o(baseTextView3);
        }
        C37658n1 c37658n1M46880Y9 = m46880Y3();
        if (c37658n1M46880Y9 != null && (baseTextView2 = c37658n1M46880Y9.f84319s) != null) {
            C27046k.m66700o(baseTextView2);
        }
        C37658n1 c37658n1M46880Y10 = m46880Y3();
        if (c37658n1M46880Y10 != null && (baseTextView = c37658n1M46880Y10.f84320t) != null) {
            C27046k.m66700o(baseTextView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final void m46887v4() {
        KcPrimaryButton kcPrimaryButton;
        C37658n1 c37658n1M46880Y3 = m46880Y3();
        if (c37658n1M46880Y3 != null && (kcPrimaryButton = c37658n1M46880Y3.f84316p) != null) {
            if (((FastSellVM) m45647o3()).m46923Z(m46858U3())) {
                kcPrimaryButton.setText(getStringRes(R$string.payment_fast_sell_max_amount, new Object[0]));
                kcPrimaryButton.setEnabled(true);
            } else if (this.f38803a0) {
                kcPrimaryButton.setText(getStringRes(R$string.payment_fast_sell_add_new_card, new Object[0]));
                kcPrimaryButton.setEnabled(m46879W3());
            } else {
                kcPrimaryButton.setText(getStringRes(R$string.payment_fast_sell_preview_order, new Object[0]));
                kcPrimaryButton.setEnabled(m46879W3());
            }
        }
    }
}
