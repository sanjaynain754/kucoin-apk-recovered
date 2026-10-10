package t20;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.chart.KuCoinPieChartView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.n */
/* JADX INFO: compiled from: BkucoinFragmentMarketTradeGuideBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44654n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99231a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f99232b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f99233c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f99234d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f99235e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KuCoinPieChartView f99236f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuCoinPieChartView f99237g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f99238h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99239i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99240j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99241k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99242l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99243m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99244n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99245o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final DashTextView f99246p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f99247q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f99248r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f99249s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f99250t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f99251u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f99252v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f99253w;

    public C44654n(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull KuCoinPieChartView kuCoinPieChartView, @NonNull KuCoinPieChartView kuCoinPieChartView2, @NonNull View view2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14) {
        this.f99231a = constraintLayout;
        this.f99232b = view;
        this.f99233c = constraintLayout2;
        this.f99234d = frameLayout;
        this.f99235e = frameLayout2;
        this.f99236f = kuCoinPieChartView;
        this.f99237g = kuCoinPieChartView2;
        this.f99238h = view2;
        this.f99239i = baseTextView;
        this.f99240j = baseTextView2;
        this.f99241k = baseTextView3;
        this.f99242l = baseTextView4;
        this.f99243m = baseTextView5;
        this.f99244n = baseTextView6;
        this.f99245o = baseTextView7;
        this.f99246p = dashTextView;
        this.f99247q = baseTextView8;
        this.f99248r = baseTextView9;
        this.f99249s = baseTextView10;
        this.f99250t = baseTextView11;
        this.f99251u = baseTextView12;
        this.f99252v = baseTextView13;
        this.f99253w = baseTextView14;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44654n m98784a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.background;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.fl_amount_ratio;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.fl_user_ratio;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout2 != null) {
                    i11 = R$id.pie_amount_ratio;
                    KuCoinPieChartView kuCoinPieChartView = (KuCoinPieChartView) ViewBindings.findChildViewById(view, i11);
                    if (kuCoinPieChartView != null) {
                        i11 = R$id.pie_user_ratio;
                        KuCoinPieChartView kuCoinPieChartView2 = (KuCoinPieChartView) ViewBindings.findChildViewById(view, i11);
                        if (kuCoinPieChartView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.thumb))) != null) {
                            i11 = R$id.tv_amount_ratio;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_amount_ratio_label;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_current;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_high;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_high_label;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_low;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_low_label;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tv_section_label;
                                                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (dashTextView != null) {
                                                            i11 = R$id.tv_section_type;
                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView8 != null) {
                                                                i11 = R$id.tv_trade_side;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.tv_trade_side_label;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        i11 = R$id.tv_trade_user;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            i11 = R$id.tv_trade_user_label;
                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView12 != null) {
                                                                                i11 = R$id.tv_user_ratio;
                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView13 != null) {
                                                                                    i11 = R$id.tv_user_ratio_label;
                                                                                    BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView14 != null) {
                                                                                        return new C44654n(constraintLayout, viewFindChildViewById2, constraintLayout, frameLayout, frameLayout2, kuCoinPieChartView, kuCoinPieChartView2, viewFindChildViewById, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, dashTextView, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14);
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
        return this.f99231a;
    }
}
