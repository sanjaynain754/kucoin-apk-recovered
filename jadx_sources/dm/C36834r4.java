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
import com.kubi.resources.widget.FixAutoSizeTextView;

/* JADX INFO: renamed from: dm.r4 */
/* JADX INFO: compiled from: BkumexTwapCustomPriceWithPercentViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36834r4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80990a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80991b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FixAutoSizeTextView f80992c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FixAutoSizeTextView f80993d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FixAutoSizeTextView f80994e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80995f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FinancialFocusEditText f80996g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FixAutoSizeTextView f80997h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36834r4 m82531a(@NonNull View view) {
        int i11 = R$id.customPriceWithPercentDescTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.fiveThousandthTv;
            FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
            if (fixAutoSizeTextView != null) {
                i11 = R$id.onePercentTv;
                FixAutoSizeTextView fixAutoSizeTextView2 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                if (fixAutoSizeTextView2 != null) {
                    i11 = R$id.oneThousandthTv;
                    FixAutoSizeTextView fixAutoSizeTextView3 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                    if (fixAutoSizeTextView3 != null) {
                        i11 = R$id.percentErrorTips;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.percentNumEt;
                            FinancialFocusEditText financialFocusEditText = (FinancialFocusEditText) ViewBindings.findChildViewById(view, i11);
                            if (financialFocusEditText != null) {
                                i11 = R$id.twoThousandthTv;
                                FixAutoSizeTextView fixAutoSizeTextView4 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                if (fixAutoSizeTextView4 != null) {
                                    return new C36834r4((ConstraintLayout) view, baseTextView, fixAutoSizeTextView, fixAutoSizeTextView2, fixAutoSizeTextView3, baseTextView2, financialFocusEditText, fixAutoSizeTextView4);
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
    public static C36834r4 m82532c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_twap_custom_price_with_percent_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82531a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80990a;
    }

    public C36834r4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull FixAutoSizeTextView fixAutoSizeTextView2, @NonNull FixAutoSizeTextView fixAutoSizeTextView3, @NonNull BaseTextView baseTextView2, @NonNull FinancialFocusEditText financialFocusEditText, @NonNull FixAutoSizeTextView fixAutoSizeTextView4) {
        this.f80990a = constraintLayout;
        this.f80991b = baseTextView;
        this.f80992c = fixAutoSizeTextView;
        this.f80993d = fixAutoSizeTextView2;
        this.f80994e = fixAutoSizeTextView3;
        this.f80995f = baseTextView2;
        this.f80996g = financialFocusEditText;
        this.f80997h = fixAutoSizeTextView4;
    }
}
