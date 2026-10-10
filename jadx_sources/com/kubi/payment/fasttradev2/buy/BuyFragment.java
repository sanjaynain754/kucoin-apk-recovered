package com.kubi.payment.fasttradev2.buy;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
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
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.buy.recurring.RecurringFrequencyDialog;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.fast.data.entities.TradingPairInfo;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.payment.fasttrade.widget.FastTradeTextView;
import com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodDialog;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.helper.H5Helper;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Map;
import lt.C42300e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p270ft.C37673q1;
import p429lf.C42180b;
import p477nt.C42876i;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
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
import p852kotlin.text.StringsKt;
import ro.C44128b;
import tt.C45070a;
import tt.C45071b;
import w00.C45681e;

/* JADX INFO: compiled from: BuyFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u001a\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u001c\u0010+\u001a\u00020\u001f2\b\b\u0002\u0010,\u001a\u00020\u00122\b\b\u0002\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u0012H\u0002J\f\u00100\u001a\u00020\u001f*\u00020\u0006H\u0002J\b\u00101\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u00020\u0012H\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\fH\u0002J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020\u001fH\u0002J\b\u0010<\u001a\u00020\u0010H\u0002J\b\u0010=\u001a\u00020\u001fH\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020\u001fH\u0014J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u001fH\u0002J\b\u0010D\u001a\u00020\u001fH\u0002J\u0010\u0010E\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010F\u001a\u00020\u001fH\u0002J\u0012\u0010G\u001a\u00020\u001f2\b\u0010H\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010I\u001a\u00020\u001fH\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020KH\u0016J\b\u0010L\u001a\u00020MH\u0016J\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100OR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006Q"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/BuyFragment;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "Lcom/kubi/payment/fasttradev2/buy/BuyVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastTradeBuyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastTradeBuyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "cryptoCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "quoteType", "", "isAddNewCard", "", "showLimit", "selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;", "isOneTimePurchaseMode", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "fastTradeViewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "showHigherLimited", "getShowHigherLimited", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initParentVM", "initTradingPair", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindEvent", "initViews", "paymentMethodJsonObject", "Lorg/json/JSONObject;", "loadPaymentMethodList", "isSelectedPaymentMethod", "refreshBankCard", "preCheck", "canBuyMax", "refreshConfirm", "zenNeedBind", "canPreviewOrder", "checkAmount", "refreshEstimated", "refreshLimit", "refreshLimitContent", "onFiatCurrencyChanged", "newFiatCurrency", "onCryptoCurrencyChanged", "newCryptoCurrency", "onTradingPairChanged", "amount", "updateCryptoCurrencyUI", "updateRecurringUI", "observeData", "onRecurringUIClick", "recurringInfo", "Lcom/kubi/payment/fast/data/entities/TradingPairInfo$Response;", "switchOneTimePurchaseMode", "refreshPrecision", "onRecurringSelected", "showRecurringExplainDialog", "onSelectedPaymentMethodChanged", "newPaymentMethod", "onResume", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "getParameters", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyFragment.kt\ncom/kubi/payment/fasttradev2/buy/BuyFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,800:1\n147#2,16:801\n17#3,2:817\n44#4,2:819\n76#5,7:821\n76#5,7:828\n*S KotlinDebug\n*F\n+ 1 BuyFragment.kt\ncom/kubi/payment/fasttradev2/buy/BuyFragment\n*L\n80#1:801,16\n129#1:817,2\n149#1:819,2\n175#1:821,7\n181#1:828,7\n*E\n"})
public final class BuyFragment extends BaseFastFragment<BuyVM> {

    /* JADX INFO: renamed from: X */
    @Nullable
    public FastTradeFiatCurrency.Response f39026X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public FastTradeCryptoCurrency.Response f39027Y;

    /* JADX INFO: renamed from: a0 */
    public boolean f39029a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f39030b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public BuyPaymentMethod.Response.PaymentMethod f39031c0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public RecurringFrequency f39033e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public FastTradeViewModel f39034f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f39035g0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f39024i0 = {Reflection.property1(new PropertyReference1Impl(BuyFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastTradeBuyBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f39023h0 = new Companion(null);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f39025W = C45681e.m100799e(this, new Function1<BuyFragment, C37673q1>() { // from class: com.kubi.payment.fasttradev2.buy.BuyFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37673q1 invoke(@NotNull BuyFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37673q1.m84932a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37673q1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.BuyFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37673q1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37673q1 c37673q1) {
            invoke(c37673q1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f39028Z = "FIAT";

    /* JADX INFO: renamed from: d0 */
    public boolean f39032d0 = true;

    /* JADX INFO: compiled from: BuyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/BuyFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/fasttradev2/buy/BuyFragment;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BuyFragment newInstance() {
            return new BuyFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.BuyFragment$a */
    /* JADX INFO: compiled from: BuyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/BuyFragment$initViews$4$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$OnFastInputListener;", "onQuoteTypeChanged", "", "quoteType", "", "onSelectFiatCurrencyClicked", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20708a implements FastTradeInputView.InterfaceC20679a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FastTradeInputView f39037b;

        public C20708a(FastTradeInputView fastTradeInputView) {
            this.f39037b = fastTradeInputView;
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: a */
        public void mo46795a() {
            FastTradeFiatSelectDialog.Companion companion = FastTradeFiatSelectDialog.f38982v0;
            FragmentManager childFragmentManager = BuyFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, "BUY");
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: b */
        public void mo46796b(String quoteType) {
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            C44128b.m97259c("payment", "BuyFragment onQuoteTypeChanged quoteType:" + quoteType);
            BuyFragment.this.f39028Z = quoteType;
            FastTradeInputView fastTradeInputView = this.f39037b;
            FastTradeFiatCurrency.Response response = BuyFragment.this.f39026X;
            String strM66668h = C27041f.m66668h(response != null ? response.getTitle() : null);
            FastTradeCryptoCurrency.Response response2 = BuyFragment.this.f39027Y;
            fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(response2 != null ? response2.getTitle() : null));
            BuyFragment.this.m47371R4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.BuyFragment$b */
    /* JADX INFO: compiled from: BuyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/BuyFragment$initViews$5$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$OnTextChangeListener;", "onTextChange", "", "text", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20709b implements FastTradeTextView.InterfaceC20680a {
        public C20709b() {
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeTextView.InterfaceC20680a
        /* JADX INFO: renamed from: a */
        public void mo46797a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            BuyFragment.this.m47387f4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.BuyFragment$c */
    /* JADX INFO: compiled from: BuyFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20710c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39039b;

        public C20710c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39039b = function;
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
            return this.f39039b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39039b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static final boolean m47354I4(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public final void m47375T4() {
        ConstraintLayout constraintLayout;
        AppCompatImageView appCompatImageView;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView;
        this.f39032d0 = true;
        this.f39033e0 = null;
        FastTradeCryptoCurrency.Response response = this.f39027Y;
        if (C27025c.m66566d(response != null ? response.isSupportRecurring() : null)) {
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 != null && (baseTextView = c37673q1M47414h4.f84448y) != null) {
                baseTextView.setText(getStringRes(R$string.payment_fast_trade_onetime_purchase, new Object[0]));
            }
            C37673q1 c37673q1M47414h5 = m47414h4();
            if (c37673q1M47414h5 != null && (constraintLayout2 = c37673q1M47414h5.f84439p) != null) {
                C27046k.m66685H(constraintLayout2);
            }
        } else {
            C37673q1 c37673q1M47414h6 = m47414h4();
            if (c37673q1M47414h6 != null && (constraintLayout = c37673q1M47414h6.f84439p) != null) {
                C27046k.m66700o(constraintLayout);
            }
        }
        C37673q1 c37673q1M47414h7 = m47414h4();
        if (c37673q1M47414h7 == null || (appCompatImageView = c37673q1M47414h7.f84434k) == null) {
            return;
        }
        C27046k.m66700o(appCompatImageView);
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m47391l4(BuyFragment buyFragment) {
        m47399u4(buyFragment, true, false, 2, null);
        C43852m.m96591c("B7FastBuy", "paymentMethod", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m47408H4(BuyPaymentMethod.Response.PaymentMethod paymentMethod) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        final BaseTextView baseTextView3;
        BuyPaymentMethod.Response.PaymentMethod.RewardInfo rewardInfo;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        AppCompatImageView appCompatImageView2;
        this.f39031c0 = paymentMethod;
        if (paymentMethod == null) {
            this.f39029a0 = false;
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 != null && (appCompatImageView2 = c37673q1M47414h4.f84432i) != null) {
                appCompatImageView2.setImageResource(R$drawable.ic2_fund_account_24);
                appCompatImageView2.setImageTintList(ContextCompat.getColorStateList(m45646n3(), R$color.c_text40));
            }
            C37673q1 c37673q1M47414h5 = m47414h4();
            if (c37673q1M47414h5 != null && (baseTextView10 = c37673q1M47414h5.f84447x) != null) {
                baseTextView10.setText(getStringRes(R$string.payment_fast_buy_select_method, new Object[0]));
            }
            C37673q1 c37673q1M47414h6 = m47414h4();
            if (c37673q1M47414h6 != null && (baseTextView9 = c37673q1M47414h6.f84447x) != null) {
                baseTextView9.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text40));
            }
            C37673q1 c37673q1M47414h7 = m47414h4();
            if (c37673q1M47414h7 != null && (baseTextView8 = c37673q1M47414h7.f84449z) != null) {
                C27046k.m66700o(baseTextView8);
            }
            C37673q1 c37673q1M47414h8 = m47414h4();
            if (c37673q1M47414h8 != null && (baseTextView7 = c37673q1M47414h8.f84427d) != null) {
                ViewExtKt.m66577h(baseTextView7);
            }
        } else {
            this.f39029a0 = ((BuyVM) m45647o3()).m47446W(this.f39031c0);
            C37673q1 c37673q1M47414h9 = m47414h4();
            final String fullMessage = null;
            if (c37673q1M47414h9 != null && (appCompatImageView = c37673q1M47414h9.f84432i) != null) {
                Context contextM45646n3 = m45646n3();
                BuyPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f39031c0;
                C24277v.m58540e(contextM45646n3, paymentMethod2 != null ? paymentMethod2.getIconUrl() : null, appCompatImageView);
                appCompatImageView.setImageTintList(null);
            }
            C37673q1 c37673q1M47414h10 = m47414h4();
            if (c37673q1M47414h10 != null && (baseTextView6 = c37673q1M47414h10.f84447x) != null) {
                BuyPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f39031c0;
                baseTextView6.setText(paymentMethod3 != null ? paymentMethod3.getPaymentMethodName() : null);
            }
            C37673q1 c37673q1M47414h11 = m47414h4();
            if (c37673q1M47414h11 != null && (baseTextView5 = c37673q1M47414h11.f84447x) != null) {
                baseTextView5.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text));
            }
            BuyPaymentMethod.Response.PaymentMethod paymentMethod4 = this.f39031c0;
            String strM66668h = C27041f.m66668h(paymentMethod4 != null ? paymentMethod4.getTag() : null);
            if (strM66668h.length() == 0) {
                C37673q1 c37673q1M47414h12 = m47414h4();
                if (c37673q1M47414h12 != null && (baseTextView4 = c37673q1M47414h12.f84449z) != null) {
                    C27046k.m66700o(baseTextView4);
                }
            } else {
                C37673q1 c37673q1M47414h13 = m47414h4();
                if (c37673q1M47414h13 != null && (baseTextView2 = c37673q1M47414h13.f84449z) != null) {
                    baseTextView2.setText(strM66668h);
                }
                C37673q1 c37673q1M47414h14 = m47414h4();
                if (c37673q1M47414h14 != null && (baseTextView = c37673q1M47414h14.f84449z) != null) {
                    C27046k.m66685H(baseTextView);
                }
            }
            C37673q1 c37673q1M47414h15 = m47414h4();
            if (c37673q1M47414h15 != null && (baseTextView3 = c37673q1M47414h15.f84427d) != null) {
                BuyPaymentMethod.Response.PaymentMethod paymentMethod5 = this.f39031c0;
                if (paymentMethod5 != null && (rewardInfo = paymentMethod5.getRewardInfo()) != null) {
                    fullMessage = rewardInfo.getFullMessage();
                }
                C21457l.m49858f(new Function0() { // from class: com.kubi.payment.fasttradev2.buy.q
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(BuyFragment.m47354I4(fullMessage));
                    }
                }, new View[]{baseTextView3}, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.r
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BuyFragment.m47356J4(baseTextView3, fullMessage);
                    }
                });
            }
        }
        m47387f4();
    }

    /* JADX INFO: renamed from: D4 */
    private final void m47346D4(RecurringFrequency recurringFrequency) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView;
        this.f39033e0 = recurringFrequency;
        com.kubi.payment.fast.buy.recurring.l lVar = com.kubi.payment.fast.buy.recurring.l.a;
        String strC = lVar.c(m45646n3(), recurringFrequency);
        C37673q1 c37673q1M47414h4 = m47414h4();
        if (c37673q1M47414h4 != null && (baseTextView = c37673q1M47414h4.f84448y) != null) {
            baseTextView.setText(strC);
        }
        boolean zG = lVar.g(recurringFrequency);
        this.f39032d0 = zG;
        if (zG) {
            m47375T4();
            C37673q1 c37673q1M47414h5 = m47414h4();
            if (c37673q1M47414h5 != null && (appCompatImageView2 = c37673q1M47414h5.f84434k) != null) {
                C27046k.m66700o(appCompatImageView2);
            }
        } else {
            C37673q1 c37673q1M47414h6 = m47414h4();
            if (c37673q1M47414h6 != null && (appCompatImageView = c37673q1M47414h6.f84434k) != null) {
                C27046k.m66685H(appCompatImageView);
            }
        }
        m47415t4(false, false);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m47351G4(BuyFragment buyFragment, RecurringFrequency it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FastTradeFiatCurrency.Response response = buyFragment.f39026X;
        Pair pairM90091to = TuplesKt.m90091to("fiat", C27041f.m66668h(response != null ? response.getTitle() : null));
        FastTradeCryptoCurrency.Response response2 = buyFragment.f39027Y;
        C43852m.m96590b("B7RecurringBuyDesign", "confirm", "1", pairM90091to, TuplesKt.m90091to("coin", C27041f.m66668h(response2 != null ? response2.getTitle() : null)), TuplesKt.m90091to("frequency", it.getMode()), TuplesKt.m90091to("date", C27041f.m66668h(it.getDisplayDayOfMonth())), TuplesKt.m90091to("time", C27041f.m66668h(it.getDisplayTimeOfDay())));
        buyFragment.m47346D4(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    private final JSONObject m47360L4() throws JSONException {
        BuyPaymentMethod.Response.PaymentMethod paymentMethod = this.f39031c0;
        if (paymentMethod == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paymentMethodCode", paymentMethod.getPaymentMethodCode());
        jSONObject.put("channelId", paymentMethod.getChannelId());
        jSONObject.put("pay_fiat_currency", paymentMethod.getFiatCurrency());
        jSONObject.put("pay_crypto_currency", paymentMethod.getCryptoCurrency());
        jSONObject.put("after_page_id", "B7PaymentMethod");
        jSONObject.put("norm_version", "1");
        RecurringFrequency recurringFrequency = this.f39033e0;
        jSONObject.put("recurring_frequency", C27041f.m66668h(recurringFrequency != null ? recurringFrequency.getMode() : null));
        RecurringFrequency recurringFrequency2 = this.f39033e0;
        jSONObject.put("recurring_date", C27041f.m66668h(recurringFrequency2 != null ? recurringFrequency2.getDisplayDayOfMonth() : null));
        RecurringFrequency recurringFrequency3 = this.f39033e0;
        jSONObject.put("recurring_time", C27041f.m66668h(recurringFrequency3 != null ? recurringFrequency3.getDisplayTimeOfDay() : null));
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    private final void m47362M4() {
        if (this.f39031c0 == null) {
            m47399u4(this, false, false, 2, null);
            return;
        }
        BuyVM buyVM = (BuyVM) m45647o3();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        buyVM.m47457h0(childFragmentManager);
        C43852m.m96589a("B7FastBuy", "button", ((BuyVM) m45647o3()).m47446W(this.f39031c0) ? "newCard" : "preview", m47360L4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    private final void m47365O4() {
        BaseTextView baseTextView;
        String strM92640e;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        String strM92640e2;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (this.f39031c0 == null) {
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 == null || (baseTextView6 = c37673q1M47414h4.f84444u) == null) {
                return;
            }
            C27046k.m66700o(baseTextView6);
            return;
        }
        String strM47384b4 = m47384b4();
        if (((BuyVM) m45647o3()).m47448Y(strM47384b4)) {
            C37673q1 c37673q1M47414h5 = m47414h4();
            if (c37673q1M47414h5 == null || (baseTextView5 = c37673q1M47414h5.f84444u) == null) {
                return;
            }
            C27046k.m66700o(baseTextView5);
            return;
        }
        if (this.f39030b0) {
            C37673q1 c37673q1M47414h6 = m47414h4();
            if (c37673q1M47414h6 == null || (baseTextView4 = c37673q1M47414h6.f84444u) == null) {
                return;
            }
            C27046k.m66700o(baseTextView4);
            return;
        }
        BigDecimal bigDecimalM47439P = ((BuyVM) m45647o3()).m47439P(strM47384b4, this.f39028Z);
        C44128b.m97259c("payment", "refreshEstimated estimatedAmount:" + bigDecimalM47439P);
        if (Intrinsics.areEqual(this.f39028Z, "FIAT")) {
            C37673q1 c37673q1M47414h7 = m47414h4();
            if (c37673q1M47414h7 != null && (baseTextView3 = c37673q1M47414h7.f84444u) != null) {
                int i11 = R$string.payment_fast_buy_about;
                if (bigDecimalM47439P != null) {
                    PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
                    FastTradeCryptoCurrency.Response response = this.f39027Y;
                    strM92640e2 = C42180b.m92640e(bigDecimalM47439P, null, precisionHelper.m48247a(C27041f.m66668h(response != null ? response.getTitle() : null)), false, false, false, 0, null, 125, null);
                } else {
                    strM92640e2 = null;
                }
                String strM92647l = C42180b.m92647l(strM92640e2);
                FastTradeCryptoCurrency.Response response2 = this.f39027Y;
                baseTextView3.setText(getStringRes(i11, strM92647l, C27041f.m66668h(response2 != null ? response2.getTitle() : null)));
            }
        } else {
            C37673q1 c37673q1M47414h8 = m47414h4();
            if (c37673q1M47414h8 != null && (baseTextView = c37673q1M47414h8.f84444u) != null) {
                int i12 = R$string.payment_fast_buy_about;
                if (bigDecimalM47439P != null) {
                    PrecisionHelper precisionHelper2 = PrecisionHelper.f39545a;
                    FastTradeFiatCurrency.Response response3 = this.f39026X;
                    strM92640e = C42180b.m92640e(bigDecimalM47439P, null, precisionHelper2.m48248b(C27041f.m66668h(response3 != null ? response3.getTitle() : null)), false, false, false, 0, null, 125, null);
                } else {
                    strM92640e = null;
                }
                String strM92647l2 = C42180b.m92647l(strM92640e);
                FastTradeFiatCurrency.Response response4 = this.f39026X;
                baseTextView.setText(getStringRes(i12, strM92647l2, C27041f.m66668h(response4 != null ? response4.getTitle() : null)));
            }
        }
        C37673q1 c37673q1M47414h9 = m47414h4();
        if (c37673q1M47414h9 == null || (baseTextView2 = c37673q1M47414h9.f84444u) == null) {
            return;
        }
        C27046k.m66685H(baseTextView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    private final void m47367P4() {
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
        if (this.f39031c0 == null) {
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 != null && (baseTextView12 = c37673q1M47414h4.f84445v) != null) {
                C27046k.m66700o(baseTextView12);
            }
            C37673q1 c37673q1M47414h5 = m47414h4();
            if (c37673q1M47414h5 == null || (baseTextView11 = c37673q1M47414h5.f84446w) == null) {
                return;
            }
            C27046k.m66700o(baseTextView11);
            return;
        }
        if (((BuyVM) m45647o3()).m47448Y(m47384b4())) {
            this.f39030b0 = true;
            C37673q1 c37673q1M47414h6 = m47414h4();
            if (c37673q1M47414h6 != null && (baseTextView10 = c37673q1M47414h6.f84445v) != null) {
                baseTextView10.setTextColor(getColorRes(R$color.c_text40));
            }
            C37673q1 c37673q1M47414h7 = m47414h4();
            if (c37673q1M47414h7 != null && (baseTextView9 = c37673q1M47414h7.f84446w) != null) {
                baseTextView9.setTextColor(getColorRes(R$color.c_text40));
            }
            C37673q1 c37673q1M47414h8 = m47414h4();
            if (c37673q1M47414h8 != null && (baseTextView8 = c37673q1M47414h8.f84445v) != null) {
                C27046k.m66685H(baseTextView8);
            }
            C37673q1 c37673q1M47414h9 = m47414h4();
            if (c37673q1M47414h9 != null && (baseTextView7 = c37673q1M47414h9.f84446w) != null) {
                baseTextView7.setVisibility(C21457l.m49860h(this.f39035g0));
            }
            m47369Q4();
            return;
        }
        if (((BuyVM) m45647o3()).m47451b0(m47384b4(), this.f39028Z)) {
            this.f39030b0 = false;
            C37673q1 c37673q1M47414h10 = m47414h4();
            if (c37673q1M47414h10 != null && (baseTextView6 = c37673q1M47414h10.f84445v) != null) {
                C27046k.m66700o(baseTextView6);
            }
            C37673q1 c37673q1M47414h11 = m47414h4();
            if (c37673q1M47414h11 == null || (baseTextView5 = c37673q1M47414h11.f84446w) == null) {
                return;
            }
            C27046k.m66700o(baseTextView5);
            return;
        }
        this.f39030b0 = true;
        C37673q1 c37673q1M47414h12 = m47414h4();
        if (c37673q1M47414h12 != null && (baseTextView4 = c37673q1M47414h12.f84445v) != null) {
            baseTextView4.setTextColor(getColorRes(R$color.brandRed));
        }
        C37673q1 c37673q1M47414h13 = m47414h4();
        if (c37673q1M47414h13 != null && (baseTextView3 = c37673q1M47414h13.f84446w) != null) {
            baseTextView3.setTextColor(getColorRes(R$color.brandRed));
        }
        C37673q1 c37673q1M47414h14 = m47414h4();
        if (c37673q1M47414h14 != null && (baseTextView2 = c37673q1M47414h14.f84445v) != null) {
            C27046k.m66685H(baseTextView2);
        }
        C37673q1 c37673q1M47414h15 = m47414h4();
        if (c37673q1M47414h15 != null && (baseTextView = c37673q1M47414h15.f84446w) != null) {
            baseTextView.setVisibility(C21457l.m49860h(this.f39035g0));
        }
        m47369Q4();
    }

    /* JADX INFO: renamed from: Q4 */
    private final void m47369Q4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (Intrinsics.areEqual(this.f39028Z, "FIAT")) {
            BuyPaymentMethod.Response.PaymentMethod paymentMethod = this.f39031c0;
            String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatMinAmount() : null);
            BuyPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f39031c0;
            String strM66668h2 = C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getFiatMaxAmount() : null);
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 != null && (baseTextView6 = c37673q1M47414h4.f84445v) != null) {
                int i11 = R$string.payment_limit_tip;
                BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(strM66668h, null, 1, null);
                PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
                FastTradeFiatCurrency.Response response = this.f39026X;
                String strM92647l = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e, null, precisionHelper.m48248b(C27041f.m66668h(response != null ? response.getTitle() : null)), false, false, false, 0, null, 125, null));
                BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(strM66668h2, null, 1, null);
                FastTradeFiatCurrency.Response response2 = this.f39026X;
                String strM92647l2 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e2, null, precisionHelper.m48248b(C27041f.m66668h(response2 != null ? response2.getTitle() : null)), false, false, false, 0, null, 125, null));
                FastTradeFiatCurrency.Response response3 = this.f39026X;
                baseTextView6.setText(getStringRes(i11, strM92647l, strM92647l2, C27041f.m66668h(response3 != null ? response3.getTitle() : null)));
            }
            if (strM66668h.length() == 0 || strM66668h2.length() == 0) {
                C37673q1 c37673q1M47414h5 = m47414h4();
                if (c37673q1M47414h5 != null && (baseTextView5 = c37673q1M47414h5.f84445v) != null) {
                    C27046k.m66700o(baseTextView5);
                }
                C37673q1 c37673q1M47414h6 = m47414h4();
                if (c37673q1M47414h6 == null || (baseTextView4 = c37673q1M47414h6.f84446w) == null) {
                    return;
                }
                C27046k.m66700o(baseTextView4);
                return;
            }
            return;
        }
        BuyPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f39031c0;
        String strM66668h3 = C27041f.m66668h(paymentMethod3 != null ? paymentMethod3.getCryptoMinAmount() : null);
        BuyPaymentMethod.Response.PaymentMethod paymentMethod4 = this.f39031c0;
        String strM66668h4 = C27041f.m66668h(paymentMethod4 != null ? paymentMethod4.getCryptoMaxAmount() : null);
        C37673q1 c37673q1M47414h7 = m47414h4();
        if (c37673q1M47414h7 != null && (baseTextView3 = c37673q1M47414h7.f84445v) != null) {
            int i12 = R$string.payment_limit_tip;
            BigDecimal bigDecimalM66535e3 = DowngradeExKt.m66535e(strM66668h3, null, 1, null);
            PrecisionHelper precisionHelper2 = PrecisionHelper.f39545a;
            FastTradeCryptoCurrency.Response response4 = this.f39027Y;
            String strM92647l3 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e3, null, precisionHelper2.m48247a(C27041f.m66668h(response4 != null ? response4.getTitle() : null)), false, false, false, 0, null, 125, null));
            BigDecimal bigDecimalM66535e4 = DowngradeExKt.m66535e(strM66668h4, null, 1, null);
            FastTradeCryptoCurrency.Response response5 = this.f39027Y;
            String strM92647l4 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e4, null, precisionHelper2.m48247a(C27041f.m66668h(response5 != null ? response5.getTitle() : null)), false, false, false, 0, null, 125, null));
            FastTradeCryptoCurrency.Response response6 = this.f39027Y;
            baseTextView3.setText(getStringRes(i12, strM92647l3, strM92647l4, C27041f.m66668h(response6 != null ? response6.getTitle() : null)));
        }
        if (strM66668h3.length() == 0 || strM66668h4.length() == 0) {
            C37673q1 c37673q1M47414h8 = m47414h4();
            if (c37673q1M47414h8 != null && (baseTextView2 = c37673q1M47414h8.f84445v) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C37673q1 c37673q1M47414h9 = m47414h4();
            if (c37673q1M47414h9 == null || (baseTextView = c37673q1M47414h9.f84446w) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public final void m47371R4() {
        FastTradeInputView fastTradeInputView;
        FastTradeTextView fastTradeTextViewM47155j;
        FastTradeInputView fastTradeInputView2;
        FastTradeTextView fastTradeTextViewM47155j2;
        if (Intrinsics.areEqual(this.f39028Z, "FIAT")) {
            PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
            FastTradeFiatCurrency.Response response = this.f39026X;
            int iM48248b = precisionHelper.m48248b(C27041f.m66668h(response != null ? response.getTitle() : null));
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 == null || (fastTradeInputView2 = c37673q1M47414h4.f84437n) == null || (fastTradeTextViewM47155j2 = fastTradeInputView2.m47155j()) == null) {
                return;
            }
            fastTradeTextViewM47155j2.setPrecision(iM48248b);
            return;
        }
        PrecisionHelper precisionHelper2 = PrecisionHelper.f39545a;
        FastTradeCryptoCurrency.Response response2 = this.f39027Y;
        int iM48247a = precisionHelper2.m48247a(C27041f.m66668h(response2 != null ? response2.getTitle() : null));
        C37673q1 c37673q1M47414h5 = m47414h4();
        if (c37673q1M47414h5 == null || (fastTradeInputView = c37673q1M47414h5.f84437n) == null || (fastTradeTextViewM47155j = fastTradeInputView.m47155j()) == null) {
            return;
        }
        fastTradeTextViewM47155j.setPrecision(iM48247a);
    }

    /* JADX INFO: renamed from: S4 */
    private final void m47373S4() {
        C42300e c42300e = C42300e.f93799a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C42300e.m92839e(c42300e, childFragmentManager, "payment_fast_recurring_explain", getStringRes(R$string.payment_investment_waht_title, new Object[0]), getStringRes(R$string.payment_fast_recurring_explain, new Object[0]), null, null, null, 112, null);
    }

    /* JADX INFO: renamed from: c4 */
    private final void m47385c4() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForBankCard".length();
        }
        C12572a.m23692a(this, false, new BuyFragment$bindEvent$$inlined$bindFlowEvent$default$1("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForBankCard", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForRecurring".length();
        }
        C12572a.m23692a(this, false, new BuyFragment$bindEvent$$inlined$bindFlowEvent$default$2("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForRecurring", null, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private final boolean m47386e4() {
        return this.f39031c0 != null && ((BuyVM) m45647o3()).m47451b0(m47384b4(), this.f39028Z) && DowngradeExKt.m66535e(m47384b4(), null, 1, null).compareTo(BigDecimal.ZERO) > 0;
    }

    /* JADX INFO: renamed from: i4 */
    private final void m47388i4() {
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f39034f0 = (FastTradeViewModel) new ViewModelProvider(fragmentActivityRequireActivity, c45071b).get(FastTradeViewModel.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "FastBuyFragment init FastTradeViewModel", false, null, 8, null), null, 2, null);
            preformBackPressed();
        }
    }

    /* JADX INFO: renamed from: j4 */
    private final void m47389j4() {
        LiveData<FastTradeCryptoCurrency.Response> liveDataM47318y0;
        LiveData<FastTradeFiatCurrency.Response> liveDataM47319z0;
        FastTradeViewModel fastTradeViewModel = this.f39034f0;
        FastTradeCryptoCurrency.Response value = null;
        this.f39026X = (fastTradeViewModel == null || (liveDataM47319z0 = fastTradeViewModel.m47319z0()) == null) ? null : liveDataM47319z0.getValue();
        FastTradeViewModel fastTradeViewModel2 = this.f39034f0;
        if (fastTradeViewModel2 != null && (liveDataM47318y0 = fastTradeViewModel2.m47318y0()) != null) {
            value = liveDataM47318y0.getValue();
        }
        this.f39027Y = value;
        C44128b.m97259c("payment", "SellFragment initTradingPair fiatCurrency: " + this.f39026X + ", cryptoCurrency: " + this.f39027Y);
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m47390k4(BuyFragment buyFragment) {
        BuyCryptoCurrencyDialog.Companion companion = BuyCryptoCurrencyDialog.f39013u0;
        FragmentManager childFragmentManager = buyFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public static final Unit m47393n4(C37673q1 c37673q1, BuyFragment buyFragment) {
        FastTradeTextView fastTradeTextViewM47155j = c37673q1.f84437n.m47155j();
        if (fastTradeTextViewM47155j != null) {
            fastTradeTextViewM47155j.setAmount(((BuyVM) buyFragment.m45647o3()).m47437L(buyFragment.f39028Z));
        }
        C43852m.m96589a("B7FastBuy", "button", "buyAll", buyFragment.m47360L4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m47394o4(BuyFragment buyFragment) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/kyc", false, 2, null));
        BuyPaymentMethod.Response.PaymentMethod paymentMethod = buyFragment.f39031c0;
        C4400a c4400aM4038a = c4400aM56184f.m4038a("paymentMethodCode", C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null));
        BuyPaymentMethod.Response.PaymentMethod paymentMethod2 = buyFragment.f39031c0;
        C4400a c4400aM4038a2 = c4400aM4038a.m4038a("channelId", C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getChannelId() : null)).m4038a("tradeType", "BUY");
        BuyPaymentMethod.Response.PaymentMethod paymentMethod3 = buyFragment.f39031c0;
        c4400aM4038a2.m4038a("fiatCurrency", C27041f.m66668h(paymentMethod3 != null ? paymentMethod3.getFiatCurrency() : null)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m47397r4(C37673q1 c37673q1, BaseTextView showByCondition) {
        Intrinsics.checkNotNullParameter(showByCondition, "$this$showByCondition");
        c37673q1.f84446w.getPaint().setFlags(8);
        c37673q1.f84446w.getPaint().setAntiAlias(true);
        BaseTextView tvNeedHigherLimits = c37673q1.f84446w;
        Intrinsics.checkNotNullExpressionValue(tvNeedHigherLimits, "tvNeedHigherLimits");
        C27046k.m66711z(tvNeedHigherLimits, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47398s4();
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final Unit m47398s4() throws JSONException {
        H5Helper.f39544a.m48245a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "buy");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7FastTrade", "otcLarge", "1", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m47399u4(BuyFragment buyFragment, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        buyFragment.m47415t4(z11, z12);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m47404z4(BuyFragment buyFragment, boolean z11) {
        if (z11) {
            BuyPaymentMethodDialog.Companion companion = BuyPaymentMethodDialog.f39275z0;
            FragmentManager childFragmentManager = buyFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m47405B4(FastTradeCryptoCurrency.Response response) {
        if (Intrinsics.areEqual(this.f39027Y, response)) {
            return;
        }
        this.f39027Y = response;
        m47377U4();
        m47410V4();
        m47358K4();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m47406C4(FastTradeFiatCurrency.Response response) {
        C44128b.m97259c("payment", "BuyFragment onFiatCurrencyChanged newFiatCurrency:" + response + ",fiatCurrency:" + this.f39026X);
        if (Intrinsics.areEqual(this.f39026X, response)) {
            return;
        }
        this.f39026X = response;
        m47358K4();
    }

    /* JADX INFO: renamed from: V4 */
    public final void m47410V4() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        FastTradeCryptoCurrency.Response response = this.f39027Y;
        if (C27025c.m66566d(response != null ? response.isSupportRecurring() : null)) {
            C37673q1 c37673q1M47414h4 = m47414h4();
            if (c37673q1M47414h4 == null || (constraintLayout2 = c37673q1M47414h4.f84439p) == null) {
                return;
            }
            C27046k.m66685H(constraintLayout2);
            return;
        }
        C37673q1 c37673q1M47414h5 = m47414h4();
        if (c37673q1M47414h5 == null || (constraintLayout = c37673q1M47414h5.f84439p) == null) {
            return;
        }
        C27046k.m66700o(constraintLayout);
    }

    /* JADX INFO: renamed from: W4 */
    public final boolean m47411W4() {
        BuyPaymentMethod.Response.PaymentMethod.PopularInfo popularInfo;
        FastTradeChannelHelper fastTradeChannelHelper = FastTradeChannelHelper.f38726a;
        BuyPaymentMethod.Response.PaymentMethod paymentMethod = this.f39031c0;
        String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
        BuyPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f39031c0;
        if (fastTradeChannelHelper.m46724a(strM66668h, C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getChannelId() : null)) instanceof FastTradeChannel.ZenPay) {
            BuyPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f39031c0;
            if ((paymentMethod3 == null || (popularInfo = paymentMethod3.getPopularInfo()) == null) ? false : Intrinsics.areEqual(popularInfo.getBoundChannelAccount(), Boolean.FALSE)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g4 */
    public final Map<String, String> m47413g4() {
        Pair pairM90091to = TuplesKt.m90091to("quoteType", this.f39028Z);
        Pair pairM90091to2 = TuplesKt.m90091to("amount", m47384b4());
        FastTradeFiatCurrency.Response response = this.f39026X;
        Pair pairM90091to3 = TuplesKt.m90091to("fiatCurrency", C27041f.m66668h(response != null ? response.getTitle() : null));
        FastTradeCryptoCurrency.Response response2 = this.f39027Y;
        return MapsKt.mutableMapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("cryptoCurrency", C27041f.m66668h(response2 != null ? response2.getTitle() : null)));
    }

    /* JADX INFO: renamed from: h4 */
    public final C37673q1 m47414h4() {
        return (C37673q1) this.f39025W.getValue(this, f39024i0[0]);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m47385c4();
        m47399u4(this, false, false, 2, null);
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        preCheckHelper.m48242m(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        final C37673q1 c37673q1M47414h4 = m47414h4();
        if (c37673q1M47414h4 == null) {
            return;
        }
        ConstraintLayout layoutRecurring = c37673q1M47414h4.f84439p;
        Intrinsics.checkNotNullExpressionValue(layoutRecurring, "layoutRecurring");
        C27046k.m66711z(layoutRecurring, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47395p4(this.f39256b);
            }
        }, 1, null);
        AppCompatImageView ivRecurringQuestion = c37673q1M47414h4.f84434k;
        Intrinsics.checkNotNullExpressionValue(ivRecurringQuestion, "ivRecurringQuestion");
        C27046k.m66711z(ivRecurringQuestion, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47396q4(this.f39314b);
            }
        }, 1, null);
        C21457l.m49859g(c37673q1M47414h4.f84446w, this.f39035g0, null, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyFragment.m47397r4(c37673q1M47414h4, (BaseTextView) obj);
            }
        }, 2, null);
        FastTradeInputView fastTradeInputView = c37673q1M47414h4.f84437n;
        fastTradeInputView.setTradeType("BUY");
        fastTradeInputView.setQuoteType(this.f39028Z);
        FastTradeFiatCurrency.Response response = this.f39026X;
        String strM66668h = C27041f.m66668h(response != null ? response.getTitle() : null);
        FastTradeCryptoCurrency.Response response2 = this.f39027Y;
        fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(response2 != null ? response2.getTitle() : null));
        m47371R4();
        fastTradeInputView.setFastInputListener(new C20708a(fastTradeInputView));
        FastTradeTextView fastTradeTextViewM47155j = c37673q1M47414h4.f84437n.m47155j();
        if (fastTradeTextViewM47155j != null) {
            c37673q1M47414h4.f84435l.addListener(fastTradeTextViewM47155j);
            fastTradeTextViewM47155j.registerListener(new C20709b());
        }
        m47377U4();
        m47410V4();
        ConstraintLayout layoutCryptoCurrency = c37673q1M47414h4.f84436m;
        Intrinsics.checkNotNullExpressionValue(layoutCryptoCurrency, "layoutCryptoCurrency");
        C27046k.m66710y(layoutCryptoCurrency, 500L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47390k4(this.f39316b);
            }
        });
        ConstraintLayout layoutPaymentMethod = c37673q1M47414h4.f84438o;
        Intrinsics.checkNotNullExpressionValue(layoutPaymentMethod, "layoutPaymentMethod");
        C27046k.m66711z(layoutPaymentMethod, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47391l4(this.f39317b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c37673q1M47414h4.f84442s;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47392m4(this.f39318b);
            }
        }, 1, null);
        KcSecondaryButton tvBuyMax = c37673q1M47414h4.f84441r;
        Intrinsics.checkNotNullExpressionValue(tvBuyMax, "tvBuyMax");
        C27046k.m66711z(tvBuyMax, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47393n4(c37673q1M47414h4, this);
            }
        }, 1, null);
        KcPrimaryButton payByZenBing = c37673q1M47414h4.f84440q;
        Intrinsics.checkNotNullExpressionValue(payByZenBing, "payByZenBing");
        C27046k.m66711z(payByZenBing, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyFragment.m47394o4(this.f39321b);
            }
        }, 1, null);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_trade_buy;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyVM.class);
    }

    public BuyFragment() {
        setPageId("B7FastBuy");
        Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
        this.f39035g0 = objM56186h != null ? ((IPaymentSiteService) objM56186h).mo45626f() : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public static final Unit m47342A4(BuyFragment buyFragment, Boolean bool) {
        if (bool.booleanValue()) {
            String strM47438M = ((BuyVM) buyFragment.m45647o3()).m47438M(buyFragment.m47384b4(), buyFragment.f39028Z);
            C44128b.m97259c("payment", "preCheckPassed fiatAmount:" + strM47438M);
            FastBuyHelper fastBuyHelper = FastBuyHelper.f39263a;
            Context contextM45646n3 = buyFragment.m45646n3();
            FragmentManager childFragmentManager = buyFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            fastBuyHelper.m47792l(contextM45646n3, childFragmentManager, buyFragment.f39031c0, strM47438M, !buyFragment.f39032d0, buyFragment.f39033e0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m47349F4(TradingPairInfo.Response response, DialogInterface dialogInterface, int i11) {
        FlutterNavigationHelper.f39477a.m48166e(C27041f.m66668h(response.getRecurringId()));
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m47356J4(BaseTextView baseTextView, String str) {
        baseTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    private final void m47358K4() {
        FastTradeInputView fastTradeInputView;
        String title;
        String title2;
        C37673q1 c37673q1M47414h4 = m47414h4();
        if (c37673q1M47414h4 != null && (fastTradeInputView = c37673q1M47414h4.f84437n) != null) {
            fastTradeInputView.setQuoteType(this.f39028Z);
            FastTradeFiatCurrency.Response response = this.f39026X;
            if (response != null) {
                title = response.getTitle();
            } else {
                title = null;
            }
            String strM66668h = C27041f.m66668h(title);
            FastTradeCryptoCurrency.Response response2 = this.f39027Y;
            if (response2 != null) {
                title2 = response2.getTitle();
            } else {
                title2 = null;
            }
            fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(title2));
        }
        m47371R4();
        m47375T4();
        m47399u4(this, false, false, 2, null);
    }

    /* JADX INFO: renamed from: U4 */
    private final void m47377U4() {
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView;
        String title;
        C37673q1 c37673q1M47414h4 = m47414h4();
        String iconUrl = null;
        if (c37673q1M47414h4 != null && (baseTextView = c37673q1M47414h4.f84443t) != null) {
            FastTradeCryptoCurrency.Response response = this.f39027Y;
            if (response != null) {
                title = response.getTitle();
            } else {
                title = null;
            }
            baseTextView.setText(C27041f.m66668h(title));
        }
        C37673q1 c37673q1M47414h5 = m47414h4();
        if (c37673q1M47414h5 != null && (appCompatImageView = c37673q1M47414h5.f84430g) != null) {
            Context contextM45646n3 = m45646n3();
            FastTradeCryptoCurrency.Response response2 = this.f39027Y;
            if (response2 != null) {
                iconUrl = response2.getIconUrl();
            }
            C24277v.m58540e(contextM45646n3, iconUrl, appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: b4 */
    private final String m47384b4() {
        String strM47153f;
        FastTradeInputView fastTradeInputView;
        C37673q1 c37673q1M47414h4 = m47414h4();
        if (c37673q1M47414h4 != null && (fastTradeInputView = c37673q1M47414h4.f84437n) != null) {
            strM47153f = fastTradeInputView.m47153f();
        } else {
            strM47153f = null;
        }
        return C27041f.m66669i(strM47153f, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public final void m47387f4() {
        C44128b.m97259c("payment", "BuyFragment onAmountChanged amount:" + m47384b4());
        m47367P4();
        m47365O4();
        C37673q1 c37673q1M47414h4 = m47414h4();
        if (c37673q1M47414h4 != null) {
            m47409N4(c37673q1M47414h4);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m47392m4(BuyFragment buyFragment) {
        buyFragment.m47362M4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public static final Unit m47395p4(BuyFragment buyFragment) {
        String title;
        BuyVM buyVM = (BuyVM) buyFragment.m45647o3();
        FastTradeFiatCurrency.Response response = buyFragment.f39026X;
        String title2 = null;
        if (response != null) {
            title = response.getTitle();
        } else {
            title = null;
        }
        String strM66668h = C27041f.m66668h(title);
        FastTradeCryptoCurrency.Response response2 = buyFragment.f39027Y;
        if (response2 != null) {
            title2 = response2.getTitle();
        }
        buyVM.m47454e0(strM66668h, C27041f.m66668h(title2));
        C43852m.m96591c("B7FastTrade", "toRecurringBuy", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m47396q4(BuyFragment buyFragment) {
        buyFragment.m47373S4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m47400v4(BuyFragment buyFragment, TradingPairInfo.Response response) {
        Intrinsics.checkNotNull(response);
        buyFragment.m47407E4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m47401w4(BuyFragment buyFragment, FastTradeFiatCurrency.Response response) {
        Intrinsics.checkNotNull(response);
        buyFragment.m47406C4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m47402x4(BuyFragment buyFragment, FastTradeCryptoCurrency.Response response) {
        Intrinsics.checkNotNull(response);
        buyFragment.m47405B4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m47403y4(BuyFragment buyFragment, BuyPaymentMethod.Response.PaymentMethod paymentMethod) {
        buyFragment.m47408H4(paymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public final void m47407E4(final TradingPairInfo.Response response) {
        String title;
        if (C27025c.m66566d(response.getHasRecurringPlan())) {
            AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
            int i11 = R$string.payment_investment_plan_title;
            FastTradeCryptoCurrency.Response response2 = this.f39027Y;
            if (response2 != null) {
                title = response2.getTitle();
            } else {
                title = null;
            }
            alertDialogFragmentHelperNewInstanceAlert.m54168Y4(getStringRes(i11, C27041f.m66668h(title))).m54153J4(R$string.payment_investment_plan_content).m54159P4(R$string.payment_investment_view_plan, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    BuyFragment.m47349F4(response, dialogInterface, i12);
                }
            }).m54162S4(R$string.payment_investment_contine_one, null).m54172c5(getChildFragmentManager());
            return;
        }
        if (!C27025c.m66566d(response.isSupportRecurring())) {
            return;
        }
        RecurringFrequencyDialog.Companion companion = RecurringFrequencyDialog.S0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RecurringFrequencyDialog.Companion.showRecurringFrequencyDialog$default(companion, childFragmentManager, false, this.f39033e0, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyFragment.m47351G4(this.f39270b, (RecurringFrequency) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m47409N4(C37673q1 c37673q1) {
        if (m47412d4()) {
            KcSecondaryButton tvBuyMax = c37673q1.f84441r;
            Intrinsics.checkNotNullExpressionValue(tvBuyMax, "tvBuyMax");
            ViewExtKt.m66594y(tvBuyMax);
            KcPrimaryButton tvConfirm = c37673q1.f84442s;
            Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
            ViewExtKt.m66577h(tvConfirm);
            KcPrimaryButton payByZenBing = c37673q1.f84440q;
            Intrinsics.checkNotNullExpressionValue(payByZenBing, "payByZenBing");
            ViewExtKt.m66577h(payByZenBing);
            return;
        }
        if (m47411W4()) {
            KcPrimaryButton tvConfirm2 = c37673q1.f84442s;
            Intrinsics.checkNotNullExpressionValue(tvConfirm2, "tvConfirm");
            ViewExtKt.m66577h(tvConfirm2);
            KcSecondaryButton tvBuyMax2 = c37673q1.f84441r;
            Intrinsics.checkNotNullExpressionValue(tvBuyMax2, "tvBuyMax");
            ViewExtKt.m66577h(tvBuyMax2);
            KcPrimaryButton payByZenBing2 = c37673q1.f84440q;
            Intrinsics.checkNotNullExpressionValue(payByZenBing2, "payByZenBing");
            ViewExtKt.m66594y(payByZenBing2);
            return;
        }
        if (this.f39029a0) {
            KcPrimaryButton tvConfirm3 = c37673q1.f84442s;
            Intrinsics.checkNotNullExpressionValue(tvConfirm3, "tvConfirm");
            ViewExtKt.m66594y(tvConfirm3);
            KcSecondaryButton tvBuyMax3 = c37673q1.f84441r;
            Intrinsics.checkNotNullExpressionValue(tvBuyMax3, "tvBuyMax");
            ViewExtKt.m66577h(tvBuyMax3);
            c37673q1.f84442s.setText(getStringRes(R$string.payment_fast_buy_add_new_card, new Object[0]));
            c37673q1.f84442s.setEnabled(m47386e4());
            KcPrimaryButton payByZenBing3 = c37673q1.f84440q;
            Intrinsics.checkNotNullExpressionValue(payByZenBing3, "payByZenBing");
            ViewExtKt.m66577h(payByZenBing3);
            return;
        }
        KcPrimaryButton tvConfirm4 = c37673q1.f84442s;
        Intrinsics.checkNotNullExpressionValue(tvConfirm4, "tvConfirm");
        ViewExtKt.m66594y(tvConfirm4);
        KcSecondaryButton tvBuyMax4 = c37673q1.f84441r;
        Intrinsics.checkNotNullExpressionValue(tvBuyMax4, "tvBuyMax");
        ViewExtKt.m66577h(tvBuyMax4);
        c37673q1.f84442s.setText(getStringRes(R$string.payment_fast_buy_preview_order, new Object[0]));
        c37673q1.f84442s.setEnabled(m47386e4());
        KcPrimaryButton payByZenBing4 = c37673q1.f84440q;
        Intrinsics.checkNotNullExpressionValue(payByZenBing4, "payByZenBing");
        ViewExtKt.m66577h(payByZenBing4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final boolean m47412d4() {
        if (((BuyVM) m45647o3()).m47448Y(m47384b4()) && !StringsKt.isBlank(C27041f.m66668h(((BuyVM) m45647o3()).m47455f0(this.f39028Z)))) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m47388i4();
        m47389j4();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C44128b.m97259c("payment", "BuyFragment onResume");
        m47399u4(this, false, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        LiveData<FastTradeCryptoCurrency.Response> liveDataM47318y0;
        LiveData<FastTradeFiatCurrency.Response> liveDataM47319z0;
        super.mo45650r3();
        ((BuyVM) m45647o3()).m47443T().observe(getViewLifecycleOwner(), new C20710c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyFragment.m47400v4(this.f39322b, (TradingPairInfo.Response) obj);
            }
        }));
        FastTradeViewModel fastTradeViewModel = this.f39034f0;
        if (fastTradeViewModel != null && (liveDataM47319z0 = fastTradeViewModel.m47319z0()) != null) {
            liveDataM47319z0.observe(getViewLifecycleOwner(), new C20710c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyFragment.m47401w4(this.f39051b, (FastTradeFiatCurrency.Response) obj);
                }
            }));
        }
        FastTradeViewModel fastTradeViewModel2 = this.f39034f0;
        if (fastTradeViewModel2 != null && (liveDataM47318y0 = fastTradeViewModel2.m47318y0()) != null) {
            liveDataM47318y0.observe(getViewLifecycleOwner(), new C20710c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyFragment.m47402x4(this.f39262b, (FastTradeCryptoCurrency.Response) obj);
                }
            }));
        }
        ((BuyVM) m45647o3()).m47444U().observe(getViewLifecycleOwner(), new C20710c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyFragment.m47403y4(this.f39266b, (BuyPaymentMethod.Response.PaymentMethod) obj);
            }
        }));
        ((BuyVM) m45647o3()).m47445V().observe(getViewLifecycleOwner(), new C42876i(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyFragment.m47404z4(this.f39267b, ((Boolean) obj).booleanValue());
            }
        }));
        ((BuyVM) m45647o3()).m47442S().observe(getViewLifecycleOwner(), new C20710c(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyFragment.m47342A4(this.f39268b, (Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m47415t4(boolean z11, boolean z12) {
        String title;
        BuyVM buyVM = (BuyVM) m45647o3();
        FastTradeFiatCurrency.Response response = this.f39026X;
        String title2 = null;
        if (response != null) {
            title = response.getTitle();
        } else {
            title = null;
        }
        String strM66668h = C27041f.m66668h(title);
        FastTradeCryptoCurrency.Response response2 = this.f39027Y;
        if (response2 != null) {
            title2 = response2.getTitle();
        }
        buyVM.m47452c0(strM66668h, C27041f.m66668h(title2), m47384b4(), this.f39028Z, !this.f39032d0, z11, z12);
    }
}
