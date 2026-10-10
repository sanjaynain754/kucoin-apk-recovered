package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.spot.SpotAssetHeaderView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.y3 */
/* JADX INFO: compiled from: FragmentAssetv2SpotBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44903y3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f101176a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f101177b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f101178c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f101179d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CoordinatorLayout f101180e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f101181f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AssetSearchView f101182g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SpotAssetHeaderView f101183h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KuCoinRefreshLayout f101184i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101185j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101186k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101187l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f101188m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44903y3 m99330a(@NonNull View view) {
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
                        i11 = R$id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.searchView;
                            AssetSearchView assetSearchView = (AssetSearchView) ViewBindings.findChildViewById(view, i11);
                            if (assetSearchView != null) {
                                i11 = R$id.spotHeaderView;
                                SpotAssetHeaderView spotAssetHeaderView = (SpotAssetHeaderView) ViewBindings.findChildViewById(view, i11);
                                if (spotAssetHeaderView != null) {
                                    KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                    i11 = R$id.tvAmount;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_assets_title;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tvCoin;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tvConvertToKCS;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    return new C44903y3(kuCoinRefreshLayout, appBarLayout, kuCheckBox, dashTextView, coordinatorLayout, recyclerView, assetSearchView, spotAssetHeaderView, kuCoinRefreshLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f101176a;
    }

    public C44903y3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull KuCheckBox kuCheckBox, @NonNull DashTextView dashTextView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull AssetSearchView assetSearchView, @NonNull SpotAssetHeaderView spotAssetHeaderView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f101176a = kuCoinRefreshLayout;
        this.f101177b = appBarLayout;
        this.f101178c = kuCheckBox;
        this.f101179d = dashTextView;
        this.f101180e = coordinatorLayout;
        this.f101181f = recyclerView;
        this.f101182g = assetSearchView;
        this.f101183h = spotAssetHeaderView;
        this.f101184i = kuCoinRefreshLayout2;
        this.f101185j = baseTextView;
        this.f101186k = baseTextView2;
        this.f101187l = baseTextView3;
        this.f101188m = baseTextView4;
    }
}
