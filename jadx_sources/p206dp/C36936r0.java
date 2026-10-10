package p206dp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.UpDownTextView;

/* JADX INFO: renamed from: dp.r0 */
/* JADX INFO: compiled from: BmarginLayoutMarketDetailTickBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36936r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81936a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81937b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81938c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FixAutoSizeTextView f81939d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81940e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81941f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81942g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81943h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final UpDownTextView f81944i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81945j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81946k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81947l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81948m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81949n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ConstraintLayout f81950o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f81951p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final LinearLayout f81952q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final FlexboxLayout f81953r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36936r0 m82741a(@NonNull View view) {
        int i11 = R$id.coin_low_price;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.coin_low_price_label;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.coin_price;
                FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                if (fixAutoSizeTextView != null) {
                    i11 = R$id.coin_rank_info;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.coin_rank_more;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.coin_top_price;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.coin_top_price_label;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.coin_turnover;
                                    UpDownTextView upDownTextView = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
                                    if (upDownTextView != null) {
                                        i11 = R$id.coin_unit;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.coin_vol_base;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.coin_vol_base_label;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.coin_vol_quote;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.coin_vol_quote_label;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.info_left;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (constraintLayout != null) {
                                                                i11 = R$id.info_right;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (constraintLayout2 != null) {
                                                                    LinearLayout linearLayout = (LinearLayout) view;
                                                                    i11 = R$id.ll_unit;
                                                                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (flexboxLayout != null) {
                                                                        return new C36936r0(linearLayout, baseTextView, baseTextView2, fixAutoSizeTextView, baseTextView3, imageView, baseTextView4, baseTextView5, upDownTextView, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, constraintLayout, constraintLayout2, linearLayout, flexboxLayout);
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
    public LinearLayout getRoot() {
        return this.f81936a;
    }

    public C36936r0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull BaseTextView baseTextView3, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull UpDownTextView upDownTextView, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout2, @NonNull FlexboxLayout flexboxLayout) {
        this.f81936a = linearLayout;
        this.f81937b = baseTextView;
        this.f81938c = baseTextView2;
        this.f81939d = fixAutoSizeTextView;
        this.f81940e = baseTextView3;
        this.f81941f = imageView;
        this.f81942g = baseTextView4;
        this.f81943h = baseTextView5;
        this.f81944i = upDownTextView;
        this.f81945j = baseTextView6;
        this.f81946k = baseTextView7;
        this.f81947l = baseTextView8;
        this.f81948m = baseTextView9;
        this.f81949n = baseTextView10;
        this.f81950o = constraintLayout;
        this.f81951p = constraintLayout2;
        this.f81952q = linearLayout2;
        this.f81953r = flexboxLayout;
    }
}
