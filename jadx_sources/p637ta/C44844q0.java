package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.finance.FinanceHeaderView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: ta.q0 */
/* JADX INFO: compiled from: AssetFragmentFinanceBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44844q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100654a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100655b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoordinatorLayout f100656c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FinanceHeaderView f100657d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KuCoinRefreshLayout f100658e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SlidingTabLayout f100659f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CustomViewPager f100660g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44844q0 m99214a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coordinator;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
            if (coordinatorLayout != null) {
                i11 = R$id.headerView;
                FinanceHeaderView financeHeaderView = (FinanceHeaderView) ViewBindings.findChildViewById(view, i11);
                if (financeHeaderView != null) {
                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                    i11 = R$id.tabLayout;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        i11 = R$id.viewPager;
                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                        if (customViewPager != null) {
                            return new C44844q0(kuCoinRefreshLayout, appBarLayout, coordinatorLayout, financeHeaderView, kuCoinRefreshLayout, slidingTabLayout, customViewPager);
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
        return this.f100654a;
    }

    public C44844q0(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FinanceHeaderView financeHeaderView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull CustomViewPager customViewPager) {
        this.f100654a = kuCoinRefreshLayout;
        this.f100655b = appBarLayout;
        this.f100656c = coordinatorLayout;
        this.f100657d = financeHeaderView;
        this.f100658e = kuCoinRefreshLayout2;
        this.f100659f = slidingTabLayout;
        this.f100660g = customViewPager;
    }
}
