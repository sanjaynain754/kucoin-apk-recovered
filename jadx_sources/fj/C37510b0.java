package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.home.R$id;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerMiddleCard;

/* JADX INFO: renamed from: fj.b0 */
/* JADX INFO: compiled from: HomeWidgetRecommendBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37510b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f83220a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HomeShimmerMiddleCard f83221b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f83222c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83223d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ReloadRefreshView f83224e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37510b0 m84478a(@NonNull View view) {
        int i11 = R$id.layoutShimmer;
        HomeShimmerMiddleCard homeShimmerMiddleCard = (HomeShimmerMiddleCard) ViewBindings.findChildViewById(view, i11);
        if (homeShimmerMiddleCard != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.reloadView;
                ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                if (reloadRefreshView != null) {
                    return new C37510b0(materialCardView, homeShimmerMiddleCard, materialCardView, recyclerView, reloadRefreshView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f83220a;
    }

    public C37510b0(@NonNull MaterialCardView materialCardView, @NonNull HomeShimmerMiddleCard homeShimmerMiddleCard, @NonNull MaterialCardView materialCardView2, @NonNull RecyclerView recyclerView, @NonNull ReloadRefreshView reloadRefreshView) {
        this.f83220a = materialCardView;
        this.f83221b = homeShimmerMiddleCard;
        this.f83222c = materialCardView2;
        this.f83223d = recyclerView;
        this.f83224e = reloadRefreshView;
    }
}
