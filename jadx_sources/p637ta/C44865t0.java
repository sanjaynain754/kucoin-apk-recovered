package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.options.AssetOptionsHeaderView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: ta.t0 */
/* JADX INFO: compiled from: AssetFragmentOptionsBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44865t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100853a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100854b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoordinatorLayout f100855c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AssetOptionsHeaderView f100856d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KuCoinRefreshLayout f100857e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SlidingTabLayout f100858f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CustomViewPager f100859g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44865t0 m99254a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coordinator;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
            if (coordinatorLayout != null) {
                i11 = R$id.crossHeaderView;
                AssetOptionsHeaderView assetOptionsHeaderView = (AssetOptionsHeaderView) ViewBindings.findChildViewById(view, i11);
                if (assetOptionsHeaderView != null) {
                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                    i11 = R$id.tabLayout;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        i11 = R$id.viewPager;
                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                        if (customViewPager != null) {
                            return new C44865t0(kuCoinRefreshLayout, appBarLayout, coordinatorLayout, assetOptionsHeaderView, kuCoinRefreshLayout, slidingTabLayout, customViewPager);
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
    public KuCoinRefreshLayout getRoot() {
        return this.f100853a;
    }

    public C44865t0(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull AssetOptionsHeaderView assetOptionsHeaderView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull CustomViewPager customViewPager) {
        this.f100853a = kuCoinRefreshLayout;
        this.f100854b = appBarLayout;
        this.f100855c = coordinatorLayout;
        this.f100856d = assetOptionsHeaderView;
        this.f100857e = kuCoinRefreshLayout2;
        this.f100858f = slidingTabLayout;
        this.f100859g = customViewPager;
    }
}
