package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.chart.KuCoinPieChartView;

/* JADX INFO: renamed from: dp.d0 */
/* JADX INFO: compiled from: BmarginFragmentMarketTradeGuideBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36908d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81639a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f81640b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f81641c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f81642d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81643e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KuCoinPieChartView f81644f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuCoinPieChartView f81645g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f81646h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81647i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81648j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81649k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81650l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81651m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81652n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81653o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final DashTextView f81654p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81655q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81656r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81657s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81658t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81659u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f81660v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f81661w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36908d0 m82685a(@NonNull View view) {
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
                                                                                        return new C36908d0(constraintLayout, viewFindChildViewById2, constraintLayout, frameLayout, frameLayout2, kuCoinPieChartView, kuCoinPieChartView2, viewFindChildViewById, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, dashTextView, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14);
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
        return this.f81639a;
    }

    public C36908d0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull KuCoinPieChartView kuCoinPieChartView, @NonNull KuCoinPieChartView kuCoinPieChartView2, @NonNull View view2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14) {
        this.f81639a = constraintLayout;
        this.f81640b = view;
        this.f81641c = constraintLayout2;
        this.f81642d = frameLayout;
        this.f81643e = frameLayout2;
        this.f81644f = kuCoinPieChartView;
        this.f81645g = kuCoinPieChartView2;
        this.f81646h = view2;
        this.f81647i = baseTextView;
        this.f81648j = baseTextView2;
        this.f81649k = baseTextView3;
        this.f81650l = baseTextView4;
        this.f81651m = baseTextView5;
        this.f81652n = baseTextView6;
        this.f81653o = baseTextView7;
        this.f81654p = dashTextView;
        this.f81655q = baseTextView8;
        this.f81656r = baseTextView9;
        this.f81657s = baseTextView10;
        this.f81658t = baseTextView11;
        this.f81659u = baseTextView12;
        this.f81660v = baseTextView13;
        this.f81661w = baseTextView14;
    }
}
