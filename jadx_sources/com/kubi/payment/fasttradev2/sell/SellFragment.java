package com.kubi.payment.fasttradev2.sell;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fasttrade.sell.FastSellBalanceExplainDialog;
import com.kubi.payment.fasttrade.sell.FastSellHelper;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.payment.fasttrade.widget.FastTradeTextView;
import com.kubi.payment.fasttradev2.FastTradeFiatSelectDialog;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.fasttradev2.sell.paymentmethod.SellPaymentMethodDialog;
import com.kubi.payment.helper.H5Helper;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
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
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37658n1;
import p429lf.C42180b;
import p477nt.C42875h;
import p477nt.C42876i;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import ro.C44128b;
import tt.C45070a;
import tt.C45071b;
import w00.C45681e;

/* JADX INFO: compiled from: SellFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\u001a\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0012\u0010-\u001a\u00020!2\b\b\u0002\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u00020!H\u0002J\b\u00100\u001a\u00020!H\u0002J\f\u00101\u001a\u00020!*\u00020\u0006H\u0002J\b\u00102\u001a\u00020\u0012H\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u00020!H\u0002J\b\u00106\u001a\u00020!H\u0002J\b\u00107\u001a\u00020!H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020\fH\u0002J\u0010\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020\u000eH\u0002J\b\u0010<\u001a\u00020!H\u0002J\b\u0010=\u001a\u00020!H\u0002J\b\u0010>\u001a\u00020\u0010H\u0002J\b\u0010?\u001a\u00020!H\u0002J\b\u0010@\u001a\u00020!H\u0014J\b\u0010A\u001a\u00020!H\u0002J\u0012\u0010B\u001a\u00020!2\b\u0010C\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010D\u001a\u00020!H\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020FH\u0016J\b\u0010G\u001a\u00020HH\u0016J\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100JR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u001b¨\u0006L"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/SellFragment;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "Lcom/kubi/payment/fasttradev2/sell/SellVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "cryptoCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "quoteType", "", "isAddNewCard", "", "showBalanceError", "showLimit", "selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "fastTradeViewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "showHigherLimited", "getShowHigherLimited", "()Z", "useMultiAccountWidget", "getUseMultiAccountWidget", "useMultiAccountWidget$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initParentVM", "initTradingPair", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindEvent", "initViews", "paymentMethodJsonObject", "Lorg/json/JSONObject;", "loadPaymentMethodList", "isSelectedPaymentMethod", "preCheck", "showAvailableBalanceExplainDialog", "refreshConfirm", "canPreviewOrder", "checkAmount", "refreshEstimated", "refreshBalance", "refreshLimit", "refreshLimitContent", "onFiatCurrencyChanged", "newFiatCurrency", "onCryptoCurrencyChanged", "newCryptoCurrency", "onTradingPairChanged", "refreshPrecision", "amount", "updateCryptoCurrencyUI", "observeData", "refreshAvailableBalance", "onSelectedPaymentMethodChanged", "newPaymentMethod", "onResume", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "getParameters", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellFragment.kt\ncom/kubi/payment/fasttradev2/sell/SellFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,725:1\n147#2,16:726\n17#3,2:742\n44#4,2:744\n76#5,7:746\n35#6,4:753\n39#6:759\n44#7,2:757\n*S KotlinDebug\n*F\n+ 1 SellFragment.kt\ncom/kubi/payment/fasttradev2/sell/SellFragment\n*L\n66#1:726,16\n107#1:742,2\n134#1:744,2\n157#1:746,7\n113#1:753,4\n113#1:759\n113#1:757,2\n*E\n"})
public final class SellFragment extends BaseFastFragment<SellVM> {

    /* JADX INFO: renamed from: X */
    @Nullable
    public FastTradeFiatCurrency.Response f39410X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public FastTradeCryptoCurrency.Response f39411Y;

    /* JADX INFO: renamed from: a0 */
    public boolean f39413a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f39414b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f39415c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public SellPaymentMethod.Response.PaymentMethod f39416d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public FastTradeViewModel f39417e0;

    /* JADX INFO: renamed from: f0 */
    public final boolean f39418f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f39419g0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f39408i0 = {Reflection.property1(new PropertyReference1Impl(SellFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastSellBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f39407h0 = new Companion(null);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f39409W = C45681e.m100799e(this, new Function1<SellFragment, C37658n1>() { // from class: com.kubi.payment.fasttradev2.sell.SellFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37658n1 invoke(@NotNull SellFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37658n1.m84899a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37658n1, Unit>() { // from class: com.kubi.payment.fasttradev2.sell.SellFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37658n1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37658n1 c37658n1) {
            invoke(c37658n1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f39412Z = "CRYPTO";

    /* JADX INFO: compiled from: SellFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/SellFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/fasttradev2/sell/SellFragment;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SellFragment newInstance() {
            return new SellFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellFragment$a */
    /* JADX INFO: compiled from: SellFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttradev2/sell/SellFragment$initViews$2$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$OnFastInputListener;", "onQuoteTypeChanged", "", "quoteType", "", "onSelectFiatCurrencyClicked", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20924a implements FastTradeInputView.InterfaceC20679a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FastTradeInputView f39421b;

        public C20924a(FastTradeInputView fastTradeInputView) {
            this.f39421b = fastTradeInputView;
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: a */
        public void mo46795a() {
            FastTradeFiatSelectDialog.Companion companion = FastTradeFiatSelectDialog.f38982v0;
            FragmentManager childFragmentManager = SellFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, "SELL");
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeInputView.InterfaceC20679a
        /* JADX INFO: renamed from: b */
        public void mo46796b(String quoteType) {
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            C44128b.m97266j("payment", "SellFragment onQuoteTypeChanged quoteType:" + quoteType);
            SellFragment.this.f39412Z = quoteType;
            FastTradeInputView fastTradeInputView = this.f39421b;
            FastTradeFiatCurrency.Response response = SellFragment.this.f39410X;
            String strM66668h = C27041f.m66668h(response != null ? response.getTitle() : null);
            FastTradeCryptoCurrency.Response response2 = SellFragment.this.f39411Y;
            fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(response2 != null ? response2.getTitle() : null));
            SellFragment.this.m47993K4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellFragment$b */
    /* JADX INFO: compiled from: SellFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/fasttradev2/sell/SellFragment$initViews$3$1", "Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$OnTextChangeListener;", "onTextChange", "", "text", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20925b implements FastTradeTextView.InterfaceC20680a {
        public C20925b() {
        }

        @Override // com.kubi.payment.fasttrade.widget.FastTradeTextView.InterfaceC20680a
        /* JADX INFO: renamed from: a */
        public void mo46797a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            SellFragment.this.m48013b4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellFragment$c */
    /* JADX INFO: compiled from: SellFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20926c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39423b;

        public C20926c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39423b = function;
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
            return this.f39423b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39423b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.sell.SellFragment$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20927d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m48020j4(SellFragment sellFragment) {
        sellFragment.m48026p4(true);
        C43852m.m96591c("B7FastSell", "paymentMethod", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    private final void m47974A4(SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        AppCompatImageView appCompatImageView2;
        this.f39416d0 = paymentMethod;
        if (paymentMethod == null) {
            this.f39413a0 = false;
            C37658n1 c37658n1M48015e4 = m48015e4();
            if (c37658n1M48015e4 != null && (appCompatImageView2 = c37658n1M48015e4.f84306f) != null) {
                appCompatImageView2.setImageResource(R$drawable.ic2_fund_account_24);
                appCompatImageView2.setImageTintList(ContextCompat.getColorStateList(m45646n3(), R$color.c_text40));
            }
            C37658n1 c37658n1M48015e5 = m48015e4();
            if (c37658n1M48015e5 != null && (baseTextView8 = c37658n1M48015e5.f84321u) != null) {
                baseTextView8.setText(getStringRes(R$string.payment_fast_sell_seect_method, new Object[0]));
            }
            C37658n1 c37658n1M48015e6 = m48015e4();
            if (c37658n1M48015e6 != null && (baseTextView7 = c37658n1M48015e6.f84321u) != null) {
                baseTextView7.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text40));
            }
            C37658n1 c37658n1M48015e7 = m48015e4();
            if (c37658n1M48015e7 != null && (baseTextView6 = c37658n1M48015e7.f84322v) != null) {
                C27046k.m66700o(baseTextView6);
            }
        } else {
            this.f39413a0 = ((SellVM) m45647o3()).m48073Y(this.f39416d0);
            C37658n1 c37658n1M48015e8 = m48015e4();
            if (c37658n1M48015e8 != null && (appCompatImageView = c37658n1M48015e8.f84306f) != null) {
                Context contextM45646n3 = m45646n3();
                SellPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f39416d0;
                C24277v.m58540e(contextM45646n3, paymentMethod2 != null ? paymentMethod2.getIconUrl() : null, appCompatImageView);
                appCompatImageView.setImageTintList(null);
            }
            C37658n1 c37658n1M48015e9 = m48015e4();
            if (c37658n1M48015e9 != null && (baseTextView5 = c37658n1M48015e9.f84321u) != null) {
                SellPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f39416d0;
                baseTextView5.setText(paymentMethod3 != null ? paymentMethod3.getPaymentMethodName() : null);
            }
            C37658n1 c37658n1M48015e10 = m48015e4();
            if (c37658n1M48015e10 != null && (baseTextView4 = c37658n1M48015e10.f84321u) != null) {
                baseTextView4.setTextColor(ContextCompat.getColor(m45646n3(), R$color.c_text));
            }
            SellPaymentMethod.Response.PaymentMethod paymentMethod4 = this.f39416d0;
            String strM66668h = C27041f.m66668h(paymentMethod4 != null ? paymentMethod4.getTag() : null);
            if (strM66668h.length() == 0) {
                C37658n1 c37658n1M48015e11 = m48015e4();
                if (c37658n1M48015e11 != null && (baseTextView3 = c37658n1M48015e11.f84322v) != null) {
                    C27046k.m66700o(baseTextView3);
                }
            } else {
                C37658n1 c37658n1M48015e12 = m48015e4();
                if (c37658n1M48015e12 != null && (baseTextView2 = c37658n1M48015e12.f84322v) != null) {
                    baseTextView2.setText(strM66668h);
                }
                C37658n1 c37658n1M48015e13 = m48015e4();
                if (c37658n1M48015e13 != null && (baseTextView = c37658n1M48015e13.f84322v) != null) {
                    C27046k.m66685H(baseTextView);
                }
            }
        }
        m47982E4();
        m48013b4();
    }

    /* JADX INFO: renamed from: C4 */
    private final JSONObject m47978C4() throws JSONException {
        SellPaymentMethod.Response.PaymentMethod paymentMethod = this.f39416d0;
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
    /* JADX INFO: renamed from: D4 */
    private final void m47980D4() {
        if (this.f39416d0 == null) {
            m48026p4(false);
            return;
        }
        SellVM sellVM = (SellVM) m45647o3();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        sellVM.m48080g0(childFragmentManager, m45646n3());
        C43852m.m96589a("B7FastSell", "button", ((SellVM) m45647o3()).m48073Y(this.f39416d0) ? "newCard" : "preview", m47978C4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    private final void m47987H4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String strM92640e;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        String strM92640e2;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (this.f39416d0 == null) {
            C37658n1 c37658n1M48015e4 = m48015e4();
            if (c37658n1M48015e4 == null || (baseTextView6 = c37658n1M48015e4.f84318r) == null) {
                return;
            }
            C27046k.m66700o(baseTextView6);
            return;
        }
        String strM48010Y3 = m48010Y3();
        if (((SellVM) m45647o3()).m48074Z(strM48010Y3)) {
            C37658n1 c37658n1M48015e5 = m48015e4();
            if (c37658n1M48015e5 == null || (baseTextView5 = c37658n1M48015e5.f84318r) == null) {
                return;
            }
            C27046k.m66700o(baseTextView5);
            return;
        }
        if (this.f39415c0 || this.f39414b0) {
            C37658n1 c37658n1M48015e6 = m48015e4();
            if (c37658n1M48015e6 == null || (baseTextView = c37658n1M48015e6.f84318r) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
            return;
        }
        BigDecimal bigDecimalM48067Q = ((SellVM) m45647o3()).m48067Q(strM48010Y3, this.f39412Z);
        C44128b.m97259c("payment", "refreshEstimated estimatedAmount:" + bigDecimalM48067Q);
        if (Intrinsics.areEqual(this.f39412Z, "FIAT")) {
            C37658n1 c37658n1M48015e7 = m48015e4();
            if (c37658n1M48015e7 != null && (baseTextView4 = c37658n1M48015e7.f84318r) != null) {
                int i11 = R$string.payment_fast_sell_about;
                if (bigDecimalM48067Q != null) {
                    PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
                    FastTradeCryptoCurrency.Response response = this.f39411Y;
                    strM92640e2 = C42180b.m92640e(bigDecimalM48067Q, null, precisionHelper.m48247a(C27041f.m66668h(response != null ? response.getTitle() : null)), false, false, false, 0, null, 125, null);
                } else {
                    strM92640e2 = null;
                }
                String strM92647l = C42180b.m92647l(strM92640e2);
                FastTradeCryptoCurrency.Response response2 = this.f39411Y;
                baseTextView4.setText(getStringRes(i11, strM92647l, C27041f.m66668h(response2 != null ? response2.getTitle() : null)));
            }
        } else {
            C37658n1 c37658n1M48015e8 = m48015e4();
            if (c37658n1M48015e8 != null && (baseTextView2 = c37658n1M48015e8.f84318r) != null) {
                int i12 = R$string.payment_fast_sell_about;
                if (bigDecimalM48067Q != null) {
                    PrecisionHelper precisionHelper2 = PrecisionHelper.f39545a;
                    FastTradeFiatCurrency.Response response3 = this.f39410X;
                    strM92640e = C42180b.m92640e(bigDecimalM48067Q, null, precisionHelper2.m48248b(C27041f.m66668h(response3 != null ? response3.getTitle() : null)), false, false, false, 0, null, 125, null);
                } else {
                    strM92640e = null;
                }
                String strM92647l2 = C42180b.m92647l(strM92640e);
                FastTradeFiatCurrency.Response response4 = this.f39410X;
                baseTextView2.setText(getStringRes(i12, strM92647l2, C27041f.m66668h(response4 != null ? response4.getTitle() : null)));
            }
        }
        C37658n1 c37658n1M48015e9 = m48015e4();
        if (c37658n1M48015e9 == null || (baseTextView3 = c37658n1M48015e9.f84318r) == null) {
            return;
        }
        C27046k.m66685H(baseTextView3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I4 */
    private final void m47989I4() {
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
        if (this.f39416d0 == null) {
            C37658n1 c37658n1M48015e4 = m48015e4();
            if (c37658n1M48015e4 != null && (baseTextView14 = c37658n1M48015e4.f84319s) != null) {
                C27046k.m66700o(baseTextView14);
            }
            C37658n1 c37658n1M48015e5 = m48015e4();
            if (c37658n1M48015e5 == null || (baseTextView13 = c37658n1M48015e5.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView13);
            return;
        }
        if (this.f39414b0) {
            C37658n1 c37658n1M48015e6 = m48015e4();
            if (c37658n1M48015e6 != null && (baseTextView12 = c37658n1M48015e6.f84319s) != null) {
                C27046k.m66700o(baseTextView12);
            }
            C37658n1 c37658n1M48015e7 = m48015e4();
            if (c37658n1M48015e7 == null || (baseTextView11 = c37658n1M48015e7.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView11);
            return;
        }
        if (((SellVM) m45647o3()).m48074Z(m48010Y3())) {
            this.f39415c0 = true;
            C37658n1 c37658n1M48015e8 = m48015e4();
            if (c37658n1M48015e8 != null && (baseTextView10 = c37658n1M48015e8.f84319s) != null) {
                baseTextView10.setTextColor(getColorRes(R$color.c_text40));
            }
            C37658n1 c37658n1M48015e9 = m48015e4();
            if (c37658n1M48015e9 != null && (baseTextView9 = c37658n1M48015e9.f84320t) != null) {
                baseTextView9.setTextColor(getColorRes(R$color.c_text40));
            }
            C37658n1 c37658n1M48015e10 = m48015e4();
            if (c37658n1M48015e10 != null && (baseTextView8 = c37658n1M48015e10.f84319s) != null) {
                C27046k.m66685H(baseTextView8);
            }
            C37658n1 c37658n1M48015e11 = m48015e4();
            if (c37658n1M48015e11 != null && (baseTextView7 = c37658n1M48015e11.f84320t) != null) {
                baseTextView7.setVisibility(C21457l.m49860h(this.f39418f0));
            }
            m47991J4();
            return;
        }
        if (((SellVM) m45647o3()).m48076b0(m48010Y3(), this.f39412Z)) {
            this.f39415c0 = false;
            C37658n1 c37658n1M48015e12 = m48015e4();
            if (c37658n1M48015e12 != null && (baseTextView6 = c37658n1M48015e12.f84319s) != null) {
                C27046k.m66700o(baseTextView6);
            }
            C37658n1 c37658n1M48015e13 = m48015e4();
            if (c37658n1M48015e13 == null || (baseTextView5 = c37658n1M48015e13.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView5);
            return;
        }
        this.f39415c0 = true;
        C37658n1 c37658n1M48015e14 = m48015e4();
        if (c37658n1M48015e14 != null && (baseTextView4 = c37658n1M48015e14.f84319s) != null) {
            baseTextView4.setTextColor(getColorRes(R$color.brandRed));
        }
        C37658n1 c37658n1M48015e15 = m48015e4();
        if (c37658n1M48015e15 != null && (baseTextView3 = c37658n1M48015e15.f84320t) != null) {
            baseTextView3.setTextColor(getColorRes(R$color.brandRed));
        }
        C37658n1 c37658n1M48015e16 = m48015e4();
        if (c37658n1M48015e16 != null && (baseTextView2 = c37658n1M48015e16.f84319s) != null) {
            C27046k.m66685H(baseTextView2);
        }
        C37658n1 c37658n1M48015e17 = m48015e4();
        if (c37658n1M48015e17 != null && (baseTextView = c37658n1M48015e17.f84320t) != null) {
            baseTextView.setVisibility(C21457l.m49860h(this.f39418f0));
        }
        m47991J4();
    }

    /* JADX INFO: renamed from: J4 */
    private final void m47991J4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (Intrinsics.areEqual(this.f39412Z, "FIAT")) {
            SellPaymentMethod.Response.PaymentMethod paymentMethod = this.f39416d0;
            String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatMinAmount() : null);
            SellPaymentMethod.Response.PaymentMethod paymentMethod2 = this.f39416d0;
            String strM66668h2 = C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getFiatMaxAmount() : null);
            C37658n1 c37658n1M48015e4 = m48015e4();
            if (c37658n1M48015e4 != null && (baseTextView6 = c37658n1M48015e4.f84319s) != null) {
                int i11 = R$string.payment_limit_tip;
                BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(strM66668h, null, 1, null);
                PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
                FastTradeFiatCurrency.Response response = this.f39410X;
                String strM92647l = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e, null, precisionHelper.m48248b(C27041f.m66668h(response != null ? response.getTitle() : null)), false, false, false, 0, null, 125, null));
                BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(strM66668h2, null, 1, null);
                FastTradeFiatCurrency.Response response2 = this.f39410X;
                String strM92647l2 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e2, null, precisionHelper.m48248b(C27041f.m66668h(response2 != null ? response2.getTitle() : null)), false, false, false, 0, null, 125, null));
                FastTradeFiatCurrency.Response response3 = this.f39410X;
                baseTextView6.setText(getStringRes(i11, strM92647l, strM92647l2, C27041f.m66668h(response3 != null ? response3.getTitle() : null)));
            }
            if (strM66668h.length() == 0 || strM66668h2.length() == 0) {
                C37658n1 c37658n1M48015e5 = m48015e4();
                if (c37658n1M48015e5 != null && (baseTextView5 = c37658n1M48015e5.f84319s) != null) {
                    C27046k.m66700o(baseTextView5);
                }
                C37658n1 c37658n1M48015e6 = m48015e4();
                if (c37658n1M48015e6 == null || (baseTextView4 = c37658n1M48015e6.f84320t) == null) {
                    return;
                }
                C27046k.m66700o(baseTextView4);
                return;
            }
            return;
        }
        SellPaymentMethod.Response.PaymentMethod paymentMethod3 = this.f39416d0;
        String strM66668h3 = C27041f.m66668h(paymentMethod3 != null ? paymentMethod3.getCryptoMinAmount() : null);
        SellPaymentMethod.Response.PaymentMethod paymentMethod4 = this.f39416d0;
        String strM66668h4 = C27041f.m66668h(paymentMethod4 != null ? paymentMethod4.getCryptoMaxAmount() : null);
        C37658n1 c37658n1M48015e7 = m48015e4();
        if (c37658n1M48015e7 != null && (baseTextView3 = c37658n1M48015e7.f84319s) != null) {
            int i12 = R$string.payment_limit_tip;
            BigDecimal bigDecimalM66535e3 = DowngradeExKt.m66535e(strM66668h3, null, 1, null);
            PrecisionHelper precisionHelper2 = PrecisionHelper.f39545a;
            FastTradeCryptoCurrency.Response response4 = this.f39411Y;
            String strM92647l3 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e3, null, precisionHelper2.m48247a(C27041f.m66668h(response4 != null ? response4.getTitle() : null)), false, false, false, 0, null, 125, null));
            BigDecimal bigDecimalM66535e4 = DowngradeExKt.m66535e(strM66668h4, null, 1, null);
            FastTradeCryptoCurrency.Response response5 = this.f39411Y;
            String strM92647l4 = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e4, null, precisionHelper2.m48247a(C27041f.m66668h(response5 != null ? response5.getTitle() : null)), false, false, false, 0, null, 125, null));
            FastTradeCryptoCurrency.Response response6 = this.f39411Y;
            baseTextView3.setText(getStringRes(i12, strM92647l3, strM92647l4, C27041f.m66668h(response6 != null ? response6.getTitle() : null)));
        }
        if (strM66668h3.length() == 0 || strM66668h4.length() == 0) {
            C37658n1 c37658n1M48015e8 = m48015e4();
            if (c37658n1M48015e8 != null && (baseTextView2 = c37658n1M48015e8.f84319s) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C37658n1 c37658n1M48015e9 = m48015e4();
            if (c37658n1M48015e9 == null || (baseTextView = c37658n1M48015e9.f84320t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public final void m47993K4() {
        FastTradeInputView fastTradeInputView;
        FastTradeTextView fastTradeTextViewM47155j;
        FastTradeInputView fastTradeInputView2;
        FastTradeTextView fastTradeTextViewM47155j2;
        if (Intrinsics.areEqual(this.f39412Z, "FIAT")) {
            PrecisionHelper precisionHelper = PrecisionHelper.f39545a;
            FastTradeFiatCurrency.Response response = this.f39410X;
            int iM48248b = precisionHelper.m48248b(C27041f.m66668h(response != null ? response.getTitle() : null));
            C37658n1 c37658n1M48015e4 = m48015e4();
            if (c37658n1M48015e4 == null || (fastTradeInputView2 = c37658n1M48015e4.f84310j) == null || (fastTradeTextViewM47155j2 = fastTradeInputView2.m47155j()) == null) {
                return;
            }
            fastTradeTextViewM47155j2.setPrecision(iM48248b);
            return;
        }
        PrecisionHelper precisionHelper2 = PrecisionHelper.f39545a;
        FastTradeCryptoCurrency.Response response2 = this.f39411Y;
        int iM48247a = precisionHelper2.m48247a(C27041f.m66668h(response2 != null ? response2.getTitle() : null));
        C37658n1 c37658n1M48015e5 = m48015e4();
        if (c37658n1M48015e5 == null || (fastTradeInputView = c37658n1M48015e5.f84310j) == null || (fastTradeTextViewM47155j = fastTradeInputView.m47155j()) == null) {
            return;
        }
        fastTradeTextViewM47155j.setPrecision(iM48247a);
    }

    /* JADX INFO: renamed from: N4 */
    public static final boolean m47999N4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20927d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_use_fund_component_key", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m48011Z3() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.payment.event.PaymentEvent:fastSellRefreshPaymentMethod".length();
        }
        C12572a.m23692a(this, false, new SellFragment$bindEvent$$inlined$bindFlowEvent$default$1("com.kubi.payment.event.PaymentEvent:fastSellRefreshPaymentMethod", null, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    private final boolean m48012a4() {
        return this.f39416d0 != null && ((SellVM) m45647o3()).m48077c0(m48010Y3(), this.f39412Z) && ((SellVM) m45647o3()).m48076b0(m48010Y3(), this.f39412Z);
    }

    /* JADX INFO: renamed from: d4 */
    private final boolean m48014d4() {
        return ((Boolean) this.f39419g0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e4 */
    private final C37658n1 m48015e4() {
        return (C37658n1) this.f39409W.getValue(this, f39408i0[0]);
    }

    /* JADX INFO: renamed from: f4 */
    private final void m48016f4() {
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.f39417e0 = (FastTradeViewModel) new ViewModelProvider(fragmentActivityRequireActivity, c45071b).get(FastTradeViewModel.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "SellFragment init FastTradeViewModel", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: g4 */
    private final void m48017g4() {
        LiveData<FastTradeCryptoCurrency.Response> liveDataM47318y0;
        LiveData<FastTradeFiatCurrency.Response> liveDataM47319z0;
        FastTradeViewModel fastTradeViewModel = this.f39417e0;
        FastTradeCryptoCurrency.Response value = null;
        this.f39410X = (fastTradeViewModel == null || (liveDataM47319z0 = fastTradeViewModel.m47319z0()) == null) ? null : liveDataM47319z0.getValue();
        FastTradeViewModel fastTradeViewModel2 = this.f39417e0;
        if (fastTradeViewModel2 != null && (liveDataM47318y0 = fastTradeViewModel2.m47318y0()) != null) {
            value = liveDataM47318y0.getValue();
        }
        this.f39411Y = value;
        C44128b.m97259c("payment", "SellFragment initTradingPair fiatCurrency: " + this.f39410X + ", cryptoCurrency: " + this.f39411Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public static final Unit m48018h4(final SellFragment sellFragment) {
        if (sellFragment.m48014d4()) {
            C37304a c37304a = C37304a.f82764a;
            FastTradeCryptoCurrency.Response response = sellFragment.f39411Y;
            String strM66668h = C27041f.m66668h(response != null ? response.getTitle() : null);
            FastTradeFiatCurrency.Response response2 = sellFragment.f39410X;
            InterfaceC37749a.a.m85115j(c37304a, "fast_sell", strM66668h, C27041f.m66668h(response2 != null ? response2.getTitle() : null), ((SellVM) sellFragment.m45647o3()).m48066P(), null, null, null, new InterfaceC36555b() { // from class: com.kubi.payment.fasttradev2.sell.t
                @Override // cy.InterfaceC36555b
                /* JADX INFO: renamed from: a */
                public final void mo4404a(int i11, Intent intent) {
                    SellFragment.m48019i4(this.f39462a, i11, intent);
                }
            }, 112, null);
        } else {
            sellFragment.m47995L4();
        }
        C43852m.m96591c("B7FastSell", "balanceDescription", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static final Unit m48022l4(SellFragment sellFragment, C37658n1 c37658n1) {
        sellFragment.f39412Z = "CRYPTO";
        c37658n1.f84310j.setQuoteType("CRYPTO");
        sellFragment.m47993K4();
        FastTradeInputView fastTradeInputView = c37658n1.f84310j;
        FastTradeFiatCurrency.Response response = sellFragment.f39410X;
        String strM66668h = C27041f.m66668h(response != null ? response.getTitle() : null);
        FastTradeCryptoCurrency.Response response2 = sellFragment.f39411Y;
        fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(response2 != null ? response2.getTitle() : null));
        FastTradeTextView fastTradeTextViewM47155j = c37658n1.f84310j.m47155j();
        if (fastTradeTextViewM47155j != null) {
            fastTradeTextViewM47155j.setAmount(((SellVM) sellFragment.m45647o3()).m48064L());
        }
        C43852m.m96589a("B7FastSell", "button", "sellAll", sellFragment.m47978C4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m48023m4(C37658n1 c37658n1, BaseTextView showByCondition) {
        Intrinsics.checkNotNullParameter(showByCondition, "$this$showByCondition");
        c37658n1.f84320t.getPaint().setFlags(8);
        c37658n1.f84320t.getPaint().setAntiAlias(true);
        BaseTextView tvNeedHigherLimits = c37658n1.f84320t;
        Intrinsics.checkNotNullExpressionValue(tvNeedHigherLimits, "tvNeedHigherLimits");
        C27046k.m66711z(tvNeedHigherLimits, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellFragment.m48024n4();
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m48024n4() {
        H5Helper.f39544a.m48245a();
        C43852m.m96590b("B7FastTrade", "otcLarge", "1", TuplesKt.m90091to("type", "sell"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m48025o4(SellFragment sellFragment) {
        FastTradeViewModel fastTradeViewModel = sellFragment.f39417e0;
        if (fastTradeViewModel != null) {
            fastTradeViewModel.m47289P0();
        }
        C43852m.m96591c("B7FastSell", "cryptoCurrency", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m48033w4(SellFragment sellFragment, boolean z11) {
        if (z11) {
            SellCryptoCurrencyDialog.Companion companion = SellCryptoCurrencyDialog.f39395w0;
            FragmentManager childFragmentManager = sellFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    private final void m48035y4(FastTradeCryptoCurrency.Response response) {
        if (Intrinsics.areEqual(this.f39411Y, response)) {
            return;
        }
        this.f39411Y = response;
        m47997M4();
        SellVM sellVM = (SellVM) m45647o3();
        FastTradeCryptoCurrency.Response response2 = this.f39411Y;
        sellVM.m48078d0(C27041f.m66668h(response2 != null ? response2.getTitle() : null));
        m47976B4();
    }

    /* JADX INFO: renamed from: z4 */
    private final void m48036z4(FastTradeFiatCurrency.Response response) {
        C44128b.m97259c("payment", "SellFragment onFiatCurrencyChanged newFiatCurrency:" + response + ",fiatCurrency:" + this.f39410X);
        if (Intrinsics.areEqual(this.f39410X, response)) {
            return;
        }
        this.f39410X = response;
        m47976B4();
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final Map<String, String> m48038c4() {
        Pair pairM90091to = TuplesKt.m90091to("quoteType", this.f39412Z);
        Pair pairM90091to2 = TuplesKt.m90091to("amount", m48010Y3());
        FastTradeFiatCurrency.Response response = this.f39410X;
        Pair pairM90091to3 = TuplesKt.m90091to("fiatCurrency", C27041f.m66668h(response != null ? response.getTitle() : null));
        FastTradeCryptoCurrency.Response response2 = this.f39411Y;
        return MapsKt.mutableMapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("cryptoCurrency", C27041f.m66668h(response2 != null ? response2.getTitle() : null)));
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m48011Z3();
        m48026p4(false);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_sell;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<SellVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(SellVM.class);
    }

    public SellFragment() {
        boolean zMo45626f;
        setPageId("B7FastSell");
        Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zMo45626f = ((IPaymentSiteService) objM56186h).mo45626f();
        } else {
            zMo45626f = true;
        }
        this.f39418f0 = zMo45626f;
        this.f39419g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.sell.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SellFragment.m47999N4());
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    private final void m47976B4() {
        FastTradeInputView fastTradeInputView;
        String title;
        C37658n1 c37658n1M48015e4 = m48015e4();
        if (c37658n1M48015e4 != null && (fastTradeInputView = c37658n1M48015e4.f84310j) != null) {
            fastTradeInputView.setQuoteType(this.f39412Z);
            FastTradeFiatCurrency.Response response = this.f39410X;
            String title2 = null;
            if (response != null) {
                title = response.getTitle();
            } else {
                title = null;
            }
            String strM66668h = C27041f.m66668h(title);
            FastTradeCryptoCurrency.Response response2 = this.f39411Y;
            if (response2 != null) {
                title2 = response2.getTitle();
            }
            fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(title2));
        }
        m47993K4();
        m48026p4(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    private final void m47982E4() {
        BaseTextView baseTextView;
        String currency;
        C37658n1 c37658n1M48015e4 = m48015e4();
        if (c37658n1M48015e4 != null && (baseTextView = c37658n1M48015e4.f84313m) != null) {
            int i11 = R$string.payment_price;
            String strM48065O = ((SellVM) m45647o3()).m48065O();
            Balance.Response value = ((SellVM) m45647o3()).m48068S().getValue();
            if (value != null) {
                currency = value.getCurrency();
            } else {
                currency = null;
            }
            baseTextView.setText(getStringRes(i11, strM48065O, C27041f.m66668h(currency)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    private final void m47984F4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        String currency;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        if (((SellVM) m45647o3()).m48074Z(m48010Y3())) {
            C37658n1 c37658n1M48015e4 = m48015e4();
            if (c37658n1M48015e4 != null && (baseTextView8 = c37658n1M48015e4.f84314n) != null) {
                C27046k.m66700o(baseTextView8);
                return;
            }
            return;
        }
        if (((SellVM) m45647o3()).m48077c0(m48010Y3(), this.f39412Z)) {
            this.f39414b0 = false;
            C37658n1 c37658n1M48015e5 = m48015e4();
            if (c37658n1M48015e5 != null && (baseTextView7 = c37658n1M48015e5.f84314n) != null) {
                C27046k.m66700o(baseTextView7);
                return;
            }
            return;
        }
        this.f39414b0 = true;
        C37658n1 c37658n1M48015e6 = m48015e4();
        if (c37658n1M48015e6 != null && (baseTextView6 = c37658n1M48015e6.f84314n) != null) {
            int i11 = R$string.payment_available_balance_tip;
            String strM48065O = ((SellVM) m45647o3()).m48065O();
            Balance.Response value = ((SellVM) m45647o3()).m48068S().getValue();
            if (value != null) {
                currency = value.getCurrency();
            } else {
                currency = null;
            }
            baseTextView6.setText(getStringRes(i11, strM48065O, C27041f.m66668h(currency)));
        }
        C37658n1 c37658n1M48015e7 = m48015e4();
        if (c37658n1M48015e7 != null && (baseTextView5 = c37658n1M48015e7.f84314n) != null) {
            baseTextView5.setTextColor(getColorRes(R$color.brandRed));
        }
        C37658n1 c37658n1M48015e8 = m48015e4();
        if (c37658n1M48015e8 != null && (baseTextView4 = c37658n1M48015e8.f84314n) != null) {
            C27046k.m66685H(baseTextView4);
        }
        C37658n1 c37658n1M48015e9 = m48015e4();
        if (c37658n1M48015e9 != null && (baseTextView3 = c37658n1M48015e9.f84318r) != null) {
            C27046k.m66700o(baseTextView3);
        }
        C37658n1 c37658n1M48015e10 = m48015e4();
        if (c37658n1M48015e10 != null && (baseTextView2 = c37658n1M48015e10.f84319s) != null) {
            C27046k.m66700o(baseTextView2);
        }
        C37658n1 c37658n1M48015e11 = m48015e4();
        if (c37658n1M48015e11 != null && (baseTextView = c37658n1M48015e11.f84320t) != null) {
            C27046k.m66700o(baseTextView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    private final void m47995L4() {
        Balance.Response value = ((SellVM) m45647o3()).m48068S().getValue();
        if (value == null) {
            return;
        }
        FastSellBalanceExplainDialog.Companion companion = FastSellBalanceExplainDialog.f38779t0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(value, childFragmentManager);
    }

    /* JADX INFO: renamed from: M4 */
    private final void m47997M4() {
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView;
        String title;
        C37658n1 c37658n1M48015e4 = m48015e4();
        String iconUrl = null;
        if (c37658n1M48015e4 != null && (baseTextView = c37658n1M48015e4.f84317q) != null) {
            FastTradeCryptoCurrency.Response response = this.f39411Y;
            if (response != null) {
                title = response.getTitle();
            } else {
                title = null;
            }
            baseTextView.setText(C27041f.m66668h(title));
        }
        C37658n1 c37658n1M48015e5 = m48015e4();
        if (c37658n1M48015e5 != null && (appCompatImageView = c37658n1M48015e5.f84304d) != null) {
            Context contextM45646n3 = m45646n3();
            FastTradeCryptoCurrency.Response response2 = this.f39411Y;
            if (response2 != null) {
                iconUrl = response2.getIconUrl();
            }
            C24277v.m58540e(contextM45646n3, iconUrl, appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private final String m48010Y3() {
        String strM47153f;
        FastTradeInputView fastTradeInputView;
        C37658n1 c37658n1M48015e4 = m48015e4();
        if (c37658n1M48015e4 != null && (fastTradeInputView = c37658n1M48015e4.f84310j) != null) {
            strM47153f = fastTradeInputView.m47153f();
        } else {
            strM47153f = null;
        }
        return C27041f.m66669i(strM47153f, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public final void m48013b4() {
        C44128b.m97259c("payment", "SellFragment onAmountChanged amount:" + m48010Y3());
        m47984F4();
        m47989I4();
        m47987H4();
        C37658n1 c37658n1M48015e4 = m48015e4();
        if (c37658n1M48015e4 != null) {
            m48037G4(c37658n1M48015e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public static final void m48019i4(SellFragment sellFragment, int i11, Intent intent) {
        String title;
        SellVM sellVM = (SellVM) sellFragment.m45647o3();
        FastTradeCryptoCurrency.Response response = sellFragment.f39411Y;
        if (response != null) {
            title = response.getTitle();
        } else {
            title = null;
        }
        sellVM.m48078d0(C27041f.m66668h(title));
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m48021k4(SellFragment sellFragment) {
        sellFragment.m47980D4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m48026p4(boolean z11) {
        String title;
        SellVM sellVM = (SellVM) m45647o3();
        FastTradeFiatCurrency.Response response = this.f39410X;
        String title2 = null;
        if (response != null) {
            title = response.getTitle();
        } else {
            title = null;
        }
        String strM66668h = C27041f.m66668h(title);
        FastTradeCryptoCurrency.Response response2 = this.f39411Y;
        if (response2 != null) {
            title2 = response2.getTitle();
        }
        sellVM.m48079e0(strM66668h, C27041f.m66668h(title2), m48010Y3(), this.f39412Z, z11);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m48027q4(SellFragment sellFragment, FastTradeFiatCurrency.Response response) {
        Intrinsics.checkNotNull(response);
        sellFragment.m48036z4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m48028r4(SellFragment sellFragment, FastTradeCryptoCurrency.Response response) {
        Intrinsics.checkNotNull(response);
        sellFragment.m48035y4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m48029s4(SellFragment sellFragment, Balance.Response response) {
        sellFragment.m47982E4();
        sellFragment.m48013b4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m48030t4(SellFragment sellFragment, SellPaymentMethod.Response.PaymentMethod paymentMethod) {
        sellFragment.m47974A4(paymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m48031u4(SellFragment sellFragment, Boolean bool) {
        if (bool.booleanValue()) {
            SellPaymentMethodDialog.Companion companion = SellPaymentMethodDialog.f39453u0;
            FragmentManager childFragmentManager = sellFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public static final Unit m48032v4(SellFragment sellFragment, Boolean bool) {
        if (bool.booleanValue()) {
            String strM48063K = ((SellVM) sellFragment.m45647o3()).m48063K(sellFragment.m48010Y3(), sellFragment.f39412Z);
            C44128b.m97259c("payment", "preCheckPassed cryptoAmount:" + strM48063K);
            FastSellHelper fastSellHelper = FastSellHelper.f38946a;
            Context contextM45646n3 = sellFragment.m45646n3();
            FragmentManager childFragmentManager = sellFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            fastSellHelper.m47141c(contextM45646n3, childFragmentManager, sellFragment.f39416d0, strM48063K);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m48034x4(SellFragment sellFragment, Boolean bool) {
        if (bool.booleanValue()) {
            sellFragment.showLoadingDialog();
        } else {
            sellFragment.hideLoadingDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final void m48037G4(C37658n1 c37658n1) {
        if (((SellVM) m45647o3()).m48074Z(m48010Y3())) {
            KcSecondaryButton tvBuyMax = c37658n1.f84315o;
            Intrinsics.checkNotNullExpressionValue(tvBuyMax, "tvBuyMax");
            ViewExtKt.m66594y(tvBuyMax);
            KcPrimaryButton tvConfirm = c37658n1.f84316p;
            Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
            ViewExtKt.m66577h(tvConfirm);
            return;
        }
        if (this.f39413a0) {
            KcSecondaryButton tvBuyMax2 = c37658n1.f84315o;
            Intrinsics.checkNotNullExpressionValue(tvBuyMax2, "tvBuyMax");
            ViewExtKt.m66577h(tvBuyMax2);
            KcPrimaryButton tvConfirm2 = c37658n1.f84316p;
            Intrinsics.checkNotNullExpressionValue(tvConfirm2, "tvConfirm");
            ViewExtKt.m66594y(tvConfirm2);
            c37658n1.f84316p.setText(getStringRes(R$string.payment_fast_sell_add_new_card, new Object[0]));
            c37658n1.f84316p.setEnabled(m48012a4());
            return;
        }
        KcSecondaryButton tvBuyMax3 = c37658n1.f84315o;
        Intrinsics.checkNotNullExpressionValue(tvBuyMax3, "tvBuyMax");
        ViewExtKt.m66577h(tvBuyMax3);
        KcPrimaryButton tvConfirm3 = c37658n1.f84316p;
        Intrinsics.checkNotNullExpressionValue(tvConfirm3, "tvConfirm");
        ViewExtKt.m66594y(tvConfirm3);
        c37658n1.f84316p.setText(getStringRes(R$string.payment_fast_sell_preview_order, new Object[0]));
        c37658n1.f84316p.setEnabled(m48012a4());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m48016f4();
        m48017g4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String title;
        super.onResume();
        C44128b.m97259c("payment", "SellFragment onResume");
        SellVM sellVM = (SellVM) m45647o3();
        FastTradeCryptoCurrency.Response response = this.f39411Y;
        if (response != null) {
            title = response.getTitle();
        } else {
            title = null;
        }
        sellVM.m48078d0(C27041f.m66668h(title));
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        String title;
        final C37658n1 c37658n1M48015e4 = m48015e4();
        if (c37658n1M48015e4 == null) {
            return;
        }
        String title2 = null;
        C21457l.m49859g(c37658n1M48015e4.f84320t, this.f39418f0, null, new Function1() { // from class: com.kubi.payment.fasttradev2.sell.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellFragment.m48023m4(c37658n1M48015e4, (BaseTextView) obj);
            }
        }, 2, null);
        FastTradeInputView fastTradeInputView = c37658n1M48015e4.f84310j;
        fastTradeInputView.setTradeType("SELL");
        fastTradeInputView.setQuoteType(this.f39412Z);
        FastTradeFiatCurrency.Response response = this.f39410X;
        if (response != null) {
            title = response.getTitle();
        } else {
            title = null;
        }
        String strM66668h = C27041f.m66668h(title);
        FastTradeCryptoCurrency.Response response2 = this.f39411Y;
        if (response2 != null) {
            title2 = response2.getTitle();
        }
        fastTradeInputView.m47154i(strM66668h, C27041f.m66668h(title2));
        m47993K4();
        fastTradeInputView.setFastInputListener(new C20924a(fastTradeInputView));
        FastTradeTextView fastTradeTextViewM47155j = c37658n1M48015e4.f84310j.m47155j();
        if (fastTradeTextViewM47155j != null) {
            c37658n1M48015e4.f84308h.addListener(fastTradeTextViewM47155j);
            fastTradeTextViewM47155j.registerListener(new C20925b());
        }
        m47997M4();
        ConstraintLayout layoutCryptoCurrency = c37658n1M48015e4.f84309i;
        Intrinsics.checkNotNullExpressionValue(layoutCryptoCurrency, "layoutCryptoCurrency");
        C27046k.m66711z(layoutCryptoCurrency, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellFragment.m48025o4(this.f39464b);
            }
        }, 1, null);
        DashTextView tvAvailable = c37658n1M48015e4.f84312l;
        Intrinsics.checkNotNullExpressionValue(tvAvailable, "tvAvailable");
        C27046k.m66711z(tvAvailable, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellFragment.m48018h4(this.f39465b);
            }
        }, 1, null);
        ConstraintLayout layoutPaymentMethod = c37658n1M48015e4.f84311k;
        Intrinsics.checkNotNullExpressionValue(layoutPaymentMethod, "layoutPaymentMethod");
        C27046k.m66711z(layoutPaymentMethod, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellFragment.m48020j4(this.f39466b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c37658n1M48015e4.f84316p;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellFragment.m48021k4(this.f39467b);
            }
        }, 1, null);
        KcSecondaryButton tvBuyMax = c37658n1M48015e4.f84315o;
        Intrinsics.checkNotNullExpressionValue(tvBuyMax, "tvBuyMax");
        C27046k.m66711z(tvBuyMax, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.sell.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellFragment.m48022l4(this.f39468b, c37658n1M48015e4);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        LiveData<Boolean> liveDataM45660s;
        LiveData<C42875h<Boolean>> liveDataM47279C0;
        LiveData<FastTradeCryptoCurrency.Response> liveDataM47318y0;
        LiveData<FastTradeFiatCurrency.Response> liveDataM47319z0;
        super.mo45650r3();
        FastTradeViewModel fastTradeViewModel = this.f39417e0;
        if (fastTradeViewModel != null && (liveDataM47319z0 = fastTradeViewModel.m47319z0()) != null) {
            liveDataM47319z0.observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellFragment.m48027q4(this.f39433b, (FastTradeFiatCurrency.Response) obj);
                }
            }));
        }
        FastTradeViewModel fastTradeViewModel2 = this.f39417e0;
        if (fastTradeViewModel2 != null && (liveDataM47318y0 = fastTradeViewModel2.m47318y0()) != null) {
            liveDataM47318y0.observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellFragment.m48028r4(this.f39435b, (FastTradeCryptoCurrency.Response) obj);
                }
            }));
        }
        ((SellVM) m45647o3()).m48068S().observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellFragment.m48029s4(this.f39436b, (Balance.Response) obj);
            }
        }));
        ((SellVM) m45647o3()).m48071V().observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellFragment.m48030t4(this.f39449b, (SellPaymentMethod.Response.PaymentMethod) obj);
            }
        }));
        ((SellVM) m45647o3()).m48072W().observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellFragment.m48031u4(this.f39450b, (Boolean) obj);
            }
        }));
        ((SellVM) m45647o3()).m48070U().observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellFragment.m48032v4(this.f39451b, (Boolean) obj);
            }
        }));
        FastTradeViewModel fastTradeViewModel3 = this.f39417e0;
        if (fastTradeViewModel3 != null && (liveDataM47279C0 = fastTradeViewModel3.m47279C0()) != null) {
            liveDataM47279C0.observe(getViewLifecycleOwner(), new C42876i(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellFragment.m48033w4(this.f39460b, ((Boolean) obj).booleanValue());
                }
            }));
        }
        FastTradeViewModel fastTradeViewModel4 = this.f39417e0;
        if (fastTradeViewModel4 != null && (liveDataM45660s = fastTradeViewModel4.m45660s()) != null) {
            liveDataM45660s.observe(getViewLifecycleOwner(), new C20926c(new Function1() { // from class: com.kubi.payment.fasttradev2.sell.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellFragment.m48034x4(this.f39461b, (Boolean) obj);
                }
            }));
        }
    }
}
