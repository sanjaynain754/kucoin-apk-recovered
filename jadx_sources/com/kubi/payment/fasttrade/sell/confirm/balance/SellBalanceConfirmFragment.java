package com.kubi.payment.fasttrade.sell.confirm.balance;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$layout;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams;
import com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmHeaderView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellLivePriceExplainView;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
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
import p270ft.C37663o1;
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

/* JADX INFO: compiled from: SellBalanceConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment;", "Lcom/kubi/payment/fasttrade/sell/confirm/SellConfirmFragment;", "Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "securityWidgetOpen", "", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "Lkotlin/Lazy;", "placeOrder", "", "oldPlaceOrder", "observeData", "headerView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmHeaderView;", "confirmInfoView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView;", "livePriceView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellLivePriceExplainView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellBalanceConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellBalanceConfirmFragment.kt\ncom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,160:1\n147#2,16:161\n35#3,4:177\n39#3:183\n44#4,2:181\n44#5,2:184\n*S KotlinDebug\n*F\n+ 1 SellBalanceConfirmFragment.kt\ncom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment\n*L\n43#1:161,16\n57#1:177,4\n57#1:183\n57#1:181,2\n73#1:184,2\n*E\n"})
public final class SellBalanceConfirmFragment extends SellConfirmFragment<SellBalanceConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f38847Y = C45681e.m100799e(this, new Function1<SellBalanceConfirmFragment, C37663o1>() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.SellBalanceConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37663o1 invoke(@NotNull SellBalanceConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37663o1.m84910a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37663o1, Unit>() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.SellBalanceConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37663o1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37663o1 c37663o1) {
            invoke(c37663o1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f38848Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f38846b0 = {Reflection.property1(new PropertyReference1Impl(SellBalanceConfirmFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f38845a0 = new Companion(null);

    /* JADX INFO: compiled from: SellBalanceConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, SellCommonConfirmExtraParams sellCommonConfirmExtraParams, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            companion.launch(context, sellCommonConfirmExtraParams, str);
        }

        public final void launch(@NotNull Context context, @NotNull SellCommonConfirmExtraParams extraParams, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            BaseActivity.INSTANCE.launch(context, SellBalanceConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.balance.SellBalanceConfirmFragment$a */
    /* JADX INFO: compiled from: SellBalanceConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20604a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38849b;

        public C20604a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38849b = function;
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
            return this.f38849b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38849b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.balance.SellBalanceConfirmFragment$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20605b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: B4 */
    private final boolean m47011B4() {
        return ((Boolean) this.f38848Z.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m47012D4(SellBalanceConfirmFragment sellBalanceConfirmFragment, String str) throws JSONException {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/order/result", false, 2, null)).m4038a("orderId", str).m4048k();
        SellConfirmFragment.m46997v4(sellBalanceConfirmFragment, true, null, 2, null);
        sellBalanceConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public static final void m47013F4(SellBalanceConfirmFragment sellBalanceConfirmFragment, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            ((SellBalanceConfirmVM) sellBalanceConfirmFragment.m45647o3()).m47028U("pmtapi/v2/crypto/balance/trade", "");
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m47014G4(SellBalanceConfirmFragment sellBalanceConfirmFragment, Throwable th2) {
        if (th2 instanceof ApiException) {
            C38301b1.m86442O(sellBalanceConfirmFragment, (ApiException) th2, null, 4, null);
        }
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FastTrackData fastTrackData = new FastTrackData("sell", null, 2, null);
        SellCommonConfirmExtraParams f38841w = sellBalanceConfirmFragment.getF38841W();
        fastTrackData.setFiatCurrency(f38841w != null ? f38841w.getFiatCurrency() : null);
        SellCommonConfirmExtraParams f38841w2 = sellBalanceConfirmFragment.getF38841W();
        fastTrackData.setCryptoCurrency(f38841w2 != null ? f38841w2.getCryptoCurrency() : null);
        SellCommonConfirmExtraParams f38841w3 = sellBalanceConfirmFragment.getF38841W();
        fastTrackData.setPaymentMethodCode(f38841w3 != null ? f38841w3.getPaymentMethodCode() : null);
        SellCommonConfirmExtraParams f38841w4 = sellBalanceConfirmFragment.getF38841W();
        fastTrackData.setChannelId(f38841w4 != null ? f38841w4.getChannelId() : null);
        Unit unit = Unit.INSTANCE;
        track.mo49802j("CHECK_PWD_ERROR", false, "-10006:CHECK_PWD_ERROR", fastTrackData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public static final Unit m47015H4(SellBalanceConfirmFragment sellBalanceConfirmFragment, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 == 0 && str2 != null && str2.length() != 0) {
            ((SellBalanceConfirmVM) sellBalanceConfirmFragment.m45647o3()).m47028U("pmtapi/v3/crypto/balance/trade", str2);
        } else if (i11 == 78858) {
            sellBalanceConfirmFragment.m47022E4();
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str3 + ", serverErrorCode" + map), "payment_sell_balance", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final boolean m47016I4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20605b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_sell_balance", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: C4 */
    public final C37663o1 m47021C4() {
        return (C37663o1) this.f38847Y.getValue(this, f38846b0[0]);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m47022E4() {
        C38301b1.m86435H(this, ValidationBizEnum.VERIFY_WITHDRAWAL_PASSWORD, null, new Consumer() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SellBalanceConfirmFragment.m47013F4(this.f38855b, obj);
            }
        }, new Consumer() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SellBalanceConfirmFragment.m47014G4(this.f38856b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_sell_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<SellBalanceConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(SellBalanceConfirmVM.class);
    }

    public SellBalanceConfirmFragment() {
        setPageId("B7SellCryBalance");
        this.f38848Z = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SellBalanceConfirmFragment.m47016I4());
            }
        });
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public SellConfirmInfoView mo46998P3() {
        C37663o1 c37663o1M47021C4 = m47021C4();
        if (c37663o1M47021C4 != null) {
            return c37663o1M47021C4.f84358c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Q3 */
    public KcPrimaryButton mo46999Q3() {
        C37663o1 c37663o1M47021C4 = m47021C4();
        if (c37663o1M47021C4 != null) {
            return c37663o1M47021C4.f84362g;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: T3 */
    public SellConfirmHeaderView mo47002T3() {
        C37663o1 c37663o1M47021C4 = m47021C4();
        if (c37663o1M47021C4 != null) {
            return c37663o1M47021C4.f84357b;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: X3 */
    public SellLivePriceExplainView mo47003X3() {
        C37663o1 c37663o1M47021C4 = m47021C4();
        if (c37663o1M47021C4 != null) {
            return c37663o1M47021C4.f84360e;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    /* JADX INFO: renamed from: e4 */
    public void mo47006e4() {
        if (m47011B4()) {
            ISafeService iSafeService = ISafeService.f46324a.get();
            Context contextM45646n3 = m45646n3();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ISafeService.m56306a(iSafeService, contextM45646n3, viewLifecycleOwner, "RV_BALANCE", null, 0, true, new Function7() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.c
                @Override // p852kotlin.jvm.functions.Function7
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    return SellBalanceConfirmFragment.m47015H4(this.f38854b, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
                }
            }, 24, null);
            return;
        }
        m47022E4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((SellBalanceConfirmVM) m45647o3()).m47026S().observe(getViewLifecycleOwner(), new C20604a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.balance.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellBalanceConfirmFragment.m47012D4(this.f38853b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: t4 */
    public PaymentTermView mo47008t4() {
        C37663o1 c37663o1M47021C4 = m47021C4();
        if (c37663o1M47021C4 != null) {
            return c37663o1M47021C4.f84361f;
        }
        return null;
    }
}
