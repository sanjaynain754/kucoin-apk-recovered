package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.unify.UnifyAssetHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.q3 */
/* JADX INFO: compiled from: FragmentAssetUnifiedBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44847q3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100680a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100681b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatCheckBox f100682c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f100683d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatCheckBox f100684e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CoordinatorLayout f100685f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f100686g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final UnifyAssetHeaderView f100687h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RecyclerView f100688i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AssetSearchView f100689j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KuCoinRefreshLayout f100690k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100691l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f100692m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f100693n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44847q3 m99219a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.cbHideSmall;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
            if (appCompatCheckBox != null) {
                i11 = R$id.cbHideSmallText;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    i11 = R$id.cbShowDebt;
                    AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
                    if (appCompatCheckBox2 != null) {
                        i11 = R$id.coordinator;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
                        if (coordinatorLayout != null) {
                            i11 = R$id.filterLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.headerView;
                                UnifyAssetHeaderView unifyAssetHeaderView = (UnifyAssetHeaderView) ViewBindings.findChildViewById(view, i11);
                                if (unifyAssetHeaderView != null) {
                                    i11 = R$id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView != null) {
                                        i11 = R$id.searchView;
                                        AssetSearchView assetSearchView = (AssetSearchView) ViewBindings.findChildViewById(view, i11);
                                        if (assetSearchView != null) {
                                            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                            i11 = R$id.tvMarginEntrance;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvShowDebt;
                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (dashTextView2 != null) {
                                                    i11 = R$id.tvTitle;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        return new C44847q3(kuCoinRefreshLayout, appBarLayout, appCompatCheckBox, dashTextView, appCompatCheckBox2, coordinatorLayout, linearLayout, unifyAssetHeaderView, recyclerView, assetSearchView, kuCoinRefreshLayout, baseTextView, dashTextView2, baseTextView2);
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
    public KuCoinRefreshLayout getRoot() {
        return this.f100680a;
    }

    public C44847q3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull DashTextView dashTextView, @NonNull AppCompatCheckBox appCompatCheckBox2, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull UnifyAssetHeaderView unifyAssetHeaderView, @NonNull RecyclerView recyclerView, @NonNull AssetSearchView assetSearchView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView2) {
        this.f100680a = kuCoinRefreshLayout;
        this.f100681b = appBarLayout;
        this.f100682c = appCompatCheckBox;
        this.f100683d = dashTextView;
        this.f100684e = appCompatCheckBox2;
        this.f100685f = coordinatorLayout;
        this.f100686g = linearLayout;
        this.f100687h = unifyAssetHeaderView;
        this.f100688i = recyclerView;
        this.f100689j = assetSearchView;
        this.f100690k = kuCoinRefreshLayout2;
        this.f100691l = baseTextView;
        this.f100692m = dashTextView2;
        this.f100693n = baseTextView2;
    }
}
