package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.g3 */
/* JADX INFO: compiled from: BkumexFragmentRetailRiskLimitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36767g3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80134a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f80135b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f80136c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80137d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80138e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80139f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f80140g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80141h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80142i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80143j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80144k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80145l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36767g3 m82389a(@NonNull View view) {
        int i11 = R$id.bgLeverage;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.bgMarginRate;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.currentLeverage;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.currentMarginRate;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.leverageLabel;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.llRiskLimit;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.marginRateLabel;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.riskLimitLabel;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.riskLimitValue;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tvCurrentLabel;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tvDesc;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    return new C36767g3((ConstraintLayout) view, constraintLayout, constraintLayout2, baseTextView, baseTextView2, baseTextView3, linearLayout, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
        return this.f80134a;
    }

    public C36767g3(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f80134a = constraintLayout;
        this.f80135b = constraintLayout2;
        this.f80136c = constraintLayout3;
        this.f80137d = baseTextView;
        this.f80138e = baseTextView2;
        this.f80139f = baseTextView3;
        this.f80140g = linearLayout;
        this.f80141h = baseTextView4;
        this.f80142i = baseTextView5;
        this.f80143j = baseTextView6;
        this.f80144k = baseTextView7;
        this.f80145l = baseTextView8;
    }
}
