package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownTextView;

/* JADX INFO: renamed from: dp.s */
/* JADX INFO: compiled from: BmarginFragmentIndexPriceDetailBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36937s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f81954a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final UpDownTextView f81955b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final UpDownTextView f81956c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f81957d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final UpDownTextView f81958e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShowHideTextView f81959f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f81960g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f81961h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f81962i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f81963j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f81964k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayout f81965l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FrameLayout f81966m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81967n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81968o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f81969p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81970q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81971r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81972s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81973t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81974u;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36937s m82743a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.coin_change;
        UpDownTextView upDownTextView = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
        if (upDownTextView != null) {
            i11 = R$id.coin_legal_price;
            UpDownTextView upDownTextView2 = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
            if (upDownTextView2 != null) {
                i11 = R$id.coin_low_price;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.coin_price;
                    UpDownTextView upDownTextView3 = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
                    if (upDownTextView3 != null) {
                        i11 = R$id.coin_top_price;
                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                        if (showHideTextView2 != null) {
                            i11 = R$id.coin_top_price_ll;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.cst_index_sample;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line2))) != null) {
                                    i11 = R$id.ll_container;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = R$id.llRule;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout3 != null) {
                                            i11 = R$id.loading_view;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                            if (frameLayout != null) {
                                                i11 = R$id.tv_1;
                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView != null) {
                                                    i11 = R$id.tv_index_word;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_price_name;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tvRule;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                i11 = R$id.tvRuleEg;
                                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView5 != null) {
                                                                    i11 = R$id.tvRuleTitle;
                                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView6 != null) {
                                                                        i11 = R$id.tv_tips;
                                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView7 != null) {
                                                                            i11 = R$id.tv_title;
                                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView8 != null) {
                                                                                return new C36937s((ScrollView) view, upDownTextView, upDownTextView2, showHideTextView, upDownTextView3, showHideTextView2, linearLayout, constraintLayout, viewFindChildViewById, viewFindChildViewById2, linearLayout2, linearLayout3, frameLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
    public ScrollView getRoot() {
        return this.f81954a;
    }

    public C36937s(@NonNull ScrollView scrollView, @NonNull UpDownTextView upDownTextView, @NonNull UpDownTextView upDownTextView2, @NonNull ShowHideTextView showHideTextView, @NonNull UpDownTextView upDownTextView3, @NonNull ShowHideTextView showHideTextView2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f81954a = scrollView;
        this.f81955b = upDownTextView;
        this.f81956c = upDownTextView2;
        this.f81957d = showHideTextView;
        this.f81958e = upDownTextView3;
        this.f81959f = showHideTextView2;
        this.f81960g = linearLayout;
        this.f81961h = constraintLayout;
        this.f81962i = view;
        this.f81963j = view2;
        this.f81964k = linearLayout2;
        this.f81965l = linearLayout3;
        this.f81966m = frameLayout;
        this.f81967n = baseTextView;
        this.f81968o = baseTextView2;
        this.f81969p = baseTextView3;
        this.f81970q = baseTextView4;
        this.f81971r = baseTextView5;
        this.f81972s = baseTextView6;
        this.f81973t = baseTextView7;
        this.f81974u = baseTextView8;
    }
}
