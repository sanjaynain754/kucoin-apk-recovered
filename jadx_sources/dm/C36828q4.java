package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.view.FixAutoSizeDashTextView;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.widget.FixAutoSizeTextView;

/* JADX INFO: renamed from: dm.q4 */
/* JADX INFO: compiled from: BkumexTwapAdvanceSettingsViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36828q4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80908a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AnimateDrawableEndView f80909b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AnimateDrawableEndView f80910c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FixAutoSizeDashTextView f80911d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f80912e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FixAutoSizeTextView f80913f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f80914g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FinancialInputEditText f80915h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FixAutoSizeDashTextView f80916i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayoutCompat f80917j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36828q4 m82518a(@NonNull View view) {
        FixAutoSizeDashTextView fixAutoSizeDashTextViewFindChildViewById;
        FixAutoSizeDashTextView fixAutoSizeDashTextViewFindChildViewById2;
        int i11 = R$id.changeIntervalTv;
        AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
        if (animateDrawableEndView != null) {
            i11 = R$id.changeOrderTypeTv;
            AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
            if (animateDrawableEndView2 != null && (fixAutoSizeDashTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.intervalLabelTv))) != null) {
                i11 = R$id.intervalLl;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.orderTypeLabelTv;
                    FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                    if (fixAutoSizeTextView != null) {
                        i11 = R$id.orderTypeLl;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat2 != null) {
                            i11 = R$id.priceLimitEt;
                            FinancialInputEditText financialInputEditText = (FinancialInputEditText) ViewBindings.findChildViewById(view, i11);
                            if (financialInputEditText != null && (fixAutoSizeDashTextViewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.priceStrategyLabelTv))) != null) {
                                i11 = R$id.priceStrategyLl;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat3 != null) {
                                    return new C36828q4((ConstraintLayout) view, animateDrawableEndView, animateDrawableEndView2, fixAutoSizeDashTextViewFindChildViewById, linearLayoutCompat, fixAutoSizeTextView, linearLayoutCompat2, financialInputEditText, fixAutoSizeDashTextViewFindChildViewById2, linearLayoutCompat3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36828q4 m82519c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_twap_advance_settings_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82518a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80908a;
    }

    public C36828q4(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull FixAutoSizeDashTextView fixAutoSizeDashTextView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull FinancialInputEditText financialInputEditText, @NonNull FixAutoSizeDashTextView fixAutoSizeDashTextView2, @NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.f80908a = constraintLayout;
        this.f80909b = animateDrawableEndView;
        this.f80910c = animateDrawableEndView2;
        this.f80911d = fixAutoSizeDashTextView;
        this.f80912e = linearLayoutCompat;
        this.f80913f = fixAutoSizeTextView;
        this.f80914g = linearLayoutCompat2;
        this.f80915h = financialInputEditText;
        this.f80916i = fixAutoSizeDashTextView2;
        this.f80917j = linearLayoutCompat3;
    }
}
