package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: dm.x0 */
/* JADX INFO: compiled from: BkumexDialogProfitLossPlusBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36866x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81302a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f81303b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f81304c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FlexboxLayout f81305d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f81306e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81307f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81308g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81309h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f81310i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81311j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81312k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayout f81313l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81314m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81315n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81316o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ViewPager2 f81317p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81318q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81319r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81320s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36866x0 m82598a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.flow;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                if (flexboxLayout != null) {
                    i11 = R$id.futuresQa;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.lastLabel;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.lastPrice;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.leverage;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                    i11 = R$id.liqLabel;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.liqPrice;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.llBar;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout != null) {
                                                i11 = R$id.model;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.openLabel;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.openPrice;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.pager;
                                                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                                                            if (viewPager2 != null) {
                                                                i11 = R$id.side;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.symbolName;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        i11 = R$id.tvTitle;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            return new C36866x0((ConstraintLayout) view, slidingTabLayout, appCompatImageView, flexboxLayout, appCompatImageView2, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById, baseTextView4, baseTextView5, linearLayout, baseTextView6, baseTextView7, baseTextView8, viewPager2, baseTextView9, baseTextView10, baseTextView11);
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
        return this.f81302a;
    }

    public C36866x0(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FlexboxLayout flexboxLayout, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull ViewPager2 viewPager2, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f81302a = constraintLayout;
        this.f81303b = slidingTabLayout;
        this.f81304c = appCompatImageView;
        this.f81305d = flexboxLayout;
        this.f81306e = appCompatImageView2;
        this.f81307f = baseTextView;
        this.f81308g = baseTextView2;
        this.f81309h = baseTextView3;
        this.f81310i = view;
        this.f81311j = baseTextView4;
        this.f81312k = baseTextView5;
        this.f81313l = linearLayout;
        this.f81314m = baseTextView6;
        this.f81315n = baseTextView7;
        this.f81316o = baseTextView8;
        this.f81317p = viewPager2;
        this.f81318q = baseTextView9;
        this.f81319r = baseTextView10;
        this.f81320s = baseTextView11;
    }
}
