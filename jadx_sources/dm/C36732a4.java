package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.tradebase.view.kline.KLineIndicatorView;
import com.kubi.tradebase.view.kline.KLineToolBarView;

/* JADX INFO: renamed from: dm.a4 */
/* JADX INFO: compiled from: BkumexKlineLandscapeActivityBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36732a4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79696a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeConstraintLayout f79697b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f79698c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Space f79699d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KLineIndicatorView f79700e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f79701f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TabLayout f79702g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KLineToolBarView f79703h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f79704i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShowHideTextView f79705j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f79706k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f79707l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f79708m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final UpDownTextView f79709n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f79710o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f79711p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f79712q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f79713r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36732a4 m82314a(@NonNull View view) {
        int i11 = R$id.clGuide;
        ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (shapeConstraintLayout != null) {
            i11 = R$id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.guideline;
                Space space = (Space) ViewBindings.findChildViewById(view, i11);
                if (space != null) {
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
                                    i11 = R$id.tvContent;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_high;
                                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView != null) {
                                            i11 = R$id.tv_low;
                                            ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView2 != null) {
                                                i11 = R$id.tv_mark_price;
                                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView3 != null) {
                                                    i11 = R$id.tv_percent;
                                                    ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (showHideTextView4 != null) {
                                                        i11 = R$id.tv_price;
                                                        UpDownTextView upDownTextView = (UpDownTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (upDownTextView != null) {
                                                            i11 = R$id.tv_priceLegal;
                                                            ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView5 != null) {
                                                                i11 = R$id.tv_symbol;
                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView2 != null) {
                                                                    i11 = R$id.tv_time_amount;
                                                                    ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView6 != null) {
                                                                        i11 = R$id.tvTitle;
                                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView3 != null) {
                                                                            return new C36732a4((ConstraintLayout) view, shapeConstraintLayout, frameLayout, space, kLineIndicatorView, imageView, tabLayout, kLineToolBarView, baseTextView, showHideTextView, showHideTextView2, showHideTextView3, showHideTextView4, upDownTextView, showHideTextView5, baseTextView2, showHideTextView6, baseTextView3);
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
        return this.f79696a;
    }

    public C36732a4(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull KLineIndicatorView kLineIndicatorView, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull KLineToolBarView kLineToolBarView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull UpDownTextView upDownTextView, @NonNull ShowHideTextView showHideTextView5, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView6, @NonNull BaseTextView baseTextView3) {
        this.f79696a = constraintLayout;
        this.f79697b = shapeConstraintLayout;
        this.f79698c = frameLayout;
        this.f79699d = space;
        this.f79700e = kLineIndicatorView;
        this.f79701f = imageView;
        this.f79702g = tabLayout;
        this.f79703h = kLineToolBarView;
        this.f79704i = baseTextView;
        this.f79705j = showHideTextView;
        this.f79706k = showHideTextView2;
        this.f79707l = showHideTextView3;
        this.f79708m = showHideTextView4;
        this.f79709n = upDownTextView;
        this.f79710o = showHideTextView5;
        this.f79711p = baseTextView2;
        this.f79712q = showHideTextView6;
        this.f79713r = baseTextView3;
    }
}
