package com.kubi.payment.fasttrade.sell.confirm.bankcard;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$layout;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams;
import com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmHeaderView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellLivePriceExplainView;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37663o1;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: SellBankCardConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment;", "Lcom/kubi/payment/fasttrade/sell/confirm/SellConfirmFragment;", "Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initViews", "", "placeOrder", "observeData", "headerView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmHeaderView;", "confirmInfoView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView;", "livePriceView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellLivePriceExplainView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellBankCardConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellBankCardConfirmFragment.kt\ncom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,151:1\n147#2,16:152\n*S KotlinDebug\n*F\n+ 1 SellBankCardConfirmFragment.kt\ncom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment\n*L\n36#1:152,16\n*E\n"})
public final class SellBankCardConfirmFragment extends SellConfirmFragment<SellBankCardVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f38859Y = C45681e.m100799e(this, new Function1<SellBankCardConfirmFragment, C37663o1>() { // from class: com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37663o1 invoke(@NotNull SellBankCardConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37663o1.m84910a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37663o1, Unit>() { // from class: com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37663o1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37663o1 c37663o1) {
            invoke(c37663o1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f38858a0 = {Reflection.property1(new PropertyReference1Impl(SellBankCardConfirmFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f38857Z = new Companion(null);

    /* JADX INFO: compiled from: SellBankCardConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
            BaseActivity.INSTANCE.launch(context, SellBankCardConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardConfirmFragment$a */
    /* JADX INFO: compiled from: SellBankCardConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20613a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38860b;

        public C20613a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38860b = function;
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
            return this.f38860b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38860b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public static final Unit m47029A4(SellBankCardConfirmFragment sellBankCardConfirmFragment, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", false);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("B7FastSellBankCardConfirm", "riskComponent", "1", jSONObject);
        } else if (str2 == null || str2.length() == 0) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_success", false);
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96593e("B7FastSellBankCardConfirm", "riskComponent", "1", jSONObject2);
        } else {
            ((SellBankCardVM) sellBankCardConfirmFragment.m45647o3()).m47047U(str2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("is_success", true);
            Unit unit3 = Unit.INSTANCE;
            C43852m.m96593e("B7FastSellBankCardConfirm", "riskComponent", "1", jSONObject3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    private final C37663o1 m47032y4() {
        return (C37663o1) this.f38859Y.getValue(this, f38858a0[0]);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m47033z4(SellBankCardConfirmFragment sellBankCardConfirmFragment, String str) throws JSONException {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/order/result", false, 2, null)).m4038a("orderId", str).m4048k();
        SellConfirmFragment.m46997v4(sellBankCardConfirmFragment, true, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    /* JADX INFO: renamed from: e4 */
    public void mo47006e4() throws JSONException {
        ISafeService iSafeService = ISafeService.f46324a.get();
        Context contextM45646n3 = m45646n3();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        JSONObject jSONObject = new JSONObject();
        SellCommonConfirmExtraParams f38841w = getF38841W();
        jSONObject.put("paymentMethodCode", f38841w != null ? f38841w.getPaymentMethodCode() : null);
        SellCommonConfirmExtraParams f38841w2 = getF38841W();
        jSONObject.put("channelId", f38841w2 != null ? f38841w2.getChannelId() : null);
        SellCommonConfirmExtraParams f38841w3 = getF38841W();
        jSONObject.put("fiatCurrency", f38841w3 != null ? f38841w3.getFiatCurrency() : null);
        SellCommonConfirmExtraParams f38841w4 = getF38841W();
        jSONObject.put("cryptoCurrency", f38841w4 != null ? f38841w4.getCryptoCurrency() : null);
        SellCommonConfirmExtraParams f38841w5 = getF38841W();
        jSONObject.put("cryptoAmount", f38841w5 != null ? f38841w5.getCryptoAmount() : null);
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ISafeService.m56306a(iSafeService, contextM45646n3, viewLifecycleOwner, "RV_CARD_PAYOUT", string, 0, false, new Function7() { // from class: com.kubi.payment.fasttrade.sell.confirm.bankcard.b
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return SellBankCardConfirmFragment.m47029A4(this.f38867b, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 48, null);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_sell_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<SellBankCardVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(SellBankCardVM.class);
    }

    public SellBankCardConfirmFragment() {
        setPageId("B7FastSellBankCardConfirm");
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public SellConfirmInfoView mo46998P3() {
        C37663o1 c37663o1M47032y4 = m47032y4();
        if (c37663o1M47032y4 != null) {
            return c37663o1M47032y4.f84358c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Q3 */
    public KcPrimaryButton mo46999Q3() {
        C37663o1 c37663o1M47032y4 = m47032y4();
        if (c37663o1M47032y4 != null) {
            return c37663o1M47032y4.f84362g;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: T3 */
    public SellConfirmHeaderView mo47002T3() {
        C37663o1 c37663o1M47032y4 = m47032y4();
        if (c37663o1M47032y4 != null) {
            return c37663o1M47032y4.f84357b;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: X3 */
    public SellLivePriceExplainView mo47003X3() {
        C37663o1 c37663o1M47032y4 = m47032y4();
        if (c37663o1M47032y4 != null) {
            return c37663o1M47032y4.f84360e;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        super.mo45648p3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((SellBankCardVM) m45647o3()).m47045S().observe(getViewLifecycleOwner(), new C20613a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.bankcard.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellBankCardConfirmFragment.m47033z4(this.f38866b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: t4 */
    public PaymentTermView mo47008t4() {
        C37663o1 c37663o1M47032y4 = m47032y4();
        if (c37663o1M47032y4 != null) {
            return c37663o1M47032y4.f84361f;
        }
        return null;
    }
}
