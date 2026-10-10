package n30;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.view.kline.KLineIndicatorView;
import com.kubi.tradebase.view.kline.KLineToolBarView;

/* JADX INFO: renamed from: n30.c */
/* JADX INFO: compiled from: BtradebaseActivityKlineLanBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42727c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94573a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f94574b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f94575c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f94576d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f94577e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KLineIndicatorView f94578f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f94579g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TabLayout f94580h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KLineToolBarView f94581i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f94582j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f94583k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f94584l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final UpDownTextView f94585m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f94586n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f94587o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f94588p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f94589q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f94590r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final UpDownTextView f94591s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f94592t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f94593u;

    public C42727c(@NonNull LinearLayout linearLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull FrameLayout frameLayout, @NonNull KLineIndicatorView kLineIndicatorView, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull KLineToolBarView kLineToolBarView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull UpDownTextView upDownTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull BaseTextView baseTextView4, @NonNull UpDownTextView upDownTextView2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f94573a = linearLayout;
        this.f94574b = barrier;
        this.f94575c = barrier2;
        this.f94576d = shapeConstraintLayout;
        this.f94577e = frameLayout;
        this.f94578f = kLineIndicatorView;
        this.f94579g = imageView;
        this.f94580h = tabLayout;
        this.f94581i = kLineToolBarView;
        this.f94582j = baseTextView;
        this.f94583k = showHideTextView;
        this.f94584l = showHideTextView2;
        this.f94585m = upDownTextView;
        this.f94586n = baseTextView2;
        this.f94587o = showHideTextView3;
        this.f94588p = baseTextView3;
        this.f94589q = showHideTextView4;
        this.f94590r = baseTextView4;
        this.f94591s = upDownTextView2;
        this.f94592t = baseTextView5;
        this.f94593u = baseTextView6;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42727c m93625a(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier1;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null) {
                i11 = R$id.clGuide;
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (shapeConstraintLayout != null) {
                    i11 = R$id.fl_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.indicatorView;
                        KLineIndicatorView kLineIndicatorView = (KLineIndicatorView) ViewBindings.findChildViewById(view, i11);
                        if (kLineIndicatorView != null) {
                            i11 = R$id.iv_close;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.tab_layout;
                                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i11);
                                if (tabLayout != null) {
                                    i11 = R$id.toolBarView;
                                    KLineToolBarView kLineToolBarView = (KLineToolBarView) ViewBindings.findChildViewById(view, i11);
                                    if (kLineToolBarView != null) {
                                        i11 = R$id.tv_24_title;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_about_price;
                                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView != null) {
                                                i11 = R$id.tv_amount;
                                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView2 != null) {
                                                    i11 = R$id.tv_change_rate;
                                                    UpDownTextView upDownTextView = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (upDownTextView != null) {
                                                        i11 = R$id.tvContent;
                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView2 != null) {
                                                            i11 = R$id.tv_high;
                                                            ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView3 != null) {
                                                                i11 = R$id.tv_high_name;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tv_low;
                                                                    ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView4 != null) {
                                                                        i11 = R$id.tv_low_name;
                                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView4 != null) {
                                                                            i11 = R$id.tv_price;
                                                                            UpDownTextView upDownTextView2 = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (upDownTextView2 != null) {
                                                                                i11 = R$id.tv_symbol;
                                                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView5 != null) {
                                                                                    i11 = R$id.tvTitle;
                                                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView6 != null) {
                                                                                        return new C42727c((LinearLayout) view, barrier, barrier2, shapeConstraintLayout, frameLayout, kLineIndicatorView, imageView, tabLayout, kLineToolBarView, baseTextView, showHideTextView, showHideTextView2, upDownTextView, baseTextView2, showHideTextView3, baseTextView3, showHideTextView4, baseTextView4, upDownTextView2, baseTextView5, baseTextView6);
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
    public LinearLayout getRoot() {
        return this.f94573a;
    }
}
