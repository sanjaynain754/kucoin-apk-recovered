package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.widget.ConfirmHeaderView;
import com.kubi.payment.widget.ConfirmInfoView;
import com.kubi.payment.widget.LivePriceExplainView;
import com.kubi.payment.widget.TermsView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.f1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyConfirmOldBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37618f1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83862a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConfirmHeaderView f83863b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConfirmInfoView f83864c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LivePriceExplainView f83865d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final PaymentConfirmRecurringLayout f83866e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TermsView f83867f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f83868g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37618f1 m84816a(@NonNull View view) {
        PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutFindChildViewById;
        int i11 = R$id.headerView;
        ConfirmHeaderView confirmHeaderView = (ConfirmHeaderView) ViewBindings.findChildViewById(view, i11);
        if (confirmHeaderView != null) {
            i11 = R$id.oneTimeInfoView;
            ConfirmInfoView confirmInfoView = (ConfirmInfoView) ViewBindings.findChildViewById(view, i11);
            if (confirmInfoView != null) {
                i11 = R$id.priceExplainView;
                LivePriceExplainView livePriceExplainView = (LivePriceExplainView) ViewBindings.findChildViewById(view, i11);
                if (livePriceExplainView != null && (paymentConfirmRecurringLayoutFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.recurringInfoView))) != null) {
                    i11 = R$id.termsView;
                    TermsView termsView = (TermsView) ViewBindings.findChildViewById(view, i11);
                    if (termsView != null) {
                        i11 = R$id.tvConfirm;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            return new C37618f1((ConstraintLayout) view, confirmHeaderView, confirmInfoView, livePriceExplainView, paymentConfirmRecurringLayoutFindChildViewById, termsView, kcPrimaryButton);
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
        return this.f83862a;
    }

    public C37618f1(@NonNull ConstraintLayout constraintLayout, @NonNull ConfirmHeaderView confirmHeaderView, @NonNull ConfirmInfoView confirmInfoView, @NonNull LivePriceExplainView livePriceExplainView, @NonNull PaymentConfirmRecurringLayout paymentConfirmRecurringLayout, @NonNull TermsView termsView, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f83862a = constraintLayout;
        this.f83863b = confirmHeaderView;
        this.f83864c = confirmInfoView;
        this.f83865d = livePriceExplainView;
        this.f83866e = paymentConfirmRecurringLayout;
        this.f83867f = termsView;
        this.f83868g = kcPrimaryButton;
    }
}
