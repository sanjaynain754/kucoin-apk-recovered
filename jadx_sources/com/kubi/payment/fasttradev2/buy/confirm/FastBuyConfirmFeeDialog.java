package com.kubi.payment.fasttradev2.buy.confirm;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37687t0;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FastBuyConfirmFeeDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/FastBuyConfirmFeeDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastBuyConfirmFeeBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastBuyConfirmFeeBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "feeInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyFeeInfo;", "mContext", "Landroid/content/Context;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "isBottomSheet", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastBuyConfirmFeeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBuyConfirmFeeDialog.kt\ncom/kubi/payment/fasttradev2/buy/confirm/FastBuyConfirmFeeDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,125:1\n143#2,20:126\n*S KotlinDebug\n*F\n+ 1 FastBuyConfirmFeeDialog.kt\ncom/kubi/payment/fasttradev2/buy/confirm/FastBuyConfirmFeeDialog\n*L\n28#1:126,20\n*E\n"})
public final class FastBuyConfirmFeeDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f39080q0 = C45681e.m100799e(this, new Function1<FastBuyConfirmFeeDialog, C37687t0>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.FastBuyConfirmFeeDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37687t0 invoke(@NotNull FastBuyConfirmFeeDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37687t0.m84965a(fragment.requireView());
        }
    }, new Function1<C37687t0, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.FastBuyConfirmFeeDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37687t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37687t0 c37687t0) {
            invoke(c37687t0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public BuyPreviewOrder.Response.BuyFeeInfo f39081r0;

    /* JADX INFO: renamed from: s0 */
    public Context f39082s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f39079u0 = {Reflection.property1(new PropertyReference1Impl(FastBuyConfirmFeeDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastBuyConfirmFeeBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f39078t0 = new Companion(null);

    /* JADX INFO: compiled from: FastBuyConfirmFeeDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/FastBuyConfirmFeeDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "feeInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyFeeInfo;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @Nullable BuyPreviewOrder.Response.BuyFeeInfo feeInfo) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            FastBuyConfirmFeeDialog fastBuyConfirmFeeDialog = new FastBuyConfirmFeeDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_fee_info", feeInfo);
            fastBuyConfirmFeeDialog.setArguments(bundle);
            fastBuyConfirmFeeDialog.show(fragmentManager, "payment_dialog_fast_buy_confirm_fee");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: l4 */
    private final void m47546l4() {
        C37687t0 c37687t0M47548k4 = m47548k4();
        if (c37687t0M47548k4 == null) {
            return;
        }
        BaseTextView baseTextView = c37687t0M47548k4.f84657f;
        BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo = this.f39081r0;
        baseTextView.setText(C27041f.m66669i(buyFeeInfo != null ? buyFeeInfo.getFeeMessage() : null, "--"));
        BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo2 = this.f39081r0;
        String strM66668h = C27041f.m66668h(buyFeeInfo2 != null ? buyFeeInfo2.getMinFee() : null);
        if (strM66668h.length() == 0) {
            BaseTextView tvMin = c37687t0M47548k4.f84660i;
            Intrinsics.checkNotNullExpressionValue(tvMin, "tvMin");
            C27046k.m66700o(tvMin);
            BaseTextView tvMinValue = c37687t0M47548k4.f84661j;
            Intrinsics.checkNotNullExpressionValue(tvMinValue, "tvMinValue");
            C27046k.m66700o(tvMinValue);
        } else {
            BaseTextView baseTextView2 = c37687t0M47548k4.f84661j;
            Context context = this.f39082s0;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            int i11 = R$string.payment_price;
            String strM92640e = C42180b.m92640e(DowngradeExKt.m66535e(strM66668h, null, 1, null), null, 0, false, false, false, 0, null, 127, null);
            BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo3 = this.f39081r0;
            baseTextView2.setText(context.getString(i11, strM92640e, C27041f.m66669i(buyFeeInfo3 != null ? buyFeeInfo3.getFeeCurrency() : null, "--")));
            BaseTextView tvMin2 = c37687t0M47548k4.f84660i;
            Intrinsics.checkNotNullExpressionValue(tvMin2, "tvMin");
            C27046k.m66685H(tvMin2);
            BaseTextView tvMinValue2 = c37687t0M47548k4.f84661j;
            Intrinsics.checkNotNullExpressionValue(tvMinValue2, "tvMinValue");
            C27046k.m66685H(tvMinValue2);
        }
        BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo4 = this.f39081r0;
        String strM66668h2 = C27041f.m66668h(buyFeeInfo4 != null ? buyFeeInfo4.getMaxFee() : null);
        if (strM66668h2.length() == 0) {
            BaseTextView tvMax = c37687t0M47548k4.f84658g;
            Intrinsics.checkNotNullExpressionValue(tvMax, "tvMax");
            C27046k.m66700o(tvMax);
            BaseTextView tvMaxValue = c37687t0M47548k4.f84659h;
            Intrinsics.checkNotNullExpressionValue(tvMaxValue, "tvMaxValue");
            C27046k.m66700o(tvMaxValue);
        } else {
            BaseTextView baseTextView3 = c37687t0M47548k4.f84659h;
            Context context2 = this.f39082s0;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            int i12 = R$string.payment_price;
            String strM92640e2 = C42180b.m92640e(DowngradeExKt.m66535e(strM66668h2, null, 1, null), null, 0, false, false, false, 0, null, 127, null);
            BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo5 = this.f39081r0;
            baseTextView3.setText(context2.getString(i12, strM92640e2, C27041f.m66669i(buyFeeInfo5 != null ? buyFeeInfo5.getFeeCurrency() : null, "--")));
            BaseTextView tvMax2 = c37687t0M47548k4.f84658g;
            Intrinsics.checkNotNullExpressionValue(tvMax2, "tvMax");
            C27046k.m66685H(tvMax2);
            BaseTextView tvMaxValue2 = c37687t0M47548k4.f84659h;
            Intrinsics.checkNotNullExpressionValue(tvMaxValue2, "tvMaxValue");
            C27046k.m66685H(tvMaxValue2);
        }
        BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo6 = this.f39081r0;
        String strM66668h3 = C27041f.m66668h(buyFeeInfo6 != null ? buyFeeInfo6.getRefundFeeMsg() : null);
        if (strM66668h3.length() == 0) {
            View divider = c37687t0M47548k4.f84653b;
            Intrinsics.checkNotNullExpressionValue(divider, "divider");
            C27046k.m66700o(divider);
            BaseTextView tvExplain = c37687t0M47548k4.f84655d;
            Intrinsics.checkNotNullExpressionValue(tvExplain, "tvExplain");
            C27046k.m66700o(tvExplain);
        } else {
            View divider2 = c37687t0M47548k4.f84653b;
            Intrinsics.checkNotNullExpressionValue(divider2, "divider");
            C27046k.m66685H(divider2);
            BaseTextView tvExplain2 = c37687t0M47548k4.f84655d;
            Intrinsics.checkNotNullExpressionValue(tvExplain2, "tvExplain");
            C27046k.m66685H(tvExplain2);
            c37687t0M47548k4.f84655d.setText(strM66668h3);
        }
        KcPrimaryButton tvConfirm = c37687t0M47548k4.f84654c;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyConfirmFeeDialog.m47547m4(this.f39169b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final C37687t0 m47548k4() {
        return (C37687t0) this.f39080q0.getValue(this, f39079u0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39082s0 = context;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_sell_confirm_fee, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.f39081r0 == null) {
            dismiss();
        } else {
            m47546l4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m47547m4(FastBuyConfirmFeeDialog fastBuyConfirmFeeDialog) {
        fastBuyConfirmFeeDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            buyFeeInfo = (BuyPreviewOrder.Response.BuyFeeInfo) RouteExKt.m56274t(arguments, "key_fee_info");
        } else {
            buyFeeInfo = null;
        }
        this.f39081r0 = buyFeeInfo;
    }
}
