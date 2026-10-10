package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.cross.AssetV2CrossHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.s3 */
/* JADX INFO: compiled from: FragmentAssetv2CrossAccountBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44861s3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100785a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100786b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f100787c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f100788d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CoordinatorLayout f100789e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AssetV2CrossHeaderView f100790f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f100791g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AssetSearchView f100792h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KuCoinRefreshLayout f100793i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100794j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44861s3 m99246a(@NonNull View view) {
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
                        i11 = R$id.crossHeaderView;
                        AssetV2CrossHeaderView assetV2CrossHeaderView = (AssetV2CrossHeaderView) ViewBindings.findChildViewById(view, i11);
                        if (assetV2CrossHeaderView != null) {
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
                                        return new C44861s3(kuCoinRefreshLayout, appBarLayout, kuCheckBox, dashTextView, coordinatorLayout, assetV2CrossHeaderView, recyclerView, assetSearchView, kuCoinRefreshLayout, baseTextView);
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
        return this.f100785a;
    }

    public C44861s3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull KuCheckBox kuCheckBox, @NonNull DashTextView dashTextView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull AssetV2CrossHeaderView assetV2CrossHeaderView, @NonNull RecyclerView recyclerView, @NonNull AssetSearchView assetSearchView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull BaseTextView baseTextView) {
        this.f100785a = kuCoinRefreshLayout;
        this.f100786b = appBarLayout;
        this.f100787c = kuCheckBox;
        this.f100788d = dashTextView;
        this.f100789e = coordinatorLayout;
        this.f100790f = assetV2CrossHeaderView;
        this.f100791g = recyclerView;
        this.f100792h = assetSearchView;
        this.f100793i = kuCoinRefreshLayout2;
        this.f100794j = baseTextView;
    }
}
