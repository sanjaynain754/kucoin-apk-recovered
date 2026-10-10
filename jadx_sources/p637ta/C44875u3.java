package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.main.AssetV2MainHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.u3 */
/* JADX INFO: compiled from: FragmentAssetv2MainBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44875u3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100943a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100944b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f100945c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f100946d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CoordinatorLayout f100947e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AssetV2MainHeaderView f100948f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f100949g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AssetSearchView f100950h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KuCoinRefreshLayout f100951i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100952j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100953k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44875u3 m99274a(@NonNull View view) {
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
                        i11 = R$id.mainHeaderView;
                        AssetV2MainHeaderView assetV2MainHeaderView = (AssetV2MainHeaderView) ViewBindings.findChildViewById(view, i11);
                        if (assetV2MainHeaderView != null) {
                            i11 = R$id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.searchView;
                                AssetSearchView assetSearchView = (AssetSearchView) ViewBindings.findChildViewById(view, i11);
                                if (assetSearchView != null) {
                                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                    i11 = R$id.tv_assets_title;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvConvertToKCS;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            return new C44875u3(kuCoinRefreshLayout, appBarLayout, kuCheckBox, dashTextView, coordinatorLayout, assetV2MainHeaderView, recyclerView, assetSearchView, kuCoinRefreshLayout, baseTextView, baseTextView2);
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
        return this.f100943a;
    }

    public C44875u3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull KuCheckBox kuCheckBox, @NonNull DashTextView dashTextView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull AssetV2MainHeaderView assetV2MainHeaderView, @NonNull RecyclerView recyclerView, @NonNull AssetSearchView assetSearchView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100943a = kuCoinRefreshLayout;
        this.f100944b = appBarLayout;
        this.f100945c = kuCheckBox;
        this.f100946d = dashTextView;
        this.f100947e = coordinatorLayout;
        this.f100948f = assetV2MainHeaderView;
        this.f100949g = recyclerView;
        this.f100950h = assetSearchView;
        this.f100951i = kuCoinRefreshLayout2;
        this.f100952j = baseTextView;
        this.f100953k = baseTextView2;
    }
}
