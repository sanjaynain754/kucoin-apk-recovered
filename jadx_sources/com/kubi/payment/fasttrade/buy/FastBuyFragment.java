package com.kubi.payment.fasttrade.buy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.perf.util.Constants;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.otc.view.SelectLabelDialogView;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.buy.recurring.RecurringFrequencyDialog;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.TradingPairInfo;
import com.kubi.payment.fast.paymentmethod.ExtraParams;
import com.kubi.payment.fast.paymentmethod.PaymentMethodFragment;
import com.kubi.payment.fasttrade.FastTradeVM;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.payment.fasttrade.widget.FastTradeTextView;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.helper.H5Helper;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37755g;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import lt.C42300e;
import mt.SelectLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37638j1;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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

/* JADX INFO: compiled from: FastBuyFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u001a\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\fH\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\u001c\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u0010H\u0002J\b\u0010,\u001a\u00020\u0019H\u0014J\b\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0019H\u0002J\u0012\u00101\u001a\u00020\u00192\b\b\u0002\u00102\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020\u0019H\u0002J\b\u00104\u001a\u00020\u0019H\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\b\u00108\u001a\u00020\u0019H\u0016J\b\u00109\u001a\u00020\u0019H\u0002J\b\u0010:\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u00020\u0019H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/buy/FastBuyFragment;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "Lcom/kubi/payment/fasttrade/buy/FastBuyVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyNewBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyNewBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "", "cryptoCurrency", "quoteType", "isBuyMaximum", "", "isOneTimePurchaseMode", "tradingPairInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "fastTradeViewModel", "Lcom/kubi/payment/fasttrade/FastTradeVM;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initParentVM", "initTradingPair", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "onFiatCurrencyChanged", "newFiatCurrency", "onCryptoCurrencyChanged", "newCryptoCurrency", "onTradingPairChanged", "updateCryptoCurrencyUI", "checkAmount", "refreshConfirm", "isInitial", Constants.ENABLE_DISABLE, "observeData", "switchOneTimePurchaseMode", "onTradingPairInfoChanged", "refreshPrecision", "refreshLimitAmount", "updateLimitAmountView", "showError", "launchPaymentMethodsPage", "onRecurringUIClick", "onRecurringSelected", "showRecurringExplainDialog", "showFiatCurrencySelectedDialog", "onResume", "loadTradingPairInfo", "trackConfirm", "onDestroyView", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nFastBuyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBuyFragment.kt\ncom/kubi/payment/fasttrade/buy/FastBuyFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,614:1\n147#2,16:615\n44#3,2:631\n*S KotlinDebug\n*F\n+ 1 FastBuyFragment.kt\ncom/kubi/payment/fasttrade/buy/FastBuyFragment\n*L\n71#1:615,16\n130#1:631,2\n*E\n"})
public final class FastBuyFragment extends BaseFastFragment<FastBuyVM> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38741W = C45681e.m100799e(this, new Function1<FastBuyFragment, C37638j1>() { // from class: com.kubi.payment.fasttrade.buy.FastBuyFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37638j1 invoke(@NotNull FastBuyFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37638j1.m84859a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37638j1, Unit>() { // from class: com.kubi.payment.fasttrade.buy.FastBuyFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37638j1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37638j1 c37638j1) {
            invoke(c37638j1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f38742X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f38743Y = "";

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f38744Z = "FIAT";

    /* JADX INFO: renamed from: a0 */
    public boolean f38745a0 = true;

    /* JADX INFO: renamed from: b0 */
    public boolean f38746b0 = true;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public TradingPairInfo.Response f38747c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public RecurringFrequency f38748d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public FastTradeVM f38749e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f38740g0 = {Reflection.property1(new PropertyReference1Impl(FastBuyFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyNewBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f38739f0 = new Companion(null);

    /* JADX INFO: compiled from: FastBuyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/buy/FastBuyFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/fasttrade/buy/FastBuyFragment;", "fiatCurrency", "", "cryptoCurrency", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FastBuyFragment newInstance(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            FastBuyFragment fastBuyFragment = new FastBuyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_fiat_currency", fiatCurrency);
            bundle.putString("key_crypto_currency", cryptoCurrency);
            fastBuyFragment.setArguments(bundle);
            return fastBuyFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.buy.FastBuyFragment$a */
    /* JADX INFO: compiled from: FastBuyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttrade/buy/FastBuyFragment$initViews$4$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$OnFastInputListener;", "onQuoteTypeChanged", "", "quoteType", "", "onSelectFiatCurrencyClicked", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20557a implements FastTradeInputView.InterfaceC20679a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FastTradeInputView f38751b;

        public C20557a(FastTradeInputView fastTradeInputView) {
            this.f38751b = fastTradeInputView;
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: a */
        public void mo46795a() {
            FastBuyFragment.this.m46794y4();
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: b */
        public void mo46796b(String quoteType) {
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            C44128b.m97259c("payment", "FastBuyFragment onQuoteTypeChanged quoteType:" + quoteType);
            FastBuyFragment.this.f38744Z = quoteType;
            this.f38751b.m47154i(FastBuyFragment.this.f38742X, FastBuyFragment.this.f38743Y);
            FastBuyFragment.this.m46789x4();
            FastBuyFragment.this.m46788w4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.buy.FastBuyFragment$b */
    /* JADX INFO: compiled from: FastBuyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/fasttrade/buy/FastBuyFragment$initViews$5$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$OnTextChangeListener;", "onTextChange", "", "text", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20558b implements FastTradeTextView.InterfaceC20680a {
        public C20558b() {
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeTextView.InterfaceC20680a
        /* JADX INFO: renamed from: a */
        public void mo46797a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            FastBuyFragment.this.m46791W3();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.buy.FastBuyFragment$c */
    /* JADX INFO: compiled from: FastBuyFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20559c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38753b;

        public C20559c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38753b = function;
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
            return this.f38753b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38753b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: B4 */
    private final void m46741B4() {
        AppCompatImageView appCompatImageView;
        this.f38746b0 = true;
        this.f38748d0 = null;
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 == null || (appCompatImageView = c37638j1M46792X3.f84083e) == null) {
            return;
        }
        C27046k.m66700o(appCompatImageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    private final void m46775i4() {
        this.f38747c0 = null;
        ((FastBuyVM) m45647o3()).m46810F(this.f38742X, this.f38743Y);
    }

    /* JADX INFO: renamed from: A4 */
    private final void m46739A4() {
        C42300e c42300e = C42300e.f93799a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C42300e.m92839e(c42300e, childFragmentManager, "payment_fast_recurring_explain", getStringRes(R$string.payment_investment_waht_title, new Object[0]), getStringRes(R$string.payment_fast_recurring_explain, new Object[0]), null, null, null, 112, null);
    }

    /* JADX INFO: renamed from: C4 */
    private final void m46743C4() {
        if (this.f38746b0) {
            C43852m.m96590b("B7FastTrade", "button", "1", TuplesKt.m90091to("pay_fiat_currency", this.f38742X), TuplesKt.m90091to("pay_crypto_currency", this.f38743Y), TuplesKt.m90091to("type", "buy"), TuplesKt.m90091to("after_page_id", "B7PaymentMethod"), TuplesKt.m90091to("norm_version", "1"));
            return;
        }
        Pair pairM90091to = TuplesKt.m90091to("fiat", this.f38742X);
        Pair pairM90091to2 = TuplesKt.m90091to("coin", this.f38743Y);
        RecurringFrequency recurringFrequency = this.f38748d0;
        Pair pairM90091to3 = TuplesKt.m90091to("frequency", C27041f.m66668h(recurringFrequency != null ? recurringFrequency.getMode() : null));
        RecurringFrequency recurringFrequency2 = this.f38748d0;
        Pair pairM90091to4 = TuplesKt.m90091to("date", C27041f.m66668h(recurringFrequency2 != null ? recurringFrequency2.getDisplayDayOfMonth() : null));
        RecurringFrequency recurringFrequency3 = this.f38748d0;
        C43852m.m96590b("B7RecurringBuyOrder", "button", "1", pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, TuplesKt.m90091to("time", C27041f.m66668h(recurringFrequency3 != null ? recurringFrequency3.getDisplayTimeOfDay() : null)));
    }

    /* JADX INFO: renamed from: E4 */
    private final void m46747E4(boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        if (z11) {
            C37638j1 c37638j1M46792X3 = m46792X3();
            if (c37638j1M46792X3 != null && (baseTextView4 = c37638j1M46792X3.f84090l) != null) {
                baseTextView4.setTextColor(getColorRes(R$color.brandRed));
            }
            C37638j1 c37638j1M46792X4 = m46792X3();
            if (c37638j1M46792X4 == null || (baseTextView3 = c37638j1M46792X4.f84091m) == null) {
                return;
            }
            baseTextView3.setTextColor(getColorRes(R$color.brandRed));
            return;
        }
        C37638j1 c37638j1M46792X5 = m46792X3();
        if (c37638j1M46792X5 != null && (baseTextView2 = c37638j1M46792X5.f84090l) != null) {
            baseTextView2.setTextColor(getColorRes(R$color.c_text40));
        }
        C37638j1 c37638j1M46792X6 = m46792X3();
        if (c37638j1M46792X6 == null || (baseTextView = c37638j1M46792X6.f84091m) == null) {
            return;
        }
        baseTextView.setTextColor(getColorRes(R$color.c_text40));
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m46765Y3() {
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            this.f38749e0 = (FastTradeVM) new ViewModelProvider(fragmentRequireParentFragment, c45071b).get(FastTradeVM.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastBuyFragment init FastTradeViewModel", false, null, 8, null), null, 2, null);
            preformBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final Unit m46769c4() throws JSONException {
        H5Helper.f39544a.m48245a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "buy");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7FastTrade", "otcLarge", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m46770d4(FastBuyFragment fastBuyFragment) {
        FastBuyCryptoCurrencyDialog.Companion companion = FastBuyCryptoCurrencyDialog.f38730v0;
        FragmentManager childFragmentManager = fastBuyFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, fastBuyFragment.f38743Y);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public static final Unit m46771e4(FastBuyFragment fastBuyFragment, C37638j1 c37638j1) {
        String strM66668h;
        if (fastBuyFragment.f38747c0 == null) {
            fastBuyFragment.m46775i4();
            return Unit.INSTANCE;
        }
        if (fastBuyFragment.f38745a0) {
            if (Intrinsics.areEqual(fastBuyFragment.f38744Z, "FIAT")) {
                TradingPairInfo.Response response = fastBuyFragment.f38747c0;
                strM66668h = C27041f.m66668h(response != null ? response.getFiatMaxAmount() : null);
            } else {
                TradingPairInfo.Response response2 = fastBuyFragment.f38747c0;
                strM66668h = C27041f.m66668h(response2 != null ? response2.getCryptoMaxAmount() : null);
            }
            FastTradeTextView fastTradeTextViewM47155j = c37638j1.f84086h.m47155j();
            if (fastTradeTextViewM47155j != null) {
                fastTradeTextViewM47155j.setAmount(strM66668h);
            }
            return Unit.INSTANCE;
        }
        OtcDepend otcDepend = OtcDepend.f38138a;
        OtcDepend.m45451d(otcDepend, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.payment.fasttrade.buy.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyFragment.m46772f4();
            }
        }), 1, null);
        if (otcDepend.m45466o()) {
            ((FastBuyVM) fastBuyFragment.m45647o3()).m46811G();
            fastBuyFragment.m46743C4();
            return Unit.INSTANCE;
        }
        IPaymentTrack.f40346a.getTrack().mo49802j("NOT_LOGIN", false, "-10002:NOT_LOGIN", new FastTrackData("buy", null, 2, null));
        fastBuyFragment.m46743C4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m46772f4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    private final void m46773g4() {
        FastTradeInputView fastTradeInputView;
        FastSymbol f38723a0;
        FastSymbol f38723a1;
        Bundle bundle = new Bundle();
        bundle.putString(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING);
        String str = this.f38742X;
        FastTradeVM fastTradeVM = this.f38749e0;
        String strLegalIcon = (fastTradeVM == null || (f38723a1 = fastTradeVM.getF38723a0()) == null) ? null : f38723a1.legalIcon(this.f38742X);
        String str2 = this.f38743Y;
        FastTradeVM fastTradeVM2 = this.f38749e0;
        String strCoinIcon = (fastTradeVM2 == null || (f38723a0 = fastTradeVM2.getF38723a0()) == null) ? null : f38723a0.coinIcon(this.f38743Y);
        C37638j1 c37638j1M46792X3 = m46792X3();
        bundle.putParcelable("data", new ExtraParams("BUY", this.f38744Z, str, strLegalIcon, str2, strCoinIcon, C27041f.m66668h((c37638j1M46792X3 == null || (fastTradeInputView = c37638j1M46792X3.f84086h) == null) ? null : fastTradeInputView.m47153f()), this.f38746b0, this.f38748d0, null, 512, null));
        Intent intent = new Intent(m45646n3(), (Class<?>) BaseActivity.class);
        intent.putExtra("fragment", PaymentMethodFragment.class.getName());
        intent.putExtra("spm", C43852m.m96602n("B7FastTrade", "button", null, 4, null));
        intent.putExtras(bundle);
        startActivityWithResult(intent, new Consumer() { // from class: com.kubi.payment.fasttrade.buy.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FastBuyFragment.m46774h4(this.f38765b, (Intent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m46774h4(FastBuyFragment fastBuyFragment, Intent intent) {
        String strM56280w;
        FastTradeInputView fastTradeInputView;
        FastTradeInputView fastTradeInputView2;
        if (intent == null || (strM56280w = RouteExKt.m56280w(intent, "data")) == null) {
            return;
        }
        fastBuyFragment.f38744Z = "FIAT";
        C37638j1 c37638j1M46792X3 = fastBuyFragment.m46792X3();
        if (c37638j1M46792X3 != null && (fastTradeInputView2 = c37638j1M46792X3.f84086h) != null) {
            fastTradeInputView2.setQuoteType(fastBuyFragment.f38744Z);
        }
        C37638j1 c37638j1M46792X4 = fastBuyFragment.m46792X3();
        if (c37638j1M46792X4 == null || (fastTradeInputView = c37638j1M46792X4.f84086h) == null) {
            return;
        }
        fastTradeInputView.setAmount(strM56280w);
    }

    /* JADX INFO: renamed from: n4 */
    private final void m46780n4(String str) {
        if (Intrinsics.areEqual(this.f38743Y, str)) {
            return;
        }
        this.f38743Y = str;
        m46745D4();
        m46786t4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    private final void m46781o4(String str) {
        C44128b.m97259c("payment", "FastBuyFragment onFiatCurrencyChanged newFiatCurrency:" + str + ",fiatCurrency:" + this.f38742X);
        if (Intrinsics.areEqual(this.f38742X, str)) {
            return;
        }
        this.f38742X = str;
        FastBuyVM fastBuyVM = (FastBuyVM) m45647o3();
        FastTradeVM fastTradeVM = this.f38749e0;
        fastBuyVM.m46812H(fastTradeVM != null ? fastTradeVM.getF38723a0() : null, this.f38742X);
        m46786t4();
    }

    /* JADX INFO: renamed from: p4 */
    private final void m46782p4(RecurringFrequency recurringFrequency) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView;
        this.f38748d0 = recurringFrequency;
        com.kubi.payment.fast.buy.recurring.l lVar = com.kubi.payment.fast.buy.recurring.l.a;
        String strC = lVar.c(m45646n3(), recurringFrequency);
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 != null && (baseTextView = c37638j1M46792X3.f84092n) != null) {
            baseTextView.setText(strC);
        }
        boolean zG = lVar.g(recurringFrequency);
        this.f38746b0 = zG;
        if (zG) {
            C37638j1 c37638j1M46792X4 = m46792X3();
            if (c37638j1M46792X4 == null || (appCompatImageView2 = c37638j1M46792X4.f84083e) == null) {
                return;
            }
            C27046k.m66700o(appCompatImageView2);
            return;
        }
        C37638j1 c37638j1M46792X5 = m46792X3();
        if (c37638j1M46792X5 == null || (appCompatImageView = c37638j1M46792X5.f84083e) == null) {
            return;
        }
        C27046k.m66685H(appCompatImageView);
    }

    /* JADX INFO: renamed from: q4 */
    private final void m46783q4() {
        C43852m.m96591c("B7FastTrade", "toRecurringBuy", "1", null, 8, null);
        TradingPairInfo.Response response = this.f38747c0;
        if (C27025c.m66566d(response != null ? response.getHasRecurringPlan() : null)) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(getStringRes(R$string.payment_investment_plan_title, this.f38743Y)).m54153J4(R$string.payment_investment_plan_content).m54159P4(R$string.payment_investment_view_plan, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.buy.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    FastBuyFragment.m46784r4(this.f38763b, dialogInterface, i11);
                }
            }).m54162S4(R$string.payment_investment_contine_one, null).m54172c5(getChildFragmentManager());
            return;
        }
        TradingPairInfo.Response response2 = this.f38747c0;
        if (C27025c.m66566d(response2 != null ? response2.isSupportRecurring() : null)) {
            RecurringFrequencyDialog.Companion companion = RecurringFrequencyDialog.S0;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RecurringFrequencyDialog.Companion.showRecurringFrequencyDialog$default(companion, childFragmentManager, false, this.f38748d0, new Function1() { // from class: com.kubi.payment.fasttrade.buy.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FastBuyFragment.m46785s4(this.f38764b, (RecurringFrequency) obj);
                }
            }, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m46784r4(FastBuyFragment fastBuyFragment, DialogInterface dialogInterface, int i11) {
        TradingPairInfo.Response response = fastBuyFragment.f38747c0;
        FlutterNavigationHelper.f39477a.m48166e(C27041f.m66668h(response != null ? response.getRecurringId() : null));
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m46785s4(FastBuyFragment fastBuyFragment, RecurringFrequency it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96590b("B7RecurringBuyDesign", "confirm", "1", TuplesKt.m90091to("fiat", fastBuyFragment.f38742X), TuplesKt.m90091to("coin", fastBuyFragment.f38743Y), TuplesKt.m90091to("frequency", it.getMode()), TuplesKt.m90091to("date", C27041f.m66668h(it.getDisplayDayOfMonth())), TuplesKt.m90091to("time", C27041f.m66668h(it.getDisplayTimeOfDay())));
        fastBuyFragment.m46782p4(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    private final void m46786t4() {
        FastTradeInputView fastTradeInputView;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        this.f38744Z = "FIAT";
        this.f38747c0 = null;
        m46741B4();
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 != null && (baseTextView2 = c37638j1M46792X3.f84090l) != null) {
            C27046k.m66700o(baseTextView2);
        }
        C37638j1 c37638j1M46792X4 = m46792X3();
        if (c37638j1M46792X4 != null && (baseTextView = c37638j1M46792X4.f84091m) != null) {
            C27046k.m66700o(baseTextView);
        }
        C37638j1 c37638j1M46792X5 = m46792X3();
        if (c37638j1M46792X5 != null && (linearLayout = c37638j1M46792X5.f84087i) != null) {
            C27046k.m66700o(linearLayout);
        }
        C37638j1 c37638j1M46792X6 = m46792X3();
        if (c37638j1M46792X6 != null && (fastTradeInputView = c37638j1M46792X6.f84086h) != null) {
            fastTradeInputView.setQuoteType(this.f38744Z);
            fastTradeInputView.m47154i(this.f38742X, this.f38743Y);
        }
        m46775i4();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX INFO: renamed from: u4 */
    private final void m46787u4(TradingPairInfo.Response response) {
        LinearLayout linearLayout;
        C37638j1 c37638j1M46792X3;
        BaseTextView baseTextView;
        LinearLayout linearLayout2;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView2;
        this.f38747c0 = response;
        if (C27025c.m66566d(response != null ? response.isSupportRecurring() : null)) {
            if (this.f38748d0 == null) {
                m46741B4();
                c37638j1M46792X3 = m46792X3();
                if (c37638j1M46792X3 != null && (baseTextView = c37638j1M46792X3.f84092n) != null) {
                    baseTextView.setText(getStringRes(R$string.payment_fast_trade_onetime_purchase, new Object[0]));
                }
            } else {
                TradingPairInfo.Response response2 = this.f38747c0;
                if (C27025c.m66566d(response2 != null ? response2.getHasRecurringPlan() : null)) {
                    m46741B4();
                    c37638j1M46792X3 = m46792X3();
                    if (c37638j1M46792X3 != null) {
                        baseTextView.setText(getStringRes(R$string.payment_fast_trade_onetime_purchase, new Object[0]));
                    }
                } else {
                    C37638j1 c37638j1M46792X4 = m46792X3();
                    if (c37638j1M46792X4 != null && (baseTextView2 = c37638j1M46792X4.f84092n) != null) {
                        baseTextView2.setText(com.kubi.payment.fast.buy.recurring.l.a.c(m45646n3(), this.f38748d0));
                    }
                    C37638j1 c37638j1M46792X5 = m46792X3();
                    if (c37638j1M46792X5 != null && (appCompatImageView = c37638j1M46792X5.f84083e) != null) {
                        C27046k.m66685H(appCompatImageView);
                    }
                }
            }
            C37638j1 c37638j1M46792X6 = m46792X3();
            if (c37638j1M46792X6 != null && (linearLayout2 = c37638j1M46792X6.f84087i) != null) {
                C27046k.m66685H(linearLayout2);
            }
        } else {
            m46741B4();
            C37638j1 c37638j1M46792X7 = m46792X3();
            if (c37638j1M46792X7 != null && (linearLayout = c37638j1M46792X7.f84087i) != null) {
                C27046k.m66700o(linearLayout);
            }
        }
        m46788w4();
        m46789x4();
        m46791W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public final void m46788w4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 != null && (baseTextView8 = c37638j1M46792X3.f84090l) != null) {
            C27046k.m66685H(baseTextView8);
        }
        C37638j1 c37638j1M46792X4 = m46792X3();
        if (c37638j1M46792X4 != null && (baseTextView7 = c37638j1M46792X4.f84091m) != null) {
            C27046k.m66685H(baseTextView7);
        }
        if (Intrinsics.areEqual(this.f38744Z, "FIAT")) {
            TradingPairInfo.Response response = this.f38747c0;
            String strM66668h = C27041f.m66668h(response != null ? response.getFiatMinAmount() : null);
            TradingPairInfo.Response response2 = this.f38747c0;
            String strM66668h2 = C27041f.m66668h(response2 != null ? response2.getFiatMaxAmount() : null);
            C37638j1 c37638j1M46792X5 = m46792X3();
            if (c37638j1M46792X5 != null && (baseTextView6 = c37638j1M46792X5.f84090l) != null) {
                int i11 = R$string.payment_limit_tip;
                BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(strM66668h, null, 1, null);
                TradingPairInfo.Response response3 = this.f38747c0;
                String strM92647l = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e, null, C27039d.m66651k(response3 != null ? response3.getFiatPrecision() : null, 2), false, false, false, 0, null, 125, null));
                BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(strM66668h2, null, 1, null);
                TradingPairInfo.Response response4 = this.f38747c0;
                baseTextView6.setText(getStringRes(i11, strM92647l, C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e2, null, C27039d.m66651k(response4 != null ? response4.getFiatPrecision() : null, 2), false, false, false, 0, null, 125, null)), this.f38742X));
            }
            if (strM66668h.length() == 0 || strM66668h2.length() == 0) {
                C37638j1 c37638j1M46792X6 = m46792X3();
                if (c37638j1M46792X6 != null && (baseTextView5 = c37638j1M46792X6.f84090l) != null) {
                    C27046k.m66700o(baseTextView5);
                }
                C37638j1 c37638j1M46792X7 = m46792X3();
                if (c37638j1M46792X7 != null && (baseTextView4 = c37638j1M46792X7.f84091m) != null) {
                    C27046k.m66700o(baseTextView4);
                }
            }
        } else {
            TradingPairInfo.Response response5 = this.f38747c0;
            String strM66668h3 = C27041f.m66668h(response5 != null ? response5.getCryptoMinAmount() : null);
            TradingPairInfo.Response response6 = this.f38747c0;
            String strM66668h4 = C27041f.m66668h(response6 != null ? response6.getCryptoMaxAmount() : null);
            C37638j1 c37638j1M46792X8 = m46792X3();
            if (c37638j1M46792X8 != null && (baseTextView3 = c37638j1M46792X8.f84090l) != null) {
                int i12 = R$string.payment_limit_tip;
                BigDecimal bigDecimalM66535e3 = DowngradeExKt.m66535e(strM66668h3, null, 1, null);
                TradingPairInfo.Response response7 = this.f38747c0;
                String strM92647l2 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e3, null, C27039d.m66651k(response7 != null ? response7.getCryptoPrecision() : null, 8), false, false, false, 0, null, 125, null));
                BigDecimal bigDecimalM66535e4 = DowngradeExKt.m66535e(strM66668h4, null, 1, null);
                TradingPairInfo.Response response8 = this.f38747c0;
                baseTextView3.setText(getStringRes(i12, strM92647l2, C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e4, null, C27039d.m66651k(response8 != null ? response8.getCryptoPrecision() : null, 8), false, false, false, 0, null, 125, null)), this.f38743Y));
            }
            if (strM66668h3.length() == 0 || strM66668h4.length() == 0) {
                C37638j1 c37638j1M46792X9 = m46792X3();
                if (c37638j1M46792X9 != null && (baseTextView2 = c37638j1M46792X9.f84090l) != null) {
                    C27046k.m66700o(baseTextView2);
                }
                C37638j1 c37638j1M46792X10 = m46792X3();
                if (c37638j1M46792X10 != null && (baseTextView = c37638j1M46792X10.f84091m) != null) {
                    C27046k.m66700o(baseTextView);
                }
            }
        }
        m46747E4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public final void m46789x4() {
        FastTradeInputView fastTradeInputView;
        FastTradeTextView fastTradeTextViewM47155j;
        FastTradeInputView fastTradeInputView2;
        FastTradeTextView fastTradeTextViewM47155j2;
        if (Intrinsics.areEqual(this.f38744Z, "FIAT")) {
            C37638j1 c37638j1M46792X3 = m46792X3();
            if (c37638j1M46792X3 == null || (fastTradeInputView2 = c37638j1M46792X3.f84086h) == null || (fastTradeTextViewM47155j2 = fastTradeInputView2.m47155j()) == null) {
                return;
            }
            TradingPairInfo.Response response = this.f38747c0;
            fastTradeTextViewM47155j2.setPrecision(C27039d.m66651k(response != null ? response.getFiatPrecision() : null, 2));
            return;
        }
        C37638j1 c37638j1M46792X4 = m46792X3();
        if (c37638j1M46792X4 == null || (fastTradeInputView = c37638j1M46792X4.f84086h) == null || (fastTradeTextViewM47155j = fastTradeInputView.m47155j()) == null) {
            return;
        }
        TradingPairInfo.Response response2 = this.f38747c0;
        fastTradeTextViewM47155j.setPrecision(C27039d.m66651k(response2 != null ? response2.getCryptoPrecision() : null, 8));
    }

    /* JADX INFO: renamed from: X3 */
    public final C37638j1 m46792X3() {
        return (C37638j1) this.f38741W.getValue(this, f38740g0[0]);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        preCheckHelper.m48242m(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_new;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m46794y4() {
        FastSymbol f38723a0;
        SelectLabelDialogView.Companion companion = SelectLabelDialogView.f38176v0;
        FastTradeVM fastTradeVM = this.f38749e0;
        DialogFragmentHelper dialogFragmentHelperNewInstance$default = SelectLabelDialogView.Companion.newInstance$default(companion, C27024b.m66560c((fastTradeVM == null || (f38723a0 = fastTradeVM.getF38723a0()) == null) ? null : f38723a0.selectLegals(this.f38742X)), new BiConsumer() { // from class: com.kubi.payment.fasttrade.buy.h
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                FastBuyFragment.m46790z4(this.f38766b, (BaseViewHolder) obj, (SelectLabel) obj2);
            }
        }, null, 4, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance$default.show(childFragmentManager, "payment_fast_buy_select_fiat_currency");
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<FastBuyVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(FastBuyVM.class);
    }

    /* JADX INFO: renamed from: D4 */
    private final void m46745D4() {
        AppCompatImageView appCompatImageView;
        String strCoinIcon;
        FastSymbol f38723a0;
        BaseTextView baseTextView;
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 != null && (baseTextView = c37638j1M46792X3.f84089k) != null) {
            baseTextView.setText(this.f38743Y);
        }
        C37638j1 c37638j1M46792X4 = m46792X3();
        if (c37638j1M46792X4 != null && (appCompatImageView = c37638j1M46792X4.f84080b) != null) {
            Context contextM45646n3 = m45646n3();
            FastTradeVM fastTradeVM = this.f38749e0;
            if (fastTradeVM != null && (f38723a0 = fastTradeVM.getF38723a0()) != null) {
                strCoinIcon = f38723a0.coinIcon(this.f38743Y);
            } else {
                strCoinIcon = null;
            }
            C24277v.m58540e(contextM45646n3, strCoinIcon, appCompatImageView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    private final void m46766Z3() {
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
            strM66668h = C46392a.m102326h(PaymentStorageId.f40364a.m49827e(), "");
        }
        if (strM66668h.length() == 0) {
            FastTradeVM fastTradeVM = this.f38749e0;
            if (fastTradeVM != null && (liveDataM46723z = fastTradeVM.m46723z()) != null) {
                value = liveDataM46723z.getValue();
            } else {
                value = null;
            }
            String strM66668h2 = C27041f.m66668h(value);
            FastTradeVM fastTradeVM2 = this.f38749e0;
            if (fastTradeVM2 != null && (f38723a0 = fastTradeVM2.getF38723a0()) != null) {
                strFirstCoin = f38723a0.firstCoin(strM66668h2);
            }
            strM66668h = C27041f.m66668h(strFirstCoin);
        }
        ((FastBuyVM) m45647o3()).m46813I(strM66668h);
        C44128b.m97259c("payment", "Payment FastBuyFragment initViews tempCryptoCurrency " + strM66668h);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m46767a4(FastBuyFragment fastBuyFragment) {
        fastBuyFragment.m46783q4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m46768b4(FastBuyFragment fastBuyFragment) {
        fastBuyFragment.m46739A4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m46776j4(FastBuyFragment fastBuyFragment, String str) {
        Intrinsics.checkNotNull(str);
        fastBuyFragment.m46781o4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m46777k4(FastBuyFragment fastBuyFragment, String str) {
        Intrinsics.checkNotNull(str);
        fastBuyFragment.m46780n4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m46778l4(FastBuyFragment fastBuyFragment, TradingPairInfo.Response response) {
        Intrinsics.checkNotNull(response);
        fastBuyFragment.m46787u4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m46779m4(FastBuyFragment fastBuyFragment, FiatUserInfo fiatUserInfo) {
        if (fiatUserInfo.isHighKyc()) {
            fastBuyFragment.m46773g4();
        } else {
            InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m46790z4(FastBuyFragment fastBuyFragment, BaseViewHolder baseViewHolder, SelectLabel selectLabel) throws JSONException {
        String strM66668h = C27041f.m66668h(selectLabel.getValue());
        if (strM66668h.length() == 0) {
            return;
        }
        FastTradeVM fastTradeVM = fastBuyFragment.f38749e0;
        if (fastTradeVM != null) {
            fastTradeVM.m46722D(strM66668h, true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fiat", strM66668h);
        jSONObject.put("type", "buy");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7FastTrade", "fiatSelector", "1", jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final void m46791W3() {
        String strM47153f;
        boolean z11;
        String cryptoMaxAmount;
        boolean z12;
        String fiatMaxAmount;
        FastTradeInputView fastTradeInputView;
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 != null && (fastTradeInputView = c37638j1M46792X3.f84086h) != null) {
            strM47153f = fastTradeInputView.m47153f();
        } else {
            strM47153f = null;
        }
        String strM66669i = C27041f.m66669i(strM47153f, "0");
        C44128b.m97259c("payment", "FastBuyFragment onAmountChanged amount:" + strM66669i);
        boolean z13 = true;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(strM66669i, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM66535e.compareTo(bigDecimal) <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (Intrinsics.areEqual(this.f38744Z, "FIAT")) {
            if (z11) {
                TradingPairInfo.Response response = this.f38747c0;
                if (response != null) {
                    fiatMaxAmount = response.getFiatMaxAmount();
                } else {
                    fiatMaxAmount = null;
                }
                if (DowngradeExKt.m66535e(fiatMaxAmount, null, 1, null).compareTo(bigDecimal) > 0) {
                    z12 = true;
                }
            }
            z12 = false;
        } else {
            if (z11) {
                TradingPairInfo.Response response2 = this.f38747c0;
                if (response2 != null) {
                    cryptoMaxAmount = response2.getCryptoMaxAmount();
                } else {
                    cryptoMaxAmount = null;
                }
                if (DowngradeExKt.m66535e(cryptoMaxAmount, null, 1, null).compareTo(bigDecimal) > 0) {
                    z12 = true;
                }
            }
            z12 = false;
        }
        boolean zM46809E = ((FastBuyVM) m45647o3()).m46809E(this.f38744Z, strM66669i, this.f38747c0);
        if (zM46809E || z12) {
            z13 = false;
        }
        m46747E4(z13);
        m46793v4(z12, zM46809E);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m46765Y3();
        m46766Z3();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C46392a.m102333p(PaymentStorageId.f40364a.m49827e(), this.f38743Y);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C44128b.m97259c("payment", "FastBuyFragment onResume");
        m46775i4();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        final C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 == null) {
            return;
        }
        LinearLayout layoutRecurring = c37638j1M46792X3.f84087i;
        Intrinsics.checkNotNullExpressionValue(layoutRecurring, "layoutRecurring");
        C27046k.m66711z(layoutRecurring, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.buy.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyFragment.m46767a4(this.f38770b);
            }
        }, 1, null);
        AppCompatImageView ivRecurringQuestion = c37638j1M46792X3.f84083e;
        Intrinsics.checkNotNullExpressionValue(ivRecurringQuestion, "ivRecurringQuestion");
        C27046k.m66711z(ivRecurringQuestion, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.buy.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyFragment.m46768b4(this.f38771b);
            }
        }, 1, null);
        c37638j1M46792X3.f84091m.getPaint().setFlags(8);
        c37638j1M46792X3.f84091m.getPaint().setAntiAlias(true);
        BaseTextView tvNeedHigherLimits = c37638j1M46792X3.f84091m;
        Intrinsics.checkNotNullExpressionValue(tvNeedHigherLimits, "tvNeedHigherLimits");
        C27046k.m66711z(tvNeedHigherLimits, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.buy.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyFragment.m46769c4();
            }
        }, 1, null);
        FastTradeInputView fastTradeInputView = c37638j1M46792X3.f84086h;
        fastTradeInputView.setTradeType("BUY");
        fastTradeInputView.setQuoteType(this.f38744Z);
        fastTradeInputView.setFastInputListener(new C20557a(fastTradeInputView));
        FastTradeTextView fastTradeTextViewM47155j = c37638j1M46792X3.f84086h.m47155j();
        if (fastTradeTextViewM47155j != null) {
            c37638j1M46792X3.f84084f.addListener(fastTradeTextViewM47155j);
            fastTradeTextViewM47155j.registerListener(new C20558b());
        }
        ConstraintLayout layoutCryptoCurrency = c37638j1M46792X3.f84085g;
        Intrinsics.checkNotNullExpressionValue(layoutCryptoCurrency, "layoutCryptoCurrency");
        C27046k.m66711z(layoutCryptoCurrency, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.buy.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyFragment.m46770d4(this.f38772b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c37638j1M46792X3.f84088j;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.buy.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyFragment.m46771e4(this.f38773b, c37638j1M46792X3);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        LiveData<String> liveDataM46723z;
        super.mo45650r3();
        FastTradeVM fastTradeVM = this.f38749e0;
        if (fastTradeVM != null && (liveDataM46723z = fastTradeVM.m46723z()) != null) {
            liveDataM46723z.observe(getViewLifecycleOwner(), new C20559c(new Function1() { // from class: com.kubi.payment.fasttrade.buy.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FastBuyFragment.m46776j4(this.f38762b, (String) obj);
                }
            }));
        }
        ((FastBuyVM) m45647o3()).m46806B().observe(getViewLifecycleOwner(), new C20559c(new Function1() { // from class: com.kubi.payment.fasttrade.buy.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastBuyFragment.m46777k4(this.f38767b, (String) obj);
            }
        }));
        ((FastBuyVM) m45647o3()).m46807C().observe(getViewLifecycleOwner(), new C20559c(new Function1() { // from class: com.kubi.payment.fasttrade.buy.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastBuyFragment.m46778l4(this.f38768b, (TradingPairInfo.Response) obj);
            }
        }));
        ((FastBuyVM) m45647o3()).m46808D().observe(getViewLifecycleOwner(), new C20559c(new Function1() { // from class: com.kubi.payment.fasttrade.buy.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastBuyFragment.m46779m4(this.f38769b, (FiatUserInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m46793v4(boolean z11, boolean z12) {
        KcPrimaryButton kcPrimaryButton;
        String strM47153f;
        FastTradeInputView fastTradeInputView;
        C37638j1 c37638j1M46792X3 = m46792X3();
        if (c37638j1M46792X3 != null && (kcPrimaryButton = c37638j1M46792X3.f84088j) != null) {
            this.f38745a0 = z11;
            boolean z13 = true;
            if (z11) {
                kcPrimaryButton.setText(getStringRes(R$string.payment_fast_buy_max_amount, new Object[0]));
                kcPrimaryButton.setEnabled(true);
                return;
            }
            C37638j1 c37638j1M46792X4 = m46792X3();
            if (c37638j1M46792X4 != null && (fastTradeInputView = c37638j1M46792X4.f84086h) != null) {
                strM47153f = fastTradeInputView.m47153f();
            } else {
                strM47153f = null;
            }
            String strM66669i = C27041f.m66669i(strM47153f, "0");
            kcPrimaryButton.setText(getStringRes(R$string.payemnt_fast_select_method, new Object[0]));
            if (!z12 || DowngradeExKt.m66535e(strM66669i, null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
                z13 = false;
            }
            kcPrimaryButton.setEnabled(z13);
        }
    }
}
