package p206dp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.margin.view.MarginRiskView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.d */
/* JADX INFO: compiled from: BmarginDialogMarginClosePositionBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36907d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81614a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81615b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81616c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f81617d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final MarginRiskView f81618e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81619f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81620g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f81621h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f81622i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f81623j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RadioButton f81624k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RadioButton f81625l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RadioButton f81626m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RadioGroupPlus f81627n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81628o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f81629p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81630q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81631r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81632s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81633t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81634u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f81635v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f81636w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f81637x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f81638y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36907d m82683a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                i11 = R$id.isolate_margin_risk_view;
                MarginRiskView marginRiskView = (MarginRiskView) ViewBindings.findChildViewById(view, i11);
                if (marginRiskView != null) {
                    i11 = R$id.iv_one;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.iv_three_1;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.iv_three_2;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView3 != null) {
                                i11 = R$id.iv_two;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView4 != null) {
                                    i11 = R$id.ll_bottom;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        i11 = R$id.rb_one;
                                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                        if (radioButton != null) {
                                            i11 = R$id.rb_three;
                                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                            if (radioButton2 != null) {
                                                i11 = R$id.rb_two;
                                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                if (radioButton3 != null) {
                                                    i11 = R$id.rgp_mode;
                                                    RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                                    if (radioGroupPlus != null) {
                                                        i11 = R$id.title;
                                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView != null) {
                                                            i11 = R$id.tvAll;
                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView2 != null) {
                                                                i11 = R$id.tvHold;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tv_one;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        i11 = R$id.tv_one_tip;
                                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView5 != null) {
                                                                            i11 = R$id.tvSymbol;
                                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView6 != null) {
                                                                                i11 = R$id.tv_three;
                                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView7 != null) {
                                                                                    i11 = R$id.tv_two;
                                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView8 != null) {
                                                                                        i11 = R$id.tv_two_three;
                                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView9 != null) {
                                                                                            i11 = R$id.tv_two_tip;
                                                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView10 != null) {
                                                                                                i11 = R$id.tvType;
                                                                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView11 != null) {
                                                                                                    return new C36907d((ConstraintLayout) view, appCompatImageView, kcPrimaryButton, viewFindChildViewById, marginRiskView, imageView, imageView2, imageView3, imageView4, linearLayout, radioButton, radioButton2, radioButton3, radioGroupPlus, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11);
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
        return this.f81614a;
    }

    public C36907d(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view, @NonNull MarginRiskView marginRiskView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroupPlus radioGroupPlus, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f81614a = constraintLayout;
        this.f81615b = appCompatImageView;
        this.f81616c = kcPrimaryButton;
        this.f81617d = view;
        this.f81618e = marginRiskView;
        this.f81619f = imageView;
        this.f81620g = imageView2;
        this.f81621h = imageView3;
        this.f81622i = imageView4;
        this.f81623j = linearLayout;
        this.f81624k = radioButton;
        this.f81625l = radioButton2;
        this.f81626m = radioButton3;
        this.f81627n = radioGroupPlus;
        this.f81628o = baseTextView;
        this.f81629p = baseTextView2;
        this.f81630q = baseTextView3;
        this.f81631r = baseTextView4;
        this.f81632s = baseTextView5;
        this.f81633t = baseTextView6;
        this.f81634u = baseTextView7;
        this.f81635v = baseTextView8;
        this.f81636w = baseTextView9;
        this.f81637x = baseTextView10;
        this.f81638y = baseTextView11;
    }
}
