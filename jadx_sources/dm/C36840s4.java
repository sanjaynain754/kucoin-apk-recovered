package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.view.FinancialFocusEditText;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.s4 */
/* JADX INFO: compiled from: BkumexTwapCustomPriceWithValueViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36840s4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81044a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81045b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81046c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81047d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81048e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81049f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FinancialFocusEditText f81050g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81051h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36840s4 m82544a(@NonNull View view) {
        int i11 = R$id.customPriceWithValueDescTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.inputErrorTips;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.oneHalfTv;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.oneTenthsTv;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.oneTv;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.priceEt;
                            FinancialFocusEditText financialFocusEditText = (FinancialFocusEditText) ViewBindings.findChildViewById(view, i11);
                            if (financialFocusEditText != null) {
                                i11 = R$id.twoTenthsTv;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    return new C36840s4((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, financialFocusEditText, baseTextView6);
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
    public static C36840s4 m82545c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_twap_custom_price_with_value_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82544a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81044a;
    }

    public C36840s4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull FinancialFocusEditText financialFocusEditText, @NonNull BaseTextView baseTextView6) {
        this.f81044a = constraintLayout;
        this.f81045b = baseTextView;
        this.f81046c = baseTextView2;
        this.f81047d = baseTextView3;
        this.f81048e = baseTextView4;
        this.f81049f = baseTextView5;
        this.f81050g = financialFocusEditText;
        this.f81051h = baseTextView6;
    }
}
