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
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: ft.m1 */
/* JADX INFO: compiled from: PaymentFragmentFastGooglePayConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37653m1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84266a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConfirmHeaderView f84267b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConfirmInfoView f84268c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LivePriceExplainView f84269d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final PaymentConfirmRecurringLayout f84270e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TermsView f84271f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f84272g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KWebContainer f84273h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37653m1 m84889a(@NonNull View view) {
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
                            i11 = R$id.webView;
                            KWebContainer kWebContainer = (KWebContainer) ViewBindings.findChildViewById(view, i11);
                            if (kWebContainer != null) {
                                return new C37653m1((ConstraintLayout) view, confirmHeaderView, confirmInfoView, livePriceExplainView, paymentConfirmRecurringLayoutFindChildViewById, termsView, kcPrimaryButton, kWebContainer);
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
        return this.f84266a;
    }

    public C37653m1(@NonNull ConstraintLayout constraintLayout, @NonNull ConfirmHeaderView confirmHeaderView, @NonNull ConfirmInfoView confirmInfoView, @NonNull LivePriceExplainView livePriceExplainView, @NonNull PaymentConfirmRecurringLayout paymentConfirmRecurringLayout, @NonNull TermsView termsView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KWebContainer kWebContainer) {
        this.f84266a = constraintLayout;
        this.f84267b = confirmHeaderView;
        this.f84268c = confirmInfoView;
        this.f84269d = livePriceExplainView;
        this.f84270e = paymentConfirmRecurringLayout;
        this.f84271f = termsView;
        this.f84272g = kcPrimaryButton;
        this.f84273h = kWebContainer;
    }
}
