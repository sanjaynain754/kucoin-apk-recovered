package dm;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.n2 */
/* JADX INFO: compiled from: BkumexFragmentIsolatedRiskLimitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36808n2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80659a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80660b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80661c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80662d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f80663e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f80664f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80665g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80666h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80667i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f80668j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80669k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f80670l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayout f80671m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80672n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80673o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80674p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AppCompatImageView f80675q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final Space f80676r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final KcPrimaryButton f80677s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36808n2 m82477a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.adjusted;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.adjustedLeverage;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.adjustedMarginRate;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.bgLeverage))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.bgMarginRate))) != null) {
                    i11 = R$id.current;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.currentLeverage;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.currentMarginRate;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.infoCl;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout != null) {
                                    i11 = R$id.leverageLabel;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                        i11 = R$id.llRiskLimit;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout != null) {
                                            i11 = R$id.marginRateLabel;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                i11 = R$id.riskLimitLabel;
                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView9 != null) {
                                                    i11 = R$id.riskLimitValue;
                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView10 != null) {
                                                        i11 = R$id.riskLimitValueIv;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                        if (appCompatImageView != null) {
                                                            i11 = R$id.space;
                                                            Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                                            if (space != null) {
                                                                i11 = R$id.tv_confirm;
                                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcPrimaryButton != null) {
                                                                    return new C36808n2((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById, viewFindChildViewById2, baseTextView4, baseTextView5, baseTextView6, constraintLayout, baseTextView7, viewFindChildViewById3, linearLayout, baseTextView8, baseTextView9, baseTextView10, appCompatImageView, space, kcPrimaryButton);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80659a;
    }

    public C36808n2(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull View view2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView7, @NonNull View view3, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull AppCompatImageView appCompatImageView, @NonNull Space space, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f80659a = constraintLayout;
        this.f80660b = baseTextView;
        this.f80661c = baseTextView2;
        this.f80662d = baseTextView3;
        this.f80663e = view;
        this.f80664f = view2;
        this.f80665g = baseTextView4;
        this.f80666h = baseTextView5;
        this.f80667i = baseTextView6;
        this.f80668j = constraintLayout2;
        this.f80669k = baseTextView7;
        this.f80670l = view3;
        this.f80671m = linearLayout;
        this.f80672n = baseTextView8;
        this.f80673o = baseTextView9;
        this.f80674p = baseTextView10;
        this.f80675q = appCompatImageView;
        this.f80676r = space;
        this.f80677s = kcPrimaryButton;
    }
}
