package com.kubi.payment.p2p.order;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReleaseCryptoDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/ReleaseCryptoDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "optionView1", "Landroid/view/View;", "optionView2", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "mContext", "Landroid/content/Context;", "onAttach", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ReleaseCryptoDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f39778u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public View f39779q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public View f39780r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public Function0<Unit> f39781s0;

    /* JADX INFO: renamed from: t0 */
    public Context f39782t0;

    /* JADX INFO: compiled from: ReleaseCryptoDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/ReleaseCryptoDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ReleaseCryptoDialog releaseCryptoDialog = new ReleaseCryptoDialog();
            releaseCryptoDialog.f39781s0 = callback;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.botc_view_order_pay_content);
            bundle.putInt("type", 8);
            releaseCryptoDialog.setArguments(bundle);
            releaseCryptoDialog.show(fragmentManager, "payment_p2p_release_crypto_dialog");
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m48871q4(KcPrimaryButton kcPrimaryButton, ReleaseCryptoDialog releaseCryptoDialog, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        kcPrimaryButton.setEnabled(true);
        View view = releaseCryptoDialog.f39779q0;
        if (view != null) {
            view.setSelected(true);
        }
        View view2 = releaseCryptoDialog.f39780r0;
        if (view2 != null) {
            view2.setSelected(false);
        }
        appCompatImageView.setImageResource(R$drawable.ic2_success_filled_20);
        Context context = releaseCryptoDialog.f39782t0;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        int color = ContextCompat.getColor(context, R$color.c_text);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        appCompatImageView.setColorFilter(color, mode);
        appCompatImageView2.setImageResource(R$drawable.ic_radio_unselect_20);
        Context context3 = releaseCryptoDialog.f39782t0;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context2 = context3;
        }
        appCompatImageView2.setColorFilter(ContextCompat.getColor(context2, R$color.c_text40), mode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m48872r4(KcPrimaryButton kcPrimaryButton, ReleaseCryptoDialog releaseCryptoDialog, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        kcPrimaryButton.setEnabled(true);
        View view = releaseCryptoDialog.f39779q0;
        if (view != null) {
            view.setSelected(false);
        }
        View view2 = releaseCryptoDialog.f39780r0;
        if (view2 != null) {
            view2.setSelected(true);
        }
        appCompatImageView.setImageResource(R$drawable.ic2_success_filled_20);
        Context context = releaseCryptoDialog.f39782t0;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        int color = ContextCompat.getColor(context, R$color.c_text);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        appCompatImageView.setColorFilter(color, mode);
        appCompatImageView2.setImageResource(R$drawable.ic_radio_unselect_20);
        Context context3 = releaseCryptoDialog.f39782t0;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context2 = context3;
        }
        appCompatImageView2.setColorFilter(ContextCompat.getColor(context2, R$color.c_text40), mode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m48869o4(ReleaseCryptoDialog releaseCryptoDialog) {
        C43852m.m96591c("B7P2POrderDetails", "cancelButton", null, null, 12, null);
        releaseCryptoDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m48870p4(ReleaseCryptoDialog releaseCryptoDialog) {
        Function0<Unit> function0;
        View view = releaseCryptoDialog.f39780r0;
        if (C27025c.m66566d(view != null ? Boolean.valueOf(view.isSelected()) : null) && (function0 = releaseCryptoDialog.f39781s0) != null) {
            function0.invoke();
        }
        releaseCryptoDialog.dismiss();
        C43852m.m96591c("B7P2POrderDetails", "sureButton", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        this.f39779q0 = viewHolder.getView(R$id.view_option_1);
        final AppCompatImageView appCompatImageView = (AppCompatImageView) viewHolder.getView(R$id.iv_select_1);
        this.f39780r0 = viewHolder.getView(R$id.view_option_2);
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewHolder.getView(R$id.iv_select_2);
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReleaseCryptoDialog.m48869o4(this.f39794b);
            }
        }, 1, null);
        final KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReleaseCryptoDialog.m48870p4(this.f39798b);
            }
        }, 1, null);
        View view2 = this.f39779q0;
        if (view2 != null) {
            C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.e2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReleaseCryptoDialog.m48871q4(kcPrimaryButton, this, appCompatImageView, appCompatImageView2);
                }
            }, 1, null);
        }
        View view3 = this.f39780r0;
        if (view3 != null) {
            C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.f2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReleaseCryptoDialog.m48872r4(kcPrimaryButton, this, appCompatImageView2, appCompatImageView);
                }
            }, 1, null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39782t0 = context;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54236e4(this);
        C43852m.m96595g("B7P2POrderDetails", "confirmReceivedPopup", null, null, 12, null);
    }
}
