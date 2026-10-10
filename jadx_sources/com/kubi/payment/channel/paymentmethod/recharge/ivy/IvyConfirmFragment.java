package com.kubi.payment.channel.paymentmethod.recharge.ivy;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.base.BaseChannelFragment;
import com.kubi.payment.channel.data.entities.CreateIvyOrderEntity;
import com.kubi.payment.channel.data.entities.IvyConfirmPageEntity;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Arrays;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p026ay.C4400a;
import p270ft.C37707x1;
import p429lf.C42180b;
import p477nt.AbstractC42878k;
import p477nt.C42879l;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
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
import w00.C45681e;

/* JADX INFO: compiled from: IvyConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001b\u001a\u00020\u0011H\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0014J\u000e\u0010\u001d\u001a\u00020\u000e*\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u000eH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082.¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmFragment;", "Lcom/kubi/payment/channel/base/BaseChannelFragment;", "Lcom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentRechargeConfirmIvyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentRechargeConfirmIvyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "trackPointParams", "", "Lkotlin/Pair;", "", "[Lkotlin/Pair;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "onResume", "jumpToResultPage", "orderId", "retry", "observeData", "formatMoney", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "trackIvyOrder", "success", "", "reason", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIvyConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IvyConfirmFragment.kt\ncom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,238:1\n147#2,16:239\n*S KotlinDebug\n*F\n+ 1 IvyConfirmFragment.kt\ncom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmFragment\n*L\n44#1:239,16\n*E\n"})
public final class IvyConfirmFragment extends BaseChannelFragment<IvyConfirmVM> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38329W = C45681e.m100799e(this, new Function1<IvyConfirmFragment, C37707x1>() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.IvyConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37707x1 invoke(@NotNull IvyConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37707x1.m85001a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37707x1, Unit>() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.IvyConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37707x1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37707x1 c37707x1) {
            invoke(c37707x1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public Pair<String, String>[] f38330X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f38328Z = {Reflection.property1(new PropertyReference1Impl(IvyConfirmFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentRechargeConfirmIvyBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f38327Y = new Companion(null);

    /* JADX INFO: compiled from: IvyConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "POPUP_DIALOG_ID", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.recharge.ivy.IvyConfirmFragment$a */
    /* JADX INFO: compiled from: IvyConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20359a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38331b;

        public C20359a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38331b = function;
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
            return this.f38331b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38331b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m45928S3(IvyConfirmFragment ivyConfirmFragment, DialogInterface dialogInterface, int i11) {
        m45922M3(ivyConfirmFragment, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public static final Unit m45921K3(C37707x1 c37707x1, IvyConfirmFragment ivyConfirmFragment) {
        if (!c37707x1.f84871l.m49900b()) {
            ToastCompat.m66437C(R$string.payment_please_agree_terms);
            return Unit.INSTANCE;
        }
        ((IvyConfirmVM) ivyConfirmFragment.m45647o3()).m45947z();
        Pair<String, String>[] pairArr = ivyConfirmFragment.f38330X;
        if (pairArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackPointParams");
            pairArr = null;
        }
        C43852m.m96592d("B7DepositOrderConfirm", "confirmButton", null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m45922M3(IvyConfirmFragment ivyConfirmFragment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        ivyConfirmFragment.m45932L3(str);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m45923N3(C37707x1 c37707x1, IvyConfirmFragment ivyConfirmFragment, IvyConfirmPageEntity.Response response) {
        c37707x1.f84865f.setText(ivyConfirmFragment.m45930I3(response.getDepositAmount()));
        c37707x1.f84866g.setText(C27041f.m66668h(response.getDepositCurrency()));
        BaseTextView baseTextView = c37707x1.f84869j;
        IvyConfirmPageEntity.PayWith payWith = response.getPayWith();
        baseTextView.setText(C27041f.m66668h(payWith != null ? payWith.getPayWithName() : null));
        BaseTextView baseTextView2 = c37707x1.f84867h;
        int i11 = R$string.payment_price;
        baseTextView2.setText(ivyConfirmFragment.getStringRes(i11, ivyConfirmFragment.m45930I3(response.getPayinAmount()), C27041f.m66668h(response.getPayinCurrency())));
        c37707x1.f84864e.setText(ivyConfirmFragment.getStringRes(i11, ivyConfirmFragment.m45930I3(response.getFeeAmount()), C27041f.m66668h(response.getFeeCurrency())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m45924O3(final IvyConfirmFragment ivyConfirmFragment, final AbstractC42878k abstractC42878k) throws JSONException {
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            String redirectSameNameTip = ((CreateIvyOrderEntity.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getRedirectSameNameTip();
            if (redirectSameNameTip == null || redirectSameNameTip.length() == 0) {
                redirectSameNameTip = ivyConfirmFragment.getStringRes(R$string.payment_ivy_redirect_desc, new Object[0]);
            }
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(ivyConfirmFragment.getStringRes(R$string.payment_ivy_redirect_title, new Object[0])).m54161R4(0).m54156M4(redirectSameNameTip).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.f
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    IvyConfirmFragment.m45925P3(baseViewHolder, dialogFragmentHelper);
                }
            }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    IvyConfirmFragment.m45926Q3(this.f38346b, dialogInterface, i11);
                }
            }).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    IvyConfirmFragment.m45927R3(abstractC42878k, ivyConfirmFragment, dialogInterface, i11);
                }
            }).m54172c5(ivyConfirmFragment.getChildFragmentManager());
            Pair<String, String>[] pairArr = ivyConfirmFragment.f38330X;
            if (pairArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackPointParams");
                pairArr = null;
            }
            C43852m.m96596h("B7DepositOrderConfirmRedirectPopup", "button", null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 4, null);
            m45929U3(ivyConfirmFragment, true, null, 2, null);
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            Exception exception = error.getException();
            ApiException apiException = exception instanceof ApiException ? (ApiException) exception : null;
            if (!Intrinsics.areEqual(apiException != null ? apiException.code : null, "900000")) {
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(ivyConfirmFragment.getStringRes(R$string.note, new Object[0])).m54156M4(C21457l.m49853a(error.getException().getMessage(), ivyConfirmFragment.getString(R$string.payment_ivy_note_risk_desc))).m54162S4(R$string.confirm, null).m54172c5(ivyConfirmFragment.getChildFragmentManager());
            }
            if (error.getException() instanceof ApiException) {
                ivyConfirmFragment.m45933T3(false, ((ApiException) error.getException()).code + ':' + error.getException().getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m45925P3(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView != null) {
            HighlightTextHelper.f43497a.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.brandGreen))));
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m45926Q3(IvyConfirmFragment ivyConfirmFragment, DialogInterface dialogInterface, int i11) {
        Pair<String, String>[] pairArr = ivyConfirmFragment.f38330X;
        if (pairArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackPointParams");
            pairArr = null;
        }
        C43852m.m96592d("B7DepositOrderConfirmRedirectPopup", "button", null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 4, null);
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m45927R3(AbstractC42878k abstractC42878k, IvyConfirmFragment ivyConfirmFragment, DialogInterface dialogInterface, int i11) {
        String redirectUrl = ((CreateIvyOrderEntity.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getRedirectUrl();
        if (redirectUrl != null && redirectUrl.length() != 0) {
            InterfaceC37766r.a.m85191b(C37304a.f82764a, redirectUrl, null, null, null, 14, null);
        }
        Pair<String, String>[] pairArr = ivyConfirmFragment.f38330X;
        if (pairArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackPointParams");
            pairArr = null;
        }
        C43852m.m96590b("B7DepositOrderConfirmRedirectPopup", "button", "2", (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m45929U3(IvyConfirmFragment ivyConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = "";
        }
        ivyConfirmFragment.m45933T3(z11, str);
    }

    /* JADX INFO: renamed from: J3 */
    public final C37707x1 m45931J3() {
        return (C37707x1) this.f38329W.getValue(this, f38328Z[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m45932L3(@Nullable String str) {
        CreateIvyOrderEntity.Response response;
        String paymentOrderId = null;
        C4400a c4400aM4038a = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/recharge/result", false, 2, null)).m4038a("paymentMethodCode", ((IvyConfirmVM) m45647o3()).getF38334b0()).m4038a("channelId", ((IvyConfirmVM) m45647o3()).getF38333a0());
        if (str == null || str.length() == 0) {
            AbstractC42878k<CreateIvyOrderEntity.Response> value = ((IvyConfirmVM) m45647o3()).m45942C().getValue();
            if (value != null && (response = (CreateIvyOrderEntity.Response) C42879l.m94041a(value)) != null) {
                paymentOrderId = response.getPaymentOrderId();
            }
            str = C27041f.m66668h(paymentOrderId);
        }
        c4400aM4038a.m4038a("orderId", str).m4048k();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m45933T3(boolean z11, String str) throws JSONException {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str2 = z11 ? "CHECK_RECHAGE_SUCCESS" : "CHECK_RECHARGE_FAILED";
        RechargeTrackData rechargeTrackData = new RechargeTrackData(C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38333a0()));
        rechargeTrackData.setFiatCurrency(C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38335c0()));
        rechargeTrackData.setPaymentMethodCode(C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38334b0()));
        rechargeTrackData.setChannelId(C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38333a0()));
        Unit unit = Unit.INSTANCE;
        track.mo49798a(str2, z11, str, rechargeTrackData);
        C42296a.m92834b(C42296a.f93790a, z11, str, null, C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38335c0()), "pay_fiat_recharge", null, null, null, C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38333a0()), C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38334b0()), C27041f.m66668h(((IvyConfirmVM) m45647o3()).getF38333a0()), 228, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((IvyConfirmVM) m45647o3()).m45946G();
        Bundle arguments = getArguments();
        if (Intrinsics.areEqual(arguments != null ? RouteExKt.m56284y(arguments, "appLauncherType") : null, "1")) {
            Bundle arguments2 = getArguments();
            m45932L3(C27041f.m66668h(arguments2 != null ? RouteExKt.m56284y(arguments2, "rechargeId") : null));
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_recharge_confirm_ivy;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<IvyConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(IvyConfirmVM.class);
    }

    /* JADX INFO: renamed from: I3 */
    public final String m45930I3(String str) {
        String strM92640e;
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        if (bigDecimalM66536f != null) {
            strM92640e = C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, false, 0, null, 127, null);
        } else {
            strM92640e = null;
        }
        return C42180b.m92647l(strM92640e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((IvyConfirmVM) m45647o3()).m45940A(getArguments());
        Pair<String, String>[] pairArr = {TuplesKt.m90091to("paymentMethodCode", ((IvyConfirmVM) m45647o3()).getF38334b0()), TuplesKt.m90091to("channelId", ((IvyConfirmVM) m45647o3()).getF38333a0())};
        this.f38330X = pairArr;
        C43852m.m96596h("B7DepositOrderConfirm", "page", null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        CreateIvyOrderEntity.Response response;
        String paymentOrderId;
        String redirectUrl;
        super.onResume();
        AbstractC42878k<CreateIvyOrderEntity.Response> value = ((IvyConfirmVM) m45647o3()).m45942C().getValue();
        if (value != null) {
            response = (CreateIvyOrderEntity.Response) C42879l.m94041a(value);
        } else {
            response = null;
        }
        if (response != null) {
            paymentOrderId = response.getPaymentOrderId();
        } else {
            paymentOrderId = null;
        }
        if (paymentOrderId != null && paymentOrderId.length() != 0) {
            if (response != null) {
                redirectUrl = response.getRedirectUrl();
            } else {
                redirectUrl = null;
            }
            if (redirectUrl != null && redirectUrl.length() != 0) {
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(getStringRes(R$string.payment_ivy_complete_title, new Object[0])).m54156M4(getStringRes(R$string.payment_ivy_complete_desc, new Object[0])).m54159P4(R$string.f37116no, null).m54162S4(R$string.yes, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        IvyConfirmFragment.m45928S3(this.f38343b, dialogInterface, i11);
                    }
                }).m54172c5(getChildFragmentManager());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        final C37707x1 c37707x1M45931J3 = m45931J3();
        if (c37707x1M45931J3 != null) {
            c37707x1M45931J3.f84871l.m49903e("recharge", ((IvyConfirmVM) m45647o3()).getF38334b0(), ((IvyConfirmVM) m45647o3()).getF38333a0());
            KcPrimaryButton confirm = c37707x1M45931J3.f84861b;
            Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
            C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IvyConfirmFragment.m45921K3(c37707x1M45931J3, this);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        final C37707x1 c37707x1M45931J3 = m45931J3();
        if (c37707x1M45931J3 != null) {
            ((IvyConfirmVM) m45647o3()).m45944E().observe(getViewLifecycleOwner(), new C20359a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IvyConfirmFragment.m45923N3(c37707x1M45931J3, this, (IvyConfirmPageEntity.Response) obj);
                }
            }));
        }
        ((IvyConfirmVM) m45647o3()).m45942C().observe(getViewLifecycleOwner(), new C20359a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IvyConfirmFragment.m45924O3(this.f38342b, (AbstractC42878k) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: w3 */
    public void mo45651w3() {
        super.mo45651w3();
        ((IvyConfirmVM) m45647o3()).m45946G();
    }
}
