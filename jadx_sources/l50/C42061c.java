package l50;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.c */
/* JADX INFO: compiled from: BtradingBotKitCouponsItemAvailableCouponsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42061c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f92503a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckBox f92504b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f92505c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f92506d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Guideline f92507e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Guideline f92508f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f92509g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f92510h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f92511i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f92512j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f92513k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f92514l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatTextView f92515m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f92516n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f92517o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f92518p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f92519q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f92520r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final TextView f92521s;

    public C42061c(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f92503a = constraintLayout;
        this.f92504b = checkBox;
        this.f92505c = constraintLayout2;
        this.f92506d = constraintLayout3;
        this.f92507e = guideline;
        this.f92508f = guideline2;
        this.f92509g = imageView;
        this.f92510h = linearLayout;
        this.f92511i = textView;
        this.f92512j = textView2;
        this.f92513k = textView3;
        this.f92514l = textView4;
        this.f92515m = appCompatTextView;
        this.f92516n = textView5;
        this.f92517o = textView6;
        this.f92518p = textView7;
        this.f92519q = textView8;
        this.f92520r = textView9;
        this.f92521s = textView10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42061c m92273a(@NonNull View view) {
        int i11 = R$id.checkbox_select;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
        if (checkBox != null) {
            i11 = R$id.cl_coupons;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.cl_rules;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout2 != null) {
                    i11 = R$id.guide_line_percent;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
                    if (guideline != null) {
                        i11 = R$id.guide_line_title;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i11);
                        if (guideline2 != null) {
                            i11 = R$id.iv_show_rules;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.ll_rules;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.tv_apply_grid_type;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView != null) {
                                        i11 = R$id.tv_apply_symbol;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView2 != null) {
                                            i11 = R$id.tv_discount_expire_date;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView3 != null) {
                                                i11 = R$id.tv_min_invest;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView4 != null) {
                                                    i11 = R$id.tv_percent_number;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatTextView != null) {
                                                        i11 = R$id.tv_rebate_cap;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView5 != null) {
                                                            i11 = R$id.tv_rebate_days;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView6 != null) {
                                                                i11 = R$id.tv_rules;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView7 != null) {
                                                                    i11 = R$id.tv_shutdown_tip;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView8 != null) {
                                                                        i11 = R$id.tv_title;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (textView9 != null) {
                                                                            i11 = R$id.tv_validity_period;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (textView10 != null) {
                                                                                return new C42061c((ConstraintLayout) view, checkBox, constraintLayout, constraintLayout2, guideline, guideline2, imageView, linearLayout, textView, textView2, textView3, textView4, appCompatTextView, textView5, textView6, textView7, textView8, textView9, textView10);
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
        return this.f92503a;
    }
}
