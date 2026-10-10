package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.fast.buy.bankcard.CVVInputDialog;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37613e1;
import p658ub.C45148b;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import w00.C45681e;

/* JADX INFO: compiled from: BuyBankCardConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initViews", "", "showSwitchFiatCurrencyDialog", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "placeOrder", "observeData", "showCVVInputDialog", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyBankCardConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBankCardConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n147#2,16:197\n1563#3:213\n1634#3,3:214\n*S KotlinDebug\n*F\n+ 1 BuyBankCardConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmFragment\n*L\n47#1:197,16\n76#1:213\n76#1:214,3\n*E\n"})
public final class BuyBankCardConfirmFragment extends BuyCommonConfirmFragment<BuyBankCardConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39098Y = C45681e.m100799e(this, new Function1<BuyBankCardConfirmFragment, C37613e1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37613e1 invoke(@NotNull BuyBankCardConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37613e1.m84807a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37613e1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37613e1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37613e1 c37613e1) {
            invoke(c37613e1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f39097a0 = {Reflection.property1(new PropertyReference1Impl(BuyBankCardConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f39096Z = new Companion(null);

    /* JADX INFO: compiled from: BuyBankCardConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
            BaseActivity.INSTANCE.launch(context, BuyBankCardConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment$a */
    /* JADX INFO: compiled from: BuyBankCardConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20732a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39099b;

        public C20732a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39099b = function;
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
            return this.f39099b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39099b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public final C37613e1 m47575H4() {
        return (C37613e1) this.f39098Y.getValue(this, f39097a0[0]);
    }

    /* JADX INFO: renamed from: M4 */
    private final void m47580M4() {
        CVVInputDialog.Companion companion = CVVInputDialog.r0;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        CVVInputDialog.Companion.show$default(companion, childFragmentManager, (String) null, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBankCardConfirmFragment.m47581N4(this.f39109b, (String) obj);
            }
        }, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static final Unit m47581N4(BuyBankCardConfirmFragment buyBankCardConfirmFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((BuyBankCardConfirmVM) buyBankCardConfirmFragment.m45647o3()).m47602x0(it);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: h4 */
    public void mo47504h4(@NotNull BuyPreviewOrder.Response previewOrder) {
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4;
        TextView textView;
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        super.mo47504h4(previewOrder);
        BuyCommonConfirmExtraParams f39061w = getF39061W();
        if (C27024b.m66560c(f39061w != null ? f39061w.getFiatCurrencyList() : null).isEmpty() || (buyConfirmInfoViewMo47506j4 = mo47506j4()) == null || (textView = (TextView) buyConfirmInfoViewMo47506j4.findViewById(R$id.tvFiatCurrencyValue)) == null) {
            return;
        }
        textView.setText(previewOrder.getFiatCurrency());
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyBankCardConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyBankCardConfirmVM.class);
    }

    public BuyBankCardConfirmFragment() {
        setPageId("B7BuyCryBankCard");
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m47576I4(BuyBankCardConfirmFragment buyBankCardConfirmFragment) {
        buyBankCardConfirmFragment.m47582O4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m47577J4(BuyBankCardConfirmFragment buyBankCardConfirmFragment, Boolean bool) {
        if (bool.booleanValue()) {
            buyBankCardConfirmFragment.m47580M4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m47578K4(BuyBankCardConfirmFragment buyBankCardConfirmFragment, String str) {
        C44128b.m97259c(buyBankCardConfirmFragment.getTAG(), "BuyBankCardConfirmFragment htmlString:" + str);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(buyBankCardConfirmFragment), null, null, new BuyBankCardConfirmFragment$observeData$2$1(buyBankCardConfirmFragment, str, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m47579L4(BuyBankCardConfirmFragment buyBankCardConfirmFragment, String str) throws JSONException {
        C44128b.m97259c(buyBankCardConfirmFragment.getTAG(), "BuyBankCardConfirmFragment redirectUrl:" + str);
        PaymentWebActivity.Companion companion = PaymentWebActivity.f37079t;
        Context context = buyBankCardConfirmFragment.getContext();
        Intrinsics.checkNotNull(str);
        PaymentWebActivity.Companion.openUrl$default(companion, context, str, null, null, false, false, 60, null);
        BuyCommonConfirmFragment.m47494z4(buyBankCardConfirmFragment, true, null, 2, null);
        if (buyBankCardConfirmFragment.m47499W3()) {
            C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForRecurring", Boolean.TRUE, 0L, 4, null);
        }
        buyBankCardConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    private final void m47582O4() {
        List<String> fiatCurrencyList;
        String iconUrl;
        String fiatCurrency;
        BuyCommonConfirmExtraParams f39061w = getF39061W();
        if (f39061w != null) {
            fiatCurrencyList = f39061w.getFiatCurrencyList();
        } else {
            fiatCurrencyList = null;
        }
        List<String> listM66560c = C27024b.m66560c(fiatCurrencyList);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
        for (String str : listM66560c) {
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
            if (coinInfoEntityM85613u != null) {
                iconUrl = coinInfoEntityM85613u.getIconUrl();
            } else {
                iconUrl = null;
            }
            BuyCommonConfirmExtraParams f39061w2 = getF39061W();
            if (f39061w2 != null) {
                fiatCurrency = f39061w2.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            arrayList.add(new SelectEntity(null, str, str, null, iconUrl, null, null, null, null, false, Intrinsics.areEqual(C45148b.m99794d(fiatCurrency), str), null, 3049, null));
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.f
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                BuyBankCardConfirmFragment.m47583P4(this.f39110b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "payment_dialog_fast_buy_confirm_switch_fiat_currency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public static final void m47583P4(BuyBankCardConfirmFragment buyBankCardConfirmFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        String strM99794d = C45148b.m99794d(interfaceC24339a.getLabel().toString());
        if (strM99794d.length() == 0) {
            return;
        }
        BuyCommonConfirmExtraParams f39061w = buyBankCardConfirmFragment.getF39061W();
        if (f39061w != null) {
            f39061w.setFiatCurrency(strM99794d);
        }
        BuyCommonConfirmVM.m47519U((BuyCommonConfirmVM) buyBankCardConfirmFragment.m45647o3(), true, false, 2, null);
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83837i;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83831c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83832d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public BuyConfirmLivePriceExplainView mo47501Y3() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83834f;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83833e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        ((BuyBankCardConfirmVM) m45647o3()).m47601n0();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83835g;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        List<String> fiatCurrencyList;
        View viewFindViewById;
        View viewFindViewById2;
        super.mo45648p3();
        BuyCommonConfirmExtraParams f39061w = getF39061W();
        if (f39061w != null) {
            fiatCurrencyList = f39061w.getFiatCurrencyList();
        } else {
            fiatCurrencyList = null;
        }
        if (!C27024b.m66560c(fiatCurrencyList).isEmpty()) {
            BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
            if (buyConfirmInfoViewMo47506j4 != null && (viewFindViewById2 = buyConfirmInfoViewMo47506j4.findViewById(R$id.groupFiatCurrency)) != null) {
                C27046k.m66685H(viewFindViewById2);
            }
            BuyConfirmInfoView buyConfirmInfoViewMo47506j5 = mo47506j4();
            if (buyConfirmInfoViewMo47506j5 != null && (viewFindViewById = buyConfirmInfoViewMo47506j5.findViewById(R$id.tvFiatCurrencyValue)) != null) {
                C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BuyBankCardConfirmFragment.m47576I4(this.f39108b);
                    }
                }, 1, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BuyBankCardConfirmVM) m45647o3()).m47598i0().observe(getViewLifecycleOwner(), new C20732a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBankCardConfirmFragment.m47577J4(this.f39105b, (Boolean) obj);
            }
        }));
        ((BuyBankCardConfirmVM) m45647o3()).m47597h0().observe(getViewLifecycleOwner(), new C20732a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBankCardConfirmFragment.m47578K4(this.f39106b, (String) obj);
            }
        }));
        ((BuyBankCardConfirmVM) m45647o3()).m47599j0().observe(getViewLifecycleOwner(), new C20732a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.bankcard.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBankCardConfirmFragment.m47579L4(this.f39107b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        C37613e1 c37613e1M47575H4 = m47575H4();
        if (c37613e1M47575H4 != null) {
            return c37613e1M47575H4.f83836h;
        }
        return null;
    }
}
