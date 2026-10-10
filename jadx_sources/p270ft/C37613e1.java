package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: ft.e1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37613e1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83829a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f83830b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BuyFluctuationTermsView f83831c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BuyConfirmHeaderView f83832d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BuyConfirmInfoView f83833e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BuyConfirmLivePriceExplainView f83834f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final PaymentConfirmRecurringLayout f83835g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final PaymentTermView f83836h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcPrimaryButton f83837i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KWebContainer f83838j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37613e1 m84807a(@NonNull View view) {
        PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutFindChildViewById;
        int i11 = R$id.bottomBarrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.fluctuationTermsView;
            BuyFluctuationTermsView buyFluctuationTermsView = (BuyFluctuationTermsView) ViewBindings.findChildViewById(view, i11);
            if (buyFluctuationTermsView != null) {
                i11 = R$id.headerView;
                BuyConfirmHeaderView buyConfirmHeaderView = (BuyConfirmHeaderView) ViewBindings.findChildViewById(view, i11);
                if (buyConfirmHeaderView != null) {
                    i11 = R$id.oneTimeInfoView;
                    BuyConfirmInfoView buyConfirmInfoView = (BuyConfirmInfoView) ViewBindings.findChildViewById(view, i11);
                    if (buyConfirmInfoView != null) {
                        i11 = R$id.priceExplainView;
                        BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainView = (BuyConfirmLivePriceExplainView) ViewBindings.findChildViewById(view, i11);
                        if (buyConfirmLivePriceExplainView != null && (paymentConfirmRecurringLayoutFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.recurringInfoView))) != null) {
                            i11 = R$id.termsView;
                            PaymentTermView paymentTermView = (PaymentTermView) ViewBindings.findChildViewById(view, i11);
                            if (paymentTermView != null) {
                                i11 = R$id.tvConfirm;
                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcPrimaryButton != null) {
                                    i11 = R$id.webView;
                                    KWebContainer kWebContainer = (KWebContainer) ViewBindings.findChildViewById(view, i11);
                                    if (kWebContainer != null) {
                                        return new C37613e1((ConstraintLayout) view, barrier, buyFluctuationTermsView, buyConfirmHeaderView, buyConfirmInfoView, buyConfirmLivePriceExplainView, paymentConfirmRecurringLayoutFindChildViewById, paymentTermView, kcPrimaryButton, kWebContainer);
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
        return this.f83829a;
    }

    public C37613e1(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull BuyFluctuationTermsView buyFluctuationTermsView, @NonNull BuyConfirmHeaderView buyConfirmHeaderView, @NonNull BuyConfirmInfoView buyConfirmInfoView, @NonNull BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainView, @NonNull PaymentConfirmRecurringLayout paymentConfirmRecurringLayout, @NonNull PaymentTermView paymentTermView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KWebContainer kWebContainer) {
        this.f83829a = constraintLayout;
        this.f83830b = barrier;
        this.f83831c = buyFluctuationTermsView;
        this.f83832d = buyConfirmHeaderView;
        this.f83833e = buyConfirmInfoView;
        this.f83834f = buyConfirmLivePriceExplainView;
        this.f83835g = paymentConfirmRecurringLayout;
        this.f83836h = paymentTermView;
        this.f83837i = kcPrimaryButton;
        this.f83838j = kWebContainer;
    }
}
