package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: bv.g */
/* JADX INFO: compiled from: FragmentChainMarketBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4668g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f4338a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4339b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppBarLayout f4340c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoordinatorLayout f4341d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f4342e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4343f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FragmentContainerView f4344g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ViewPager2 f4345h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final C4681m0 f4346i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4668g m4648a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.appBar;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
            if (appBarLayout != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i11 = R$id.iv_filter;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.iv_time;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.sectorsFragmentContainer;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                        if (fragmentContainerView != null) {
                            i11 = R$id.viewPager;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                            if (viewPager2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_sort))) != null) {
                                return new C4668g(coordinatorLayout, slidingTabLayout, appBarLayout, coordinatorLayout, appCompatImageView, baseTextView, fragmentContainerView, viewPager2, C4681m0.m4674a(viewFindChildViewById));
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
    public CoordinatorLayout getRoot() {
        return this.f4338a;
    }

    public C4668g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull FragmentContainerView fragmentContainerView, @NonNull ViewPager2 viewPager2, @NonNull C4681m0 c4681m0) {
        this.f4338a = coordinatorLayout;
        this.f4339b = slidingTabLayout;
        this.f4340c = appBarLayout;
        this.f4341d = coordinatorLayout2;
        this.f4342e = appCompatImageView;
        this.f4343f = baseTextView;
        this.f4344g = fragmentContainerView;
        this.f4345h = viewPager2;
        this.f4346i = c4681m0;
    }
}
