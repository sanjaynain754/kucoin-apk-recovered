package com.kubi.payment.fasttradev2.buy.confirm.balance;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$layout;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import ht.C38301b1;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37613e1;
import p569qq.C43846g;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BuyBalanceConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006("}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/balance/BuyBalanceConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/balance/BuyBalanceConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "securityWidgetOpen", "", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "Lkotlin/Lazy;", "placeOrder", "", "oldPlaceOrder", "observeData", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyBalanceConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBalanceConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/balance/BuyBalanceConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,181:1\n147#2,16:182\n35#3,4:198\n39#3:204\n44#4,2:202\n44#5,2:205\n*S KotlinDebug\n*F\n+ 1 BuyBalanceConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/balance/BuyBalanceConfirmFragment\n*L\n44#1:182,16\n58#1:198,4\n58#1:204\n58#1:202,2\n74#1:205,2\n*E\n"})
public final class BuyBalanceConfirmFragment extends BuyCommonConfirmFragment<BuyBalanceConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39086Y = C45681e.m100799e(this, new Function1<BuyBalanceConfirmFragment, C37613e1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.BuyBalanceConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37613e1 invoke(@NotNull BuyBalanceConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37613e1.m84807a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37613e1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.BuyBalanceConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37613e1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37613e1 c37613e1) {
            invoke(c37613e1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f39087Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f39085b0 = {Reflection.property1(new PropertyReference1Impl(BuyBalanceConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f39084a0 = new Companion(null);

    /* JADX INFO: compiled from: BuyBalanceConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/balance/BuyBalanceConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            companion.launch(context, buyCommonConfirmExtraParams, str);
        }

        public final void launch(@NotNull Context context, @NotNull BuyCommonConfirmExtraParams extraParams, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            BaseActivity.INSTANCE.launch(context, BuyBalanceConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.balance.BuyBalanceConfirmFragment$a */
    /* JADX INFO: compiled from: BuyBalanceConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20725a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39088b;

        public C20725a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39088b = function;
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
            return this.f39088b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39088b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.balance.BuyBalanceConfirmFragment$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20726b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: G4 */
    private final boolean m47554G4() {
        return ((Boolean) this.f39087Z.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I4 */
    private final void m47556I4() {
        C38301b1.m86435H(this, ValidationBizEnum.VERIFY_WITHDRAWAL_PASSWORD, null, new Consumer() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyBalanceConfirmFragment.m47557J4(this.f39094b, obj);
            }
        }, new Consumer() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BuyBalanceConfirmFragment.m47558K4(this.f39095b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public static final void m47557J4(BuyBalanceConfirmFragment buyBalanceConfirmFragment, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            ((BuyBalanceConfirmVM) buyBalanceConfirmFragment.m45647o3()).m47567d0("pmtapi/v2/balance/trade/buy", "");
        }
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m47558K4(BuyBalanceConfirmFragment buyBalanceConfirmFragment, Throwable th2) {
        if (th2 instanceof ApiException) {
            C38301b1.m86442O(buyBalanceConfirmFragment, (ApiException) th2, null, 4, null);
        }
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FastTrackData fastTrackData = new FastTrackData("buy", null, 2, null);
        BuyCommonConfirmExtraParams f39061w = buyBalanceConfirmFragment.getF39061W();
        fastTrackData.setFiatCurrency(f39061w != null ? f39061w.getFiatCurrency() : null);
        BuyCommonConfirmExtraParams f39061w2 = buyBalanceConfirmFragment.getF39061W();
        fastTrackData.setCryptoCurrency(f39061w2 != null ? f39061w2.getCryptoCurrency() : null);
        BuyCommonConfirmExtraParams f39061w3 = buyBalanceConfirmFragment.getF39061W();
        fastTrackData.setPaymentMethodCode(f39061w3 != null ? f39061w3.getPaymentMethodCode() : null);
        BuyCommonConfirmExtraParams f39061w4 = buyBalanceConfirmFragment.getF39061W();
        fastTrackData.setChannelId(f39061w4 != null ? f39061w4.getChannelId() : null);
        Unit unit = Unit.INSTANCE;
        track.mo49802j("CHECK_PWD_ERROR", false, "-10006:CHECK_PWD_ERROR", fastTrackData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public static final Unit m47559L4(BuyBalanceConfirmFragment buyBalanceConfirmFragment, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 == 0 && str2 != null && str2.length() != 0) {
            ((BuyBalanceConfirmVM) buyBalanceConfirmFragment.m45647o3()).m47567d0("pmtapi/v3/balance/trade/buy", str2);
        } else if (i11 == 78858) {
            buyBalanceConfirmFragment.m47556I4();
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str3 + ", serverErrorCode" + map), "payment_buy_balance", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public static final boolean m47560M4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20726b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_buy_balance", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: F4 */
    public final C37613e1 m47561F4() {
        return (C37613e1) this.f39086Y.getValue(this, f39085b0[0]);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyBalanceConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyBalanceConfirmVM.class);
    }

    public BuyBalanceConfirmFragment() {
        setPageId("B7BuyCryBalance");
        this.f39087Z = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(BuyBalanceConfirmFragment.m47560M4());
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m47555H4(BuyBalanceConfirmFragment buyBalanceConfirmFragment, String str) throws JSONException {
        if (buyBalanceConfirmFragment.m47499W3()) {
            FlutterNavigationHelper flutterNavigationHelper = FlutterNavigationHelper.f39477a;
            Intrinsics.checkNotNull(str);
            flutterNavigationHelper.m48167f(str);
        } else {
            Intrinsics.checkNotNull(str);
            buyBalanceConfirmFragment.m47500X3(str);
        }
        BuyCommonConfirmFragment.m47494z4(buyBalanceConfirmFragment, true, null, 2, null);
        if (buyBalanceConfirmFragment.m47499W3()) {
            C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForRecurring", Boolean.TRUE, 0L, 4, null);
        } else {
            C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForBalance", Boolean.TRUE, 0L, 4, null);
        }
        buyBalanceConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83837i;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83831c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83832d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public BuyConfirmLivePriceExplainView mo47501Y3() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83834f;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83833e;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        if (m47554G4()) {
            ISafeService iSafeService = ISafeService.f46324a.get();
            Context contextM45646n3 = m45646n3();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ISafeService.m56306a(iSafeService, contextM45646n3, viewLifecycleOwner, "RV_BALANCE", null, 0, true, new Function7() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.c
                @Override // p852kotlin.jvm.functions.Function7
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    return BuyBalanceConfirmFragment.m47559L4(this.f39093b, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
                }
            }, 24, null);
            return;
        }
        m47556I4();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83835g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BuyBalanceConfirmVM) m45647o3()).m47565b0().observe(getViewLifecycleOwner(), new C20725a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.balance.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBalanceConfirmFragment.m47555H4(this.f39092b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        C37613e1 c37613e1M47561F4 = m47561F4();
        if (c37613e1M47561F4 != null) {
            return c37613e1M47561F4.f83836h;
        }
        return null;
    }
}
