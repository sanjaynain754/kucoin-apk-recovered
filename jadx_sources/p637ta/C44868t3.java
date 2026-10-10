package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.isolated.AssetV2IsolatedHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.t3 */
/* JADX INFO: compiled from: FragmentAssetv2IsolatedAccountBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44868t3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100877a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100878b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f100879c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f100880d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CoordinatorLayout f100881e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AssetV2IsolatedHeaderView f100882f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f100883g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AssetSearchView f100884h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KuCoinRefreshLayout f100885i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100886j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44868t3 m99260a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.cbHideSmall;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null) {
                i11 = R$id.cbHideSmallText;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    i11 = R$id.coordinator;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
                    if (coordinatorLayout != null) {
                        i11 = R$id.isolatedHeaderView;
                        AssetV2IsolatedHeaderView assetV2IsolatedHeaderView = (AssetV2IsolatedHeaderView) ViewBindings.findChildViewById(view, i11);
                        if (assetV2IsolatedHeaderView != null) {
                            i11 = R$id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.searchView;
                                AssetSearchView assetSearchView = (AssetSearchView) ViewBindings.findChildViewById(view, i11);
                                if (assetSearchView != null) {
                                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                    i11 = R$id.tvConvertToKCS;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        return new C44868t3(kuCoinRefreshLayout, appBarLayout, kuCheckBox, dashTextView, coordinatorLayout, assetV2IsolatedHeaderView, recyclerView, assetSearchView, kuCoinRefreshLayout, baseTextView);
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
        return this.f100877a;
    }

    public C44868t3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull KuCheckBox kuCheckBox, @NonNull DashTextView dashTextView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull AssetV2IsolatedHeaderView assetV2IsolatedHeaderView, @NonNull RecyclerView recyclerView, @NonNull AssetSearchView assetSearchView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull BaseTextView baseTextView) {
        this.f100877a = kuCoinRefreshLayout;
        this.f100878b = appBarLayout;
        this.f100879c = kuCheckBox;
        this.f100880d = dashTextView;
        this.f100881e = coordinatorLayout;
        this.f100882f = assetV2IsolatedHeaderView;
        this.f100883g = recyclerView;
        this.f100884h = assetSearchView;
        this.f100885i = kuCoinRefreshLayout2;
        this.f100886j = baseTextView;
    }
}
