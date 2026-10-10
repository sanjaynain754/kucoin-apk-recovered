package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.round.widget.RoundLinearLayout;

/* JADX INFO: renamed from: ta.w4 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawConfirmDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44890w4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101061a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f101062b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f101063c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RoundLinearLayout f101064d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RelativeLayout f101065e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RelativeLayout f101066f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final NestedScrollView f101067g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101068h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f101069i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101070j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101071k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101072l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f101073m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final AlignTopTextView f101074n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AlignTopTextView f101075o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final AlignTopTextView f101076p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final KcPrimaryButton f101077q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f101078r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f101079s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f101080t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f101081u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f101082v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f101083w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f101084x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f101085y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44890w4 m99304a(@NonNull View view) {
        int i11 = R$id.iv_cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ll_1;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.ll_content;
                RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i11);
                if (roundLinearLayout != null) {
                    i11 = R$id.rl_memo;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                    if (relativeLayout != null) {
                        i11 = R$id.rl_network;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                        if (relativeLayout2 != null) {
                            i11 = R$id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                            if (nestedScrollView != null) {
                                i11 = R$id.tv_1;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_account;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_address;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tv_address_remark;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tv_amount;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tv_de_label;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tv_desc_1;
                                                        AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (alignTopTextView != null) {
                                                            i11 = R$id.tv_desc_2;
                                                            AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (alignTopTextView2 != null) {
                                                                i11 = R$id.tv_desc_3;
                                                                AlignTopTextView alignTopTextView3 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (alignTopTextView3 != null) {
                                                                    i11 = R$id.tv_determine;
                                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                    if (kcPrimaryButton != null) {
                                                                        i11 = R$id.tvFee;
                                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView7 != null) {
                                                                            i11 = R$id.tvFeeName;
                                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView8 != null) {
                                                                                i11 = R$id.tv_memo;
                                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView9 != null) {
                                                                                    i11 = R$id.tv_memo_title;
                                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView10 != null) {
                                                                                        i11 = R$id.tv_network;
                                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView11 != null) {
                                                                                            i11 = R$id.tv_title;
                                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView12 != null) {
                                                                                                i11 = R$id.tv_unit;
                                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView13 != null) {
                                                                                                    i11 = R$id.tvWithdrawAmount;
                                                                                                    BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView14 != null) {
                                                                                                        return new C44890w4((ConstraintLayout) view, imageView, linearLayout, roundLinearLayout, relativeLayout, relativeLayout2, nestedScrollView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, alignTopTextView, alignTopTextView2, alignTopTextView3, kcPrimaryButton, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14);
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
        return this.f101061a;
    }

    public C44890w4(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RoundLinearLayout roundLinearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull AlignTopTextView alignTopTextView, @NonNull AlignTopTextView alignTopTextView2, @NonNull AlignTopTextView alignTopTextView3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14) {
        this.f101061a = constraintLayout;
        this.f101062b = imageView;
        this.f101063c = linearLayout;
        this.f101064d = roundLinearLayout;
        this.f101065e = relativeLayout;
        this.f101066f = relativeLayout2;
        this.f101067g = nestedScrollView;
        this.f101068h = baseTextView;
        this.f101069i = baseTextView2;
        this.f101070j = baseTextView3;
        this.f101071k = baseTextView4;
        this.f101072l = baseTextView5;
        this.f101073m = baseTextView6;
        this.f101074n = alignTopTextView;
        this.f101075o = alignTopTextView2;
        this.f101076p = alignTopTextView3;
        this.f101077q = kcPrimaryButton;
        this.f101078r = baseTextView7;
        this.f101079s = baseTextView8;
        this.f101080t = baseTextView9;
        this.f101081u = baseTextView10;
        this.f101082v = baseTextView11;
        this.f101083w = baseTextView12;
        this.f101084x = baseTextView13;
        this.f101085y = baseTextView14;
    }
}
