package p532pc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.copytrading.R$id;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;

/* JADX INFO: renamed from: pc.a */
/* JADX INFO: compiled from: BcopytradingUserHomeWidgetBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43432a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f95884a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f95885b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f95886c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final HomeShimmerHalfCard f95887d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ReloadRefreshView f95888e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43432a m95625a(@NonNull View view) {
        int i11 = R$id.banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.layoutShimmer;
            HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
            if (homeShimmerHalfCard != null) {
                i11 = R$id.reloadView;
                ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                if (reloadRefreshView != null) {
                    return new C43432a(materialCardView, bGABanner, materialCardView, homeShimmerHalfCard, reloadRefreshView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f95884a;
    }

    public C43432a(@NonNull MaterialCardView materialCardView, @NonNull BGABanner bGABanner, @NonNull MaterialCardView materialCardView2, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull ReloadRefreshView reloadRefreshView) {
        this.f95884a = materialCardView;
        this.f95885b = bGABanner;
        this.f95886c = materialCardView2;
        this.f95887d = homeShimmerHalfCard;
        this.f95888e = reloadRefreshView;
    }
}
