package com.kubi.payment.fasttradev2.buy.confirm.ivy;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fast.data.entities.PlaceBuyOrder;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import com.kubi.payment.util.C21457l;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37613e1;
import p477nt.AbstractC42878k;
import p477nt.C42879l;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BuyIvyConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\u0012\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006."}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "observeData", "", "placeOrder", "trackIvyOrder", "success", "", "reason", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "jumpToResultPage", "orderId", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyIvyConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyIvyConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,196:1\n147#2,16:197\n*S KotlinDebug\n*F\n+ 1 BuyIvyConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmFragment\n*L\n43#1:197,16\n*E\n"})
public final class BuyIvyConfirmFragment extends BuyCommonConfirmFragment<BuyIvyConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39148Y = C45681e.m100799e(this, new Function1<BuyIvyConfirmFragment, C37613e1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.BuyIvyConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37613e1 invoke(@NotNull BuyIvyConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37613e1.m84807a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37613e1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.BuyIvyConfirmFragment$special$$inlined$viewBindingFragment$1
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
    public static final /* synthetic */ KProperty<Object>[] f39147a0 = {Reflection.property1(new PropertyReference1Impl(BuyIvyConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f39146Z = new Companion(null);

    /* JADX INFO: compiled from: BuyIvyConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmFragment$Companion;", "", "<init>", "()V", "ORDER_ID", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.ivy.BuyIvyConfirmFragment$a */
    /* JADX INFO: compiled from: BuyIvyConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20761a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39149b;

        public C20761a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39149b = function;
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
            return this.f39149b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39149b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m47663M4(BuyIvyConfirmFragment buyIvyConfirmFragment, DialogInterface dialogInterface, int i11) {
        m47658H4(buyIvyConfirmFragment, null, 1, null);
    }

    /* JADX INFO: renamed from: F4 */
    private final C37613e1 m47657F4() {
        return (C37613e1) this.f39148Y.getValue(this, f39147a0[0]);
    }

    /* JADX INFO: renamed from: H4 */
    public static /* synthetic */ void m47658H4(BuyIvyConfirmFragment buyIvyConfirmFragment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        buyIvyConfirmFragment.m47666G4(str);
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m47659I4(final BuyIvyConfirmFragment buyIvyConfirmFragment, final AbstractC42878k abstractC42878k) throws JSONException {
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            String redirectSameNameTip = ((PlaceBuyOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getRedirectSameNameTip();
            if (redirectSameNameTip == null || redirectSameNameTip.length() == 0) {
                redirectSameNameTip = buyIvyConfirmFragment.getStringRes(R$string.payment_ivy_redirect_desc, new Object[0]);
            }
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(buyIvyConfirmFragment.getStringRes(R$string.payment_ivy_redirect_title, new Object[0])).m54161R4(0).m54156M4(redirectSameNameTip).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.d
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    BuyIvyConfirmFragment.m47660J4(baseViewHolder, dialogFragmentHelper);
                }
            }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    BuyIvyConfirmFragment.m47661K4(this.f39156b, dialogInterface, i11);
                }
            }).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    BuyIvyConfirmFragment.m47662L4(abstractC42878k, buyIvyConfirmFragment, dialogInterface, i11);
                }
            }).m54172c5(buyIvyConfirmFragment.getChildFragmentManager());
            C43852m.m96595g(C27041f.m66668h(buyIvyConfirmFragment.getF23018V()), "redirectPopup", null, null, 12, null);
            m47665O4(buyIvyConfirmFragment, true, null, 2, null);
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(buyIvyConfirmFragment.getStringRes(R$string.note, new Object[0])).m54156M4(C21457l.m49853a(error.getException().getMessage(), buyIvyConfirmFragment.getString(R$string.payment_ivy_note_risk_desc))).m54162S4(R$string.confirm, null).m54172c5(buyIvyConfirmFragment.getChildFragmentManager());
            if (error.getException() instanceof ApiException) {
                buyIvyConfirmFragment.m47664N4(false, ((ApiException) error.getException()).code + ':' + error.getException().getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m47660J4(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView != null) {
            HighlightTextHelper.f43497a.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.brandGreen))));
        }
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m47662L4(AbstractC42878k abstractC42878k, BuyIvyConfirmFragment buyIvyConfirmFragment, DialogInterface dialogInterface, int i11) {
        String redirectUrl = ((PlaceBuyOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getRedirectUrl();
        if (redirectUrl != null && redirectUrl.length() != 0) {
            InterfaceC37766r.a.m85191b(C37304a.f82764a, redirectUrl, null, null, null, 14, null);
        }
        C43852m.m96591c(C27041f.m66668h(buyIvyConfirmFragment.getF23018V()), "redirectPopupConfirm", null, null, 12, null);
    }

    /* JADX INFO: renamed from: N4 */
    private final void m47664N4(boolean z11, String str) throws JSONException {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str2 = z11 ? "CHECK_RECHAGE_SUCCESS" : "CHECK_RECHARGE_FAILED";
        BuyCommonConfirmExtraParams f39061w = getF39061W();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(C27041f.m66668h(f39061w != null ? f39061w.getChannelId() : null));
        BuyCommonConfirmExtraParams f39061w2 = getF39061W();
        rechargeTrackData.setFiatCurrency(C27041f.m66668h(f39061w2 != null ? f39061w2.getFiatCurrency() : null));
        BuyCommonConfirmExtraParams f39061w3 = getF39061W();
        rechargeTrackData.setPaymentMethodCode(C27041f.m66668h(f39061w3 != null ? f39061w3.getPaymentMethodCode() : null));
        Unit unit = Unit.INSTANCE;
        track.mo49798a(str2, z11, str, rechargeTrackData);
        C42296a c42296a = C42296a.f93790a;
        BuyCommonConfirmExtraParams f39061w4 = getF39061W();
        String strM66668h = C27041f.m66668h(f39061w4 != null ? f39061w4.getFiatCurrency() : null);
        BuyCommonConfirmExtraParams f39061w5 = getF39061W();
        C42296a.m92834b(c42296a, z11, str, null, strM66668h, "pay_fiat_recharge", null, null, null, C27041f.m66668h(f39061w5 != null ? f39061w5.getChannelId() : null), null, null, 1764, null);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m47665O4(BuyIvyConfirmFragment buyIvyConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = "";
        }
        buyIvyConfirmFragment.m47664N4(z11, str);
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (Intrinsics.areEqual(arguments != null ? RouteExKt.m56284y(arguments, "appLauncherType") : null, "1")) {
            Bundle arguments2 = getArguments();
            m47666G4(C27041f.m66668h(arguments2 != null ? RouteExKt.m56284y(arguments2, "fastBuyOrderId") : null));
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyIvyConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyIvyConfirmVM.class);
    }

    public BuyIvyConfirmFragment() {
        setPageId("B7BuyCryIvy");
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m47661K4(BuyIvyConfirmFragment buyIvyConfirmFragment, DialogInterface dialogInterface, int i11) {
        C43852m.m96591c(C27041f.m66668h(buyIvyConfirmFragment.getF23018V()), "redirectPopupCancel", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public final void m47666G4(@Nullable String str) {
        String orderId;
        PlaceBuyOrder.Response response;
        String strM66668h = C27041f.m66668h(str);
        if (strM66668h.length() == 0) {
            AbstractC42878k<PlaceBuyOrder.Response> value = ((BuyIvyConfirmVM) m45647o3()).m47669a0().getValue();
            if (value != null && (response = (PlaceBuyOrder.Response) C42879l.m94041a(value)) != null) {
                orderId = response.getOrderId();
            } else {
                orderId = null;
            }
            strM66668h = C27041f.m66668h(orderId);
        }
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/order/result", false, 2, null)).m4038a("orderId", strM66668h).m4048k();
        preformBackPressed();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83837i;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83831c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83832d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public BuyConfirmLivePriceExplainView mo47501Y3() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83834f;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83833e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        ((BuyIvyConfirmVM) m45647o3()).m47671c0();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83835g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        PlaceBuyOrder.Response response;
        String orderId;
        String redirectUrl;
        super.onResume();
        AbstractC42878k<PlaceBuyOrder.Response> value = ((BuyIvyConfirmVM) m45647o3()).m47669a0().getValue();
        if (value != null) {
            response = (PlaceBuyOrder.Response) C42879l.m94041a(value);
        } else {
            response = null;
        }
        if (response != null) {
            orderId = response.getOrderId();
        } else {
            orderId = null;
        }
        if (orderId != null && orderId.length() != 0) {
            if (response != null) {
                redirectUrl = response.getRedirectUrl();
            } else {
                redirectUrl = null;
            }
            if (redirectUrl != null && redirectUrl.length() != 0) {
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(getStringRes(R$string.payment_ivy_complete_title, new Object[0])).m54156M4(getStringRes(R$string.payment_ivy_complete_desc, new Object[0])).m54159P4(R$string.f37116no, null).m54162S4(R$string.yes, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        BuyIvyConfirmFragment.m47663M4(this.f39154b, dialogInterface, i11);
                    }
                }).m54172c5(getChildFragmentManager());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BuyIvyConfirmVM) m45647o3()).m47669a0().observe(getViewLifecycleOwner(), new C20761a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyIvyConfirmFragment.m47659I4(this.f39155b, (AbstractC42878k) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        C37613e1 c37613e1M47657F4 = m47657F4();
        if (c37613e1M47657F4 != null) {
            return c37613e1M47657F4.f83836h;
        }
        return null;
    }
}
