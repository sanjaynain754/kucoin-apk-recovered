package dm;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.widget.TitleBar;

/* JADX INFO: renamed from: dm.m2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesWelfareBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36802m2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80558a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f80559b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f80560c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f80561d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f80562e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f80563f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final SlidingTabLayout f80564g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TitleBar f80565h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f80566i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RtlViewPager f80567j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f80568k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36802m2 m82465a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coinBg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.history;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.statusBar))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.subTab))) != null) {
                    i11 = R$id.tab_layout;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        i11 = R$id.title;
                        TitleBar titleBar = (TitleBar) ViewBindings.findChildViewById(view, i11);
                        if (titleBar != null) {
                            i11 = R$id.topBg;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.viewPager;
                                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                                if (rtlViewPager != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.viewPagerBg))) != null) {
                                    return new C36802m2((ConstraintLayout) view, appBarLayout, imageView, appCompatImageView, viewFindChildViewById, viewFindChildViewById2, slidingTabLayout, titleBar, imageView2, rtlViewPager, viewFindChildViewById3);
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
        return this.f80558a;
    }

    public C36802m2(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull View view2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull TitleBar titleBar, @NonNull ImageView imageView2, @NonNull RtlViewPager rtlViewPager, @NonNull View view3) {
        this.f80558a = constraintLayout;
        this.f80559b = appBarLayout;
        this.f80560c = imageView;
        this.f80561d = appCompatImageView;
        this.f80562e = view;
        this.f80563f = view2;
        this.f80564g = slidingTabLayout;
        this.f80565h = titleBar;
        this.f80566i = imageView2;
        this.f80567j = rtlViewPager;
        this.f80568k = view3;
    }
}
