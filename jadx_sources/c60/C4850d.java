package c60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.view.TransferAccountView;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.transfer.view.TransferCoinPairView;
import com.kubi.transfer.view.TransferCoinView;
import com.kubi.transfer.view.TransferTipView;

/* JADX INFO: renamed from: c60.d */
/* JADX INFO: compiled from: BtransferFragmentTransferBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4850d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4947a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentContainerView f4948b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f4949c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f4950d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f4951e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcSmallSwitchButton f4952f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TransferAccountView f4953g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TransferAmountView f4954h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TransferCoinPairView f4955i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TransferCoinView f4956j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TransferTipView f4957k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f4958l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcPrimaryButton f4959m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f4960n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AlertTipsTextView f4961o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4850d m4977a(@NonNull View view) {
        int i11 = R$id.batchTransferFragment;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            i11 = R$id.layoutCoin;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.loading;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.loadingView;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.switchButton;
                        KcSmallSwitchButton kcSmallSwitchButton = (KcSmallSwitchButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSmallSwitchButton != null) {
                            i11 = R$id.transferAccountView;
                            TransferAccountView transferAccountView = (TransferAccountView) ViewBindings.findChildViewById(view, i11);
                            if (transferAccountView != null) {
                                i11 = R$id.transferAmountView;
                                TransferAmountView transferAmountView = (TransferAmountView) ViewBindings.findChildViewById(view, i11);
                                if (transferAmountView != null) {
                                    i11 = R$id.transferCoinPairView;
                                    TransferCoinPairView transferCoinPairView = (TransferCoinPairView) ViewBindings.findChildViewById(view, i11);
                                    if (transferCoinPairView != null) {
                                        i11 = R$id.transferCoinView;
                                        TransferCoinView transferCoinView = (TransferCoinView) ViewBindings.findChildViewById(view, i11);
                                        if (transferCoinView != null) {
                                            i11 = R$id.transferTipView;
                                            TransferTipView transferTipView = (TransferTipView) ViewBindings.findChildViewById(view, i11);
                                            if (transferTipView != null) {
                                                i11 = R$id.tvBatchTitle;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView != null) {
                                                    i11 = R$id.tvConfirm;
                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                    if (kcPrimaryButton != null) {
                                                        i11 = R$id.tvTitle;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView2 != null) {
                                                            i11 = R$id.tvUnifiedModeTradeTip;
                                                            AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (alertTipsTextView != null) {
                                                                return new C4850d((ConstraintLayout) view, fragmentContainerView, constraintLayout, imageView, frameLayout, kcSmallSwitchButton, transferAccountView, transferAmountView, transferCoinPairView, transferCoinView, transferTipView, textView, kcPrimaryButton, textView2, alertTipsTextView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4947a;
    }

    public C4850d(@NonNull ConstraintLayout constraintLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull KcSmallSwitchButton kcSmallSwitchButton, @NonNull TransferAccountView transferAccountView, @NonNull TransferAmountView transferAmountView, @NonNull TransferCoinPairView transferCoinPairView, @NonNull TransferCoinView transferCoinView, @NonNull TransferTipView transferTipView, @NonNull TextView textView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextView textView2, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f4947a = constraintLayout;
        this.f4948b = fragmentContainerView;
        this.f4949c = constraintLayout2;
        this.f4950d = imageView;
        this.f4951e = frameLayout;
        this.f4952f = kcSmallSwitchButton;
        this.f4953g = transferAccountView;
        this.f4954h = transferAmountView;
        this.f4955i = transferCoinPairView;
        this.f4956j = transferCoinView;
        this.f4957k = transferTipView;
        this.f4958l = textView;
        this.f4959m = kcPrimaryButton;
        this.f4960n = textView2;
        this.f4961o = alertTipsTextView;
    }
}
