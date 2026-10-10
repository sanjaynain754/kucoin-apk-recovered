package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.t0 */
/* JADX INFO: compiled from: PaymentDialogFastBuyConfirmFeeBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37687t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84652a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f84653b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f84654c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84655d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84656e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84657f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84658g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84659h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84660i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84661j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84662k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f84663l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ConstraintLayout f84664m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f84665n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37687t0 m84965a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tvExplain;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvFeeRate;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvFeeRateValue;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvMax;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tvMaxValue;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tvMin;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.tvMinValue;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.tvTitle;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_bg))) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                i11 = R$id.view_line;
                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                                                if (viewFindChildViewById3 != null) {
                                                    return new C37687t0(constraintLayout, viewFindChildViewById2, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, viewFindChildViewById, constraintLayout, viewFindChildViewById3);
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
        return this.f84652a;
    }

    public C37687t0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view3) {
        this.f84652a = constraintLayout;
        this.f84653b = view;
        this.f84654c = kcPrimaryButton;
        this.f84655d = baseTextView;
        this.f84656e = baseTextView2;
        this.f84657f = baseTextView3;
        this.f84658g = baseTextView4;
        this.f84659h = baseTextView5;
        this.f84660i = baseTextView6;
        this.f84661j = baseTextView7;
        this.f84662k = baseTextView8;
        this.f84663l = view2;
        this.f84664m = constraintLayout2;
        this.f84665n = view3;
    }
}
